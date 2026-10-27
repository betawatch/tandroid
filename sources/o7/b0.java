package o7;

import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b0 extends o {
    public final transient Object d;

    public b0(Object obj) {
        this.d = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // o7.h
    public final int h(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // o7.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new t(this.d);
    }

    @Override // o7.h
    public final d0 o() {
        return new t(this.d);
    }

    @Override // o7.o
    public final m s() {
        Object[] objArr = {this.d};
        for (int i10 = 0; i10 < 1; i10++) {
            i iVar = m.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(ic.a.i(i10, "at index "));
            }
        }
        return m.s(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a1.g.p("[", this.d.toString(), "]");
    }
}
