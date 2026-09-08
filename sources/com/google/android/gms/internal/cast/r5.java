package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class r5 extends t5 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.cast.t5
    public final void a(Object obj, long j3) {
        Object unmodifiableList;
        List list = (List) u6.h(obj, j3);
        if (list instanceof q5) {
            unmodifiableList = ((q5) list).zzd();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof f6) && (list instanceof m5)) {
                w4 w4Var = (w4) ((m5) list);
                boolean z10 = w4Var.a;
                if (z10 && z10) {
                    w4Var.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        u6.l(obj, j3, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.t5
    public final void b(Object obj, long j3, Object obj2) {
        p5 p5Var;
        List list = (List) u6.h(obj2, j3);
        int size = list.size();
        List list2 = (List) u6.h(obj, j3);
        if (list2.isEmpty()) {
            list2 = list2 instanceof q5 ? new p5(size) : ((list2 instanceof f6) && (list2 instanceof m5)) ? ((m5) list2).zzg(size) : new ArrayList(size);
            u6.l(obj, j3, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                u6.l(obj, j3, arrayList);
                p5Var = arrayList;
            } else if (list2 instanceof p6) {
                p5 p5Var2 = new p5(list2.size() + size);
                p5Var2.addAll(p5Var2.b.size(), (p6) list2);
                u6.l(obj, j3, p5Var2);
                p5Var = p5Var2;
            } else if ((list2 instanceof f6) && (list2 instanceof m5)) {
                m5 m5Var = (m5) list2;
                if (!((w4) m5Var).a) {
                    list2 = m5Var.zzg(list2.size() + size);
                    u6.l(obj, j3, list2);
                }
            }
            list2 = p5Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        u6.l(obj, j3, list);
    }
}
