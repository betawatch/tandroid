package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m7 extends vc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.ls c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(org.telegram.messenger.ls lsVar, Context context, int i7) {
        super(context);
        this.b = i7;
        this.c = lsVar;
    }

    @Override // org.telegram.ui.Components.vc
    public final void c(boolean z9) {
        switch (this.b) {
            case 0:
                b8 b8Var = (b8) this.c;
                b8Var.updateColors();
                org.telegram.ui.wq wqVar = b8Var.E1;
                if (wqVar != null) {
                    wqVar.a(d1.f.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.z0 z0Var = photoViewer.F0;
                if (z0Var != null) {
                    z0Var.f(z9);
                    photoViewer.F0.setSelectorColor(z9 ? 259241196 : 268435455);
                }
                u51 u51Var = photoViewer.F2;
                if (u51Var != null) {
                    u51Var.t0(d1.f.u() || photoViewer.r);
                }
                org.telegram.ui.wq wqVar2 = photoViewer.w0;
                if (wqVar2 != null) {
                    wqVar2.a(d1.f.u());
                    break;
                }
                break;
        }
    }
}
