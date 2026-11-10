package a3;

import a8.ia;
import e2.s1;
import j$.util.Objects;
import l2.q1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class y {
    public final int a;
    public final q1[] b;
    public final u[] c;
    public final s1 d;
    public final Object e;

    public y(q1[] q1VarArr, u[] uVarArr, s1 s1Var, Object obj) {
        ia.f(q1VarArr.length == uVarArr.length);
        this.b = q1VarArr;
        this.c = (u[]) uVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.a = q1VarArr.length;
    }

    public final boolean a(y yVar, int i7) {
        return yVar != null && Objects.equals(this.b[i7], yVar.b[i7]) && Objects.equals(this.c[i7], yVar.c[i7]);
    }

    public final boolean b(int i7) {
        return this.b[i7] != null;
    }
}
