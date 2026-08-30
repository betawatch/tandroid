package com.google.android.gms.internal.clearcut;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends h0 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.clearcut.h0
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) k1.k(obj, j10);
        if (list instanceof g0) {
            unmodifiableList = ((g0) list).k();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        k1.d(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final void b(Object obj, long j10, Object obj2) {
        f0 f0Var;
        List list = (List) k1.k(obj2, j10);
        int size = list.size();
        List list2 = (List) k1.k(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof g0 ? new f0(size) : new ArrayList(size);
            k1.d(obj, j10, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                f0Var = arrayList;
            } else if (list2 instanceof e1) {
                f0 f0Var2 = new f0(list2.size() + size);
                f0Var2.addAll((e1) list2);
                f0Var = f0Var2;
            }
            k1.d(obj, j10, f0Var);
            list2 = f0Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        k1.d(obj, j10, list);
    }
}
