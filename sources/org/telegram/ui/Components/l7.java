package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l7 extends uc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.ls c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7(org.telegram.messenger.ls lsVar, Context context, int i7) {
        super(context);
        this.b = i7;
        this.c = lsVar;
    }

    @Override // org.telegram.ui.Components.uc
    public final void c(boolean z9) {
        switch (this.b) {
            case 0:
                a8 a8Var = (a8) this.c;
                a8Var.updateColors();
                org.telegram.ui.xq xqVar = a8Var.H1;
                if (xqVar != null) {
                    xqVar.a(d1.f.u());
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
                t51 t51Var = photoViewer.F2;
                if (t51Var != null) {
                    t51Var.t0(d1.f.u() || photoViewer.r);
                }
                org.telegram.ui.xq xqVar2 = photoViewer.w0;
                if (xqVar2 != null) {
                    xqVar2.a(d1.f.u());
                    break;
                }
                break;
        }
    }
}
