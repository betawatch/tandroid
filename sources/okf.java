// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class okf {
    public static final kkf a = new kkf();
    public static final mkf b = new mkf();

    public void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) wlf.g(obj, j);
        if (list instanceof ikf) {
            unmodifiableList = ((ikf) list).zzd();
        } else {
            if (kkf.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof flf) && (list instanceof tjf)) {
                bif bifVar = (bif) ((tjf) list);
                boolean z = bifVar.a;
                if (z && z) {
                    bifVar.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        wlf.i(obj, j, unmodifiableList);
    }

    public abstract void b(long j, Object obj, Object obj2);
}
