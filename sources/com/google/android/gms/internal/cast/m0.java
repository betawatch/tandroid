package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 extends i0 {
    public final transient b8.m d;
    public final transient Object[] e;
    public final transient int f;

    public m0(b8.m mVar, Object[] objArr, int i3) {
        this.d = mVar;
        this.e = objArr;
        this.f = i3;
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

    @Override // com.google.android.gms.internal.cast.d0
    public final int h(Object[] objArr) {
        g0 g0Var = this.b;
        if (g0Var == null) {
            g0Var = n();
            this.b = g0Var;
        }
        return g0Var.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g0 g0Var = this.b;
        if (g0Var == null) {
            g0Var = n();
            this.b = g0Var;
        }
        return g0Var.listIterator(0);
    }

    public final g0 n() {
        return new l0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
