// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n8d extends r7d {
    public final transient v8d r;
    public final transient s8d s;

    public n8d(v8d v8dVar, s8d s8dVar) {
        super((byte) 2);
        this.r = v8dVar;
        this.s = s8dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.r.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.s.listIterator(0);
    }

    @Override // kzc
    public final int p(Object[] objArr) {
        return this.s.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r.h;
    }
}
