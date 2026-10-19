package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg0 b;

    public /* synthetic */ hg0(jg0 jg0Var, int i10) {
        this.a = i10;
        this.b = jg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ot0 ot0Var = this.b.a;
                RadialProgressView radialProgressView = ot0Var.n;
                View view = ot0Var.r;
                radialProgressView.setVisibility(4);
                if (ot0Var.F) {
                    ot0Var.F = false;
                    ot0Var.setPlaybackSpeed(ot0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = ot0Var.b;
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
