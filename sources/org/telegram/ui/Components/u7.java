package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                k8Var.d();
                org.telegram.ui.lr lrVar = k8Var.O;
                if (lrVar != null) {
                    lrVar.a(b5.d.u());
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
                b81 b81Var = photoViewer.F2;
                if (b81Var != null) {
                    b81Var.O(b5.d.u() || photoViewer.r);
                }
                org.telegram.ui.lr lrVar2 = photoViewer.w0;
                if (lrVar2 != null) {
                    lrVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
