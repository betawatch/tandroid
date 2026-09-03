package f5;

import h5.d0;
import j3.g2;
import j3.q2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class x {
    public final int a;
    public final g2[] b;
    public final c[] c;
    public final q2 d;
    public final Object e;

    public x(g2[] g2VarArr, c[] cVarArr, q2 q2Var, s sVar) {
        this.b = g2VarArr;
        this.c = (c[]) cVarArr.clone();
        this.d = q2Var;
        this.e = sVar;
        this.a = g2VarArr.length;
    }

    public final boolean a(x xVar, int i10) {
        return xVar != null && d0.a(this.b[i10], xVar.b[i10]) && d0.a(this.c[i10], xVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
