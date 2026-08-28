package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o0 extends k0 {
    public final transient j0 d;
    public final transient Object[] e;
    public final transient int f;

    public o0(j0 j0Var, Object[] objArr, int i9) {
        this.d = j0Var;
        this.e = objArr;
        this.f = i9;
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

    @Override // com.google.android.gms.internal.cast.e0
    public final int i(Object[] objArr) {
        h0 h0Var = this.b;
        if (h0Var == null) {
            h0Var = s();
            this.b = h0Var;
        }
        return h0Var.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        h0 h0Var = this.b;
        if (h0Var == null) {
            h0Var = s();
            this.b = h0Var;
        }
        return h0Var.listIterator(0);
    }

    public final h0 s() {
        return new n0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
