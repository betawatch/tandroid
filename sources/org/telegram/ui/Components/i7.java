package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i7 extends oc {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.messenger.vs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7(org.telegram.messenger.vs vsVar, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = vsVar;
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
                v61 v61Var = photoViewer.F2;
                if (v61Var != null) {
                    v61Var.t0(b5.d.u() || photoViewer.r);
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
