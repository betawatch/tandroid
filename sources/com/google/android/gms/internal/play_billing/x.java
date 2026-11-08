package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class x extends t {
    public final transient a8.v c;
    public final transient Object[] d;
    public final transient int e;

    public x(a8.v vVar, Object[] objArr, int i7) {
        this.c = vVar;
        this.d = objArr;
        this.e = i7;
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

    @Override // com.google.android.gms.internal.play_billing.o
    public final int f(Object[] objArr) {
        return k().f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.t
    public final r n() {
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
