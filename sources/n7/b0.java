package n7;

import i2.o1;
import java.util.Iterator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

    @Override // n7.h
    public final int h(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // n7.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new t(this.d);
    }

    @Override // n7.h
    public final d0 o() {
        return new t(this.d);
    }

    @Override // n7.o
    public final m s() {
        Object[] objArr = {this.d};
        for (int i10 = 0; i10 < 1; i10++) {
            i iVar = m.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(o1.k(i10, "at index "));
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
