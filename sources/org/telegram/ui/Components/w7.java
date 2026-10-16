package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class w7 extends nd {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.nd
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                m8 m8Var = (m8) this.c;
                m8Var.d();
                org.telegram.ui.cs csVar = m8Var.O;
                if (csVar != null) {
                    csVar.a(b5.d.u());
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
                i81 i81Var = photoViewer.F2;
                if (i81Var != null) {
                    i81Var.O(b5.d.u() || photoViewer.r);
                }
                org.telegram.ui.cs csVar2 = photoViewer.w0;
                if (csVar2 != null) {
                    csVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
