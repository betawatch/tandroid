package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sn0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ po0 d;

    public /* synthetic */ sn0(po0 po0Var, int i7) {
        this.c = i7;
        this.d = po0Var;
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
                mo0 mo0Var = this.d.I1;
                return (i7 == mo0Var.x || i7 == mo0Var.y || i7 == mo0Var.E || i7 == mo0Var.G || mo0Var.d(i7) == 0) ? 4 : 1;
            default:
                if (i7 == 0) {
                    return this.d.E1.J;
                }
                return 1;
        }
    }
}
