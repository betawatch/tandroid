// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hld extends okd {
    public final /* synthetic */ pld s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hld(pld pldVar) {
        super((byte) 4);
        this.s = pldVar;
    }

    @Override // okd
    public final yjd B() {
        return new bld(this);
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

    @Override // okd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return c3f.a(this.s.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.d.size();
    }

    @Override // l1d
    public final v7c u() {
        return A().listIterator(0);
    }
}
