// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ged extends vad {
    public final transient med h;
    public final transient jed n;

    public ged(med medVar, jed jedVar) {
        super((byte) 0);
        this.h = medVar;
        this.n = jedVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.h.get(obj) != null;
    }

    @Override // x8d
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
