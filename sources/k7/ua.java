package k7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class ua extends ra {
    public final /* synthetic */ va c;

    public ua(va vaVar) {
        this.c = vaVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        va vaVar = this.c;
        j7.t8.a(i10, vaVar.e);
        Object[] objArr = vaVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
