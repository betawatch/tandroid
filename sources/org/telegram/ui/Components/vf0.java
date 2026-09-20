package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf0 b;

    public /* synthetic */ vf0(xf0 xf0Var, int i10) {
        this.a = i10;
        this.b = xf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.iu0 iu0Var = this.b.a;
                RadialProgressView radialProgressView = iu0Var.n;
                View view = iu0Var.r;
                radialProgressView.setVisibility(4);
                if (iu0Var.F) {
                    iu0Var.F = false;
                    iu0Var.setPlaybackSpeed(iu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = iu0Var.b;
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
