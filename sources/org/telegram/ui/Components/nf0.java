package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                org.telegram.ui.hu0 hu0Var = this.b.a;
                RadialProgressView radialProgressView = hu0Var.n;
                View view = hu0Var.r;
                radialProgressView.setVisibility(4);
                if (hu0Var.F) {
                    hu0Var.F = false;
                    hu0Var.setPlaybackSpeed(hu0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = hu0Var.b;
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
