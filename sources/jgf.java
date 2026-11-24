// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
