package com.google.firebase.sessions;

import a4.l;
import ag.w;
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
import ce.a0;
import com.google.firebase.components.ComponentRegistrar;
import j5.f;
import java.util.List;
import kotlin.jvm.internal.i;
import m9.h;
import o9.a;
import o9.b;
import s9.j;
import s9.r;
import sa.d;
import w7.o5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public static final m getComponents$lambda-0(s9.b bVar) {
        Object n10 = bVar.n(firebaseApp);
        i.d(n10, "container[firebaseApp]");
        Object n11 = bVar.n(sessionsSettings);
        i.d(n11, "container[sessionsSettings]");
        Object n12 = bVar.n(backgroundDispatcher);
        i.d(n12, "container[backgroundDispatcher]");
        return new m((h) n10, (db.h) n11, (ld.h) n12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 getComponents$lambda-1(s9.b bVar) {
        return new m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 getComponents$lambda-2(s9.b bVar) {
        Object n10 = bVar.n(firebaseApp);
        i.d(n10, "container[firebaseApp]");
        Object n11 = bVar.n(firebaseInstallationsApi);
        i.d(n11, "container[firebaseInstallationsApi]");
        Object n12 = bVar.n(sessionsSettings);
        i.d(n12, "container[sessionsSettings]");
        ra.b b10 = bVar.b(transportFactory);
        i.d(b10, "container.getProvider(transportFactory)");
        l lVar = new l(b10, 5);
        Object n13 = bVar.n(backgroundDispatcher);
        i.d(n13, "container[backgroundDispatcher]");
        return new k0((h) n10, (d) n11, (db.h) n12, lVar, (ld.h) n13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final db.h getComponents$lambda-3(s9.b bVar) {
        Object n10 = bVar.n(firebaseApp);
        i.d(n10, "container[firebaseApp]");
        Object n11 = bVar.n(blockingDispatcher);
        i.d(n11, "container[blockingDispatcher]");
        Object n12 = bVar.n(backgroundDispatcher);
        i.d(n12, "container[backgroundDispatcher]");
        Object n13 = bVar.n(firebaseInstallationsApi);
        i.d(n13, "container[firebaseInstallationsApi]");
        return new db.h((h) n10, (ld.h) n11, (ld.h) n12, (d) n13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t getComponents$lambda-4(s9.b bVar) {
        h hVar = (h) bVar.n(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object n10 = bVar.n(backgroundDispatcher);
        i.d(n10, "container[backgroundDispatcher]");
        return new c0(context, (ld.h) n10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 getComponents$lambda-5(s9.b bVar) {
        Object n10 = bVar.n(firebaseApp);
        i.d(n10, "container[firebaseApp]");
        return new r0((h) n10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s9.a> getComponents() {
        n0 a2 = s9.a.a(m.class);
        a2.d = LIBRARY_NAME;
        r rVar = firebaseApp;
        a2.a(j.b(rVar));
        r rVar2 = sessionsSettings;
        a2.a(j.b(rVar2));
        r rVar3 = backgroundDispatcher;
        a2.a(j.b(rVar3));
        a2.f = new w(19);
        a2.c(2);
        s9.a b10 = a2.b();
        n0 a10 = s9.a.a(m0.class);
        a10.d = "session-generator";
        a10.f = new w(20);
        s9.a b11 = a10.b();
        n0 a11 = s9.a.a(g0.class);
        a11.d = "session-publisher";
        a11.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        a11.a(j.b(rVar4));
        a11.a(new j(rVar2, 1, 0));
        a11.a(new j(transportFactory, 1, 1));
        a11.a(new j(rVar3, 1, 0));
        a11.f = new w(21);
        s9.a b12 = a11.b();
        n0 a12 = s9.a.a(db.h.class);
        a12.d = "sessions-settings";
        a12.a(new j(rVar, 1, 0));
        a12.a(j.b(blockingDispatcher));
        a12.a(new j(rVar3, 1, 0));
        a12.a(new j(rVar4, 1, 0));
        a12.f = new w(22);
        s9.a b13 = a12.b();
        n0 a13 = s9.a.a(t.class);
        a13.d = "sessions-datastore";
        a13.a(new j(rVar, 1, 0));
        a13.a(new j(rVar3, 1, 0));
        a13.f = new w(23);
        s9.a b14 = a13.b();
        n0 a14 = s9.a.a(q0.class);
        a14.d = "sessions-service-binder";
        a14.a(new j(rVar, 1, 0));
        a14.f = new w(24);
        return kd.h.c(b10, b11, b12, b13, b14, a14.b(), o5.a(LIBRARY_NAME, "1.2.0"));
    }
}
