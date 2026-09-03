package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n7 extends cd {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.cd
    public final void c(boolean z4) {
        switch (this.b) {
            case 0:
                c8 c8Var = (c8) this.c;
                c8Var.D0();
                org.telegram.ui.ur urVar = c8Var.L;
                if (urVar != null) {
                    urVar.a(d1.f.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.C0;
                if (g1Var != null) {
                    g1Var.d(z4);
                    photoViewer.C0.setSelectorColor(z4 ? 259241196 : 268435455);
                }
                j71 j71Var = photoViewer.C2;
                if (j71Var != null) {
                    j71Var.O(d1.f.u() || photoViewer.r);
                }
                org.telegram.ui.ur urVar2 = photoViewer.t0;
                if (urVar2 != null) {
                    urVar2.a(d1.f.u());
                    break;
                }
                break;
        }
    }
}
