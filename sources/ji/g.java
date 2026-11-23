package ji;

import ai.l0;
import ai.w1;
import org.telegram.messenger.w10;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ g(n nVar, String[] strArr, int i7) {
        this.a = i7;
        this.b = nVar;
        this.c = strArr;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        w1 w1Var;
        q qVar;
        w1 w1Var2;
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                n nVar = this.b;
                nVar.getClass();
                if (num.intValue() != 0) {
                    String str = this.c[num.intValue() - 1];
                    ai.q M = DictationAsr.M(str);
                    boolean z10 = (M == null || DictationAsr.A(M)) ? false : true;
                    DictationAsr.a0(str);
                    DictationAsr.v(M);
                    if (z10 && nVar.c == 2 && (qVar = nVar.h) != null) {
                        nVar.n = "";
                        if (qVar.P1) {
                            qVar.x1 = null;
                        }
                        qVar.k0 = "";
                        qVar.y1 = -1;
                        qVar.l0 = null;
                        qVar.o0.clear();
                        qVar.U0 = true;
                        qVar.D0 = 0.0f;
                        qVar.C0 = 0.0f;
                        qVar.E0 = 0.0f;
                        qVar.F0 = 0.0f;
                        qVar.H0 = -1.0f;
                        qVar.G0 = -1.0f;
                        qVar.J0 = -1.0f;
                        qVar.L0 = false;
                        qVar.S0 = 0L;
                        qVar.T0 = 0.0f;
                        qVar.A0 = true;
                        qVar.Z0 = true;
                        qVar.invalidate();
                    }
                    q qVar2 = nVar.h;
                    if (qVar2 != null) {
                        qVar2.setLanguage(l0.F(str));
                    }
                    if (nVar.c == 2 && (w1Var = nVar.f) != null) {
                        w1Var.j(str);
                    }
                    nVar.s();
                    break;
                } else {
                    DictationAsr.b0(true);
                    break;
                }
                break;
            default:
                if (num.intValue() != 0) {
                    String str2 = this.c[num.intValue() - 1];
                    ai.q M2 = DictationAsr.M(str2);
                    boolean z11 = (M2 == null || DictationAsr.A(M2)) ? false : true;
                    DictationAsr.a0(str2);
                    DictationAsr.v(M2);
                    n nVar2 = this.b;
                    if (z11 && nVar2.c == 2 && nVar2.X == null && nVar2.e0 == null) {
                        nVar2.M.clear();
                        nVar2.m();
                    }
                    String F = l0.F(str2);
                    nVar2.l0 = F;
                    e eVar = nVar2.K;
                    if (eVar != null) {
                        eVar.setLanguage(F);
                    }
                    if (nVar2.c == 2 && (w1Var2 = nVar2.f) != null) {
                        w1Var2.j(str2);
                    }
                    nVar2.s();
                    break;
                } else {
                    DictationAsr.b0(true);
                    break;
                }
        }
    }
}
