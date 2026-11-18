package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bo0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ yo0 d;

    public /* synthetic */ bo0(yo0 yo0Var, int i7) {
        this.c = i7;
        this.d = yo0Var;
    }

    @Override // g.p
    public final int i(int i7) {
        switch (this.c) {
            case 0:
                if (i7 == 0) {
                    return this.d.D1.J;
                }
                return 1;
            case 1:
                vo0 vo0Var = this.d.I1;
                return (i7 == vo0Var.x || i7 == vo0Var.y || i7 == vo0Var.E || i7 == vo0Var.G || vo0Var.d(i7) == 0) ? 4 : 1;
            default:
                if (i7 == 0) {
                    return this.d.E1.J;
                }
                return 1;
        }
    }
}
