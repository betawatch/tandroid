package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ ag0(cg0 cg0Var, int i10) {
        this.a = i10;
        this.b = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.du0 du0Var = this.b.a;
                RadialProgressView radialProgressView = du0Var.n;
                View view = du0Var.r;
                radialProgressView.setVisibility(4);
                if (du0Var.F) {
                    du0Var.F = false;
                    du0Var.setPlaybackSpeed(du0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = du0Var.b;
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
