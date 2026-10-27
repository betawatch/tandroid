package f9;

import a8.yb;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h0 extends i0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i0 e;

    public h0(i0 i0Var, int i10, int i11) {
        this.e = i0Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // f9.i0, java.util.List
    /* renamed from: B */
    public final i0 subList(int i10, int i11) {
        yb.n(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        yb.j(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // f9.i0, f9.d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // f9.i0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // f9.d0
    public final Object[] n() {
        return this.e.n();
    }

    @Override // f9.d0
    public final int o() {
        return this.e.p() + this.c + this.d;
    }

    @Override // f9.d0
    public final int p() {
        return this.e.p() + this.c;
    }

    @Override // f9.d0
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // f9.i0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
