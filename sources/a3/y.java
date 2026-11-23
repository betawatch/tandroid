package a3;

import a8.ma;
import e2.s1;
import j$.util.Objects;
import l2.n1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class y {
    public final int a;
    public final n1[] b;
    public final u[] c;
    public final s1 d;
    public final Object e;

    public y(n1[] n1VarArr, u[] uVarArr, s1 s1Var, Object obj) {
        ma.f(n1VarArr.length == uVarArr.length);
        this.b = n1VarArr;
        this.c = (u[]) uVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.a = n1VarArr.length;
    }

    public final boolean a(y yVar, int i7) {
        return yVar != null && Objects.equals(this.b[i7], yVar.b[i7]) && Objects.equals(this.c[i7], yVar.c[i7]);
    }

    public final boolean b(int i7) {
        return this.b[i7] != null;
    }
}
