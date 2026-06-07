package androidx.car.app;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* loaded from: classes.dex */
public abstract class Screen implements LifecycleOwner {
    private final LifecycleRegistry mLifecycleRegistry;

    public final void invalidate() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final ScreenManager getScreenManager() {
        throw null;
    }
}
