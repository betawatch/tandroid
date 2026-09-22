package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class r7 extends kd {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.kd
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                h8 h8Var = (h8) this.c;
                h8Var.D0();
                org.telegram.ui.yr yrVar = h8Var.O;
                if (yrVar != null) {
                    yrVar.a(b5.d.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.f1 f1Var = photoViewer.F0;
                if (f1Var != null) {
                    f1Var.d(z10);
                    photoViewer.F0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                g71 g71Var = photoViewer.F2;
                if (g71Var != null) {
                    g71Var.O(b5.d.u() || photoViewer.r);
                }
                org.telegram.ui.yr yrVar2 = photoViewer.w0;
                if (yrVar2 != null) {
                    yrVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
