package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v7 extends pd {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.pd
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                l8 l8Var = (l8) this.c;
                l8Var.e();
                org.telegram.ui.xr xrVar = l8Var.O;
                if (xrVar != null) {
                    xrVar.a(b5.d.u());
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
                k81 k81Var = photoViewer.F2;
                if (k81Var != null) {
                    k81Var.O(b5.d.u() || photoViewer.r);
                }
                org.telegram.ui.xr xrVar2 = photoViewer.w0;
                if (xrVar2 != null) {
                    xrVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
