package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class i61 extends g.o {
    public final /* synthetic */ k61 c;

    public i61(k61 k61Var) {
        this.c = k61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        k61 k61Var = this.c;
        org.telegram.ui.Components.wz wzVar = k61Var.X;
        org.telegram.ui.Components.u61 u61Var = k61Var.d0;
        if (u61Var == null) {
            return wzVar.J;
        }
        org.telegram.ui.Components.h61 G = u61Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
    }
}
