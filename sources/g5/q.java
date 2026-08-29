package g5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import f5.d0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q implements p, DisplayManager.DisplayListener {
    public final DisplayManager a;
    public eg.n b;

    public q(DisplayManager displayManager) {
        this.a = displayManager;
    }

    @Override // g5.p
    public final void c(eg.n nVar) {
        this.b = nVar;
        Handler k9 = d0.k(null);
        DisplayManager displayManager = this.a;
        displayManager.registerDisplayListener(this, k9);
        nVar.c(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        eg.n nVar = this.b;
        if (nVar == null || i10 != 0) {
            return;
        }
        nVar.c(this.a.getDisplay(0));
    }

    @Override // g5.p
    public final void x() {
        this.a.unregisterDisplayListener(this);
        this.b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
