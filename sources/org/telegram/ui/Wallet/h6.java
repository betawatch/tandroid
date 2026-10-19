package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class h6 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                m6.b((m6) this.b, z10, f7);
                break;
            default:
                i9 i9Var = (i9) this.b;
                i9Var.X = null;
                i9Var.Y = 1.0f;
                i9Var.A0();
                break;
        }
    }
}
