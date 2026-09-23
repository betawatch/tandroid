package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class t7 extends md {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.md
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                j8 j8Var = (j8) this.c;
                j8Var.D0();
                org.telegram.ui.ur urVar = j8Var.O;
                if (urVar != null) {
                    urVar.a(b5.d.u());
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
                f71 f71Var = photoViewer.F2;
                if (f71Var != null) {
                    f71Var.O(b5.d.u() || photoViewer.r);
                }
                org.telegram.ui.ur urVar2 = photoViewer.w0;
                if (urVar2 != null) {
                    urVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
