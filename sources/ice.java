// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ice extends g9e {
    public final transient Object s;

    public ice(Object obj) {
        super((byte) 5);
        this.s = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.s.equals(obj);
    }

    @Override // g9e, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.s.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new l9e(this.s);
    }

    @Override // b4d
    public final int p(Object[] objArr) {
        objArr[0] = this.s;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return qd4.y("[", this.s.toString(), "]");
    }
}
