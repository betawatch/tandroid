package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i7 extends oc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.us c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7(org.telegram.messenger.us usVar, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = usVar;
    }

    @Override // org.telegram.ui.Components.oc
    public final void c(boolean z10) {
        switch (this.b) {
            case 0:
                w7 w7Var = (w7) this.c;
                w7Var.updateColors();
                org.telegram.ui.vr vrVar = w7Var.E1;
                if (vrVar != null) {
                    vrVar.a(b5.d.u());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                org.telegram.ui.ActionBar.b1 b1Var = photoViewer.F0;
                if (b1Var != null) {
                    b1Var.f(z10);
                    photoViewer.F0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                u61 u61Var = photoViewer.F2;
                if (u61Var != null) {
                    u61Var.t0(b5.d.u() || photoViewer.r);
                }
                org.telegram.ui.vr vrVar2 = photoViewer.w0;
                if (vrVar2 != null) {
                    vrVar2.a(b5.d.u());
                    break;
                }
                break;
        }
    }
}
