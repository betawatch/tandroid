// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ced extends vad {
    public final transient f7d h;
    public final transient Object[] n;
    public final transient boolean r;

    public ced(f7d f7dVar, Object[] objArr) {
        super((byte) 0);
        this.h = f7dVar;
        this.n = objArr;
        this.r = true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // x8d
    public final int h(Object[] objArr) {
        aad aadVar = this.f;
        if (aadVar == null) {
            aadVar = new wdd(this);
            this.f = aadVar;
        }
        return aadVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        aad aadVar = this.f;
        if (aadVar == null) {
            aadVar = new wdd(this);
            this.f = aadVar;
        }
        return aadVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r ? 1 : 0;
    }
}
