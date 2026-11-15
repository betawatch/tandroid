package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                org.telegram.ui.bq0 bq0Var = this.b.a;
                RadialProgressView radialProgressView = bq0Var.n;
                View view = bq0Var.r;
                radialProgressView.setVisibility(4);
                if (bq0Var.G) {
                    bq0Var.G = false;
                    bq0Var.setPlaybackSpeed(bq0Var.F);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = bq0Var.b;
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
