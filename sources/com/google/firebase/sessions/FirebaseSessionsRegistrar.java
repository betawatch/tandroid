package com.google.firebase.sessions;

import android.content.Context;
import c9.c;
import c9.t;
import ca.d;
import com.google.firebase.components.ComponentRegistrar;
import j7.m8;
import java.util.List;
import k3.e;
import kotlin.jvm.internal.j;
import la.d0;
import la.h0;
import la.j0;
import la.l;
import la.n;
import la.n0;
import la.o0;
import la.s;
import la.z;
import ld.a0;
import na.h;
import o5.i;
import v2.f;
import w8.g;
import y8.a;
import y8.b;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final n Companion = new n();

    @Deprecated
    private static final t firebaseApp = t.a(g.class);

    @Deprecated
    private static final t firebaseInstallationsApi = t.a(d.class);

    @Deprecated
    private static final t backgroundDispatcher = new t(a.class, a0.class);

    @Deprecated
    private static final t blockingDispatcher = new t(b.class, a0.class);

    @Deprecated
    private static final t transportFactory = t.a(f.class);

    @Deprecated
    private static final t sessionFirelogPublisher = t.a(d0.class);

    @Deprecated
    private static final t sessionGenerator = t.a(j0.class);

    @Deprecated
    private static final t sessionsSettings = t.a(h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final l getComponents$lambda-0(c cVar) {
        Object f10 = cVar.f(firebaseApp);
        j.d(f10, "container[firebaseApp]");
        Object f11 = cVar.f(sessionsSettings);
        j.d(f11, "container[sessionsSettings]");
        Object f12 = cVar.f(backgroundDispatcher);
        j.d(f12, "container[backgroundDispatcher]");
        return new l((g) f10, (h) f11, (uc.h) f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 getComponents$lambda-1(c cVar) {
        return new j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 getComponents$lambda-2(c cVar) {
        Object f10 = cVar.f(firebaseApp);
        j.d(f10, "container[firebaseApp]");
        Object f11 = cVar.f(firebaseInstallationsApi);
        j.d(f11, "container[firebaseInstallationsApi]");
        Object f12 = cVar.f(sessionsSettings);
        j.d(f12, "container[sessionsSettings]");
        ba.b b10 = cVar.b(transportFactory);
        j.d(b10, "container.getProvider(transportFactory)");
        i iVar = new i(b10, 21);
        Object f13 = cVar.f(backgroundDispatcher);
        j.d(f13, "container[backgroundDispatcher]");
        return new h0((g) f10, (d) f11, (h) f12, iVar, (uc.h) f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h getComponents$lambda-3(c cVar) {
        Object f10 = cVar.f(firebaseApp);
        j.d(f10, "container[firebaseApp]");
        Object f11 = cVar.f(blockingDispatcher);
        j.d(f11, "container[blockingDispatcher]");
        Object f12 = cVar.f(backgroundDispatcher);
        j.d(f12, "container[backgroundDispatcher]");
        Object f13 = cVar.f(firebaseInstallationsApi);
        j.d(f13, "container[firebaseInstallationsApi]");
        return new h((g) f10, (uc.h) f11, (uc.h) f12, (d) f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s getComponents$lambda-4(c cVar) {
        g gVar = (g) cVar.f(firebaseApp);
        gVar.a();
        Context context = gVar.a;
        j.d(context, "container[firebaseApp].applicationContext");
        Object f10 = cVar.f(backgroundDispatcher);
        j.d(f10, "container[backgroundDispatcher]");
        return new z(context, (uc.h) f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 getComponents$lambda-5(c cVar) {
        Object f10 = cVar.f(firebaseApp);
        j.d(f10, "container[firebaseApp]");
        return new o0((g) f10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c9.b> getComponents() {
        c9.a b10 = c9.b.b(l.class);
        b10.a = LIBRARY_NAME;
        t tVar = firebaseApp;
        b10.a(c9.l.a(tVar));
        t tVar2 = sessionsSettings;
        b10.a(c9.l.a(tVar2));
        t tVar3 = backgroundDispatcher;
        b10.a(c9.l.a(tVar3));
        b10.g = new e(17);
        b10.c(2);
        c9.b b11 = b10.b();
        c9.a b12 = c9.b.b(j0.class);
        b12.a = "session-generator";
        b12.g = new e(18);
        c9.b b13 = b12.b();
        c9.a b14 = c9.b.b(d0.class);
        b14.a = "session-publisher";
        b14.a(new c9.l(tVar, 1, 0));
        t tVar4 = firebaseInstallationsApi;
        b14.a(c9.l.a(tVar4));
        b14.a(new c9.l(tVar2, 1, 0));
        b14.a(new c9.l(transportFactory, 1, 1));
        b14.a(new c9.l(tVar3, 1, 0));
        b14.g = new e(19);
        c9.b b15 = b14.b();
        c9.a b16 = c9.b.b(h.class);
        b16.a = "sessions-settings";
        b16.a(new c9.l(tVar, 1, 0));
        b16.a(c9.l.a(blockingDispatcher));
        b16.a(new c9.l(tVar3, 1, 0));
        b16.a(new c9.l(tVar4, 1, 0));
        b16.g = new e(20);
        c9.b b17 = b16.b();
        c9.a b18 = c9.b.b(s.class);
        b18.a = "sessions-datastore";
        b18.a(new c9.l(tVar, 1, 0));
        b18.a(new c9.l(tVar3, 1, 0));
        b18.g = new e(21);
        c9.b b19 = b18.b();
        c9.a b20 = c9.b.b(n0.class);
        b20.a = "sessions-service-binder";
        b20.a(new c9.l(tVar, 1, 0));
        b20.g = new e(22);
        return tc.h.c(b11, b13, b15, b17, b19, b20.b(), m8.a(LIBRARY_NAME, "1.2.0"));
    }
}
