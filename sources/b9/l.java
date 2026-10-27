package b9;

import a8.w1;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l extends j {
    public static final l d = new l(new Object[0]);
    public final transient Object[] c;

    public l(Object[] objArr) {
        this.c = objArr;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w1.a(i10, 0);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // b9.j, b9.g
    public final int h(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // b9.g
    public final int m() {
        return 0;
    }

    @Override // b9.g
    public final int n() {
        return 0;
    }

    @Override // b9.g
    public final Object[] o() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
