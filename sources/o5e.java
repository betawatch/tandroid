// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class o5e extends u3e {
    public final /* synthetic */ u5e r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5e(u5e u5eVar) {
        super((byte) 5);
        this.r = u5eVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        u5e u5eVar = this.r;
        p1f.a(i, u5eVar.x);
        Object[] objArr = u5eVar.w;
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
