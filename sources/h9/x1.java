package h9;

import a8.ia;
import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class x1 extends i0 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public x1(int i7, int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
        this.e = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ia.j(i7, this.e);
        Object obj = this.c[(i7 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // h9.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
