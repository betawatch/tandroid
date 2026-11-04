package g9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q0 extends t0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ r0 e;

    public /* synthetic */ q0(r0 r0Var, int i3) {
        this.d = i3;
        this.e = r0Var;
    }

    @Override // g9.d0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof o1)) {
                    return false;
                }
                o1 o1Var = (o1) obj;
                if (o1Var.a() <= 0) {
                    return false;
                }
                return ((y1) this.e).e.b(o1Var.a) == o1Var.a();
            default:
                return ((y1) this.e).contains(obj);
        }
    }

    @Override // g9.t0, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.d) {
            case 0:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // g9.d0
    public final int i(int i3, Object[] objArr) {
        return h().i(i3, objArr);
    }

    @Override // g9.d0
    public final boolean m() {
        switch (this.d) {
            case 0:
                this.e.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override // g9.d0
    /* renamed from: n */
    public final g2 iterator() {
        return h().listIterator(0);
    }

    @Override // g9.t0
    public final i0 r() {
        return new u0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.d) {
            case 0:
                return this.e.o().size();
            default:
                return ((y1) this.e).e.c;
        }
    }
}
