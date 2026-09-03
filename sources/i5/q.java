package i5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import h5.d0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q implements p, DisplayManager.DisplayListener {
    public final DisplayManager a;
    public gg.f b;

    public q(DisplayManager displayManager) {
        this.a = displayManager;
    }

    @Override // i5.p
    public final void l(gg.f fVar) {
        this.b = fVar;
        Handler l10 = d0.l(null);
        DisplayManager displayManager = this.a;
        displayManager.registerDisplayListener(this, l10);
        fVar.a(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        gg.f fVar = this.b;
        if (fVar == null || i10 != 0) {
            return;
        }
        fVar.a(this.a.getDisplay(0));
    }

    @Override // i5.p
    public final void z() {
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
