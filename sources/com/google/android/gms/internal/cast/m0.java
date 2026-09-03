package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m0 extends i0 {
    public final transient h0 d;
    public final transient Object[] e;
    public final transient int f;

    public m0(h0 h0Var, Object[] objArr, int i10) {
        this.d = h0Var;
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
    public final int i(Object[] objArr) {
        f0 f0Var = this.b;
        if (f0Var == null) {
            f0Var = s();
            this.b = f0Var;
        }
        return f0Var.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f0 f0Var = this.b;
        if (f0Var == null) {
            f0Var = s();
            this.b = f0Var;
        }
        return f0Var.listIterator(0);
    }

    public final f0 s() {
        return new l0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
