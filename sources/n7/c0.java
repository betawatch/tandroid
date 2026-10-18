package n7;

import java.util.Iterator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class c0 extends p {
    public final transient Object d;

    public c0(Object obj) {
        this.d = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // n7.i
    public final int h(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // n7.p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new u(this.d);
    }

    @Override // n7.i
    public final e0 o() {
        return new u(this.d);
    }

    @Override // n7.p
    public final n s() {
        Object[] objArr = {this.d};
        for (int i10 = 0; i10 < 1; i10++) {
            j jVar = n.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(i2.d.j(i10, "at index "));
            }
        }
        return n.s(1, objArr);
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
