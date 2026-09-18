package n7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class q extends n {
    public final /* synthetic */ r c;

    public q(r rVar) {
        this.c = rVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        r rVar = this.c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.c.f.get(i10), rVar.d.d.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.d.d.size();
    }
}
