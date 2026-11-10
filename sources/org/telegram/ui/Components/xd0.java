package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                org.telegram.ui.fq0 fq0Var = this.b.a;
                RadialProgressView radialProgressView = fq0Var.n;
                View view = fq0Var.r;
                radialProgressView.setVisibility(4);
                if (fq0Var.F) {
                    fq0Var.F = false;
                    fq0Var.setPlaybackSpeed(fq0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = fq0Var.b;
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
