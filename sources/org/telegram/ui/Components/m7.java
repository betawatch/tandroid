package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                org.telegram.ui.uq uqVar = b8Var.E1;
                if (uqVar != null) {
                    uqVar.a(d1.f.u());
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
                org.telegram.ui.uq uqVar2 = photoViewer.w0;
                if (uqVar2 != null) {
                    uqVar2.a(d1.f.u());
                    break;
                }
                break;
        }
    }
}
