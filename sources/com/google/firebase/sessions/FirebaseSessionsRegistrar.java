package com.google.firebase.sessions;

import android.content.Context;
import b2.n0;
import bb.c0;
import bb.g0;
import bb.k0;
import bb.m;
import bb.m0;
import bb.o;
import bb.q0;
import bb.r0;
import bb.t;
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
import td.a0;
import w7.v9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    private static final r sessionsSettings = r.a(db.h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final m getComponents$lambda-0(r9.b bVar) {
        Object d = bVar.d(firebaseApp);
        i.d(d, "container[firebaseApp]");
        Object d10 = bVar.d(sessionsSettings);
        i.d(d10, "container[sessionsSettings]");
        Object d11 = bVar.d(backgroundDispatcher);
        i.d(d11, "container[backgroundDispatcher]");
        return new m((h) d, (db.h) d10, (cd.h) d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 getComponents$lambda-1(r9.b bVar) {
        return new m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 getComponents$lambda-2(r9.b bVar) {
        Object d = bVar.d(firebaseApp);
        i.d(d, "container[firebaseApp]");
        Object d10 = bVar.d(firebaseInstallationsApi);
        i.d(d10, "container[firebaseInstallationsApi]");
        Object d11 = bVar.d(sessionsSettings);
        i.d(d11, "container[sessionsSettings]");
        qa.b e = bVar.e(transportFactory);
        i.d(e, "container.getProvider(transportFactory)");
        k6.h hVar = new k6.h(e, 9);
        Object d12 = bVar.d(backgroundDispatcher);
        i.d(d12, "container[backgroundDispatcher]");
        return new k0((h) d, (d) d10, (db.h) d11, hVar, (cd.h) d12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final db.h getComponents$lambda-3(r9.b bVar) {
        Object d = bVar.d(firebaseApp);
        i.d(d, "container[firebaseApp]");
        Object d10 = bVar.d(blockingDispatcher);
        i.d(d10, "container[blockingDispatcher]");
        Object d11 = bVar.d(backgroundDispatcher);
        i.d(d11, "container[backgroundDispatcher]");
        Object d12 = bVar.d(firebaseInstallationsApi);
        i.d(d12, "container[firebaseInstallationsApi]");
        return new db.h((h) d, (cd.h) d10, (cd.h) d11, (d) d12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t getComponents$lambda-4(r9.b bVar) {
        h hVar = (h) bVar.d(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object d = bVar.d(backgroundDispatcher);
        i.d(d, "container[backgroundDispatcher]");
        return new c0(context, (cd.h) d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 getComponents$lambda-5(r9.b bVar) {
        Object d = bVar.d(firebaseApp);
        i.d(d, "container[firebaseApp]");
        return new r0((h) d);
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
        a2.f = new aa.a(21);
        a2.c(2);
        r9.a b10 = a2.b();
        n0 a10 = r9.a.a(m0.class);
        a10.d = "session-generator";
        a10.f = new aa.a(22);
        r9.a b11 = a10.b();
        n0 a11 = r9.a.a(g0.class);
        a11.d = "session-publisher";
        a11.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        a11.a(j.b(rVar4));
        a11.a(new j(rVar2, 1, 0));
        a11.a(new j(transportFactory, 1, 1));
        a11.a(new j(rVar3, 1, 0));
        a11.f = new aa.a(23);
        r9.a b12 = a11.b();
        n0 a12 = r9.a.a(db.h.class);
        a12.d = "sessions-settings";
        a12.a(new j(rVar, 1, 0));
        a12.a(j.b(blockingDispatcher));
        a12.a(new j(rVar3, 1, 0));
        a12.a(new j(rVar4, 1, 0));
        a12.f = new aa.a(24);
        r9.a b13 = a12.b();
        n0 a13 = r9.a.a(t.class);
        a13.d = "sessions-datastore";
        a13.a(new j(rVar, 1, 0));
        a13.a(new j(rVar3, 1, 0));
        a13.f = new aa.a(25);
        r9.a b14 = a13.b();
        n0 a14 = r9.a.a(q0.class);
        a14.d = "sessions-service-binder";
        a14.a(new j(rVar, 1, 0));
        a14.f = new aa.a(26);
        return bd.j.c(b10, b11, b12, b13, b14, a14.b(), v9.a(LIBRARY_NAME, "1.2.0"));
    }
}
