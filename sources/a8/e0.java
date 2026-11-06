package a8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e0 extends u {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e = 1;

    public e0(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        x0.a(i7, this.e);
        Object obj = this.c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
