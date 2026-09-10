package o2;

import b2.o0;
import b2.p0;
import java.util.Map;
import u2.c1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p extends c1 {
    public final Map H;
    public b2.o I;

    public p(y2.d dVar, n2.n nVar, n2.j jVar, Map map) {
        super(dVar, nVar, jVar);
        this.H = map;
    }

    @Override // u2.c1
    public final b2.s p(b2.s sVar) {
        b2.o oVar;
        b2.o oVar2 = this.I;
        if (oVar2 == null) {
            oVar2 = sVar.v;
        }
        if (oVar2 != null && (oVar = (b2.o) this.H.get(oVar2.c)) != null) {
            oVar2 = oVar;
        }
        p0 p0Var = sVar.l;
        p0 p0Var2 = null;
        if (p0Var != null) {
            o0[] o0VarArr = p0Var.a;
            int length = o0VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                o0 o0Var = o0VarArr[i11];
                if ((o0Var instanceof q3.n) && "com.apple.streaming.transportStreamTimestamp".equals(((q3.n) o0Var).b)) {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                if (length != 1) {
                    o0[] o0VarArr2 = new o0[length - 1];
                    while (i10 < length) {
                        if (i10 != i11) {
                            o0VarArr2[i10 < i11 ? i10 : i10 - 1] = o0VarArr[i10];
                        }
                        i10++;
                    }
                    p0Var2 = new p0(o0VarArr2);
                }
            }
            if (oVar2 == sVar.v || p0Var != sVar.l) {
                b2.r a2 = sVar.a();
                a2.u = oVar2;
                a2.k = p0Var;
                sVar = new b2.s(a2);
            }
            return super.p(sVar);
        }
        p0Var = p0Var2;
        if (oVar2 == sVar.v) {
        }
        b2.r a22 = sVar.a();
        a22.u = oVar2;
        a22.k = p0Var;
        sVar = new b2.s(a22);
        return super.p(sVar);
    }
}
