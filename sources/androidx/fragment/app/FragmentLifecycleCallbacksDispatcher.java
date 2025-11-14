package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FragmentLifecycleCallbacksDispatcher {
    private final FragmentManager fragmentManager;
    private final CopyOnWriteArrayList lifecycleCallbacks;

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList();
    }

    public final void dispatchOnFragmentPreAttached(Fragment f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreAttached(f, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentAttached(Fragment f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentAttached(f, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentPreCreated(Fragment f, Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreCreated(f, bundle, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentCreated(Fragment f, Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentCreated(f, bundle, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentActivityCreated(Fragment f, Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentActivityCreated(f, bundle, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentViewCreated(Fragment f, View v, Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(v, "v");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewCreated(f, v, bundle, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentStarted(Fragment f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStarted(f, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentResumed(Fragment f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentResumed(f, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentPaused(Fragment f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPaused(f, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentStopped(Fragment f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStopped(f, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentSaveInstanceState(Fragment f, Bundle outState, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentSaveInstanceState(f, outState, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentViewDestroyed(Fragment f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewDestroyed(f, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentDestroyed(Fragment f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDestroyed(f, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }

    public final void dispatchOnFragmentDetached(Fragment f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDetached(f, true);
        }
        Iterator it = this.lifecycleCallbacks.iterator();
        if (it.hasNext()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            if (z) {
                throw null;
            }
            throw null;
        }
    }
}
