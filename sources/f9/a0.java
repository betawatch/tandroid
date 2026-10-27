package f9;

import java.util.Collection;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
