package h7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q {
    public static final l b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public q(Context context, cb.l lVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        cb.c.a(context);
        synchronized (u.class) {
            if (u.b == null) {
                u.b = new u(0);
            }
        }
        this.a = "common";
        cb.g a2 = cb.g.a();
        h2.f fVar = new h2.f(this, 2);
        a2.getClass();
        cb.g.b(fVar);
        cb.g a10 = cb.g.a();
        Objects.requireNonNull(lVar);
        p pVar = new p(lVar, 0);
        a10.getClass();
        cb.g.b(pVar);
        l lVar2 = b;
        if (lVar2.containsKey("common")) {
            m6.e.d(context, (String) lVar2.get("common"), false);
        }
    }
}
