package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf0 b;

    public /* synthetic */ nf0(pf0 pf0Var, int i10) {
        this.a = i10;
        this.b = pf0Var;
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
