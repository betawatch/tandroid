package b5;

import d5.g0;
import h3.i2;
import h3.u2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z {
    public final int a;
    public final i2[] b;
    public final s[] c;
    public final u2 d;
    public final Object e;

    public z(i2[] i2VarArr, s[] sVarArr, u2 u2Var, u uVar) {
        this.b = i2VarArr;
        this.c = (s[]) sVarArr.clone();
        this.d = u2Var;
        this.e = uVar;
        this.a = i2VarArr.length;
    }

    public final boolean a(z zVar, int i10) {
        return zVar != null && g0.a(this.b[i10], zVar.b[i10]) && g0.a(this.c[i10], zVar.c[i10]);
    }

    public final boolean b(int i10) {
        return this.b[i10] != null;
    }
}
