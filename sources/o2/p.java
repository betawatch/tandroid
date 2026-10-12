package o2;

import b2.t0;
import b2.u0;
import b2.w;
import b2.x;
import java.util.Map;
import u2.c1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class p extends c1 {
    public final Map J;
    public b2.t K;

    public p(androidx.biometric.e eVar, n2.n nVar, n2.k kVar, Map map) {
        super(eVar, nVar, kVar);
        this.J = map;
    }

    @Override // u2.c1
    public final x r(x xVar) {
        b2.t tVar;
        b2.t tVar2 = this.K;
        if (tVar2 == null) {
            tVar2 = xVar.w;
        }
        if (tVar2 != null && (tVar = (b2.t) this.J.get(tVar2.c)) != null) {
            tVar2 = tVar;
        }
        u0 u0Var = xVar.l;
        u0 u0Var2 = null;
        if (u0Var != null) {
            t0[] t0VarArr = u0Var.a;
            int length = t0VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                t0 t0Var = t0VarArr[i11];
                if ((t0Var instanceof q3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((q3.m) t0Var).b)) {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                if (length != 1) {
                    t0[] t0VarArr2 = new t0[length - 1];
                    while (i10 < length) {
                        if (i10 != i11) {
                            t0VarArr2[i10 < i11 ? i10 : i10 - 1] = t0VarArr[i10];
                        }
                        i10++;
                    }
                    u0Var2 = new u0(t0VarArr2);
                }
            }
            if (tVar2 == xVar.w || u0Var != xVar.l) {
                w a2 = xVar.a();
                a2.v = tVar2;
                a2.k = u0Var;
                xVar = new x(a2);
            }
            return super.r(xVar);
        }
        u0Var = u0Var2;
        if (tVar2 == xVar.w) {
        }
        w a22 = xVar.a();
        a22.v = tVar2;
        a22.k = u0Var;
        xVar = new x(a22);
        return super.r(xVar);
    }
}
