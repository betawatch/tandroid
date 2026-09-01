package k7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class ua extends ra {
    public final /* synthetic */ va c;

    public ua(va vaVar) {
        this.c = vaVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        va vaVar = this.c;
        j7.u8.a(i10, vaVar.e);
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
