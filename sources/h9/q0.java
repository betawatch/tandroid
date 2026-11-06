package h9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class q0 extends t0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ r0 e;

    public /* synthetic */ q0(r0 r0Var, int i7) {
        this.d = i7;
        this.e = r0Var;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof p1)) {
                    return false;
                }
                p1 p1Var = (p1) obj;
                if (p1Var.a() <= 0) {
                    return false;
                }
                return ((z1) this.e).e.b(p1Var.a) == p1Var.a();
            default:
                return ((z1) this.e).contains(obj);
        }
    }

    @Override // h9.t0, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.d) {
            case 0:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // h9.d0
    public final int i(int i7, Object[] objArr) {
        return f().i(i7, objArr);
    }

    @Override // h9.d0
    public final boolean m() {
        switch (this.d) {
            case 0:
                this.e.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override // h9.d0
    /* renamed from: n */
    public final h2 iterator() {
        return f().listIterator(0);
    }

    @Override // h9.t0
    public final i0 r() {
        return new u0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.d) {
            case 0:
                return this.e.o().size();
            default:
                return ((z1) this.e).e.c;
        }
    }
}
