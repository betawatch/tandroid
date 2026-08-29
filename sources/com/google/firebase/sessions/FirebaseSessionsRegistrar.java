package com.google.firebase.sessions;

import a9.c;
import a9.v;
import aa.d;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import h7.v7;
import j3.d0;
import ja.c0;
import ja.g0;
import ja.k0;
import ja.m;
import ja.m0;
import ja.o;
import ja.q0;
import ja.r0;
import ja.t;
import java.util.List;
import jd.a0;
import kotlin.jvm.internal.j;
import la.h;
import u8.g;
import v2.f;
import w8.a;
import w8.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final o Companion = new o();

    @Deprecated
    private static final v firebaseApp = v.a(g.class);

    @Deprecated
    private static final v firebaseInstallationsApi = v.a(d.class);

    @Deprecated
    private static final v backgroundDispatcher = new v(a.class, a0.class);

    @Deprecated
    private static final v blockingDispatcher = new v(b.class, a0.class);

    @Deprecated
    private static final v transportFactory = v.a(f.class);

    @Deprecated
    private static final v sessionFirelogPublisher = v.a(g0.class);

    @Deprecated
    private static final v sessionGenerator = v.a(m0.class);

    @Deprecated
    private static final v sessionsSettings = v.a(h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final m getComponents$lambda-0(c cVar) {
        Object d = cVar.d(firebaseApp);
        j.d(d, "container[firebaseApp]");
        Object d10 = cVar.d(sessionsSettings);
        j.d(d10, "container[sessionsSettings]");
        Object d11 = cVar.d(backgroundDispatcher);
        j.d(d11, "container[backgroundDispatcher]");
        return new m((g) d, (h) d10, (sc.h) d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 getComponents$lambda-1(c cVar) {
        return new m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 getComponents$lambda-2(c cVar) {
        Object d = cVar.d(firebaseApp);
        j.d(d, "container[firebaseApp]");
        Object d10 = cVar.d(firebaseInstallationsApi);
        j.d(d10, "container[firebaseInstallationsApi]");
        Object d11 = cVar.d(sessionsSettings);
        j.d(d11, "container[sessionsSettings]");
        z9.b g10 = cVar.g(transportFactory);
        j.d(g10, "container.getProvider(transportFactory)");
        za.c cVar2 = new za.c(g10, 20);
        Object d12 = cVar.d(backgroundDispatcher);
        j.d(d12, "container[backgroundDispatcher]");
        return new k0((g) d, (d) d10, (h) d11, cVar2, (sc.h) d12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h getComponents$lambda-3(c cVar) {
        Object d = cVar.d(firebaseApp);
        j.d(d, "container[firebaseApp]");
        Object d10 = cVar.d(blockingDispatcher);
        j.d(d10, "container[blockingDispatcher]");
        Object d11 = cVar.d(backgroundDispatcher);
        j.d(d11, "container[backgroundDispatcher]");
        Object d12 = cVar.d(firebaseInstallationsApi);
        j.d(d12, "container[firebaseInstallationsApi]");
        return new h((g) d, (sc.h) d10, (sc.h) d11, (d) d12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t getComponents$lambda-4(c cVar) {
        g gVar = (g) cVar.d(firebaseApp);
        gVar.a();
        Context context = gVar.a;
        j.d(context, "container[firebaseApp].applicationContext");
        Object d = cVar.d(backgroundDispatcher);
        j.d(d, "container[backgroundDispatcher]");
        return new c0(context, (sc.h) d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 getComponents$lambda-5(c cVar) {
        Object d = cVar.d(firebaseApp);
        j.d(d, "container[firebaseApp]");
        return new r0((g) d);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a9.b> getComponents() {
        a9.a b10 = a9.b.b(m.class);
        b10.c = LIBRARY_NAME;
        v vVar = firebaseApp;
        b10.a(a9.m.a(vVar));
        v vVar2 = sessionsSettings;
        b10.a(a9.m.a(vVar2));
        v vVar3 = backgroundDispatcher;
        b10.a(a9.m.a(vVar3));
        b10.g = new d0(22);
        b10.c(2);
        a9.b b11 = b10.b();
        a9.a b12 = a9.b.b(m0.class);
        b12.c = "session-generator";
        b12.g = new d0(23);
        a9.b b13 = b12.b();
        a9.a b14 = a9.b.b(g0.class);
        b14.c = "session-publisher";
        b14.a(new a9.m(vVar, 1, 0));
        v vVar4 = firebaseInstallationsApi;
        b14.a(a9.m.a(vVar4));
        b14.a(new a9.m(vVar2, 1, 0));
        b14.a(new a9.m(transportFactory, 1, 1));
        b14.a(new a9.m(vVar3, 1, 0));
        b14.g = new d0(24);
        a9.b b15 = b14.b();
        a9.a b16 = a9.b.b(h.class);
        b16.c = "sessions-settings";
        b16.a(new a9.m(vVar, 1, 0));
        b16.a(a9.m.a(blockingDispatcher));
        b16.a(new a9.m(vVar3, 1, 0));
        b16.a(new a9.m(vVar4, 1, 0));
        b16.g = new d0(25);
        a9.b b17 = b16.b();
        a9.a b18 = a9.b.b(t.class);
        b18.c = "sessions-datastore";
        b18.a(new a9.m(vVar, 1, 0));
        b18.a(new a9.m(vVar3, 1, 0));
        b18.g = new d0(26);
        a9.b b19 = b18.b();
        a9.a b20 = a9.b.b(q0.class);
        b20.c = "sessions-service-binder";
        b20.a(new a9.m(vVar, 1, 0));
        b20.g = new d0(27);
        return rc.h.c(b11, b13, b15, b17, b19, b20.b(), v7.a(LIBRARY_NAME, "1.2.0"));
    }
}
