package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd0 b;

    public /* synthetic */ xd0(zd0 zd0Var, int i7) {
        this.a = i7;
        this.b = zd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.cq0 cq0Var = this.b.a;
                RadialProgressView radialProgressView = cq0Var.n;
                View view = cq0Var.r;
                radialProgressView.setVisibility(4);
                if (cq0Var.F) {
                    cq0Var.F = false;
                    cq0Var.setPlaybackSpeed(cq0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = cq0Var.b;
                if (photoViewer != null) {
                    photoViewer.s0();
                    break;
                }
                break;
            default:
                this.b.a.h.setVisibility(4);
                break;
        }
    }
}
