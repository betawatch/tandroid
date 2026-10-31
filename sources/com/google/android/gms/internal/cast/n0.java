package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n0 extends j0 {
    public final transient i0 d;
    public final transient Object[] e;
    public final transient int f;

    public n0(i0 i0Var, Object[] objArr, int i10) {
        this.d = i0Var;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g0 g0Var = this.b;
        if (g0Var == null) {
            g0Var = r();
            this.b = g0Var;
        }
        return g0Var.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int l(Object[] objArr) {
        g0 g0Var = this.b;
        if (g0Var == null) {
            g0Var = r();
            this.b = g0Var;
        }
        return g0Var.l(objArr);
    }

    public final g0 r() {
        return new m0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
