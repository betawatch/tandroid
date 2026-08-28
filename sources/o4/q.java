package o4;

import h3.s0;
import h3.t0;
import j4.a1;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends a1 {
    public final Map H;
    public l3.c I;

    public q(com.google.android.exoplayer2.upstream.r rVar, l3.i iVar, a6.a aVar, Map map) {
        super(rVar, iVar, aVar);
        this.H = map;
    }

    @Override // j4.a1
    public final t0 m(t0 t0Var) {
        l3.c cVar;
        l3.c cVar2 = this.I;
        if (cVar2 == null) {
            cVar2 = t0Var.E;
        }
        if (cVar2 != null && (cVar = (l3.c) this.H.get(cVar2.c)) != null) {
            cVar2 = cVar;
        }
        z3.c cVar3 = t0Var.s;
        z3.c cVar4 = null;
        if (cVar3 != null) {
            z3.b[] bVarArr = cVar3.a;
            int length = bVarArr.length;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                z3.b bVar = bVarArr[i10];
                if ((bVar instanceof e4.m) && "com.apple.streaming.transportStreamTimestamp".equals(((e4.m) bVar).b)) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                if (length != 1) {
                    z3.b[] bVarArr2 = new z3.b[length - 1];
                    while (i9 < length) {
                        if (i9 != i10) {
                            bVarArr2[i9 < i10 ? i9 : i9 - 1] = bVarArr[i9];
                        }
                        i9++;
                    }
                    cVar4 = new z3.c(bVarArr2);
                }
            }
            if (cVar2 == t0Var.E || cVar3 != t0Var.s) {
                s0 a2 = t0Var.a();
                a2.r = cVar2;
                a2.i = cVar3;
                t0Var = new t0(a2);
            }
            return super.m(t0Var);
        }
        cVar3 = cVar4;
        if (cVar2 == t0Var.E) {
        }
        s0 a22 = t0Var.a();
        a22.r = cVar2;
        a22.i = cVar3;
        t0Var = new t0(a22);
        return super.m(t0Var);
    }
}
