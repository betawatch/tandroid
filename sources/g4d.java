// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class g4d extends e4d {
    public static final g4d w = new g4d(0, new Object[0]);
    public final transient Object[] r;
    public final transient boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    public g4d(int i, Object[] objArr) {
        super((byte) 1);
        this.r = objArr;
        this.s = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yye.a(i, this.s ? 1 : 0);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // e4d, kzc
    public final int l(Object[] objArr) {
        Object[] objArr2 = this.r;
        boolean z = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, z ? 1 : 0);
        return z ? 1 : 0;
    }

    @Override // kzc
    public final int m() {
        return this.s ? 1 : 0;
    }

    @Override // kzc
    public final Object[] o() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s ? 1 : 0;
    }
}
