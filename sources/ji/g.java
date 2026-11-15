package ji;

import ai.c2;
import ai.n0;
import ai.t;
import org.telegram.messenger.z10;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ g(m mVar, String[] strArr, int i7) {
        this.a = i7;
        this.b = mVar;
        this.c = strArr;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        c2 c2Var;
        p pVar;
        c2 c2Var2;
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                m mVar = this.b;
                mVar.getClass();
                if (num.intValue() != 0) {
                    String str = this.c[num.intValue() - 1];
                    t H = DictationAsr.H(str);
                    boolean z10 = (H == null || DictationAsr.w(H)) ? false : true;
                    DictationAsr.S(str);
                    DictationAsr.s(H);
                    if (z10 && mVar.c == 2 && (pVar = mVar.h) != null) {
                        mVar.n = "";
                        if (pVar.N1) {
                            pVar.v1 = null;
                        }
                        pVar.i0 = "";
                        pVar.w1 = -1;
                        pVar.j0 = null;
                        pVar.m0.clear();
                        pVar.S0 = true;
                        pVar.B0 = 0.0f;
                        pVar.A0 = 0.0f;
                        pVar.C0 = 0.0f;
                        pVar.D0 = 0.0f;
                        pVar.F0 = -1.0f;
                        pVar.E0 = -1.0f;
                        pVar.H0 = -1.0f;
                        pVar.J0 = false;
                        pVar.Q0 = 0L;
                        pVar.R0 = 0.0f;
                        pVar.y0 = true;
                        pVar.X0 = true;
                        pVar.invalidate();
                    }
                    p pVar2 = mVar.h;
                    if (pVar2 != null) {
                        pVar2.setLanguage(n0.l(str));
                    }
                    if (mVar.c == 2 && (c2Var = mVar.f) != null) {
                        c2Var.p(str);
                    }
                    mVar.t();
                    break;
                } else {
                    DictationAsr.T(true);
                    break;
                }
                break;
            default:
                if (num.intValue() != 0) {
                    String str2 = this.c[num.intValue() - 1];
                    t H2 = DictationAsr.H(str2);
                    boolean z11 = (H2 == null || DictationAsr.w(H2)) ? false : true;
                    DictationAsr.S(str2);
                    DictationAsr.s(H2);
                    m mVar2 = this.b;
                    if (z11 && mVar2.c == 2 && mVar2.X == null && mVar2.e0 == null) {
                        mVar2.M.clear();
                        mVar2.n();
                    }
                    String l10 = n0.l(str2);
                    mVar2.l0 = l10;
                    e eVar = mVar2.K;
                    if (eVar != null) {
                        eVar.setLanguage(l10);
                    }
                    if (mVar2.c == 2 && (c2Var2 = mVar2.f) != null) {
                        c2Var2.p(str2);
                    }
                    mVar2.t();
                    break;
                } else {
                    DictationAsr.T(true);
                    break;
                }
        }
    }
}
