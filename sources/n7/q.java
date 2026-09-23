package n7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
