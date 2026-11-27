// default package

import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gdd extends kcd {
    public final transient odd r;
    public final transient ldd s;

    public gdd(odd oddVar, ldd lddVar) {
        super((byte) 2);
        this.r = oddVar;
        this.s = lddVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.r.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.s.listIterator(0);
    }

    @Override // b4d
    public final int p(Object[] objArr) {
        return this.s.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r.h;
    }
}
