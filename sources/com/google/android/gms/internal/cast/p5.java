package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p5 extends r5 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.cast.r5
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) s6.h(obj, j10);
        if (list instanceof o5) {
            unmodifiableList = ((o5) list).zzd();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof d6) && (list instanceof k5)) {
                u4 u4Var = (u4) ((k5) list);
                boolean z10 = u4Var.a;
                if (z10 && z10) {
                    u4Var.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        s6.l(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.r5
    public final void b(Object obj, long j10, Object obj2) {
        n5 n5Var;
        List list = (List) s6.h(obj2, j10);
        int size = list.size();
        List list2 = (List) s6.h(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof o5 ? new n5(size) : ((list2 instanceof d6) && (list2 instanceof k5)) ? ((k5) list2).zzg(size) : new ArrayList(size);
            s6.l(obj, j10, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                s6.l(obj, j10, arrayList);
                n5Var = arrayList;
            } else if (list2 instanceof n6) {
                n5 n5Var2 = new n5(list2.size() + size);
                n5Var2.addAll(n5Var2.b.size(), (n6) list2);
                s6.l(obj, j10, n5Var2);
                n5Var = n5Var2;
            } else if ((list2 instanceof d6) && (list2 instanceof k5)) {
                k5 k5Var = (k5) list2;
                if (!((u4) k5Var).a) {
                    list2 = k5Var.zzg(list2.size() + size);
                    s6.l(obj, j10, list2);
                }
            }
            list2 = n5Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        s6.l(obj, j10, list);
    }
}
