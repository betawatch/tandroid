package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag0 b;

    public /* synthetic */ yf0(ag0 ag0Var, int i10) {
        this.a = i10;
        this.b = ag0Var;
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
