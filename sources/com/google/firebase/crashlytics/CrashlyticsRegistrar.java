package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final h09 a = new h09(od0.class, ExecutorService.class);
    public final h09 b = new h09(ok0.class, ExecutorService.class);
    public final h09 c = new h09(m36.class, ExecutorService.class);

    static {
        Map map = nj4.b;
        iaa iaaVar = iaa.a;
        if (map.containsKey(iaaVar)) {
            Log.d("FirebaseSessions", "Dependency " + iaaVar + " already added.");
            return;
        }
        map.put(iaaVar, new lj4(new CountDownLatch(1)));
        StringBuilder sb = new StringBuilder("Dependency to ");
        sb.append(iaaVar);
        bs2.x(sb, " added.", "FirebaseSessions");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        eq2 b = fq2.b(li4.class);
        b.a = "fire-cls";
        b.a(qe3.b(ji4.class));
        b.a(qe3.b(ri4.class));
        b.a(new qe3(this.a, 1, 0));
        b.a(new qe3(this.b, 1, 0));
        b.a(new qe3(this.c, 1, 0));
        b.a(new qe3(0, 2, az2.class));
        b.a(new qe3(0, 2, rj.class));
        b.a(new qe3(0, 2, ej4.class));
        b.f = new ht2(this, (byte) 4);
        b.c(2);
        return Arrays.asList(b.b(), ise.a("fire-cls", "20.1.1"));
    }
}
