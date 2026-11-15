package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j7 extends qc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.is c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7(org.telegram.messenger.is isVar, Context context, int i7) {
        super(context);
        this.b = i7;
        this.c = isVar;
    }

    @Override // org.telegram.ui.Components.qc
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                y7 y7Var = (y7) this.c;
                y7Var.updateColors();
                org.telegram.ui.wq wqVar = y7Var.I1;
                if (wqVar != null) {
                    wqVar.a(d1.f.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.z0 z0Var = photoViewer.G0;
                if (z0Var != null) {
                    z0Var.f(z10);
                    photoViewer.G0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                u51 u51Var = photoViewer.G2;
                if (u51Var != null) {
                    u51Var.t0(d1.f.u() || photoViewer.r);
                }
                org.telegram.ui.wq wqVar2 = photoViewer.x0;
                if (wqVar2 != null) {
                    wqVar2.a(d1.f.u());
                    break;
                }
                break;
        }
    }
}
