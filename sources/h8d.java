// default package

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h8d extends r6d {
    public final /* synthetic */ l8d r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8d(l8d l8dVar) {
        super((byte) 2);
        this.r = l8dVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        l8d l8dVar = this.r;
        k4f.a(i, l8dVar.w);
        Object[] objArr = l8dVar.s;
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
