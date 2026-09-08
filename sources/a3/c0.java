package a3;

import android.hardware.display.DisplayManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c0 implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ e0 b;

    public c0(e0 e0Var, DisplayManager displayManager) {
        this.b = e0Var;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            e0.a(this.b, this.a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
