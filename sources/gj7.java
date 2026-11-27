// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gj7 extends r3 {
    public final r3 e;
    public final kj4 f;

    public gj7(r3 r3Var, kj4 kj4Var) {
        r3Var.getClass();
        this.e = r3Var;
        this.f = kj4Var;
    }

    @Override // r3
    public final void b() {
        this.e.b();
    }

    @Override // r3
    public final Map d() {
        return new sk6(this.e.a(), new bm6(this, (byte) 14));
    }

    @Override // r3
    public final Collection e() {
        return new q3(this, (byte) 0);
    }

    @Override // r3
    public final Set f() {
        return this.e.j();
    }

    @Override // r3
    public final Iterator h() {
        return new nu5(this.e.g().iterator(), new pk6(this.f));
    }

    @Override // r3
    public final Collection i(Object obj) {
        return ose.b((List) this.e.i(obj), new nk6(this.f, obj));
    }

    @Override // r3
    public final boolean k(Object obj, Object obj2) {
        return i(obj).remove(obj2);
    }

    @Override // r3
    public final int l() {
        return this.e.l();
    }
}
