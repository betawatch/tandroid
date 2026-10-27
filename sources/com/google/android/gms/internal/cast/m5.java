package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m5 extends o5 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.cast.o5
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) p6.h(obj, j10);
        if (list instanceof l5) {
            unmodifiableList = ((l5) list).zzd();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof a6) && (list instanceof h5)) {
                r4 r4Var = (r4) ((h5) list);
                boolean z10 = r4Var.a;
                if (z10 && z10) {
                    r4Var.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        p6.l(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.o5
    public final void b(Object obj, long j10, Object obj2) {
        k5 k5Var;
        List list = (List) p6.h(obj2, j10);
        int size = list.size();
        List list2 = (List) p6.h(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof l5 ? new k5(size) : ((list2 instanceof a6) && (list2 instanceof h5)) ? ((h5) list2).zzg(size) : new ArrayList(size);
            p6.l(obj, j10, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                p6.l(obj, j10, arrayList);
                k5Var = arrayList;
            } else if (list2 instanceof k6) {
                k5 k5Var2 = new k5(list2.size() + size);
                k5Var2.addAll(k5Var2.b.size(), (k6) list2);
                p6.l(obj, j10, k5Var2);
                k5Var = k5Var2;
            } else if ((list2 instanceof a6) && (list2 instanceof h5)) {
                h5 h5Var = (h5) list2;
                if (!((r4) h5Var).a) {
                    list2 = h5Var.zzg(list2.size() + size);
                    p6.l(obj, j10, list2);
                }
            }
            list2 = k5Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        p6.l(obj, j10, list);
    }
}
