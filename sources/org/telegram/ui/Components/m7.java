package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m7 extends bd {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i9) {
        super(context);
        this.b = i9;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.bd
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                c8 c8Var = (c8) this.c;
                c8Var.C0();
                org.telegram.ui.nr nrVar = c8Var.K;
                if (nrVar != null) {
                    nrVar.a(d1.f.t());
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
                k61 k61Var = photoViewer.B2;
                if (k61Var != null) {
                    k61Var.P(d1.f.t() || photoViewer.r);
                }
                org.telegram.ui.nr nrVar2 = photoViewer.s0;
                if (nrVar2 != null) {
                    nrVar2.a(d1.f.t());
                    break;
                }
                break;
        }
    }
}
