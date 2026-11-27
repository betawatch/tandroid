// default package

import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class krd {
    public static final msd a = new msd();
    public static final nsd b = new nsd();

    public void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) k4e.l(j, obj);
        if (list instanceof frd) {
            unmodifiableList = ((frd) list).g();
        } else if (msd.c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        k4e.d(j, obj, unmodifiableList);
    }

    public abstract void b(mnd mndVar, mnd mndVar2, long j);
}
