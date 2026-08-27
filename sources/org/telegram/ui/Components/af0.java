package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf0 b;

    public /* synthetic */ af0(cf0 cf0Var, int i10) {
        this.a = i10;
        this.b = cf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ht0 ht0Var = this.b.a;
                RadialProgressView radialProgressView = ht0Var.n;
                View view = ht0Var.r;
                radialProgressView.setVisibility(4);
                if (ht0Var.B) {
                    ht0Var.B = false;
                    ht0Var.setPlaybackSpeed(ht0Var.A);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ht0Var.b;
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
