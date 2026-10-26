package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w7 extends kd {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.kd
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                m8 m8Var = (m8) this.c;
                m8Var.updateColors();
                org.telegram.ui.qr qrVar = m8Var.N;
                if (qrVar != null) {
                    qrVar.a(c5.d.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.F0;
                if (g1Var != null) {
                    g1Var.f(z10);
                    photoViewer.F0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                s81 s81Var = photoViewer.F2;
                if (s81Var != null) {
                    s81Var.O(c5.d.u() || photoViewer.r);
                }
                org.telegram.ui.qr qrVar2 = photoViewer.w0;
                if (qrVar2 != null) {
                    qrVar2.a(c5.d.u());
                    break;
                }
                break;
        }
    }
}
