package com.google.android.gms.internal.clearcut;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 extends g0 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.clearcut.g0
    public final void a(Object obj, long j3) {
        Object unmodifiableList;
        List list = (List) j1.k(obj, j3);
        if (list instanceof f0) {
            unmodifiableList = ((f0) list).k();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        j1.d(obj, j3, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.clearcut.g0
    public final void b(Object obj, long j3, Object obj2) {
        e0 e0Var;
        List list = (List) j1.k(obj2, j3);
        int size = list.size();
        List list2 = (List) j1.k(obj, j3);
        if (list2.isEmpty()) {
            list2 = list2 instanceof f0 ? new e0(size) : new ArrayList(size);
            j1.d(obj, j3, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                e0Var = arrayList;
            } else if (list2 instanceof d1) {
                e0 e0Var2 = new e0(list2.size() + size);
                e0Var2.addAll((d1) list2);
                e0Var = e0Var2;
            }
            j1.d(obj, j3, e0Var);
            list2 = e0Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        j1.d(obj, j3, list);
    }
}
