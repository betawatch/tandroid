package com.google.android.recaptcha.internal;

import hd.f;
import hd.m;
import hd.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzku {
    private List zza = o.a;

    public final long zza(long[] jArr) {
        ArrayList arrayList;
        List list = this.zza;
        List g10 = f.g(jArr);
        i.e(list, "<this>");
        if (g10 instanceof Collection) {
            List list2 = g10;
            arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
        } else {
            arrayList = new ArrayList(list);
            m.e(arrayList, g10);
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = f.g(jArr);
    }
}
