package f9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q0 extends t0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ r0 e;

    public /* synthetic */ q0(r0 r0Var, int i10) {
        this.d = i10;
        this.e = r0Var;
    }

    @Override // f9.d0, java.util.AbstractCollection, java.util.Collection
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

    @Override // f9.t0, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.d) {
            case 0:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // f9.d0
    public final int m(int i10, Object[] objArr) {
        return h().m(i10, objArr);
    }

    @Override // f9.d0
    public final boolean q() {
        switch (this.d) {
            case 0:
                this.e.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override // f9.d0
    /* renamed from: r */
    public final g2 iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.d) {
            case 0:
                return this.e.s().size();
            default:
                return ((y1) this.e).e.c;
        }
    }

    @Override // f9.t0
    public final i0 v() {
        return new u0(this);
    }
}
