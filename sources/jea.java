// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jea extends kha {
    public final /* synthetic */ nha H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jea(nha nhaVar, Context context) {
        super(nhaVar, context, 0, true);
        this.H = nhaVar;
    }

    @Override // kha, y59
    public final void f() {
        super.f();
        nha nhaVar = this.H;
        iga P = nhaVar.P(9);
        if (P != null && P.n.getVisibility() == 0) {
            nhaVar.i0.f();
        }
        if (P != null) {
            efa efaVar = P.w;
            z3b z3bVar = this.s;
            efaVar.e(z3bVar != null && (z3bVar.k() || (nhaVar.d0() && this.s.g() > 0)), true);
        }
    }
}
