package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class q1 extends p implements f1 {
    public final f1 e;
    public final a4.l f;

    public q1(f1 f1Var, a4.l lVar) {
        f1Var.getClass();
        this.e = f1Var;
        this.f = lVar;
    }

    @Override // e9.n1
    public final void clear() {
        this.e.clear();
    }

    @Override // e9.p
    public final Map d() {
        return new m1(this.e.b(), new e1.c(this, 1));
    }

    @Override // e9.p
    public final Collection e() {
        return new o(this, 0);
    }

    @Override // e9.p
    public final Set f() {
        return this.e.keySet();
    }

    @Override // e9.p
    public final Iterator g() {
        return new b1(this.e.a().iterator(), new a6.i(this.f, 16));
    }

    @Override // e9.n1
    public final Collection get(Object obj) {
        return s.x((List) this.e.get(obj), new n4.s(16, this.f, obj));
    }

    @Override // e9.p, e9.n1
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // e9.n1
    public final int size() {
        return this.e.size();
    }
}
