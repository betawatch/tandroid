// default package

import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ebe extends g9e {
    public final transient qbe s;
    public final transient kbe w;

    public ebe(qbe qbeVar, kbe kbeVar) {
        super((byte) 5);
        this.s = qbeVar;
        this.w = kbeVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.s.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.w.listIterator(0);
    }

    @Override // b4d
    public final int p(Object[] objArr) {
        return this.w.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.h;
    }
}
