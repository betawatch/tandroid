package f9;

import java.util.Collection;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class a0 extends l0 {
    @Override // f9.l0
    public final d0 d() {
        throw new AssertionError("should never be called");
    }

    @Override // f9.l0
    /* renamed from: e */
    public final d0 values() {
        r1 r1Var = ((r1) this).n;
        t0 t0Var = r1Var.b;
        if (t0Var != null) {
            return t0Var;
        }
        v1 c10 = r1Var.c();
        r1Var.b = c10;
        return c10;
    }

    @Override // f9.l0, java.util.Map
    public final Collection values() {
        r1 r1Var = ((r1) this).n;
        t0 t0Var = r1Var.b;
        if (t0Var != null) {
            return t0Var;
        }
        v1 c10 = r1Var.c();
        r1Var.b = c10;
        return c10;
    }
}
