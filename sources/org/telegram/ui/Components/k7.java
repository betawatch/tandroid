package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k7 extends tc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.cs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7(org.telegram.messenger.cs csVar, Context context, int i3) {
        super(context);
        this.b = i3;
        this.c = csVar;
    }

    @Override // org.telegram.ui.Components.tc
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                z7 z7Var = (z7) this.c;
                z7Var.updateColors();
                org.telegram.ui.tq tqVar = z7Var.F1;
                if (tqVar != null) {
                    tqVar.a(d1.f.u());
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
                m51 m51Var = photoViewer.G2;
                if (m51Var != null) {
                    m51Var.t0(d1.f.u() || photoViewer.r);
                }
                org.telegram.ui.tq tqVar2 = photoViewer.x0;
                if (tqVar2 != null) {
                    tqVar2.a(d1.f.u());
                    break;
                }
                break;
        }
    }
}
