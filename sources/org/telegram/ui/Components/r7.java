package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r7 extends fd {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.fd
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                g8 g8Var = (g8) this.c;
                g8Var.D0();
                org.telegram.ui.nr nrVar = g8Var.K;
                if (nrVar != null) {
                    nrVar.a(d1.f.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.B0;
                if (g1Var != null) {
                    g1Var.d(z10);
                    photoViewer.B0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                x61 x61Var = photoViewer.B2;
                if (x61Var != null) {
                    x61Var.P(d1.f.u() || photoViewer.r);
                }
                org.telegram.ui.nr nrVar2 = photoViewer.s0;
                if (nrVar2 != null) {
                    nrVar2.a(d1.f.u());
                    break;
                }
                break;
        }
    }
}
