package b5;

import d5.f0;
import h3.i2;
import h3.t2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 {
    public final int a;
    public final i2[] b;
    public final t[] c;
    public final t2 d;
    public final Object e;

    public a0(i2[] i2VarArr, t[] tVarArr, t2 t2Var, v vVar) {
        this.b = i2VarArr;
        this.c = (t[]) tVarArr.clone();
        this.d = t2Var;
        this.e = vVar;
        this.a = i2VarArr.length;
    }

    public final boolean a(a0 a0Var, int i9) {
        return a0Var != null && f0.a(this.b[i9], a0Var.b[i9]) && f0.a(this.c[i9], a0Var.c[i9]);
    }

    public final boolean b(int i9) {
        return this.b[i9] != null;
    }
}
