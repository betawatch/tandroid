package e9;

import java.util.Iterator;
import java.util.ListIterator;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class m0 extends n0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ n0 e;

    public m0(n0 n0Var, int i10, int i11) {
        this.e = n0Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // e9.n0, java.util.List
    /* renamed from: B */
    public final n0 subList(int i10, int i11) {
        u6.n(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        u6.j(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // e9.n0, e9.i0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // e9.n0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // e9.i0
    public final Object[] n() {
        return this.e.n();
    }

    @Override // e9.i0
    public final int o() {
        return this.e.p() + this.c + this.d;
    }

    @Override // e9.i0
    public final int p() {
        return this.e.p() + this.c;
    }

    @Override // e9.i0
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // e9.n0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
