package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                org.telegram.ui.qt0 qt0Var = this.b.a;
                RadialProgressView radialProgressView = qt0Var.n;
                View view = qt0Var.r;
                radialProgressView.setVisibility(4);
                if (qt0Var.F) {
                    qt0Var.F = false;
                    qt0Var.setPlaybackSpeed(qt0Var.E);
                }
                view.setEnabled(true);
                view.setAlpha(1.0f);
                PhotoViewer photoViewer = qt0Var.b;
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
