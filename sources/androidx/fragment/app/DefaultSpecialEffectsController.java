package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.BackEventCompat;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.collection.ArrayMap;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void collectEffects(List operations, boolean z) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(operations, "operations");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj2;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState == state && operation.getFinalState() != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj2;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) previous;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation3.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState2 = companion2.asOperationState(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState2 != state2 && operation3.getFinalState() == state2) {
                obj = previous;
                break;
            }
        }
        SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) obj;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Executing operations from " + operation2 + " to " + operation4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        syncAnimations(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) it2.next();
            arrayList.add(new AnimationInfo(operation5, z));
            boolean z2 = false;
            if (z) {
                if (operation5 != operation2) {
                    arrayList2.add(new TransitionInfo(operation5, z, z2));
                    operation5.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.collectEffects$lambda$2(DefaultSpecialEffectsController.this, operation5);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new TransitionInfo(operation5, z, z2));
                operation5.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.collectEffects$lambda$2(DefaultSpecialEffectsController.this, operation5);
                    }
                });
            } else {
                if (operation5 != operation4) {
                    arrayList2.add(new TransitionInfo(operation5, z, z2));
                    operation5.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.collectEffects$lambda$2(DefaultSpecialEffectsController.this, operation5);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new TransitionInfo(operation5, z, z2));
                operation5.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.collectEffects$lambda$2(DefaultSpecialEffectsController.this, operation5);
                    }
                });
            }
        }
        createTransitionEffect(arrayList2, z, operation2, operation4);
        collectAnimEffects(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectEffects$lambda$2(DefaultSpecialEffectsController this$0, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.applyContainerChangesToOperation$fragment_release(operation);
    }

    private final void syncAnimations(List list) {
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last(list)).getFragment();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) it.next();
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    private final void collectAnimEffects(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((AnimationInfo) it.next()).getOperation().getEffects$fragment_release());
        }
        boolean isEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        int i = 0;
        boolean z = false;
        while (it2.hasNext()) {
            AnimationInfo animationInfo = (AnimationInfo) it2.next();
            Context context = getContainer().getContext();
            SpecialEffectsController.Operation operation = animationInfo.getOperation();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation != null) {
                if (animation.animator == null) {
                    arrayList.add(animationInfo);
                } else {
                    Fragment fragment = operation.getFragment();
                    if (!operation.getEffects$fragment_release().isEmpty()) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                        }
                    } else {
                        if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation.setAwaitingContainerChanges(false);
                        }
                        operation.addEffect(new AnimatorEffect(animationInfo));
                        z = true;
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AnimationInfo animationInfo2 = (AnimationInfo) obj;
            SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (isEmpty) {
                if (z) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                    }
                } else {
                    operation2.addEffect(new AnimationEffect(animationInfo2));
                }
            } else if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    private final void createTransitionEffect(List list, boolean z, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
        FragmentTransitionImpl fragmentTransitionImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        Pair pair;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (!((TransitionInfo) obj).isVisibilityUnchanged()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList3.get(i);
            i++;
            if (((TransitionInfo) obj2).getHandlingImpl() != null) {
                arrayList4.add(obj2);
            }
        }
        int size2 = arrayList4.size();
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        int i2 = 0;
        while (i2 < size2) {
            Object obj3 = arrayList4.get(i2);
            i2++;
            TransitionInfo transitionInfo = (TransitionInfo) obj3;
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl2 != null && handlingImpl != fragmentTransitionImpl2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl2 = handlingImpl;
        }
        if (fragmentTransitionImpl2 == null) {
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayMap arrayMap = new ArrayMap();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        int size3 = arrayList4.size();
        ArrayList arrayList9 = arrayList7;
        ArrayList arrayList10 = arrayList8;
        Object obj4 = null;
        int i3 = 0;
        while (i3 < size3) {
            Object obj5 = arrayList4.get(i3);
            i3++;
            TransitionInfo transitionInfo2 = (TransitionInfo) obj5;
            if (!transitionInfo2.hasSharedElementTransition() || operation == null || operation2 == null) {
                fragmentTransitionImpl = fragmentTransitionImpl2;
                arrayList = arrayList5;
                arrayList2 = arrayList6;
            } else {
                obj4 = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo2.getSharedElementTransition()));
                arrayList10 = operation2.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(arrayList10, "lastIn.fragment.sharedElementSourceNames");
                ArrayList sharedElementSourceNames = operation.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                ArrayList sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                fragmentTransitionImpl = fragmentTransitionImpl2;
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size4 = sharedElementTargetNames.size();
                arrayList = arrayList5;
                int i4 = 0;
                while (i4 < size4) {
                    int i5 = size4;
                    int indexOf = arrayList10.indexOf(sharedElementTargetNames.get(i4));
                    ArrayList arrayList11 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        arrayList10.set(indexOf, sharedElementSourceNames.get(i4));
                    }
                    i4++;
                    size4 = i5;
                    sharedElementTargetNames = arrayList11;
                }
                arrayList9 = operation2.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(arrayList9, "lastIn.fragment.sharedElementTargetNames");
                if (z) {
                    operation.getFragment().getEnterTransitionCallback();
                    operation2.getFragment().getExitTransitionCallback();
                    pair = TuplesKt.to(null, null);
                } else {
                    operation.getFragment().getExitTransitionCallback();
                    operation2.getFragment().getEnterTransitionCallback();
                    pair = TuplesKt.to(null, null);
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(pair.component1());
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(pair.component2());
                int size5 = arrayList10.size();
                int i6 = 0;
                while (i6 < size5) {
                    Object obj6 = arrayList10.get(i6);
                    int i7 = size5;
                    Intrinsics.checkNotNullExpressionValue(obj6, "exitingNames[i]");
                    Object obj7 = arrayList9.get(i6);
                    Intrinsics.checkNotNullExpressionValue(obj7, "enteringNames[i]");
                    arrayMap.put((String) obj6, (String) obj7);
                    i6++;
                    size5 = i7;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    arrayList2 = arrayList6;
                    int i8 = 0;
                    for (int size6 = arrayList9.size(); i8 < size6; size6 = size6) {
                        Object obj8 = arrayList9.get(i8);
                        Log.v("FragmentManager", "Name: " + ((String) obj8));
                        i8++;
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    int i9 = 0;
                    for (int size7 = arrayList10.size(); i9 < size7; size7 = size7) {
                        Object obj9 = arrayList10.get(i9);
                        Log.v("FragmentManager", "Name: " + ((String) obj9));
                        i9++;
                    }
                } else {
                    arrayList2 = arrayList6;
                }
                View view = operation.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                findNamedViews(arrayMap2, view);
                arrayMap2.retainAll(arrayList10);
                arrayMap.retainAll(arrayMap2.keySet());
                View view2 = operation2.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view2, "lastIn.fragment.mView");
                findNamedViews(arrayMap3, view2);
                arrayMap3.retainAll(arrayList9);
                arrayMap3.retainAll(arrayMap.values());
                FragmentTransition.retainValues(arrayMap, arrayMap3);
                Collection keySet = arrayMap.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                retainMatchingViews(arrayMap2, keySet);
                Collection values = arrayMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                retainMatchingViews(arrayMap3, values);
                if (arrayMap.isEmpty()) {
                    Log.i("FragmentManager", "Ignoring shared elements transition " + obj4 + " between " + operation + " and " + operation2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList.clear();
                    arrayList2.clear();
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList5 = arrayList;
                    arrayList6 = arrayList2;
                    obj4 = null;
                }
            }
            fragmentTransitionImpl2 = fragmentTransitionImpl;
            arrayList5 = arrayList;
            arrayList6 = arrayList2;
        }
        FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
        ArrayList arrayList12 = arrayList5;
        ArrayList arrayList13 = arrayList6;
        if (obj4 == null) {
            if (arrayList4.isEmpty()) {
                return;
            }
            int size8 = arrayList4.size();
            int i10 = 0;
            while (i10 < size8) {
                Object obj10 = arrayList4.get(i10);
                i10++;
                if (((TransitionInfo) obj10).getTransition() == null) {
                }
            }
            return;
        }
        TransitionEffect transitionEffect = new TransitionEffect(arrayList4, operation, operation2, fragmentTransitionImpl3, obj4, arrayList12, arrayList13, arrayMap, arrayList9, arrayList10, arrayMap2, arrayMap3, z);
        int size9 = arrayList4.size();
        int i11 = 0;
        while (i11 < size9) {
            Object obj11 = arrayList4.get(i11);
            i11++;
            ((TransitionInfo) obj11).getOperation().addEffect(transitionEffect);
        }
    }

    private final void retainMatchingViews(ArrayMap arrayMap, final Collection collection) {
        Set entries = arrayMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new Function1() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Map.Entry entry) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(CollectionsKt.contains(collection, ViewCompat.getTransitionName((View) entry.getValue())));
            }
        });
    }

    private final void findNamedViews(Map map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    findNamedViews(map, child);
                }
            }
        }
    }

    public static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final boolean isVisibilityUnchanged() {
            View view = this.operation.getFragment().mView;
            SpecialEffectsController.Operation.State asOperationState = view != null ? SpecialEffectsController.Operation.State.Companion.asOperationState(view) : null;
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (asOperationState == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (asOperationState == state || finalState == state) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, boolean z) {
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.isPop = z;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator loadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = loadAnimation;
            this.isAnimLoaded = true;
            return loadAnimation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, boolean z, boolean z2) {
            super(operation);
            Object returnTransition;
            boolean z3;
            Object obj;
            Intrinsics.checkNotNullParameter(operation, "operation");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                returnTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            if (operation.getFinalState() != state) {
                z3 = true;
            } else if (z) {
                z3 = operation.getFragment().getAllowReturnTransitionOverlap();
            } else {
                z3 = operation.getFragment().getAllowEnterTransitionOverlap();
            }
            this.isOverlapAllowed = z3;
            if (!z2) {
                obj = null;
            } else if (z) {
                obj = operation.getFragment().getSharedElementReturnTransition();
            } else {
                obj = operation.getFragment().getSharedElementEnterTransition();
            }
            this.sharedElementTransition = obj;
        }

        public final Object getTransition() {
            return this.transition;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class AnimationEffect extends SpecialEffectsController.Effect {
        private final AnimationInfo animationInfo;

        public AnimationEffect(AnimationInfo animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        public final AnimationInfo getAnimationInfo() {
            return this.animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animationInfo.isVisibilityUnchanged()) {
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            Context context = container.getContext();
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            AnimationInfo animationInfo = this.animationInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation2 = animation.animation;
            if (animation2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                view.startAnimation(animation2);
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            container.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view);
            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$AnimationEffect$onCommit$1(operation, container, view, this));
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().completeEffect(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class AnimatorEffect extends SpecialEffectsController.Effect {
        private AnimatorSet animator;
        private final AnimationInfo animatorInfo;

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
            return true;
        }

        public AnimatorEffect(AnimationInfo animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        public final AnimationInfo getAnimatorInfo() {
            return this.animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(final ViewGroup container) {
            final AnimatorEffect animatorEffect;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animatorInfo.isVisibilityUnchanged()) {
                return;
            }
            Context context = container.getContext();
            AnimationInfo animationInfo = this.animatorInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            this.animator = animation != null ? animation.animator : null;
            final SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            final boolean z = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
            final View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator anim) {
                        Intrinsics.checkNotNullParameter(anim, "anim");
                        container.endViewTransition(view);
                        if (z || operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                            View viewToAnimate = view;
                            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                            finalState.applyState(viewToAnimate, container);
                        }
                        animatorEffect.getAnimatorInfo().getOperation().completeEffect(animatorEffect);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Animator from operation " + operation + " has ended.");
                        }
                    }
                });
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long j = Api24Impl.INSTANCE.totalDuration(animatorSet);
            long progress = (long) (backEvent.getProgress() * j);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == j) {
                progress = j - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, progress);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            if (operation.isSeeking()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Api26Impl.INSTANCE.reverse(animatorSet);
                }
            } else {
                animatorSet.end();
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(operation);
                sb.append(" has been canceled");
                sb.append(operation.isSeeking() ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TransitionEffect extends SpecialEffectsController.Effect {
        private Object controller;
        private final ArrayList enteringNames;
        private final ArrayList exitingNames;
        private final SpecialEffectsController.Operation firstOut;
        private final ArrayMap firstOutViews;
        private final boolean isPop;
        private final SpecialEffectsController.Operation lastIn;
        private final ArrayMap lastInViews;
        private boolean noControllerReturned;
        private final ArrayList sharedElementFirstOutViews;
        private final ArrayList sharedElementLastInViews;
        private final ArrayMap sharedElementNameMapping;
        private final Object sharedElementTransition;
        private final FragmentTransitionImpl transitionImpl;
        private final List transitionInfos;
        private final CancellationSignal transitionSignal;

        public final List getTransitionInfos() {
            return this.transitionInfos;
        }

        public final SpecialEffectsController.Operation getFirstOut() {
            return this.firstOut;
        }

        public final SpecialEffectsController.Operation getLastIn() {
            return this.lastIn;
        }

        public final FragmentTransitionImpl getTransitionImpl() {
            return this.transitionImpl;
        }

        public TransitionEffect(List transitionInfos, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, FragmentTransitionImpl transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, ArrayMap sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, ArrayMap firstOutViews, ArrayMap lastInViews, boolean z) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = operation;
            this.lastIn = operation2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z;
            this.transitionSignal = new CancellationSignal();
        }

        public final Object getController() {
            return this.controller;
        }

        public final void setController(Object obj) {
            this.controller = obj;
        }

        public final void setNoControllerReturned(boolean z) {
            this.noControllerReturned = z;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
            if (!this.transitionImpl.isSeekingSupported()) {
                return false;
            }
            List<TransitionInfo> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (TransitionInfo transitionInfo : list) {
                    if (Build.VERSION.SDK_INT < 34 || transitionInfo.getTransition() == null || !this.transitionImpl.isSeekingSupported(transitionInfo.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.isSeekingSupported(obj);
        }

        public final boolean getTransitioning() {
            List list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((TransitionInfo) it.next()).getOperation().getFragment().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(final ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((TransitionInfo) it.next()).getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (getTransitioning() && this.sharedElementTransition != null && !isSeekingSupported()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (isSeekingSupported() && getTransitioning()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Pair createMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
                ArrayList arrayList = (ArrayList) createMergedTransition.component1();
                final Object component2 = createMergedTransition.component2();
                List list = this.transitionInfos;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((TransitionInfo) it2.next()).getOperation());
                }
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    final SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) arrayList2.get(i);
                    this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), component2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4(Ref$ObjectRef.this);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(SpecialEffectsController.Operation.this, this);
                        }
                    });
                }
                runTransition(arrayList, container, new Function0() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                        }
                        DefaultSpecialEffectsController.TransitionEffect transitionEffect = DefaultSpecialEffectsController.TransitionEffect.this;
                        transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(container, component2));
                        if (DefaultSpecialEffectsController.TransitionEffect.this.getController() == null) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "TransitionSeekController was not created.");
                            }
                            DefaultSpecialEffectsController.TransitionEffect.this.setNoControllerReturned(true);
                            return;
                        }
                        ref$ObjectRef.element = new 1(DefaultSpecialEffectsController.TransitionEffect.this, component2, container);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Started executing operations from " + DefaultSpecialEffectsController.TransitionEffect.this.getFirstOut() + " to " + DefaultSpecialEffectsController.TransitionEffect.this.getLastIn());
                        }
                    }

                    static final class 1 extends Lambda implements Function0 {
                        final /* synthetic */ ViewGroup $container;
                        final /* synthetic */ Object $mergedTransition;
                        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        1(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj, ViewGroup viewGroup) {
                            super(0);
                            this.this$0 = transitionEffect;
                            this.$mergedTransition = obj;
                            this.$container = viewGroup;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            List transitionInfos = this.this$0.getTransitionInfos();
                            if (!(transitionInfos instanceof Collection) || !transitionInfos.isEmpty()) {
                                Iterator it = transitionInfos.iterator();
                                while (it.hasNext()) {
                                    if (!((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().isSeeking()) {
                                        if (FragmentManager.isLoggingEnabled(2)) {
                                            Log.v("FragmentManager", "Completing animating immediately");
                                        }
                                        CancellationSignal cancellationSignal = new CancellationSignal();
                                        FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
                                        Fragment fragment = ((DefaultSpecialEffectsController.TransitionInfo) this.this$0.getTransitionInfos().get(0)).getOperation().getFragment();
                                        Object obj = this.$mergedTransition;
                                        final DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                                        transitionImpl.setListenerForTransitionEnd(fragment, obj, cancellationSignal, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE 
                                              (r1v7 'transitionImpl' androidx.fragment.app.FragmentTransitionImpl)
                                              (r2v6 'fragment' androidx.fragment.app.Fragment)
                                              (r3v2 'obj' java.lang.Object)
                                              (r0v5 'cancellationSignal' androidx.core.os.CancellationSignal)
                                              (wrap:java.lang.Runnable:0x0064: CONSTRUCTOR (r4v0 'transitionEffect' androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect A[DONT_INLINE]) A[MD:(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void (m), WRAPPED] call: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda1.<init>(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void type: CONSTRUCTOR)
                                             VIRTUAL call: androidx.fragment.app.FragmentTransitionImpl.setListenerForTransitionEnd(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void A[MD:(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void (m)] in method: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1.invoke():void, file: classes.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda1, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 35 more
                                            */
                                        /*
                                            this = this;
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            java.util.List r0 = r0.getTransitionInfos()
                                            java.lang.Iterable r0 = (java.lang.Iterable) r0
                                            boolean r1 = r0 instanceof java.util.Collection
                                            java.lang.String r2 = "FragmentManager"
                                            r3 = 2
                                            if (r1 == 0) goto L19
                                            r1 = r0
                                            java.util.Collection r1 = (java.util.Collection) r1
                                            boolean r1 = r1.isEmpty()
                                            if (r1 == 0) goto L19
                                            goto L6e
                                        L19:
                                            java.util.Iterator r0 = r0.iterator()
                                        L1d:
                                            boolean r1 = r0.hasNext()
                                            if (r1 == 0) goto L6e
                                            java.lang.Object r1 = r0.next()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
                                            androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.getOperation()
                                            boolean r1 = r1.isSeeking()
                                            if (r1 != 0) goto L1d
                                            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                                            if (r0 == 0) goto L3e
                                            java.lang.String r0 = "Completing animating immediately"
                                            android.util.Log.v(r2, r0)
                                        L3e:
                                            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
                                            r0.<init>()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            androidx.fragment.app.FragmentTransitionImpl r1 = r1.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            java.util.List r2 = r2.getTransitionInfos()
                                            r3 = 0
                                            java.lang.Object r2 = r2.get(r3)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
                                            androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                                            androidx.fragment.app.Fragment r2 = r2.getFragment()
                                            java.lang.Object r3 = r6.$mergedTransition
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r4 = r6.this$0
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda1 r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda1
                                            r5.<init>(r4)
                                            r1.setListenerForTransitionEnd(r2, r3, r0, r5)
                                            r0.cancel()
                                            return
                                        L6e:
                                            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                                            if (r0 == 0) goto L79
                                            java.lang.String r0 = "Animating to start"
                                            android.util.Log.v(r2, r0)
                                        L79:
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            androidx.fragment.app.FragmentTransitionImpl r0 = r0.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            java.lang.Object r1 = r1.getController()
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            android.view.ViewGroup r3 = r6.$container
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda0 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda0
                                            r4.<init>(r2, r3)
                                            r0.animateToStart(r1, r4)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1.invoke():void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final void invoke$lambda$2(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(container, "$container");
                                        Iterator it = this$0.getTransitionInfos().iterator();
                                        while (it.hasNext()) {
                                            SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation();
                                            View view = operation.getFragment().getView();
                                            if (view != null) {
                                                operation.getFinalState().applyState(view, container);
                                            }
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final void invoke$lambda$4(DefaultSpecialEffectsController.TransitionEffect this$0) {
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        if (FragmentManager.isLoggingEnabled(2)) {
                                            Log.v("FragmentManager", "Transition for all operations has completed");
                                        }
                                        Iterator it = this$0.getTransitionInfos().iterator();
                                        while (it.hasNext()) {
                                            ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().completeEffect(this$0);
                                        }
                                    }
                                }
                            });
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void onStart$lambda$6$lambda$4(Ref$ObjectRef seekCancelLambda) {
                        Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
                        Function0 function0 = (Function0) seekCancelLambda.element;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void onStart$lambda$6$lambda$5(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
                        Intrinsics.checkNotNullParameter(operation, "$operation");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                        }
                        operation.completeEffect(this$0);
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public void onProgress(BackEventCompat backEvent, ViewGroup container) {
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        Intrinsics.checkNotNullParameter(container, "container");
                        Object obj = this.controller;
                        if (obj != null) {
                            this.transitionImpl.setCurrentPlayTime(obj, backEvent.getProgress());
                        }
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public void onCommit(final ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        int i = 0;
                        if (container.isLaidOut() && !this.noControllerReturned) {
                            Object obj = this.controller;
                            if (obj != null) {
                                FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                                Intrinsics.checkNotNull(obj);
                                fragmentTransitionImpl.animateToEnd(obj);
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                                    return;
                                }
                                return;
                            }
                            Pair createMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
                            ArrayList arrayList = (ArrayList) createMergedTransition.component1();
                            final Object component2 = createMergedTransition.component2();
                            List list = this.transitionInfos;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((TransitionInfo) it.next()).getOperation());
                            }
                            int size = arrayList2.size();
                            while (i < size) {
                                Object obj2 = arrayList2.get(i);
                                i++;
                                final SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj2;
                                this.transitionImpl.setListenerForTransitionEnd(operation.getFragment(), component2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation.this, this);
                                    }
                                });
                            }
                            runTransition(arrayList, container, new Function0() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    DefaultSpecialEffectsController.TransitionEffect.this.getTransitionImpl().beginDelayedTransition(container, component2);
                                }
                            });
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
                                return;
                            }
                            return;
                        }
                        for (TransitionInfo transitionInfo : this.transitionInfos) {
                            SpecialEffectsController.Operation operation2 = transitionInfo.getOperation();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                if (this.noControllerReturned) {
                                    Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + operation2);
                                } else {
                                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation2);
                                }
                            }
                            transitionInfo.getOperation().completeEffect(this);
                        }
                        this.noControllerReturned = false;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
                        Intrinsics.checkNotNullParameter(operation, "$operation");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                        }
                        operation.completeEffect(this$0);
                    }

                    private final Pair createMergedTransition(ViewGroup viewGroup, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
                        final SpecialEffectsController.Operation operation3 = operation;
                        final SpecialEffectsController.Operation operation4 = operation2;
                        View view = new View(viewGroup.getContext());
                        final Rect rect = new Rect();
                        Iterator it = this.transitionInfos.iterator();
                        View view2 = null;
                        boolean z = false;
                        while (it.hasNext()) {
                            if (((TransitionInfo) it.next()).hasSharedElementTransition() && operation4 != null && operation3 != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                                FragmentTransition.callSharedElementStartEnd(operation3.getFragment(), operation4.getFragment(), this.isPop, this.firstOutViews, true);
                                OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12(SpecialEffectsController.Operation.this, operation4, this);
                                    }
                                });
                                this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                                if (!this.exitingNames.isEmpty()) {
                                    Object obj = this.exitingNames.get(0);
                                    Intrinsics.checkNotNullExpressionValue(obj, "exitingNames[0]");
                                    view2 = (View) this.firstOutViews.get((String) obj);
                                    this.transitionImpl.setEpicenter(this.sharedElementTransition, view2);
                                }
                                this.sharedElementLastInViews.addAll(this.lastInViews.values());
                                if (!this.enteringNames.isEmpty()) {
                                    Object obj2 = this.enteringNames.get(0);
                                    Intrinsics.checkNotNullExpressionValue(obj2, "enteringNames[0]");
                                    final View view3 = (View) this.lastInViews.get((String) obj2);
                                    if (view3 != null) {
                                        final FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                                        OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13(FragmentTransitionImpl.this, view3, rect);
                                            }
                                        });
                                        z = true;
                                    }
                                }
                                this.transitionImpl.setSharedElementTargets(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                                FragmentTransitionImpl fragmentTransitionImpl2 = this.transitionImpl;
                                Object obj3 = this.sharedElementTransition;
                                fragmentTransitionImpl2.scheduleRemoveTargets(obj3, null, null, null, null, obj3, this.sharedElementLastInViews);
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = this.transitionInfos.iterator();
                        Object obj4 = null;
                        Object obj5 = null;
                        while (it2.hasNext()) {
                            TransitionInfo transitionInfo = (TransitionInfo) it2.next();
                            SpecialEffectsController.Operation operation5 = transitionInfo.getOperation();
                            boolean z2 = z;
                            Object cloneTransition = this.transitionImpl.cloneTransition(transitionInfo.getTransition());
                            if (cloneTransition != null) {
                                final ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = it2;
                                View view4 = operation5.getFragment().mView;
                                Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                                captureTransitioningViews(arrayList2, view4);
                                if (this.sharedElementTransition != null && (operation5 == operation4 || operation5 == operation3)) {
                                    if (operation5 == operation4) {
                                        arrayList2.removeAll(CollectionsKt.toSet(this.sharedElementFirstOutViews));
                                    } else {
                                        arrayList2.removeAll(CollectionsKt.toSet(this.sharedElementLastInViews));
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    this.transitionImpl.addTarget(cloneTransition, view);
                                } else {
                                    this.transitionImpl.addTargets(cloneTransition, arrayList2);
                                    this.transitionImpl.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList2, null, null, null, null);
                                    if (operation5.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                                        operation5.setAwaitingContainerChanges(false);
                                        ArrayList arrayList3 = new ArrayList(arrayList2);
                                        arrayList3.remove(operation5.getFragment().mView);
                                        this.transitionImpl.scheduleHideFragmentView(cloneTransition, operation5.getFragment().mView, arrayList3);
                                        OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14(arrayList2);
                                            }
                                        });
                                    }
                                }
                                if (operation5.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                                    arrayList.addAll(arrayList2);
                                    if (z2) {
                                        this.transitionImpl.setEpicenter(cloneTransition, rect);
                                    }
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v("FragmentManager", "Entering Transition: " + cloneTransition);
                                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                                        int size = arrayList2.size();
                                        int i = 0;
                                        while (i < size) {
                                            int i2 = size;
                                            Object transitioningViews = arrayList2.get(i);
                                            i++;
                                            Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                            Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                                            size = i2;
                                        }
                                    }
                                } else {
                                    this.transitionImpl.setEpicenter(cloneTransition, view2);
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v("FragmentManager", "Exiting Transition: " + cloneTransition);
                                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                                        int i3 = 0;
                                        for (int size2 = arrayList2.size(); i3 < size2; size2 = size2) {
                                            Object transitioningViews2 = arrayList2.get(i3);
                                            i3++;
                                            Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                            Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                                        }
                                    }
                                }
                                if (transitionInfo.isOverlapAllowed()) {
                                    obj4 = this.transitionImpl.mergeTransitionsTogether(obj4, cloneTransition, null);
                                } else {
                                    obj5 = this.transitionImpl.mergeTransitionsTogether(obj5, cloneTransition, null);
                                }
                                operation3 = operation;
                                operation4 = operation2;
                                z = z2;
                                it2 = it3;
                            } else {
                                operation3 = operation;
                                operation4 = operation2;
                                z = z2;
                            }
                        }
                        Object mergeTransitionsInSequence = this.transitionImpl.mergeTransitionsInSequence(obj4, obj5, this.sharedElementTransition);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Final merged transition: " + mergeTransitionsInSequence + " for container " + viewGroup);
                        }
                        return new Pair(arrayList, mergeTransitionsInSequence);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void createMergedTransition$lambda$12(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, TransitionEffect this$0) {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), this$0.isPop, this$0.lastInViews, false);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void createMergedTransition$lambda$13(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
                        Intrinsics.checkNotNullParameter(impl, "$impl");
                        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                        impl.getBoundsOnScreen(view, lastInEpicenterRect);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void createMergedTransition$lambda$14(ArrayList transitioningViews) {
                        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                        FragmentTransition.setViewVisibility(transitioningViews, 4);
                    }

                    private final void runTransition(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
                        FragmentTransition.setViewVisibility(arrayList, 4);
                        ArrayList prepareSetNameOverridesReordered = this.transitionImpl.prepareSetNameOverridesReordered(this.sharedElementLastInViews);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                            ArrayList arrayList2 = this.sharedElementFirstOutViews;
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                Object sharedElementFirstOutViews = arrayList2.get(i);
                                i++;
                                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                                View view = (View) sharedElementFirstOutViews;
                                Log.v("FragmentManager", "View: " + view + " Name: " + ViewCompat.getTransitionName(view));
                            }
                            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                            ArrayList arrayList3 = this.sharedElementLastInViews;
                            int size2 = arrayList3.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object sharedElementLastInViews = arrayList3.get(i2);
                                i2++;
                                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                                View view2 = (View) sharedElementLastInViews;
                                Log.v("FragmentManager", "View: " + view2 + " Name: " + ViewCompat.getTransitionName(view2));
                            }
                        }
                        function0.invoke();
                        this.transitionImpl.setNameOverridesReordered(viewGroup, this.sharedElementFirstOutViews, this.sharedElementLastInViews, prepareSetNameOverridesReordered, this.sharedElementNameMapping);
                        FragmentTransition.setViewVisibility(arrayList, 0);
                        this.transitionImpl.swapSharedElementTargets(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public void onCancel(ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        this.transitionSignal.cancel();
                    }

                    private final void captureTransitioningViews(ArrayList arrayList, View view) {
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) view;
                            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                                if (arrayList.contains(view)) {
                                    return;
                                }
                                arrayList.add(view);
                                return;
                            }
                            int childCount = viewGroup.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View child = viewGroup.getChildAt(i);
                                if (child.getVisibility() == 0) {
                                    Intrinsics.checkNotNullExpressionValue(child, "child");
                                    captureTransitioningViews(arrayList, child);
                                }
                            }
                            return;
                        }
                        if (arrayList.contains(view)) {
                            return;
                        }
                        arrayList.add(view);
                    }
                }

                public static final class Api24Impl {
                    public static final Api24Impl INSTANCE = new Api24Impl();

                    private Api24Impl() {
                    }

                    public final long totalDuration(AnimatorSet animatorSet) {
                        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
                        return animatorSet.getTotalDuration();
                    }
                }

                public static final class Api26Impl {
                    public static final Api26Impl INSTANCE = new Api26Impl();

                    private Api26Impl() {
                    }

                    public final void reverse(AnimatorSet animatorSet) {
                        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
                        animatorSet.reverse();
                    }

                    public final void setCurrentPlayTime(AnimatorSet animatorSet, long j) {
                        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
                        animatorSet.setCurrentPlayTime(j);
                    }
                }
            }
