package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
