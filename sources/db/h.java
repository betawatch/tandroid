package db;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h extends i implements Iterable {
    public final ArrayList a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof h) && ((h) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // db.i
    public final String n() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return ((i) arrayList.get(0)).n();
        }
        throw new IllegalStateException(i2.g.i(size, "Array must have size 1, but has size "));
    }
}
