// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lha extends kha {
    public final /* synthetic */ mha H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lha(mha mhaVar, Context context, int i) {
        super(mhaVar.e, context, i, false);
        this.H = mhaVar;
    }

    @Override // kha, y59
    public final void f() {
        super.f();
        mha mhaVar = this.H;
        nha nhaVar = mhaVar.e;
        int i = mhaVar.a;
        int[] iArr = nha.t2;
        iga P = nhaVar.P(i);
        if (P != null && P.n.getVisibility() == 0) {
            mhaVar.d.f();
        }
        if (P != null) {
            efa efaVar = P.w;
            z3b z3bVar = this.s;
            efaVar.e(z3bVar != null && (z3bVar.k() || (nhaVar.d0() && this.s.g() > 0)), true);
        }
    }
}
