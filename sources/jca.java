// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jca extends kfa {
    public final /* synthetic */ nfa H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jca(nfa nfaVar, Context context) {
        super(nfaVar, context, 0, true);
        this.H = nfaVar;
    }

    @Override // kfa, w39
    public final void f() {
        super.f();
        nfa nfaVar = this.H;
        iea P = nfaVar.P(9);
        if (P != null && P.n.getVisibility() == 0) {
            nfaVar.i0.f();
        }
        if (P != null) {
            eda edaVar = P.w;
            y1b y1bVar = this.s;
            edaVar.e(y1bVar != null && (y1bVar.k() || (nfaVar.d0() && this.s.g() > 0)), true);
        }
    }
}
