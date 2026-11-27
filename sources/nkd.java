// default package

import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class nkd extends thd {
    public final transient xkd h;
    public final transient rkd n;

    public nkd(xkd xkdVar, rkd rkdVar) {
        super((byte) 1);
        this.h = xkdVar;
        this.n = rkdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.h.get(obj) != null;
    }

    @Override // qdd
    public final int h(Object[] objArr) {
        return this.n.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.n.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.h.getClass();
        return 1;
    }
}
