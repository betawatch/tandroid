package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ td0 b;

    public /* synthetic */ rd0(td0 td0Var, int i3) {
        this.a = i3;
        this.b = td0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.tp0 tp0Var = this.b.a;
                RadialProgressView radialProgressView = tp0Var.n;
                View view = tp0Var.r;
                radialProgressView.setVisibility(4);
                if (tp0Var.G) {
                    tp0Var.G = false;
                    tp0Var.setPlaybackSpeed(tp0Var.F);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = tp0Var.b;
                if (photoViewer != null) {
                    photoViewer.A0();
                    break;
                }
                break;
            default:
                this.b.a.h.setVisibility(4);
                break;
        }
    }
}
