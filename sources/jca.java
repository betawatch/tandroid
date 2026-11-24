// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
