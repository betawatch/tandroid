package h9;

import a8.ia;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class h0 extends i0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i0 e;

    public h0(i0 i0Var, int i7, int i10) {
        this.e = i0Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ia.j(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // h9.i0, h9.d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // h9.d0
    public final Object[] j() {
        return this.e.j();
    }

    @Override // h9.d0
    public final int k() {
        return this.e.l() + this.c + this.d;
    }

    @Override // h9.d0
    public final int l() {
        return this.e.l() + this.c;
    }

    @Override // h9.i0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // h9.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // h9.i0, java.util.List
    /* renamed from: x */
    public final i0 subList(int i7, int i10) {
        ia.n(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // h9.i0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
        return listIterator(i7);
    }
}
