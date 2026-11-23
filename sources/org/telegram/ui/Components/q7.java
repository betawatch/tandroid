package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class q7 extends zc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.gs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(org.telegram.messenger.gs gsVar, Context context, int i7) {
        super(context);
        this.b = i7;
        this.c = gsVar;
    }

    @Override // org.telegram.ui.Components.zc
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                f8 f8Var = (f8) this.c;
                f8Var.updateColors();
                org.telegram.ui.xq xqVar = f8Var.I1;
                if (xqVar != null) {
                    xqVar.a(d1.f.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.y0 y0Var = photoViewer.G0;
                if (y0Var != null) {
                    y0Var.f(z10);
                    photoViewer.G0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                i61 i61Var = photoViewer.G2;
                if (i61Var != null) {
                    i61Var.t0(d1.f.u() || photoViewer.r);
                }
                org.telegram.ui.xq xqVar2 = photoViewer.x0;
                if (xqVar2 != null) {
                    xqVar2.a(d1.f.u());
                    break;
                }
                break;
        }
    }
}
