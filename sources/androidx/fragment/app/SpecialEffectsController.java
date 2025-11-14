package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.fragment.R$id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class SpecialEffectsController {
    public static final Companion Companion = new Companion(null);
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;
    private final List pendingOperations;
    private boolean runningNonSeekableTransition;
    private final List runningOperations;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return Companion.getOrCreateController(viewGroup, fragmentManager);
    }

    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return Companion.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }

    public abstract void collectEffects(List list, boolean z);

    public SpecialEffectsController(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    public final ViewGroup getContainer() {
        return this.container;
    }

    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.getFragment();
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        Operation findPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact = findPendingOperation != null ? findPendingOperation.getLifecycleImpact() : null;
        Operation findRunningOperation = findRunningOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = findRunningOperation != null ? findRunningOperation.getLifecycleImpact() : null;
        int i = lifecycleImpact == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        return (i == -1 || i == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object obj;
        Iterator it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.isCanceled()) {
                break;
            }
        }
        return (Operation) obj;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object obj;
        Iterator it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.isCanceled()) {
                break;
            }
        }
        return (Operation) obj;
    }

    public final void enqueueAdd(Operation.State finalState, FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueShow(FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueHide(FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    private final void enqueue(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                Fragment fragment = fragmentStateManager.getFragment();
                Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                Operation findPendingOperation = findPendingOperation(fragment);
                if (findPendingOperation == null) {
                    if (!fragmentStateManager.getFragment().mTransitioning && !fragmentStateManager.getFragment().mRemoving) {
                        findPendingOperation = null;
                    }
                    Fragment fragment2 = fragmentStateManager.getFragment();
                    Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
                    findPendingOperation = findRunningOperation(fragment2);
                }
                if (findPendingOperation != null) {
                    findPendingOperation.mergeWith(state, lifecycleImpact);
                    return;
                }
                final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(fragmentStateManagerOperation);
                fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController.enqueue$lambda$4$lambda$2(SpecialEffectsController.this, fragmentStateManagerOperation);
                    }
                });
                fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController.enqueue$lambda$4$lambda$3(SpecialEffectsController.this, fragmentStateManagerOperation);
                    }
                });
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            Operation.State finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            finalState.applyState(view, this$0.container);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    public final void updateOperationDirection(boolean z) {
        this.operationDirectionIsPop = z;
    }

    public final void markPostponedState() {
        Object obj;
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                List list = this.pendingOperations;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    Operation operation = (Operation) obj;
                    Operation.State.Companion companion = Operation.State.Companion;
                    View view = operation.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    Operation.State asOperationState = companion.asOperationState(view);
                    Operation.State finalState = operation.getFinalState();
                    Operation.State state = Operation.State.VISIBLE;
                    if (finalState == state && asOperationState != state) {
                        break;
                    }
                }
                Operation operation2 = (Operation) obj;
                Fragment fragment = operation2 != null ? operation2.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isPendingExecute() {
        return !this.pendingOperations.isEmpty();
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    public final void executePendingOperations() {
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<Operation> mutableList = CollectionsKt.toMutableList((Collection) this.runningOperations);
                this.runningOperations.clear();
                for (Operation operation : mutableList) {
                    operation.setSeeking$fragment_release(!this.pendingOperations.isEmpty() && operation.getFragment().mTransitioning);
                }
                for (Operation operation2 : mutableList) {
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + operation2);
                        }
                        operation2.complete$fragment_release();
                    } else {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation2);
                        }
                        operation2.cancel(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!operation2.isComplete()) {
                        this.runningOperations.add(operation2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    updateFinalState();
                    List mutableList2 = CollectionsKt.toMutableList((Collection) this.pendingOperations);
                    if (mutableList2.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(mutableList2);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    collectEffects(mutableList2, this.operationDirectionIsPop);
                    boolean isOperationSeekable = isOperationSeekable(mutableList2);
                    boolean isOperationTransitioning = isOperationTransitioning(mutableList2);
                    this.runningNonSeekableTransition = isOperationTransitioning && !isOperationSeekable;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + isOperationSeekable + " \ntransition = " + isOperationTransitioning);
                    }
                    if (!isOperationTransitioning) {
                        processStart(mutableList2);
                        commitEffects$fragment_release(mutableList2);
                    } else if (isOperationSeekable) {
                        processStart(mutableList2);
                        int size = mutableList2.size();
                        for (int i = 0; i < size; i++) {
                            applyContainerChangesToOperation$fragment_release((Operation) mutableList2.get(i));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean isOperationTransitioning(List list) {
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!((Operation) it.next()).getFragment().mTransitioning) {
                z = false;
            }
        }
        return z;
    }

    private final boolean isOperationSeekable(List list) {
        boolean z;
        List<Operation> list2 = list;
        loop0: while (true) {
            z = true;
            for (Operation operation : list2) {
                if (!operation.getEffects$fragment_release().isEmpty()) {
                    List effects$fragment_release = operation.getEffects$fragment_release();
                    if (!(effects$fragment_release instanceof Collection) || !effects$fragment_release.isEmpty()) {
                        Iterator it = effects$fragment_release.iterator();
                        while (it.hasNext()) {
                            if (!((Effect) it.next()).isSeekingSupported()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList, ((Operation) it2.next()).getEffects$fragment_release());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void applyContainerChangesToOperation$fragment_release(Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.isAwaitingContainerChanges()) {
            Operation.State finalState = operation.getFinalState();
            View requireView = operation.getFragment().requireView();
            Intrinsics.checkNotNullExpressionValue(requireView, "operation.fragment.requireView()");
            finalState.applyState(requireView, this.container);
            operation.setAwaitingContainerChanges(false);
        }
    }

    public final void forceCompleteAllOperations() {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                processStart(this.pendingOperations);
                List<Operation> mutableList = CollectionsKt.toMutableList((Collection) this.runningOperations);
                Iterator it = mutableList.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).setSeeking$fragment_release(false);
                }
                for (Operation operation : mutableList) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling running operation " + operation);
                    }
                    operation.cancel(this.container);
                }
                List<Operation> mutableList2 = CollectionsKt.toMutableList((Collection) this.pendingOperations);
                Iterator it2 = mutableList2.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).setSeeking$fragment_release(false);
                }
                for (Operation operation2 : mutableList2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling pending operation " + operation2);
                    }
                    operation2.cancel(this.container);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void updateFinalState() {
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.getFragment().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.Companion.from(requireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public void commitEffects$fragment_release(List operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((Operation) it.next()).getEffects$fragment_release());
        }
        List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Effect) list.get(i)).onCommit(this.container);
        }
        int size2 = operations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            applyContainerChangesToOperation$fragment_release((Operation) operations.get(i2));
        }
        List list2 = CollectionsKt.toList(operations);
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Operation operation = (Operation) list2.get(i3);
            if (operation.getEffects$fragment_release().isEmpty()) {
                operation.complete$fragment_release();
            }
        }
    }

    private final void processStart(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Operation) list.get(i)).onStart();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((Operation) it.next()).getEffects$fragment_release());
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Effect) list2.get(i2)).performStart(this.container);
        }
    }

    public final void processProgress(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.getProgress());
        }
        List list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((Operation) it.next()).getEffects$fragment_release());
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((Effect) list2.get(i)).onProgress(backEvent, this.container);
        }
    }

    public final void completeBack() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        processStart(this.runningOperations);
        commitEffects$fragment_release(this.runningOperations);
    }

    public static class Operation {
        private final List _effects;
        private final List completionListeners;
        private final List effects;
        private State finalState;
        private final Fragment fragment;
        private boolean isAwaitingContainerChanges;
        private boolean isCanceled;
        private boolean isComplete;
        private boolean isSeeking;
        private boolean isStarted;
        private LifecycleImpact lifecycleImpact;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(State finalState, LifecycleImpact lifecycleImpact, Fragment fragment) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.isAwaitingContainerChanges = true;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final State getFinalState() {
            return this.finalState;
        }

        public final LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        public final Fragment getFragment() {
            return this.fragment;
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final Companion Companion = new Companion(null);

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public static final State from(int i) {
                return Companion.from(i);
            }

            public final void applyState(View view, ViewGroup container) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(container, "container");
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i != 4) {
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }

            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final State asOperationState(View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        return State.INVISIBLE;
                    }
                    return from(view.getVisibility());
                }

                public final State from(int i) {
                    if (i == 0) {
                        return State.VISIBLE;
                    }
                    if (i == 4) {
                        return State.INVISIBLE;
                    }
                    if (i == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i);
                }
            }
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final boolean isSeeking() {
            return this.isSeeking;
        }

        public final void setSeeking$fragment_release(boolean z) {
            this.isSeeking = z;
        }

        public final boolean isStarted() {
            return this.isStarted;
        }

        public final boolean isAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        public final void setAwaitingContainerChanges(boolean z) {
            this.isAwaitingContainerChanges = z;
        }

        public final List getEffects$fragment_release() {
            return this.effects;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }

        public final void cancel(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                complete$fragment_release();
                return;
            }
            Iterator it = CollectionsKt.toList(this.effects).iterator();
            while (it.hasNext()) {
                ((Effect) it.next()).cancel(container);
            }
        }

        public final void mergeWith(State finalState, LifecycleImpact lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i == 1) {
                if (this.finalState == State.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                    }
                    this.finalState = State.VISIBLE;
                    this.lifecycleImpact = LifecycleImpact.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = State.REMOVED;
                this.lifecycleImpact = LifecycleImpact.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i == 3 && this.finalState != State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                }
                this.finalState = finalState;
            }
        }

        public final void addCompletionListener(Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void addEffect(Effect effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this._effects.add(effect);
        }

        public final void completeEffect(Effect effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                complete$fragment_release();
            }
        }

        public void onStart() {
            this.isStarted = true;
        }

        public void complete$fragment_release() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class FragmentStateManagerOperation extends Operation {
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public FragmentStateManagerOperation(Operation.State finalState, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
            super(finalState, lifecycleImpact, r0);
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Fragment fragment = fragmentStateManager.getFragment();
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            this.fragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            if (isStarted()) {
                return;
            }
            super.onStart();
            if (getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.fragmentStateManager.getFragment();
                Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = getFragment().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "this.fragment.requireView()");
                if (requireView.getParent() == null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Adding fragment " + fragment + " view " + requireView + " to container in onStart");
                    }
                    this.fragmentStateManager.addViewToContainer();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Making view " + requireView + " INVISIBLE in onStart");
                    }
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Setting view alpha to " + fragment.getPostOnViewCreatedAlpha() + " in onStart");
                    return;
                }
                return;
            }
            if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                Fragment fragment2 = this.fragmentStateManager.getFragment();
                Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
                View requireView2 = fragment2.requireView();
                Intrinsics.checkNotNullExpressionValue(requireView2, "fragment.requireView()");
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
                }
                requireView2.clearFocus();
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete$fragment_release() {
            super.complete$fragment_release();
            getFragment().mTransitioning = false;
            this.fragmentStateManager.moveToExpectedState();
        }
    }

    public static class Effect {
        private boolean isCancelled;
        private final boolean isSeekingSupported;
        private boolean isStarted;

        public abstract void onCancel(ViewGroup viewGroup);

        public abstract void onCommit(ViewGroup viewGroup);

        public void onProgress(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void onStart(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public boolean isSeekingSupported() {
            return this.isSeekingSupported;
        }

        public final void performStart(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.isStarted) {
                onStart(container);
            }
            this.isStarted = true;
        }

        public final void cancel(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.isCancelled) {
                onCancel(container);
            }
            this.isCancelled = true;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SpecialEffectsController getOrCreateController(ViewGroup container, FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            Intrinsics.checkNotNullExpressionValue(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(container, specialEffectsControllerFactory);
        }

        public final SpecialEffectsController getOrCreateController(ViewGroup container, SpecialEffectsControllerFactory factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            int i = R$id.special_effects_controller_view_tag;
            Object tag = container.getTag(i);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController createController = factory.createController(container);
            Intrinsics.checkNotNullExpressionValue(createController, "factory.createController(container)");
            container.setTag(i, createController);
            return createController;
        }
    }
}
