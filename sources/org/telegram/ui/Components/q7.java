package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q7 extends zc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.fs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(org.telegram.messenger.fs fsVar, Context context, int i7) {
        super(context);
        this.b = i7;
        this.c = fsVar;
    }

    @Override // org.telegram.ui.Components.zc
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                g8 g8Var = (g8) this.c;
                g8Var.updateColors();
                org.telegram.ui.xq xqVar = g8Var.I1;
                if (xqVar != null) {
                    xqVar.a(d1.f.u());
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
                f61 f61Var = photoViewer.G2;
                if (f61Var != null) {
                    f61Var.t0(d1.f.u() || photoViewer.r);
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
