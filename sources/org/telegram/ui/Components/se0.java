package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ue0 b;

    public /* synthetic */ se0(ue0 ue0Var, int i10) {
        this.a = i10;
        this.b = ue0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.mr0 mr0Var = this.b.a;
                RadialProgressView radialProgressView = mr0Var.n;
                View view = mr0Var.r;
                radialProgressView.setVisibility(4);
                if (mr0Var.F) {
                    mr0Var.F = false;
                    mr0Var.setPlaybackSpeed(mr0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = mr0Var.b;
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
