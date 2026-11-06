package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class l5 extends n5 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.cast.n5
    public final void a(Object obj, long j3) {
        Object unmodifiableList;
        List list = (List) o6.h(obj, j3);
        if (list instanceof k5) {
            unmodifiableList = ((k5) list).zzd();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof z5) && (list instanceof g5)) {
                r4 r4Var = (r4) ((g5) list);
                boolean z9 = r4Var.a;
                if (z9 && z9) {
                    r4Var.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        o6.l(obj, j3, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.n5
    public final void b(Object obj, long j3, Object obj2) {
        j5 j5Var;
        List list = (List) o6.h(obj2, j3);
        int size = list.size();
        List list2 = (List) o6.h(obj, j3);
        if (list2.isEmpty()) {
            list2 = list2 instanceof k5 ? new j5(size) : ((list2 instanceof z5) && (list2 instanceof g5)) ? ((g5) list2).zzg(size) : new ArrayList(size);
            o6.l(obj, j3, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                o6.l(obj, j3, arrayList);
                j5Var = arrayList;
            } else if (list2 instanceof j6) {
                j5 j5Var2 = new j5(list2.size() + size);
                j5Var2.addAll(j5Var2.b.size(), (j6) list2);
                o6.l(obj, j3, j5Var2);
                j5Var = j5Var2;
            } else if ((list2 instanceof z5) && (list2 instanceof g5)) {
                g5 g5Var = (g5) list2;
                if (!((r4) g5Var).a) {
                    list2 = g5Var.zzg(list2.size() + size);
                    o6.l(obj, j3, list2);
                }
            }
            list2 = j5Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        o6.l(obj, j3, list);
    }
}
