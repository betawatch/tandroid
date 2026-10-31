package com.google.android.recaptcha.internal;

import bd.h;
import bd.o;
import bd.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzku {
    private List zza = q.a;

    public final long zza(long[] jArr) {
        ArrayList arrayList;
        List list = this.zza;
        List g10 = h.g(jArr);
        i.e(list, "<this>");
        if (g10 instanceof Collection) {
            List list2 = g10;
            arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
        } else {
            arrayList = new ArrayList(list);
            o.e(arrayList, g10);
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
        this.zza = h.g(jArr);
    }
}
