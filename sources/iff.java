// default package

import android.content.Context;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class iff {
    public static final xad b = xad.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public iff(Context context, uha uhaVar) {
        context.getPackageName();
        ao2.a(context);
        synchronized (fgf.class) {
            byte b2 = 0;
            if (fgf.b == null) {
                fgf.b = new fgf(b2);
            }
        }
        this.a = "common";
        ni6.q();
        ni6.E(new mg7(this, (byte) 8));
        ni6.q();
        Objects.requireNonNull(uhaVar);
        ni6.E(new kze(uhaVar, (byte) 3));
        xad xadVar = b;
        if (xadVar.containsKey("common")) {
            nt3.d(context, (String) xadVar.get("common"), false);
        }
    }
}
