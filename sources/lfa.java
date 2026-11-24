// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lfa extends kfa {
    public final /* synthetic */ mfa H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfa(mfa mfaVar, Context context, int i) {
        super(mfaVar.e, context, i, false);
        this.H = mfaVar;
    }

    @Override // kfa, w39
    public final void f() {
        super.f();
        mfa mfaVar = this.H;
        nfa nfaVar = mfaVar.e;
        int i = mfaVar.a;
        int[] iArr = nfa.t2;
        iea P = nfaVar.P(i);
        if (P != null && P.n.getVisibility() == 0) {
            mfaVar.d.f();
        }
        if (P != null) {
            eda edaVar = P.w;
            y1b y1bVar = this.s;
            edaVar.e(y1bVar != null && (y1bVar.k() || (nfaVar.d0() && this.s.g() > 0)), true);
        }
    }
}
