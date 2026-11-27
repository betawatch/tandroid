// default package

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class oo5 extends po5 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ po5 e;

    public oo5(po5 po5Var, int i, int i2) {
        this.e = po5Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yve.j(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // po5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // jo5
    public final Object[] j() {
        return this.e.j();
    }

    @Override // jo5
    public final int k() {
        return this.e.l() + this.c + this.d;
    }

    @Override // jo5
    public final int l() {
        return this.e.l() + this.c;
    }

    @Override // po5, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // jo5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // po5, java.util.List
    /* renamed from: x */
    public final po5 subList(int i, int i2) {
        yve.n(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // po5, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
