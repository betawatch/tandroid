// default package

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jad extends t8d {
    public final /* synthetic */ nad r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jad(nad nadVar) {
        super((byte) 2);
        this.r = nadVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        nad nadVar = this.r;
        m6f.a(i, nadVar.w);
        Object[] objArr = nadVar.s;
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
