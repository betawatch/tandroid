package o8;

import java.util.Iterator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l extends j {
    public static final Object[] f;
    public static final l h;
    public final transient Object[] d;
    public final transient Object[] e;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        h = new l(objArr, objArr);
    }

    public l(Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.e.length;
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // o8.f
    public final int i(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        k kVar = this.b;
        if (kVar == null) {
            g gVar = i.b;
            kVar = k.d;
            this.b = kVar;
        }
        return kVar.listIterator(0);
    }

    @Override // o8.f
    public final int n() {
        return 0;
    }

    @Override // o8.f
    public final int o() {
        return 0;
    }

    @Override // o8.f
    public final Object[] p() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
