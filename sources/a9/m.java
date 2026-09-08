package a9;

import com.google.android.gms.internal.play_billing.s1;
import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m extends k {
    public static final m d = new m(new Object[0]);
    public final transient Object[] c;

    public m(Object[] objArr) {
        this.c = objArr;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s1.a(i10, 0);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // a9.k, a9.h
    public final int i(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
        return 0;
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
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
