package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye0 b;

    public /* synthetic */ we0(ye0 ye0Var, int i9) {
        this.a = i9;
        this.b = ye0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.gt0 gt0Var = this.b.a;
                RadialProgressView radialProgressView = gt0Var.n;
                View view = gt0Var.r;
                radialProgressView.setVisibility(4);
                if (gt0Var.B) {
                    gt0Var.B = false;
                    gt0Var.setPlaybackSpeed(gt0Var.A);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = gt0Var.b;
                if (photoViewer != null) {
                    photoViewer.y0();
                    break;
                }
                break;
            default:
                this.b.a.h.setVisibility(4);
                break;
        }
    }
}
