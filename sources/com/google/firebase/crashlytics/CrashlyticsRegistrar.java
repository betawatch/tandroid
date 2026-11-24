package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final xw8 a = new xw8(md0.class, ExecutorService.class);
    public final xw8 b = new xw8(nk0.class, ExecutorService.class);
    public final xw8 c = new xw8(i16.class, ExecutorService.class);

    static {
        Map map = lh4.b;
        q6a q6aVar = q6a.a;
        if (map.containsKey(q6aVar)) {
            Log.d("FirebaseSessions", "Dependency " + q6aVar + " already added.");
            return;
        }
        map.put(q6aVar, new jh4(new CountDownLatch(1)));
        StringBuilder sb = new StringBuilder("Dependency to ");
        sb.append(q6aVar);
        ir2.x(sb, " added.", "FirebaseSessions");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        lp2 b = mp2.b(lg4.class);
        b.a = "fire-cls";
        b.a(wd3.b(jg4.class));
        b.a(wd3.b(rg4.class));
        b.a(new wd3(this.a, 1, 0));
        b.a(new wd3(this.b, 1, 0));
        b.a(new wd3(this.c, 1, 0));
        b.a(new wd3(0, 2, fy2.class));
        b.a(new wd3(0, 2, qj.class));
        b.a(new wd3(0, 2, dh4.class));
        b.f = new vu2(this, (byte) 2);
        b.c(2);
        return Arrays.asList(b.b(), one.a("fire-cls", "20.1.1"));
    }
}
