package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x extends t {
    public final transient com.google.android.gms.internal.cast.i0 c;
    public final transient Object[] d;
    public final transient int e;

    public x(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr, int i10) {
        this.c = i0Var;
        this.d = objArr;
        this.e = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int l(Object[] objArr) {
        return o().l(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.t
    public final r r() {
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
