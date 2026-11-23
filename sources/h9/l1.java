package h9;

import di.v6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class l1 extends l implements a1 {
    public final a1 e;
    public final h6.o f;

    public l1(a1 a1Var, h6.o oVar) {
        a1Var.getClass();
        this.e = a1Var;
        this.f = oVar;
    }

    @Override // h9.i1
    public final void clear() {
        this.e.clear();
    }

    @Override // h9.l
    public final Map d() {
        return new h1(this.e.b(), new v6(this, 16));
    }

    @Override // h9.l
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override // h9.l
    public final Set f() {
        return this.e.keySet();
    }

    @Override // h9.l
    public final Iterator g() {
        return new w0(this.e.a().iterator(), new ob.c(this.f, 26));
    }

    @Override // h9.i1
    public final Collection get(Object obj) {
        return o.y((List) this.e.get(obj), new q4.q(this.f, obj, false, 24));
    }

    @Override // h9.l, h9.i1
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // h9.i1
    public final int size() {
        return this.e.size();
    }
}
