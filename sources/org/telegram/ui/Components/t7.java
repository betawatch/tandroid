package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class t7 extends nd {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.nd
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                j8 j8Var = (j8) this.c;
                j8Var.D0();
                org.telegram.ui.tr trVar = j8Var.O;
                if (trVar != null) {
                    trVar.a(b5.d.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.e1 e1Var = photoViewer.F0;
                if (e1Var != null) {
                    e1Var.d(z10);
                    photoViewer.F0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                u71 u71Var = photoViewer.F2;
                if (u71Var != null) {
                    u71Var.O(b5.d.u() || photoViewer.r);
                }
                org.telegram.ui.tr trVar2 = photoViewer.w0;
                if (trVar2 != null) {
                    trVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
