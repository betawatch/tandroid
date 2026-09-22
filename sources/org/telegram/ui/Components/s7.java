package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class s7 extends md {
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.md
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                i8 i8Var = (i8) this.c;
                i8Var.D0();
                org.telegram.ui.yr yrVar = i8Var.O;
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
                v71 v71Var = photoViewer.F2;
                if (v71Var != null) {
                    v71Var.O(b5.d.u() || photoViewer.r);
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
