// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jre extends zqe {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zqe
    public final void a(nne nneVar, nne nneVar2, long j) {
        ArrayList arrayList;
        List list = (List) i0f.l(nneVar2, j);
        int size = list.size();
        List list2 = (List) i0f.l(nneVar, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof ere ? new pqe(size) : ((list2 instanceof yve) && (list2 instanceof kpe)) ? ((kpe) list2).zza(size) : new ArrayList(size);
            i0f.d(nneVar, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                i0f.d(nneVar, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof uze) {
                uze uzeVar = (uze) list2;
                pqe pqeVar = new pqe(uzeVar.a.size() + size);
                pqeVar.addAll(uzeVar);
                i0f.d(nneVar, j, pqeVar);
                arrayList = pqeVar;
            } else if ((list2 instanceof yve) && (list2 instanceof kpe)) {
                kpe kpeVar = (kpe) list2;
                if (!kpeVar.zza()) {
                    list2 = kpeVar.zza(list2.size() + size);
                    i0f.d(nneVar, j, list2);
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
        i0f.d(nneVar, j, list);
    }
}
