package ji;

import ai.f2;
import ai.p0;
import ai.t;
import org.telegram.messenger.y10;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ f(o oVar, String[] strArr, int i7) {
        this.a = i7;
        this.b = oVar;
        this.c = strArr;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        f2 f2Var;
        r rVar;
        f2 f2Var2;
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                o oVar = this.b;
                oVar.getClass();
                if (num.intValue() != 0) {
                    String str = this.c[num.intValue() - 1];
                    t J = DictationAsr.J(str);
                    boolean z10 = (J == null || DictationAsr.y(J)) ? false : true;
                    DictationAsr.X(str);
                    DictationAsr.t(J);
                    if (z10 && oVar.c == 2 && (rVar = oVar.h) != null) {
                        oVar.n = "";
                        if (rVar.P1) {
                            rVar.x1 = null;
                        }
                        rVar.k0 = "";
                        rVar.y1 = -1;
                        rVar.l0 = null;
                        rVar.o0.clear();
                        rVar.U0 = true;
                        rVar.D0 = 0.0f;
                        rVar.C0 = 0.0f;
                        rVar.E0 = 0.0f;
                        rVar.F0 = 0.0f;
                        rVar.H0 = -1.0f;
                        rVar.G0 = -1.0f;
                        rVar.J0 = -1.0f;
                        rVar.L0 = false;
                        rVar.S0 = 0L;
                        rVar.T0 = 0.0f;
                        rVar.A0 = true;
                        rVar.Z0 = true;
                        rVar.invalidate();
                    }
                    r rVar2 = oVar.h;
                    if (rVar2 != null) {
                        rVar2.setLanguage(p0.H(str));
                    }
                    if (oVar.c == 2 && (f2Var = oVar.f) != null) {
                        f2Var.q(str);
                    }
                    oVar.t();
                    break;
                } else {
                    DictationAsr.Y(true);
                    break;
                }
                break;
            default:
                if (num.intValue() != 0) {
                    String str2 = this.c[num.intValue() - 1];
                    t J2 = DictationAsr.J(str2);
                    boolean z11 = (J2 == null || DictationAsr.y(J2)) ? false : true;
                    DictationAsr.X(str2);
                    DictationAsr.t(J2);
                    o oVar2 = this.b;
                    if (z11 && oVar2.c == 2 && oVar2.X == null && oVar2.e0 == null) {
                        oVar2.M.clear();
                        oVar2.o();
                    }
                    String H = p0.H(str2);
                    oVar2.l0 = H;
                    e eVar = oVar2.K;
                    if (eVar != null) {
                        eVar.setLanguage(H);
                    }
                    if (oVar2.c == 2 && (f2Var2 = oVar2.f) != null) {
                        f2Var2.q(str2);
                    }
                    oVar2.t();
                    break;
                } else {
                    DictationAsr.Y(true);
                    break;
                }
        }
    }
}
