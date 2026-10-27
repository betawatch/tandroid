package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public r o() {
        r rVar = this.b;
        if (rVar != null) {
            return rVar;
        }
        r r6 = r();
        this.b = r6;
        return r6;
    }

    public r r() {
        Object[] array = toArray(o.a);
        p pVar = r.b;
        return r.s(array.length, array);
    }
}
