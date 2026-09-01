package i5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import h5.d0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q implements p, DisplayManager.DisplayListener {
    public final DisplayManager a;
    public hg.f b;

    public q(DisplayManager displayManager) {
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        hg.f fVar = this.b;
        if (fVar == null || i10 != 0) {
            return;
        }
        fVar.a(this.a.getDisplay(0));
    }

    @Override // i5.p
    public final void r(hg.f fVar) {
        this.b = fVar;
        Handler l10 = d0.l(null);
        DisplayManager displayManager = this.a;
        displayManager.registerDisplayListener(this, l10);
        fVar.a(displayManager.getDisplay(0));
    }

    @Override // i5.p
    public final void s() {
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
