package o4;

import h3.s0;
import h3.t0;
import j4.a1;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q extends a1 {
    public final Map H;
    public l3.d I;

    public q(com.google.android.exoplayer2.upstream.r rVar, l3.j jVar, b6.a aVar, Map map) {
        super(rVar, jVar, aVar);
        this.H = map;
    }

    @Override // j4.a1
    public final t0 m(t0 t0Var) {
        l3.d dVar;
        l3.d dVar2 = this.I;
        if (dVar2 == null) {
            dVar2 = t0Var.E;
        }
        if (dVar2 != null && (dVar = (l3.d) this.H.get(dVar2.c)) != null) {
            dVar2 = dVar;
        }
        z3.c cVar = t0Var.s;
        z3.c cVar2 = null;
        if (cVar != null) {
            z3.b[] bVarArr = cVar.a;
            int length = bVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                z3.b bVar = bVarArr[i11];
                if ((bVar instanceof e4.m) && "com.apple.streaming.transportStreamTimestamp".equals(((e4.m) bVar).b)) {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                if (length != 1) {
                    z3.b[] bVarArr2 = new z3.b[length - 1];
                    while (i10 < length) {
                        if (i10 != i11) {
                            bVarArr2[i10 < i11 ? i10 : i10 - 1] = bVarArr[i10];
                        }
                        i10++;
                    }
                    cVar2 = new z3.c(bVarArr2);
                }
            }
            if (dVar2 == t0Var.E || cVar != t0Var.s) {
                s0 a2 = t0Var.a();
                a2.r = dVar2;
                a2.i = cVar;
                t0Var = new t0(a2);
            }
            return super.m(t0Var);
        }
        cVar = cVar2;
        if (dVar2 == t0Var.E) {
        }
        s0 a22 = t0Var.a();
        a22.r = dVar2;
        a22.i = cVar;
        t0Var = new t0(a22);
        return super.m(t0Var);
    }
}
