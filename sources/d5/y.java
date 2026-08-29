package d5;

import f5.d0;
import j3.i2;
import j3.t2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y {
    public final int a;
    public final i2[] b;
    public final r[] c;
    public final t2 d;
    public final Object e;

    public y(i2[] i2VarArr, r[] rVarArr, t2 t2Var, t tVar) {
        this.b = i2VarArr;
        this.c = (r[]) rVarArr.clone();
        this.d = t2Var;
        this.e = tVar;
        this.a = i2VarArr.length;
    }

    public final boolean a(y yVar, int i10) {
        return yVar != null && d0.a(this.b[i10], yVar.b[i10]) && d0.a(this.c[i10], yVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
