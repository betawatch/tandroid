package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                if (bq0Var.F) {
                    bq0Var.F = false;
                    bq0Var.setPlaybackSpeed(bq0Var.E);
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
