package com.google.android.gms.internal.vision;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u1 extends s1 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.s1
    public final void a(Object obj, long j3, Object obj2) {
        r1 r1Var;
        List list = (List) y2.l(obj2, j3);
        int size = list.size();
        List list2 = (List) y2.l(obj, j3);
        if (list2.isEmpty()) {
            list2 = list2 instanceof t1 ? new r1(size) : ((list2 instanceof j2) && (list2 instanceof o1)) ? ((o1) list2).zza(size) : new ArrayList(size);
            y2.d(obj, j3, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                y2.d(obj, j3, arrayList);
                r1Var = arrayList;
            } else if (list2 instanceof t2) {
                r1 r1Var2 = new r1(list2.size() + size);
                r1Var2.addAll((t2) list2);
                y2.d(obj, j3, r1Var2);
                r1Var = r1Var2;
            } else if ((list2 instanceof j2) && (list2 instanceof o1)) {
                o1 o1Var = (o1) list2;
                if (!o1Var.zza()) {
                    list2 = o1Var.zza(list2.size() + size);
                    y2.d(obj, j3, list2);
                }
            }
            list2 = r1Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        y2.d(obj, j3, list);
    }

    @Override // com.google.android.gms.internal.vision.s1
    public final void b(Object obj, long j3) {
        Object unmodifiableList;
        List list = (List) y2.l(obj, j3);
        if (list instanceof t1) {
            unmodifiableList = ((t1) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof j2) && (list instanceof o1)) {
                o1 o1Var = (o1) list;
                if (o1Var.zza()) {
                    o1Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        y2.d(obj, j3, unmodifiableList);
    }
}
