// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bld extends yjd {
    public final /* synthetic */ hld r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bld(hld hldVar) {
        super((byte) 4);
        this.r = hldVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        pld pldVar = this.r.s;
        return new AbstractMap.SimpleImmutableEntry(pldVar.c.x.get(i), pldVar.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r.s.d.size();
    }
}
