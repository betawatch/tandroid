package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uf0 b;

    public /* synthetic */ sf0(uf0 uf0Var, int i10) {
        this.a = i10;
        this.b = uf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.nt0 nt0Var = this.b.a;
                RadialProgressView radialProgressView = nt0Var.n;
                View view = nt0Var.r;
                radialProgressView.setVisibility(4);
                if (nt0Var.C) {
                    nt0Var.C = false;
                    nt0Var.setPlaybackSpeed(nt0Var.B);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = nt0Var.b;
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
