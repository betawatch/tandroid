package f7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r {
    public static final l b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public r(Context context, ab.l lVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        ab.c.a(context);
        synchronized (v.class) {
            if (v.b == null) {
                v.b = new v(0);
            }
        }
        this.a = "common";
        ab.g a2 = ab.g.a();
        p pVar = new p(this, 0);
        a2.getClass();
        ab.g.b(pVar);
        ab.g a10 = ab.g.a();
        Objects.requireNonNull(lVar);
        q qVar = new q(lVar, 0);
        a10.getClass();
        ab.g.b(qVar);
        l lVar2 = b;
        if (lVar2.containsKey("common")) {
            k6.e.d(context, (String) lVar2.get("common"), false);
        }
    }
}
