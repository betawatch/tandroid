package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u7 extends md {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.md
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                k8 k8Var = (k8) this.c;
                k8Var.D0();
                org.telegram.ui.zr zrVar = k8Var.O;
                if (zrVar != null) {
                    zrVar.a(b5.d.u());
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
                org.telegram.ui.zr zrVar2 = photoViewer.w0;
                if (zrVar2 != null) {
                    zrVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
