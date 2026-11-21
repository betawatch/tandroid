package a3;

import a8.la;
import e2.s1;
import j$.util.Objects;
import l2.m1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class y {
    public final int a;
    public final m1[] b;
    public final u[] c;
    public final s1 d;
    public final Object e;

    public y(m1[] m1VarArr, u[] uVarArr, s1 s1Var, Object obj) {
        la.f(m1VarArr.length == uVarArr.length);
        this.b = m1VarArr;
        this.c = (u[]) uVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.a = m1VarArr.length;
    }

    public final boolean a(y yVar, int i7) {
        return yVar != null && Objects.equals(this.b[i7], yVar.b[i7]) && Objects.equals(this.c[i7], yVar.c[i7]);
    }

    public final boolean b(int i7) {
        return this.b[i7] != null;
    }
}
