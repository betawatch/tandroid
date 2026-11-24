package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzku {
    private List zza = c24.a;

    public final long zza(long[] jArr) {
        ArrayList arrayList;
        List list = this.zza;
        List g = ss.g(jArr);
        list.getClass();
        if (g instanceof Collection) {
            List list2 = g;
            arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
        } else {
            arrayList = new ArrayList(list);
            el2.d(g, arrayList);
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            fyb.i("Empty collection can't be reduced.");
            return 0L;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = ss.g(jArr);
    }
}
