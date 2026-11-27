// default package

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class add extends kbd {
    public final /* synthetic */ edd r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public add(edd eddVar) {
        super((byte) 2);
        this.r = eddVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        edd eddVar = this.r;
        d9f.a(i, eddVar.w);
        Object[] objArr = eddVar.s;
        int i2 = i << 1;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r.w;
    }
}
