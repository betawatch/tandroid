package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg0 b;

    public /* synthetic */ kg0(mg0 mg0Var, int i10) {
        this.a = i10;
        this.b = mg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.xt0 xt0Var = this.b.a;
                RadialProgressView radialProgressView = xt0Var.n;
                View view = xt0Var.r;
                radialProgressView.setVisibility(4);
                if (xt0Var.F) {
                    xt0Var.F = false;
                    xt0Var.setPlaybackSpeed(xt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = xt0Var.b;
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
