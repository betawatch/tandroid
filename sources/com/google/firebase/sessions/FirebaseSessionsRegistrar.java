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
import qb.c;
import r9.j;
import r9.r;
import ra.d;
import w7.w8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        Object c10 = bVar.c(firebaseApp);
        i.d(c10, "container[firebaseApp]");
        Object c11 = bVar.c(sessionsSettings);
        i.d(c11, "container[sessionsSettings]");
        Object c12 = bVar.c(backgroundDispatcher);
        i.d(c12, "container[backgroundDispatcher]");
        return new m((h) c10, (cb.h) c11, (kd.h) c12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 getComponents$lambda-1(r9.b bVar) {
        return new m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 getComponents$lambda-2(r9.b bVar) {
        Object c10 = bVar.c(firebaseApp);
        i.d(c10, "container[firebaseApp]");
        Object c11 = bVar.c(firebaseInstallationsApi);
        i.d(c11, "container[firebaseInstallationsApi]");
        Object c12 = bVar.c(sessionsSettings);
        i.d(c12, "container[sessionsSettings]");
        qa.b e = bVar.e(transportFactory);
        i.d(e, "container.getProvider(transportFactory)");
        c cVar = new c(e, 2);
        Object c13 = bVar.c(backgroundDispatcher);
        i.d(c13, "container[backgroundDispatcher]");
        return new k0((h) c10, (d) c11, (cb.h) c12, cVar, (kd.h) c13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cb.h getComponents$lambda-3(r9.b bVar) {
        Object c10 = bVar.c(firebaseApp);
        i.d(c10, "container[firebaseApp]");
        Object c11 = bVar.c(blockingDispatcher);
        i.d(c11, "container[blockingDispatcher]");
        Object c12 = bVar.c(backgroundDispatcher);
        i.d(c12, "container[backgroundDispatcher]");
        Object c13 = bVar.c(firebaseInstallationsApi);
        i.d(c13, "container[firebaseInstallationsApi]");
        return new cb.h((h) c10, (kd.h) c11, (kd.h) c12, (d) c13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t getComponents$lambda-4(r9.b bVar) {
        h hVar = (h) bVar.c(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object c10 = bVar.c(backgroundDispatcher);
        i.d(c10, "container[backgroundDispatcher]");
        return new c0(context, (kd.h) c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 getComponents$lambda-5(r9.b bVar) {
        Object c10 = bVar.c(firebaseApp);
        i.d(c10, "container[firebaseApp]");
        return new s0((h) c10);
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
        return jd.h.c(b10, b11, b12, b13, b14, a14.b(), w8.a(LIBRARY_NAME, "1.2.0"));
    }
}
