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
import s9.k;
import s9.s;
import sa.d;
import w7.p5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final o Companion = new o();

    @Deprecated
    private static final s firebaseApp = s.a(h.class);

    @Deprecated
    private static final s firebaseInstallationsApi = s.a(d.class);

    @Deprecated
    private static final s backgroundDispatcher = new s(a.class, a0.class);

    @Deprecated
    private static final s blockingDispatcher = new s(b.class, a0.class);

    @Deprecated
    private static final s transportFactory = s.a(f.class);

    @Deprecated
    private static final s sessionFirelogPublisher = s.a(g0.class);

    @Deprecated
    private static final s sessionGenerator = s.a(m0.class);

    @Deprecated
    private static final s sessionsSettings = s.a(db.h.class);

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
        s sVar = firebaseApp;
        a2.a(k.b(sVar));
        s sVar2 = sessionsSettings;
        a2.a(k.b(sVar2));
        s sVar3 = backgroundDispatcher;
        a2.a(k.b(sVar3));
        a2.f = new w(19);
        a2.c(2);
        s9.a b10 = a2.b();
        n0 a10 = s9.a.a(m0.class);
        a10.d = "session-generator";
        a10.f = new w(20);
        s9.a b11 = a10.b();
        n0 a11 = s9.a.a(g0.class);
        a11.d = "session-publisher";
        a11.a(new k(sVar, 1, 0));
        s sVar4 = firebaseInstallationsApi;
        a11.a(k.b(sVar4));
        a11.a(new k(sVar2, 1, 0));
        a11.a(new k(transportFactory, 1, 1));
        a11.a(new k(sVar3, 1, 0));
        a11.f = new w(21);
        s9.a b12 = a11.b();
        n0 a12 = s9.a.a(db.h.class);
        a12.d = "sessions-settings";
        a12.a(new k(sVar, 1, 0));
        a12.a(k.b(blockingDispatcher));
        a12.a(new k(sVar3, 1, 0));
        a12.a(new k(sVar4, 1, 0));
        a12.f = new w(22);
        s9.a b13 = a12.b();
        n0 a13 = s9.a.a(t.class);
        a13.d = "sessions-datastore";
        a13.a(new k(sVar, 1, 0));
        a13.a(new k(sVar3, 1, 0));
        a13.f = new w(23);
        s9.a b14 = a13.b();
        n0 a14 = s9.a.a(q0.class);
        a14.d = "sessions-service-binder";
        a14.a(new k(sVar, 1, 0));
        a14.f = new w(24);
        return kd.h.c(b10, b11, b12, b13, b14, a14.b(), p5.a(LIBRARY_NAME, "1.2.0"));
    }
}
