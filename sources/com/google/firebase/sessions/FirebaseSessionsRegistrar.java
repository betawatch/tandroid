package com.google.firebase.sessions;

import ab.c0;
import ab.g0;
import ab.k0;
import ab.m;
import ab.m0;
import ab.o;
import ab.r0;
import ab.s0;
import ab.t;
import android.content.Context;
import be.a0;
import com.google.firebase.components.ComponentRegistrar;
import i5.f;
import java.util.List;
import kotlin.jvm.internal.i;
import l9.h;
import n9.a;
import n9.b;
import r9.j;
import r9.r;
import ra.d;
import w7.x8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
    private static final r sessionsSettings = r.a(cb.h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final m getComponents$lambda-0(r9.b bVar) {
        Object f7 = bVar.f(firebaseApp);
        i.d(f7, "container[firebaseApp]");
        Object f10 = bVar.f(sessionsSettings);
        i.d(f10, "container[sessionsSettings]");
        Object f11 = bVar.f(backgroundDispatcher);
        i.d(f11, "container[backgroundDispatcher]");
        return new m((h) f7, (cb.h) f10, (kd.h) f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 getComponents$lambda-1(r9.b bVar) {
        return new m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 getComponents$lambda-2(r9.b bVar) {
        Object f7 = bVar.f(firebaseApp);
        i.d(f7, "container[firebaseApp]");
        Object f10 = bVar.f(firebaseInstallationsApi);
        i.d(f10, "container[firebaseInstallationsApi]");
        Object f11 = bVar.f(sessionsSettings);
        i.d(f11, "container[sessionsSettings]");
        qa.b g10 = bVar.g(transportFactory);
        i.d(g10, "container.getProvider(transportFactory)");
        a6.m mVar = new a6.m(g10, 1);
        Object f12 = bVar.f(backgroundDispatcher);
        i.d(f12, "container[backgroundDispatcher]");
        return new k0((h) f7, (d) f10, (cb.h) f11, mVar, (kd.h) f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cb.h getComponents$lambda-3(r9.b bVar) {
        Object f7 = bVar.f(firebaseApp);
        i.d(f7, "container[firebaseApp]");
        Object f10 = bVar.f(blockingDispatcher);
        i.d(f10, "container[blockingDispatcher]");
        Object f11 = bVar.f(backgroundDispatcher);
        i.d(f11, "container[backgroundDispatcher]");
        Object f12 = bVar.f(firebaseInstallationsApi);
        i.d(f12, "container[firebaseInstallationsApi]");
        return new cb.h((h) f7, (kd.h) f10, (kd.h) f11, (d) f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t getComponents$lambda-4(r9.b bVar) {
        h hVar = (h) bVar.f(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object f7 = bVar.f(backgroundDispatcher);
        i.d(f7, "container[backgroundDispatcher]");
        return new c0(context, (kd.h) f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 getComponents$lambda-5(r9.b bVar) {
        Object f7 = bVar.f(firebaseApp);
        i.d(f7, "container[firebaseApp]");
        return new s0((h) f7);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        b2.m0 a2 = r9.a.a(m.class);
        a2.d = LIBRARY_NAME;
        r rVar = firebaseApp;
        a2.a(j.b(rVar));
        r rVar2 = sessionsSettings;
        a2.a(j.b(rVar2));
        r rVar3 = backgroundDispatcher;
        a2.a(j.b(rVar3));
        a2.f = new aa.a(7);
        a2.c(2);
        r9.a b10 = a2.b();
        b2.m0 a10 = r9.a.a(m0.class);
        a10.d = "session-generator";
        a10.f = new aa.a(8);
        r9.a b11 = a10.b();
        b2.m0 a11 = r9.a.a(g0.class);
        a11.d = "session-publisher";
        a11.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        a11.a(j.b(rVar4));
        a11.a(new j(rVar2, 1, 0));
        a11.a(new j(transportFactory, 1, 1));
        a11.a(new j(rVar3, 1, 0));
        a11.f = new aa.a(9);
        r9.a b12 = a11.b();
        b2.m0 a12 = r9.a.a(cb.h.class);
        a12.d = "sessions-settings";
        a12.a(new j(rVar, 1, 0));
        a12.a(j.b(blockingDispatcher));
        a12.a(new j(rVar3, 1, 0));
        a12.a(new j(rVar4, 1, 0));
        a12.f = new aa.a(10);
        r9.a b13 = a12.b();
        b2.m0 a13 = r9.a.a(t.class);
        a13.d = "sessions-datastore";
        a13.a(new j(rVar, 1, 0));
        a13.a(new j(rVar3, 1, 0));
        a13.f = new aa.a(11);
        r9.a b14 = a13.b();
        b2.m0 a14 = r9.a.a(r0.class);
        a14.d = "sessions-service-binder";
        a14.a(new j(rVar, 1, 0));
        a14.f = new aa.a(12);
        return jd.h.c(b10, b11, b12, b13, b14, a14.b(), x8.a(LIBRARY_NAME, "1.2.0"));
    }
}
