package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;
    public final /* synthetic */ r1.g c;

    public /* synthetic */ xm0(fn0 fn0Var, r1.g gVar, int i7) {
        this.a = i7;
        this.b = fn0Var;
        this.c = gVar;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    gVar.d();
                    break;
                }
                break;
            default:
                fn0 fn0Var = this.b;
                if (!z10) {
                    fn0Var.z.remove(this.c);
                    gVar.d();
                    break;
                } else {
                    fn0Var.getClass();
                    break;
                }
        }
    }
}
