// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class eae extends k8e {
    public final /* synthetic */ kae r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eae(kae kaeVar) {
        super((byte) 5);
        this.r = kaeVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        kae kaeVar = this.r;
        h6f.a(i, kaeVar.x);
        Object[] objArr = kaeVar.w;
        int i2 = i << 1;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r.x;
    }
}
