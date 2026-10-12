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
import b2.n0;
import be.a0;
import com.google.firebase.components.ComponentRegistrar;
import i5.f;
import java.util.List;
import kotlin.jvm.internal.i;
import l9.h;
import n9.a;
import n9.b;
import qb.c;
import r9.j;
import r9.r;
import ra.d;
import w7.w8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        Object e = bVar.e(firebaseApp);
        i.d(e, "container[firebaseApp]");
        Object e7 = bVar.e(sessionsSettings);
        i.d(e7, "container[sessionsSettings]");
        Object e10 = bVar.e(backgroundDispatcher);
        i.d(e10, "container[backgroundDispatcher]");
        return new m((h) e, (cb.h) e7, (kd.h) e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 getComponents$lambda-1(r9.b bVar) {
        return new m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 getComponents$lambda-2(r9.b bVar) {
        Object e = bVar.e(firebaseApp);
        i.d(e, "container[firebaseApp]");
        Object e7 = bVar.e(firebaseInstallationsApi);
        i.d(e7, "container[firebaseInstallationsApi]");
        Object e10 = bVar.e(sessionsSettings);
        i.d(e10, "container[sessionsSettings]");
        qa.b g10 = bVar.g(transportFactory);
        i.d(g10, "container.getProvider(transportFactory)");
        c cVar = new c(g10, 2);
        Object e11 = bVar.e(backgroundDispatcher);
        i.d(e11, "container[backgroundDispatcher]");
        return new k0((h) e, (d) e7, (cb.h) e10, cVar, (kd.h) e11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cb.h getComponents$lambda-3(r9.b bVar) {
        Object e = bVar.e(firebaseApp);
        i.d(e, "container[firebaseApp]");
        Object e7 = bVar.e(blockingDispatcher);
        i.d(e7, "container[blockingDispatcher]");
        Object e10 = bVar.e(backgroundDispatcher);
        i.d(e10, "container[backgroundDispatcher]");
        Object e11 = bVar.e(firebaseInstallationsApi);
        i.d(e11, "container[firebaseInstallationsApi]");
        return new cb.h((h) e, (kd.h) e7, (kd.h) e10, (d) e11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t getComponents$lambda-4(r9.b bVar) {
        h hVar = (h) bVar.e(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object e = bVar.e(backgroundDispatcher);
        i.d(e, "container[backgroundDispatcher]");
        return new c0(context, (kd.h) e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 getComponents$lambda-5(r9.b bVar) {
        Object e = bVar.e(firebaseApp);
        i.d(e, "container[firebaseApp]");
        return new s0((h) e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        n0 a2 = r9.a.a(m.class);
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
        n0 a10 = r9.a.a(m0.class);
        a10.d = "session-generator";
        a10.f = new aa.a(8);
        r9.a b11 = a10.b();
        n0 a11 = r9.a.a(g0.class);
        a11.d = "session-publisher";
        a11.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        a11.a(j.b(rVar4));
        a11.a(new j(rVar2, 1, 0));
        a11.a(new j(transportFactory, 1, 1));
        a11.a(new j(rVar3, 1, 0));
        a11.f = new aa.a(9);
        r9.a b12 = a11.b();
        n0 a12 = r9.a.a(cb.h.class);
        a12.d = "sessions-settings";
        a12.a(new j(rVar, 1, 0));
        a12.a(j.b(blockingDispatcher));
        a12.a(new j(rVar3, 1, 0));
        a12.a(new j(rVar4, 1, 0));
        a12.f = new aa.a(10);
        r9.a b13 = a12.b();
        n0 a13 = r9.a.a(t.class);
        a13.d = "sessions-datastore";
        a13.a(new j(rVar, 1, 0));
        a13.a(new j(rVar3, 1, 0));
        a13.f = new aa.a(11);
        r9.a b14 = a13.b();
        n0 a14 = r9.a.a(r0.class);
        a14.d = "sessions-service-binder";
        a14.a(new j(rVar, 1, 0));
        a14.f = new aa.a(12);
        return jd.h.c(b10, b11, b12, b13, b14, a14.b(), w8.a(LIBRARY_NAME, "1.2.0"));
    }
}
