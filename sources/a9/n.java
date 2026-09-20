package a9;

import java.util.Iterator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class n extends l {
    public static final Object[] f;
    public static final n h;
    public final transient Object[] d;
    public final transient Object[] e;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        h = new n(objArr, objArr);
    }

    public n(Object[] objArr, Object[] objArr2) {
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

    @Override // a9.h
    public final int i(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        m mVar = this.b;
        if (mVar == null) {
            i iVar = k.b;
            mVar = m.d;
            this.b = mVar;
        }
        return mVar.listIterator(0);
    }

    @Override // a9.h
    public final int n() {
        return 0;
    }

    @Override // a9.h
    public final int o() {
        return 0;
    }

    @Override // a9.h
    public final Object[] p() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
