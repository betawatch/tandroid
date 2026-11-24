package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzku {
    private List zza = n34.a;

    public final long zza(long[] jArr) {
        ArrayList arrayList;
        List list = this.zza;
        List g = tt.g(jArr);
        list.getClass();
        if (g instanceof Collection) {
            List list2 = g;
            arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
        } else {
            arrayList = new ArrayList(list);
            qm2.d(g, arrayList);
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            rjb.j("Empty collection can't be reduced.");
            return 0L;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = tt.g(jArr);
    }
}
