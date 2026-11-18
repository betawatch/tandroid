package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class l0 extends h0 {
    public final transient a8.v d;
    public final transient Object[] e;
    public final transient int f;

    public l0(a8.v vVar, Object[] objArr, int i7) {
        this.d = vVar;
        this.e = objArr;
        this.f = i7;
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

    @Override // com.google.android.gms.internal.cast.c0
    public final int f(Object[] objArr) {
        f0 f0Var = this.b;
        if (f0Var == null) {
            f0Var = n();
            this.b = f0Var;
        }
        return f0Var.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f0 f0Var = this.b;
        if (f0Var == null) {
            f0Var = n();
            this.b = f0Var;
        }
        return f0Var.listIterator(0);
    }

    public final f0 n() {
        return new k0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
