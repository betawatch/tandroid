package g9;

import b8.zb;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h0 extends i0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i0 e;

    public h0(i0 i0Var, int i3, int i10) {
        this.e = i0Var;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        zb.j(i3, this.d);
        return this.e.get(i3 + this.c);
    }

    @Override // g9.i0, g9.d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // g9.d0
    public final Object[] j() {
        return this.e.j();
    }

    @Override // g9.d0
    public final int k() {
        return this.e.l() + this.c + this.d;
    }

    @Override // g9.d0
    public final int l() {
        return this.e.l() + this.c;
    }

    @Override // g9.i0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // g9.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // g9.i0, java.util.List
    /* renamed from: x */
    public final i0 subList(int i3, int i10) {
        zb.n(i3, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i3 + i11, i10 + i11);
    }

    @Override // g9.i0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i3) {
        return listIterator(i3);
    }
}
