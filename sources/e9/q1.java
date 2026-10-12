package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class q1 extends p implements f1 {
    public final f1 e;
    public final k6.h f;

    public q1(f1 f1Var, k6.h hVar) {
        f1Var.getClass();
        this.e = f1Var;
        this.f = hVar;
    }

    @Override // e9.n1
    public final void clear() {
        this.e.clear();
    }

    @Override // e9.p
    public final Map d() {
        return new m1(this.e.b(), new a1.c(this, 29));
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
        return s.x((List) this.e.get(obj), new n4.s(14, this.f, obj));
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
