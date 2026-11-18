package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class he0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je0 b;

    public /* synthetic */ he0(je0 je0Var, int i7) {
        this.a = i7;
        this.b = je0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.dq0 dq0Var = this.b.a;
                RadialProgressView radialProgressView = dq0Var.n;
                View view = dq0Var.r;
                radialProgressView.setVisibility(4);
                if (dq0Var.G) {
                    dq0Var.G = false;
                    dq0Var.setPlaybackSpeed(dq0Var.F);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = dq0Var.b;
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
