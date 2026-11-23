package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p7 extends zc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.fs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7(org.telegram.messenger.fs fsVar, Context context, int i7) {
        super(context);
        this.b = i7;
        this.c = fsVar;
    }

    @Override // org.telegram.ui.Components.zc
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                e8 e8Var = (e8) this.c;
                e8Var.updateColors();
                org.telegram.ui.xq xqVar = e8Var.I1;
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
                h61 h61Var = photoViewer.G2;
                if (h61Var != null) {
                    h61Var.t0(d1.f.u() || photoViewer.r);
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
