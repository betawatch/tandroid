// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class kkf extends okf {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okf
    public final void b(long j, Object obj, Object obj2) {
        ArrayList arrayList;
        List list = (List) wlf.g(obj2, j);
        int size = list.size();
        List list2 = (List) wlf.g(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof ikf ? new gkf(size) : ((list2 instanceof flf) && (list2 instanceof tjf)) ? ((tjf) list2).zzg(size) : new ArrayList(size);
            wlf.i(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                wlf.i(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof ulf) {
                ulf ulfVar = (ulf) list2;
                gkf gkfVar = new gkf(ulfVar.size() + size);
                gkfVar.addAll(gkfVar.b.size(), ulfVar);
                wlf.i(obj, j, gkfVar);
                arrayList = gkfVar;
            } else if ((list2 instanceof flf) && (list2 instanceof tjf)) {
                tjf tjfVar = (tjf) list2;
                if (!((bif) tjfVar).a) {
                    list2 = tjfVar.zzg(list2.size() + size);
                    wlf.i(obj, j, list2);
                }
            }
            list2 = arrayList;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        wlf.i(obj, j, list);
    }
}
