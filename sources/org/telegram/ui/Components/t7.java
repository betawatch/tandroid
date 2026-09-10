package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t7 extends kd {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.kd
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                j8 j8Var = (j8) this.c;
                j8Var.D0();
                org.telegram.ui.as asVar = j8Var.O;
                if (asVar != null) {
                    asVar.a(b5.d.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.F0;
                if (g1Var != null) {
                    g1Var.d(z10);
                    photoViewer.F0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                t71 t71Var = photoViewer.F2;
                if (t71Var != null) {
                    t71Var.O(b5.d.u() || photoViewer.r);
                }
                org.telegram.ui.as asVar2 = photoViewer.w0;
                if (asVar2 != null) {
                    asVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
