// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fjd extends mid {
    public final /* synthetic */ njd s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjd(njd njdVar) {
        super((byte) 4);
        this.s = njdVar;
    }

    @Override // mid
    public final xhd B() {
        return new zid(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.s.get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // mid, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a1f.a(this.s.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.d.size();
    }

    @Override // kzc
    public final v5c u() {
        return A().listIterator(0);
    }
}
