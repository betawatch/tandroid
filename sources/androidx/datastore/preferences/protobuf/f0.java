package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f0 extends h0 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j3, Object obj, int i10) {
        List list = (List) r1.d.i(obj, j3);
        if (list.isEmpty()) {
            List d0Var = list instanceof e0 ? new d0(i10) : ((list instanceof x0) && (list instanceof y)) ? ((y) list).d(i10) : new ArrayList(i10);
            r1.o(obj, j3, d0Var);
            return d0Var;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            r1.o(obj, j3, arrayList);
            return arrayList;
        }
        if (list instanceof m1) {
            d0 d0Var2 = new d0(list.size() + i10);
            d0Var2.addAll((m1) list);
            r1.o(obj, j3, d0Var2);
            return d0Var2;
        }
        if ((list instanceof x0) && (list instanceof y)) {
            y yVar = (y) list;
            if (!((b) yVar).a) {
                y d = yVar.d(list.size() + i10);
                r1.o(obj, j3, d);
                return d;
            }
        }
        return list;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void a(Object obj, long j3) {
        Object unmodifiableList;
        List list = (List) r1.d.i(obj, j3);
        if (list instanceof e0) {
            unmodifiableList = ((e0) list).j();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof x0) && (list instanceof y)) {
                b bVar = (b) ((y) list);
                if (bVar.a) {
                    bVar.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        r1.o(obj, j3, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void b(Object obj, long j3, Object obj2) {
        List list = (List) r1.d.i(obj2, j3);
        List d = d(j3, obj, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        r1.o(obj, j3, list);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final List c(Object obj, long j3) {
        return d(j3, obj, 10);
    }
}
