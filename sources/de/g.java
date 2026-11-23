package de;

import c8.x0;
import com.google.android.gms.internal.vision.e2;
import ee.t;
import kotlin.jvm.internal.u;
import rd.p;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class g {
    public static final t a = new t("NULL", 0);

    public static final Object a(id.h hVar, Object obj, Object obj2, p pVar, id.c frame) {
        Object invoke;
        Object l10 = ee.a.l(hVar, obj2);
        try {
            m mVar = new m(frame, hVar);
            if (e2.s(pVar)) {
                u.a(2, pVar);
                invoke = pVar.invoke(obj, mVar);
            } else {
                invoke = x0.c(pVar, obj, mVar);
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
