package e7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r {
    public static final l b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public r(Context context, za.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        za.c.a(context);
        synchronized (v.class) {
            if (v.b == null) {
                v.b = new v(0);
            }
        }
        this.a = "common";
        za.f a2 = za.f.a();
        int i10 = 0;
        p pVar = new p(this, i10);
        a2.getClass();
        za.f.b(pVar);
        za.f a3 = za.f.a();
        Objects.requireNonNull(kVar);
        q qVar = new q(kVar, i10);
        a3.getClass();
        za.f.b(qVar);
        l lVar = b;
        if (lVar.containsKey("common")) {
            j6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
