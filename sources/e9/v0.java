package e9;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class v0 extends y0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ w0 e;

    public /* synthetic */ v0(w0 w0Var, int i10) {
        this.d = i10;
        this.e = w0Var;
    }

    @Override // e9.i0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof t1)) {
                    return false;
                }
                t1 t1Var = (t1) obj;
                if (t1Var.a() <= 0) {
                    return false;
                }
                return ((d2) this.e).e.b(t1Var.a) == t1Var.a();
            default:
                return ((d2) this.e).contains(obj);
        }
    }

    @Override // e9.y0, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.d) {
            case 0:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // e9.i0
    public final int m(int i10, Object[] objArr) {
        return h().m(i10, objArr);
    }

    @Override // e9.i0
    public final boolean q() {
        switch (this.d) {
            case 0:
                this.e.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override // e9.i0
    /* renamed from: r */
    public final m2 iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.d) {
            case 0:
                return this.e.s().size();
            default:
                return ((d2) this.e).e.c;
        }
    }

    @Override // e9.y0
    public final n0 v() {
        return new z0(this);
    }
}
