package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                s6.b((s6) this.b, z10, f7);
                break;
            default:
                o9 o9Var = (o9) this.b;
                o9Var.X = null;
                o9Var.Y = 1.0f;
                o9Var.A0();
                break;
        }
    }
}
