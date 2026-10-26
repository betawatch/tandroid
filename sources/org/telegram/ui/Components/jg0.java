package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg0 b;

    public /* synthetic */ jg0(lg0 lg0Var, int i10) {
        this.a = i10;
        this.b = lg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.vt0 vt0Var = this.b.a;
                RadialProgressView radialProgressView = vt0Var.n;
                View view = vt0Var.r;
                radialProgressView.setVisibility(4);
                if (vt0Var.F) {
                    vt0Var.F = false;
                    vt0Var.setPlaybackSpeed(vt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = vt0Var.b;
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
