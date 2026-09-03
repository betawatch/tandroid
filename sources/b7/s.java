package b7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s extends o {
    public final /* synthetic */ t c;

    public s(t tVar) {
        this.c = tVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        t tVar = this.c;
        return new AbstractMap.SimpleImmutableEntry(tVar.d.c.f.get(i10), tVar.d.d.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.d.d.size();
    }
}
