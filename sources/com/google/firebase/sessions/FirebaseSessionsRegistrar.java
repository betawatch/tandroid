package com.google.firebase.sessions;

import ae.b0;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import i5.f;
import java.util.List;
import k9.h;
import kotlin.jvm.internal.i;
import m2.t;
import m9.a;
import m9.b;
import q9.j;
import q9.r;
import qa.d;
import w7.o8;
import za.a0;
import za.e0;
import za.i0;
import za.k0;
import za.m;
import za.o;
import za.o0;
import za.p0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    private static final r backgroundDispatcher = new r(a.class, b0.class);

    @Deprecated
    private static final r blockingDispatcher = new r(b.class, b0.class);

    @Deprecated
    private static final r transportFactory = r.a(f.class);

    @Deprecated
    private static final r sessionFirelogPublisher = r.a(e0.class);

    @Deprecated
    private static final r sessionGenerator = r.a(k0.class);

    @Deprecated
    private static final r sessionsSettings = r.a(bb.h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final m getComponents$lambda-0(q9.b bVar) {
        Object g10 = bVar.g(firebaseApp);
        i.d(g10, "container[firebaseApp]");
        Object g11 = bVar.g(sessionsSettings);
        i.d(g11, "container[sessionsSettings]");
        Object g12 = bVar.g(backgroundDispatcher);
        i.d(g12, "container[backgroundDispatcher]");
        return new m((h) g10, (bb.h) g11, (jd.h) g12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k0 getComponents$lambda-1(q9.b bVar) {
        return new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 getComponents$lambda-2(q9.b bVar) {
        Object g10 = bVar.g(firebaseApp);
        i.d(g10, "container[firebaseApp]");
        Object g11 = bVar.g(firebaseInstallationsApi);
        i.d(g11, "container[firebaseInstallationsApi]");
        Object g12 = bVar.g(sessionsSettings);
        i.d(g12, "container[sessionsSettings]");
        pa.b d = bVar.d(transportFactory);
        i.d(d, "container.getProvider(transportFactory)");
        t tVar = new t(d, 24);
        Object g13 = bVar.g(backgroundDispatcher);
        i.d(g13, "container[backgroundDispatcher]");
        return new i0((h) g10, (d) g11, (bb.h) g12, tVar, (jd.h) g13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bb.h getComponents$lambda-3(q9.b bVar) {
        Object g10 = bVar.g(firebaseApp);
        i.d(g10, "container[firebaseApp]");
        Object g11 = bVar.g(blockingDispatcher);
        i.d(g11, "container[blockingDispatcher]");
        Object g12 = bVar.g(backgroundDispatcher);
        i.d(g12, "container[backgroundDispatcher]");
        Object g13 = bVar.g(firebaseInstallationsApi);
        i.d(g13, "container[firebaseInstallationsApi]");
        return new bb.h((h) g10, (jd.h) g11, (jd.h) g12, (d) g13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final za.t getComponents$lambda-4(q9.b bVar) {
        h hVar = (h) bVar.g(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object g10 = bVar.g(backgroundDispatcher);
        i.d(g10, "container[backgroundDispatcher]");
        return new a0(context, (jd.h) g10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 getComponents$lambda-5(q9.b bVar) {
        Object g10 = bVar.g(firebaseApp);
        i.d(g10, "container[firebaseApp]");
        return new p0((h) g10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        b2.i0 a2 = q9.a.a(m.class);
        a2.d = LIBRARY_NAME;
        r rVar = firebaseApp;
        a2.a(j.b(rVar));
        r rVar2 = sessionsSettings;
        a2.a(j.b(rVar2));
        r rVar3 = backgroundDispatcher;
        a2.a(j.b(rVar3));
        a2.f = new xa.b(17);
        a2.c(2);
        q9.a b10 = a2.b();
        b2.i0 a10 = q9.a.a(k0.class);
        a10.d = "session-generator";
        a10.f = new xa.b(18);
        q9.a b11 = a10.b();
        b2.i0 a11 = q9.a.a(e0.class);
        a11.d = "session-publisher";
        a11.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        a11.a(j.b(rVar4));
        a11.a(new j(rVar2, 1, 0));
        a11.a(new j(transportFactory, 1, 1));
        a11.a(new j(rVar3, 1, 0));
        a11.f = new xa.b(19);
        q9.a b12 = a11.b();
        b2.i0 a12 = q9.a.a(bb.h.class);
        a12.d = "sessions-settings";
        a12.a(new j(rVar, 1, 0));
        a12.a(j.b(blockingDispatcher));
        a12.a(new j(rVar3, 1, 0));
        a12.a(new j(rVar4, 1, 0));
        a12.f = new xa.b(20);
        q9.a b13 = a12.b();
        b2.i0 a13 = q9.a.a(za.t.class);
        a13.d = "sessions-datastore";
        a13.a(new j(rVar, 1, 0));
        a13.a(new j(rVar3, 1, 0));
        a13.f = new xa.b(21);
        q9.a b14 = a13.b();
        b2.i0 a14 = q9.a.a(o0.class);
        a14.d = "sessions-service-binder";
        a14.a(new j(rVar, 1, 0));
        a14.f = new xa.b(22);
        return id.h.c(b10, b11, b12, b13, b14, a14.b(), o8.a(LIBRARY_NAME, "1.2.0"));
    }
}
