package ji;

import ai.c2;
import ai.n0;
import ai.t;
import org.telegram.messenger.x10;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ g(m mVar, String[] strArr, int i7) {
        this.a = i7;
        this.b = mVar;
        this.c = strArr;
    }

    @Override // org.telegram.messenger.x10
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
                    DictationAsr.r(H);
                    if (z10 && mVar.c == 2 && (pVar = mVar.h) != null) {
                        mVar.n = "";
                        if (pVar.P1) {
                            pVar.x1 = null;
                        }
                        pVar.k0 = "";
                        pVar.y1 = -1;
                        pVar.l0 = null;
                        pVar.o0.clear();
                        pVar.U0 = true;
                        pVar.D0 = 0.0f;
                        pVar.C0 = 0.0f;
                        pVar.E0 = 0.0f;
                        pVar.F0 = 0.0f;
                        pVar.H0 = -1.0f;
                        pVar.G0 = -1.0f;
                        pVar.J0 = -1.0f;
                        pVar.L0 = false;
                        pVar.S0 = 0L;
                        pVar.T0 = 0.0f;
                        pVar.A0 = true;
                        pVar.Z0 = true;
                        pVar.invalidate();
                    }
                    p pVar2 = mVar.h;
                    if (pVar2 != null) {
                        pVar2.setLanguage(n0.p(str));
                    }
                    if (mVar.c == 2 && (c2Var = mVar.f) != null) {
                        c2Var.p(str);
                    }
                    mVar.u();
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
                    DictationAsr.r(H2);
                    m mVar2 = this.b;
                    if (z11 && mVar2.c == 2 && mVar2.X == null && mVar2.e0 == null) {
                        mVar2.M.clear();
                        mVar2.p();
                    }
                    String p10 = n0.p(str2);
                    mVar2.l0 = p10;
                    e eVar = mVar2.K;
                    if (eVar != null) {
                        eVar.setLanguage(p10);
                    }
                    if (mVar2.c == 2 && (c2Var2 = mVar2.f) != null) {
                        c2Var2.p(str2);
                    }
                    mVar2.u();
                    break;
                } else {
                    DictationAsr.T(true);
                    break;
                }
        }
    }
}
