package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class q0 extends m0 {
    public final transient l0 d;
    public final transient Object[] e;
    public final transient int f;

    public q0(l0 l0Var, Object[] objArr, int i10) {
        this.d = l0Var;
        this.e = objArr;
        this.f = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.g0
    public final int i(Object[] objArr) {
        j0 j0Var = this.b;
        if (j0Var == null) {
            j0Var = s();
            this.b = j0Var;
        }
        return j0Var.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        j0 j0Var = this.b;
        if (j0Var == null) {
            j0Var = s();
            this.b = j0Var;
        }
        return j0Var.listIterator(0);
    }

    public final j0 s() {
        return new p0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
