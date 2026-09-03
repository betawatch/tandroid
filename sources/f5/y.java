package f5;

import h5.d0;
import j3.g2;
import j3.q2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y {
    public final int a;
    public final g2[] b;
    public final c[] c;
    public final q2 d;
    public final Object e;

    public y(g2[] g2VarArr, c[] cVarArr, q2 q2Var, s sVar) {
        this.b = g2VarArr;
        this.c = (c[]) cVarArr.clone();
        this.d = q2Var;
        this.e = sVar;
        this.a = g2VarArr.length;
    }

    public final boolean a(y yVar, int i10) {
        return yVar != null && d0.a(this.b[i10], yVar.b[i10]) && d0.a(this.c[i10], yVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
