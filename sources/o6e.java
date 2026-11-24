// default package

import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o6e extends q4e {
    public final transient a7e s;
    public final transient u6e w;

    public o6e(a7e a7eVar, u6e u6eVar) {
        super((byte) 5);
        this.s = a7eVar;
        this.w = u6eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.s.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.w.listIterator(0);
    }

    @Override // kzc
    public final int p(Object[] objArr) {
        return this.w.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.h;
    }
}
