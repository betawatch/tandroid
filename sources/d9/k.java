package d9;

import a8.o9;
import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class k extends i {
    public static final k d = new k(new Object[0]);
    public final transient Object[] c;

    public k(Object[] objArr) {
        this.c = objArr;
    }

    @Override // d9.i, d9.f
    public final int f(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        o9.a(i7, 0);
        Object obj = this.c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // d9.f
    public final int i() {
        return 0;
    }

    @Override // d9.f
    public final int j() {
        return 0;
    }

    @Override // d9.f
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
