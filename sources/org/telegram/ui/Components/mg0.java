package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ mg0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.rt0 rt0Var = this.b.a;
                RadialProgressView radialProgressView = rt0Var.n;
                View view = rt0Var.r;
                radialProgressView.setVisibility(4);
                if (rt0Var.F) {
                    rt0Var.F = false;
                    rt0Var.setPlaybackSpeed(rt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = rt0Var.b;
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
