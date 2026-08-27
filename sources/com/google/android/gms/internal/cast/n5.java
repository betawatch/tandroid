package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n5 extends p5 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.cast.p5
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) q6.h(obj, j10);
        if (list instanceof m5) {
            unmodifiableList = ((m5) list).zzd();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof b6) && (list instanceof i5)) {
                s4 s4Var = (s4) ((i5) list);
                boolean z10 = s4Var.a;
                if (z10 && z10) {
                    s4Var.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        q6.l(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.p5
    public final void b(Object obj, long j10, Object obj2) {
        l5 l5Var;
        List list = (List) q6.h(obj2, j10);
        int size = list.size();
        List list2 = (List) q6.h(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof m5 ? new l5(size) : ((list2 instanceof b6) && (list2 instanceof i5)) ? ((i5) list2).zzg(size) : new ArrayList(size);
            q6.l(obj, j10, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                q6.l(obj, j10, arrayList);
                l5Var = arrayList;
            } else if (list2 instanceof l6) {
                l5 l5Var2 = new l5(list2.size() + size);
                l5Var2.addAll(l5Var2.b.size(), (l6) list2);
                q6.l(obj, j10, l5Var2);
                l5Var = l5Var2;
            } else if ((list2 instanceof b6) && (list2 instanceof i5)) {
                i5 i5Var = (i5) list2;
                if (!((s4) i5Var).a) {
                    list2 = i5Var.zzg(list2.size() + size);
                    q6.l(obj, j10, list2);
                }
            }
            list2 = l5Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        q6.l(obj, j10, list);
    }
}
