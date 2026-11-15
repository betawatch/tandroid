package h9;

import di.z6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class l1 extends l implements a1 {
    public final a1 e;
    public final ob.c f;

    public l1(a1 a1Var, ob.c cVar) {
        a1Var.getClass();
        this.e = a1Var;
        this.f = cVar;
    }

    @Override // h9.i1
    public final void clear() {
        this.e.clear();
    }

    @Override // h9.l
    public final Map d() {
        return new h1(this.e.b(), new z6(this, 15));
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
        return new w0(this.e.a().iterator(), new d6.i(this.f, 24));
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
