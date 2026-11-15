package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8 b;

    public /* synthetic */ h8(q8 q8Var, int i7) {
        this.a = i7;
        this.b = q8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == -1) {
                    q8.Z(this.b);
                    break;
                }
                break;
            default:
                q8 q8Var = this.b;
                if (i7 == -1) {
                    q8.Z(q8Var);
                }
                if (i7 == 1) {
                    q8Var.k0();
                    break;
                }
                break;
        }
    }
}
