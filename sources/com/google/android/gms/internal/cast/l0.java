package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l0 extends h0 {
    public final transient a8.m d;
    public final transient Object[] e;
    public final transient int f;

    public l0(a8.m mVar, Object[] objArr, int i10) {
        this.d = mVar;
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

    @Override // com.google.android.gms.internal.cast.c0
    public final int h(Object[] objArr) {
        f0 f0Var = this.b;
        if (f0Var == null) {
            f0Var = r();
            this.b = f0Var;
        }
        return f0Var.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f0 f0Var = this.b;
        if (f0Var == null) {
            f0Var = r();
            this.b = f0Var;
        }
        return f0Var.listIterator(0);
    }

    public final f0 r() {
        return new k0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
