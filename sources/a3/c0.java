package a3;

import android.hardware.display.DisplayManager;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
