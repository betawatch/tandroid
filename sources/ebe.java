// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
