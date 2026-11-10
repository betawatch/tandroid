package de;

import c8.u0;
import kotlin.jvm.internal.u;
import rd.p;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class g {
    public static final com.google.android.gms.internal.clearcut.e a = new com.google.android.gms.internal.clearcut.e("NULL", 1);

    public static final Object a(id.h hVar, Object obj, Object obj2, p pVar, id.c frame) {
        Object invoke;
        Object l10 = ee.a.l(hVar, obj2);
        try {
            m mVar = new m(frame, hVar);
            if (com.google.android.recaptcha.internal.a.u(pVar)) {
                u.a(2, pVar);
                invoke = pVar.invoke(obj, mVar);
            } else {
                invoke = u0.c(pVar, obj, mVar);
            }
            ee.a.g(hVar, l10);
            if (invoke == jd.a.a) {
                kotlin.jvm.internal.j.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th2) {
            ee.a.g(hVar, l10);
            throw th2;
        }
    }
}
