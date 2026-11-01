package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ue0 b;

    public /* synthetic */ se0(ue0 ue0Var, int i10) {
        this.a = i10;
        this.b = ue0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.lr0 lr0Var = this.b.a;
                RadialProgressView radialProgressView = lr0Var.n;
                View view = lr0Var.r;
                radialProgressView.setVisibility(4);
                if (lr0Var.F) {
                    lr0Var.F = false;
                    lr0Var.setPlaybackSpeed(lr0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = lr0Var.b;
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
