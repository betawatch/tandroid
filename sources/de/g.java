package de;

import c8.y0;
import com.google.android.gms.internal.vision.e2;
import ee.t;
import kotlin.jvm.internal.u;
import rd.p;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                invoke = y0.c(pVar, obj, mVar);
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
