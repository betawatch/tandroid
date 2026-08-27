package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m7 extends yc {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.yc
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                b8 b8Var = (b8) this.c;
                b8Var.D0();
                org.telegram.ui.pr prVar = b8Var.K;
                if (prVar != null) {
                    prVar.a(d1.f.t());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.f1 f1Var = photoViewer.B0;
                if (f1Var != null) {
                    f1Var.d(z10);
                    photoViewer.B0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                m61 m61Var = photoViewer.B2;
                if (m61Var != null) {
                    m61Var.P(d1.f.t() || photoViewer.r);
                }
                org.telegram.ui.pr prVar2 = photoViewer.s0;
                if (prVar2 != null) {
                    prVar2.a(d1.f.t());
                    break;
                }
                break;
        }
    }
}
