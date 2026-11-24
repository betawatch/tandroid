// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class akf extends khf {
    public final /* synthetic */ e7d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akf(e7d e7dVar) {
        super((byte) 3);
        this.h = e7dVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        e7d e7dVar = this.h;
        t4f.a(i, e7dVar.r ? 1 : 0);
        int i2 = i << 1;
        Object[] objArr = e7dVar.n;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.r ? 1 : 0;
    }
}
