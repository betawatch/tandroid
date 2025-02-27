package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzge {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
