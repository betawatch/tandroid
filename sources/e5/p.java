package e5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p implements o, DisplayManager.DisplayListener {
    public final DisplayManager a;
    public a1.c b;

    public p(DisplayManager displayManager) {
        this.a = displayManager;
    }

    @Override // e5.o
    public final void m(a1.c cVar) {
        this.b = cVar;
        Handler k10 = g0.k(null);
        DisplayManager displayManager = this.a;
        displayManager.registerDisplayListener(this, k10);
        cVar.a(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        a1.c cVar = this.b;
        if (cVar == null || i10 != 0) {
            return;
        }
        cVar.a(this.a.getDisplay(0));
    }

    @Override // e5.o
    public final void r() {
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
