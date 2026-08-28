package com.google.firebase.sessions;

import android.content.Context;
import android.support.v4.media.c;
import com.google.firebase.components.ComponentRegistrar;
import f7.c7;
import ha.c0;
import ha.g0;
import ha.k0;
import ha.m;
import ha.m0;
import ha.o;
import ha.q0;
import ha.r0;
import ha.t;
import hd.a0;
import java.util.List;
import kotlin.jvm.internal.i;
import s8.h;
import t2.f;
import u8.a;
import u8.b;
import y8.j;
import y8.r;
import y9.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final o Companion = new o();

    @Deprecated
    private static final r firebaseApp = r.a(h.class);

    @Deprecated
    private static final r firebaseInstallationsApi = r.a(d.class);

    @Deprecated
    private static final r backgroundDispatcher = new r(a.class, a0.class);

    @Deprecated
    private static final r blockingDispatcher = new r(b.class, a0.class);

    @Deprecated
    private static final r transportFactory = r.a(f.class);

    @Deprecated
    private static final r sessionFirelogPublisher = r.a(g0.class);

    @Deprecated
    private static final r sessionGenerator = r.a(m0.class);

    @Deprecated
    private static final r sessionsSettings = r.a(ja.h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final m getComponents$lambda-0(y8.b bVar) {
        Object c10 = bVar.c(firebaseApp);
        i.d(c10, "container[firebaseApp]");
        Object c11 = bVar.c(sessionsSettings);
        i.d(c11, "container[sessionsSettings]");
        Object c12 = bVar.c(backgroundDispatcher);
        i.d(c12, "container[backgroundDispatcher]");
        return new m((h) c10, (ja.h) c11, (qc.h) c12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 getComponents$lambda-1(y8.b bVar) {
        return new m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 getComponents$lambda-2(y8.b bVar) {
        Object c10 = bVar.c(firebaseApp);
        i.d(c10, "container[firebaseApp]");
        Object c11 = bVar.c(firebaseInstallationsApi);
        i.d(c11, "container[firebaseInstallationsApi]");
        Object c12 = bVar.c(sessionsSettings);
        i.d(c12, "container[sessionsSettings]");
        x9.b g10 = bVar.g(transportFactory);
        i.d(g10, "container.getProvider(transportFactory)");
        c cVar = new c(g10, 17);
        Object c13 = bVar.c(backgroundDispatcher);
        i.d(c13, "container[backgroundDispatcher]");
        return new k0((h) c10, (d) c11, (ja.h) c12, cVar, (qc.h) c13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ja.h getComponents$lambda-3(y8.b bVar) {
        Object c10 = bVar.c(firebaseApp);
        i.d(c10, "container[firebaseApp]");
        Object c11 = bVar.c(blockingDispatcher);
        i.d(c11, "container[blockingDispatcher]");
        Object c12 = bVar.c(backgroundDispatcher);
        i.d(c12, "container[backgroundDispatcher]");
        Object c13 = bVar.c(firebaseInstallationsApi);
        i.d(c13, "container[firebaseInstallationsApi]");
        return new ja.h((h) c10, (qc.h) c11, (qc.h) c12, (d) c13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t getComponents$lambda-4(y8.b bVar) {
        h hVar = (h) bVar.c(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object c10 = bVar.c(backgroundDispatcher);
        i.d(c10, "container[backgroundDispatcher]");
        return new c0(context, (qc.h) c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 getComponents$lambda-5(y8.b bVar) {
        Object c10 = bVar.c(firebaseApp);
        i.d(c10, "container[firebaseApp]");
        return new r0((h) c10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<y8.a> getComponents() {
        tg.b a2 = y8.a.a(m.class);
        a2.c = LIBRARY_NAME;
        r rVar = firebaseApp;
        a2.a(j.b(rVar));
        r rVar2 = sessionsSettings;
        a2.a(j.b(rVar2));
        r rVar3 = backgroundDispatcher;
        a2.a(j.b(rVar3));
        a2.f = new h9.a(5);
        a2.c(2);
        y8.a b10 = a2.b();
        tg.b a3 = y8.a.a(m0.class);
        a3.c = "session-generator";
        a3.f = new h9.a(6);
        y8.a b11 = a3.b();
        tg.b a10 = y8.a.a(g0.class);
        a10.c = "session-publisher";
        a10.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        a10.a(j.b(rVar4));
        a10.a(new j(rVar2, 1, 0));
        a10.a(new j(transportFactory, 1, 1));
        a10.a(new j(rVar3, 1, 0));
        a10.f = new h9.a(7);
        y8.a b12 = a10.b();
        tg.b a11 = y8.a.a(ja.h.class);
        a11.c = "sessions-settings";
        a11.a(new j(rVar, 1, 0));
        a11.a(j.b(blockingDispatcher));
        a11.a(new j(rVar3, 1, 0));
        a11.a(new j(rVar4, 1, 0));
        a11.f = new h9.a(8);
        y8.a b13 = a11.b();
        tg.b a12 = y8.a.a(t.class);
        a12.c = "sessions-datastore";
        a12.a(new j(rVar, 1, 0));
        a12.a(new j(rVar3, 1, 0));
        a12.f = new h9.a(9);
        y8.a b14 = a12.b();
        tg.b a13 = y8.a.a(q0.class);
        a13.c = "sessions-service-binder";
        a13.a(new j(rVar, 1, 0));
        a13.f = new h9.a(10);
        return pc.h.c(b10, b11, b12, b13, b14, a13.b(), c7.a(LIBRARY_NAME, "1.2.0"));
    }
}
