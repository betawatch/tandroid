package b7;

import f7.i0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u extends v {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ v e;

    public u(v vVar, int i9, int i10) {
        this.e = vVar;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        i0.a(i9, this.d);
        return this.e.get(i9 + this.c);
    }

    @Override // b7.s
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // b7.s
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // b7.s
    public final boolean p() {
        return true;
    }

    @Override // b7.s
    public final Object[] q() {
        return this.e.q();
    }

    @Override // b7.v, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final v subList(int i9, int i10) {
        i0.b(i9, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i9 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
