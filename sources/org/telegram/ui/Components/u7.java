package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class u7 extends ld {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.ld
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                k8 k8Var = (k8) this.c;
                k8Var.updateColors();
                org.telegram.ui.nr nrVar = k8Var.N;
                if (nrVar != null) {
                    nrVar.a(b5.d.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.e1 e1Var = photoViewer.F0;
                if (e1Var != null) {
                    e1Var.f(z10);
                    photoViewer.F0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                j81 j81Var = photoViewer.F2;
                if (j81Var != null) {
                    j81Var.O(b5.d.u() || photoViewer.r);
                }
                org.telegram.ui.nr nrVar2 = photoViewer.w0;
                if (nrVar2 != null) {
                    nrVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
