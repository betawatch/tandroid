package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class q1 extends p implements f1 {
    public final f1 e;
    public final ag.b f;

    public q1(f1 f1Var, ag.b bVar) {
        f1Var.getClass();
        this.e = f1Var;
        this.f = bVar;
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
