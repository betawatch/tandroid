package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                p6.b((p6) this.b, z10, f7);
                break;
            default:
                l9 l9Var = (l9) this.b;
                l9Var.X = null;
                l9Var.Y = 1.0f;
                l9Var.A0();
                break;
        }
    }
}
