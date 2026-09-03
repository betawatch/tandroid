package com.google.android.gms.internal.vision;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u1 extends s1 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.s1
    public final void a(Object obj, long j10, Object obj2) {
        r1 r1Var;
        List list = (List) x2.l(obj2, j10);
        int size = list.size();
        List list2 = (List) x2.l(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof t1 ? new r1(size) : ((list2 instanceof i2) && (list2 instanceof o1)) ? ((o1) list2).zza(size) : new ArrayList(size);
            x2.d(obj, j10, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                x2.d(obj, j10, arrayList);
                r1Var = arrayList;
            } else if (list2 instanceof s2) {
                r1 r1Var2 = new r1(list2.size() + size);
                r1Var2.addAll((s2) list2);
                x2.d(obj, j10, r1Var2);
                r1Var = r1Var2;
            } else if ((list2 instanceof i2) && (list2 instanceof o1)) {
                o1 o1Var = (o1) list2;
                if (!o1Var.zza()) {
                    list2 = o1Var.zza(list2.size() + size);
                    x2.d(obj, j10, list2);
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
        x2.d(obj, j10, list);
    }

    @Override // com.google.android.gms.internal.vision.s1
    public final void b(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) x2.l(obj, j10);
        if (list instanceof t1) {
            unmodifiableList = ((t1) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof i2) && (list instanceof o1)) {
                o1 o1Var = (o1) list;
                if (o1Var.zza()) {
                    o1Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        x2.d(obj, j10, unmodifiableList);
    }
}
