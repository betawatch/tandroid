// default package

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class mde {
    public static g83 a(ka9 ka9Var, String str, b19 b19Var, int i) {
        Map map = Collections.EMPTY_MAP;
        Uri d = lze.d(str, b19Var.c);
        long j = b19Var.a;
        long j2 = b19Var.b;
        String a = ka9Var.a();
        if (a == null) {
            a = lze.d(((wh0) ka9Var.b.get(0)).a, b19Var.c).toString();
        }
        String str2 = a;
        jte.l(d, "The uri must be set.");
        return new g83(d, 1, null, d89.h, j, j2, str2, i);
    }
}
