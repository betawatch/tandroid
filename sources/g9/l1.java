package g9;

import ei.y8;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l1 extends l implements a1 {
    public final a1 e;
    public final c6.i f;

    public l1(a1 a1Var, c6.i iVar) {
        a1Var.getClass();
        this.e = a1Var;
        this.f = iVar;
    }

    @Override // g9.i1
    public final void clear() {
        this.e.clear();
    }

    @Override // g9.l
    public final Map d() {
        return new h1(this.e.b(), new y8(this, 4));
    }

    @Override // g9.l
    public final Collection e() {
        return new b8.f(this, 2);
    }

    @Override // g9.l
    public final Set f() {
        return this.e.keySet();
    }

    @Override // g9.l
    public final Iterator g() {
        return new w0(this.e.a().iterator(), new bb.c(this.f, 27));
    }

    @Override // g9.i1
    public final Collection get(Object obj) {
        return o.y((List) this.e.get(obj), new tf.b(this.f, obj));
    }

    @Override // g9.l, g9.i1
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // g9.i1
    public final int size() {
        return this.e.size();
    }
}
