package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g0 extends i0 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j10, Object obj, int i9) {
        List list = (List) s1.d.i(obj, j10);
        if (list.isEmpty()) {
            List e0Var = list instanceof f0 ? new e0(i9) : ((list instanceof y0) && (list instanceof z)) ? ((z) list).e(i9) : new ArrayList(i9);
            s1.o(obj, j10, e0Var);
            return e0Var;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i9);
            arrayList.addAll(list);
            s1.o(obj, j10, arrayList);
            return arrayList;
        }
        if (list instanceof n1) {
            e0 e0Var2 = new e0(list.size() + i9);
            e0Var2.addAll((n1) list);
            s1.o(obj, j10, e0Var2);
            return e0Var2;
        }
        if ((list instanceof y0) && (list instanceof z)) {
            z zVar = (z) list;
            if (!((b) zVar).a) {
                z e10 = zVar.e(list.size() + i9);
                s1.o(obj, j10, e10);
                return e10;
            }
        }
        return list;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) s1.d.i(obj, j10);
        if (list instanceof f0) {
            unmodifiableList = ((f0) list).j();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof y0) && (list instanceof z)) {
                b bVar = (b) ((z) list);
                if (bVar.a) {
                    bVar.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        s1.o(obj, j10, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void b(Object obj, long j10, Object obj2) {
        List list = (List) s1.d.i(obj2, j10);
        List d = d(j10, obj, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        s1.o(obj, j10, list);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final List c(Object obj, long j10) {
        return d(j10, obj, 10);
    }
}
