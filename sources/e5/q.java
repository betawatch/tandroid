package e5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q implements p, DisplayManager.DisplayListener {
    public final DisplayManager a;
    public a1.c b;

    public q(DisplayManager displayManager) {
        this.a = displayManager;
    }

    @Override // e5.p
    public final void m(a1.c cVar) {
        this.b = cVar;
        Handler k10 = f0.k(null);
        DisplayManager displayManager = this.a;
        displayManager.registerDisplayListener(this, k10);
        cVar.a(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i9) {
        a1.c cVar = this.b;
        if (cVar == null || i9 != 0) {
            return;
        }
        cVar.a(this.a.getDisplay(0));
    }

    @Override // e5.p
    public final void s() {
        this.a.unregisterDisplayListener(this);
        this.b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i9) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i9) {
    }
}
