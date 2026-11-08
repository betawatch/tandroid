package de;

import c8.u0;
import kotlin.jvm.internal.u;
import rd.p;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
