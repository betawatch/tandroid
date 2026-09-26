package n7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class q extends o {
    public final /* synthetic */ r d;

    public q(r rVar) {
        this.d = rVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.d.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // n7.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a.b(this.d.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return t().listIterator(0);
    }

    @Override // n7.h
    public final d0 p() {
        return t().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.d.size();
    }

    @Override // n7.o
    public final m u() {
        return new p(this);
    }
}
