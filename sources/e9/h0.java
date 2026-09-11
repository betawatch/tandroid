package e9;

import java.util.Iterator;
import java.util.ListIterator;
import v7.t6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    @Override // e9.i0, java.util.List
    /* renamed from: C */
    public final i0 subList(int i10, int i11) {
        t6.f(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t6.c(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // e9.i0, e9.d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // e9.i0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // e9.d0
    public final Object[] o() {
        return this.e.o();
    }

    @Override // e9.d0
    public final int p() {
        return this.e.q() + this.c + this.d;
    }

    @Override // e9.d0
    public final int q() {
        return this.e.q() + this.c;
    }

    @Override // e9.d0
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // e9.i0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
