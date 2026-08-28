package d7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r {
    public static final l b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public r(Context context, ya.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        ya.c.a(context);
        synchronized (u.class) {
            if (u.b == null) {
                u.b = new u(0);
            }
        }
        this.a = "common";
        ya.f a2 = ya.f.a();
        p pVar = new p(this, 0);
        a2.getClass();
        ya.f.b(pVar);
        ya.f a3 = ya.f.a();
        Objects.requireNonNull(kVar);
        q qVar = new q(kVar, 0);
        a3.getClass();
        ya.f.b(qVar);
        l lVar = b;
        if (lVar.containsKey("common")) {
            i6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
