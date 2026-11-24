// default package

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lo5 extends mo5 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ mo5 e;

    public lo5(mo5 mo5Var, int i, int i2) {
        this.e = mo5Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jte.j(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // mo5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // go5
    public final Object[] j() {
        return this.e.j();
    }

    @Override // go5
    public final int k() {
        return this.e.l() + this.c + this.d;
    }

    @Override // go5
    public final int l() {
        return this.e.l() + this.c;
    }

    @Override // mo5, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // go5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // mo5, java.util.List
    /* renamed from: x */
    public final mo5 subList(int i, int i2) {
        jte.n(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // mo5, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
