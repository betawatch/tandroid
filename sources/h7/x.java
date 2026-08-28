package h7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x extends s {
    public final /* synthetic */ y c;

    public x(y yVar) {
        this.c = yVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i9) {
        y yVar = this.c;
        f7.b8.a(i9, yVar.e);
        int i10 = i9 + i9;
        Object[] objArr = yVar.d;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
