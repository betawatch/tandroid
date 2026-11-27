// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
