// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class cte {
    public static final mte a = new mte();
    public static final aue b = new aue();

    public abstract void a(qpe qpeVar, qpe qpeVar2, long j);

    public void b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) k2f.l(obj, j);
        if (list instanceof hte) {
            unmodifiableList = ((hte) list).zze();
        } else {
            if (mte.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof aye) && (list instanceof nre)) {
                nre nreVar = (nre) list;
                if (nreVar.zza()) {
                    nreVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        k2f.d(obj, j, unmodifiableList);
    }
}
