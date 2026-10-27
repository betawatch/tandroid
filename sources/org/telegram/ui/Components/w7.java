package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                org.telegram.ui.sr srVar = m8Var.N;
                if (srVar != null) {
                    srVar.a(c5.d.u());
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
                t81 t81Var = photoViewer.F2;
                if (t81Var != null) {
                    t81Var.O(c5.d.u() || photoViewer.r);
                }
                org.telegram.ui.sr srVar2 = photoViewer.w0;
                if (srVar2 != null) {
                    srVar2.a(c5.d.u());
                    break;
                }
                break;
        }
    }
}
