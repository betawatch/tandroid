package o8;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y extends z {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ z e;

    public y(z zVar, int i9, int i10) {
        this.e = zVar;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        g7.d0.b(i9, this.d);
        return this.e.get(i9 + this.c);
    }

    @Override // o8.z, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // o8.z, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // o8.u
    public final Object[] o() {
        return this.e.o();
    }

    @Override // o8.u
    public final int p() {
        return this.e.q() + this.c + this.d;
    }

    @Override // o8.u
    public final int q() {
        return this.e.q() + this.c;
    }

    @Override // o8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // o8.z, java.util.List
    /* renamed from: z */
    public final z subList(int i9, int i10) {
        g7.d0.d(i9, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i9 + i11, i10 + i11);
    }

    @Override // o8.z, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i9) {
        return listIterator(i9);
    }
}
