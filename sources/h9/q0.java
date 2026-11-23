package h9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class q0 extends t0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ r0 e;

    public /* synthetic */ q0(r0 r0Var, int i7) {
        this.d = i7;
        this.e = r0Var;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection
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
    public final g2 iterator() {
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
                return ((y1) this.e).e.c;
        }
    }
}
