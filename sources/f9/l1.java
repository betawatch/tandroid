package f9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l1 extends l implements a1 {
    public final a1 e;
    public final b6.i f;

    public l1(a1 a1Var, b6.i iVar) {
        a1Var.getClass();
        this.e = a1Var;
        this.f = iVar;
    }

    @Override // f9.i1
    public final void clear() {
        this.e.clear();
    }

    @Override // f9.l
    public final Map d() {
        return new h1(this.e.b(), new e1.c(this, 4));
    }

    @Override // f9.l
    public final Collection e() {
        return new a8.f(this, 2);
    }

    @Override // f9.l
    public final Set f() {
        return this.e.keySet();
    }

    @Override // f9.l
    public final Iterator g() {
        return new w0(this.e.a().iterator(), new za.c(this.f, 19));
    }

    @Override // f9.i1
    public final Collection get(Object obj) {
        return o.x((List) this.e.get(obj), new n4.s(17, this.f, obj));
    }

    @Override // f9.l, f9.i1
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // f9.i1
    public final int size() {
        return this.e.size();
    }
}
