package n7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
