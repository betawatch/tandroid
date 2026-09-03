package l7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class x extends s {
    public final /* synthetic */ y c;

    public x(y yVar) {
        this.c = yVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        y yVar = this.c;
        k7.k.a(i10, yVar.e);
        int i11 = i10 + i10;
        Object[] objArr = yVar.d;
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
