package com.google.android.recaptcha.internal;

import hd.e;
import hd.l;
import hd.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class zzku {
    private List zza = n.a;

    public final long zza(long[] jArr) {
        ArrayList arrayList;
        List list = this.zza;
        List g10 = e.g(jArr);
        j.e(list, "<this>");
        if (g10 instanceof Collection) {
            List list2 = g10;
            arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
        } else {
            arrayList = new ArrayList(list);
            l.e(g10, arrayList);
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
        this.zza = e.g(jArr);
    }
}
