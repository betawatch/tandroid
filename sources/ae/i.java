package ae;

import b8.jc;
import be.t;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class i {
    public static final t a = new t("NULL", 0);

    public static final Object a(fd.h hVar, Object obj, Object obj2, od.p pVar, fd.c frame) {
        Object invoke;
        Object l10 = be.a.l(hVar, obj2);
        try {
            p pVar2 = new p(frame, hVar);
            if (com.google.android.recaptcha.internal.a.u(pVar)) {
                u.a(2, pVar);
                invoke = pVar.invoke(obj, pVar2);
            } else {
                invoke = jc.c(pVar, obj, pVar2);
            }
            be.a.g(hVar, l10);
            if (invoke == gd.a.a) {
                kotlin.jvm.internal.j.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th2) {
            be.a.g(hVar, l10);
            throw th2;
        }
    }
}
