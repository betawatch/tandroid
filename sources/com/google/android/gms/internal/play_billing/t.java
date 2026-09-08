package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class t extends o implements Set, j$.util.Set {
    public transient r b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public r p() {
        r rVar = this.b;
        if (rVar != null) {
            return rVar;
        }
        r s10 = s();
        this.b = s10;
        return s10;
    }

    public r s() {
        Object[] array = toArray(o.a);
        p pVar = r.b;
        return r.t(array.length, array);
    }
}
