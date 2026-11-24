// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jgf extends f7f {
    public final /* synthetic */ vgf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgf(vgf vgfVar) {
        super((byte) 2);
        this.h = vgfVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        vgf vgfVar = this.h;
        q1f.a(i, vgfVar.r ? 1 : 0);
        Object[] objArr = vgfVar.n;
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
