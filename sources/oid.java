// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class oid extends ted {
    public final /* synthetic */ tid h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oid(tid tidVar) {
        super((byte) 0);
        this.h = tidVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        tid tidVar = this.h;
        d7f.a(i, tidVar.r ? 1 : 0);
        Object[] objArr = tidVar.n;
        int i2 = i << 1;
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
