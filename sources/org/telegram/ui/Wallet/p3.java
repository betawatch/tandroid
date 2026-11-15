package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                v3 v3Var = (v3) this.b;
                v3Var.H = f10;
                v3Var.c();
                break;
            case 1:
                q8 q8Var = (q8) this.b;
                q8Var.e = f10;
                q8Var.setScaleX(f10);
                q8Var.setScaleY(f10);
                break;
            case 2:
                p9 p9Var = (p9) this.b;
                p9Var.c0 = f10;
                p9Var.G0();
                break;
            default:
                ((o9) this.b).d.setConversionWobble(f10);
                break;
        }
    }
}
