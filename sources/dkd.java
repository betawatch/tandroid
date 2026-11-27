// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dkd extends ghd {
    public final /* synthetic */ ikd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkd(ikd ikdVar) {
        super((byte) 1);
        this.h = ikdVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        ikd ikdVar = this.h;
        b9f.a(i, ikdVar.r ? 1 : 0);
        int i2 = i << 1;
        Object[] objArr = ikdVar.n;
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
