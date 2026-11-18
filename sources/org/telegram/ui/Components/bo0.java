package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
