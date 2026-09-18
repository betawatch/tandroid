package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf0 b;

    public /* synthetic */ nf0(pf0 pf0Var, int i10) {
        this.a = i10;
        this.b = pf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ku0 ku0Var = this.b.a;
                RadialProgressView radialProgressView = ku0Var.n;
                View view = ku0Var.r;
                radialProgressView.setVisibility(4);
                if (ku0Var.F) {
                    ku0Var.F = false;
                    ku0Var.setPlaybackSpeed(ku0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ku0Var.b;
                if (photoViewer != null) {
                    photoViewer.z0();
                    break;
                }
                break;
            default:
                this.b.a.h.setVisibility(4);
                break;
        }
    }
}
