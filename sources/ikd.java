// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ikd extends thd {
    public final transient ybd h;
    public final transient Object[] n;
    public final transient boolean r;

    public ikd(ybd ybdVar, Object[] objArr) {
        super((byte) 1);
        this.h = ybdVar;
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

    @Override // qdd
    public final int h(Object[] objArr) {
        ghd ghdVar = this.f;
        if (ghdVar == null) {
            ghdVar = new dkd(this);
            this.f = ghdVar;
        }
        return ghdVar.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ghd ghdVar = this.f;
        if (ghdVar == null) {
            ghdVar = new dkd(this);
            this.f = ghdVar;
        }
        return ghdVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r ? 1 : 0;
    }
}
