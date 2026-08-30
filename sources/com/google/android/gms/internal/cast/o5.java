package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o5 extends q5 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.cast.q5
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) r6.h(obj, j10);
        if (list instanceof n5) {
            unmodifiableList = ((n5) list).zzd();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof c6) && (list instanceof j5)) {
                u4 u4Var = (u4) ((j5) list);
                boolean z4 = u4Var.a;
                if (z4 && z4) {
                    u4Var.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        r6.l(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.q5
    public final void b(Object obj, long j10, Object obj2) {
        m5 m5Var;
        List list = (List) r6.h(obj2, j10);
        int size = list.size();
        List list2 = (List) r6.h(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof n5 ? new m5(size) : ((list2 instanceof c6) && (list2 instanceof j5)) ? ((j5) list2).zzg(size) : new ArrayList(size);
            r6.l(obj, j10, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                r6.l(obj, j10, arrayList);
                m5Var = arrayList;
            } else if (list2 instanceof m6) {
                m5 m5Var2 = new m5(list2.size() + size);
                m5Var2.addAll(m5Var2.b.size(), (m6) list2);
                r6.l(obj, j10, m5Var2);
                m5Var = m5Var2;
            } else if ((list2 instanceof c6) && (list2 instanceof j5)) {
                j5 j5Var = (j5) list2;
                if (!((u4) j5Var).a) {
                    list2 = j5Var.zzg(list2.size() + size);
                    r6.l(obj, j10, list2);
                }
            }
            list2 = m5Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        r6.l(obj, j10, list);
    }
}
