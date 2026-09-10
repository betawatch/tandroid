package com.google.firebase.sessions;

import android.content.Context;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import i5.f;
import java.util.List;
import k9.h;
import kotlin.jvm.internal.i;
import m.g3;
import m9.a;
import m9.b;
import q9.j;
import q9.r;
import qa.d;
import w7.o8;
import za.d0;
import za.h0;
import za.j0;
import za.l;
import za.n;
import za.n0;
import za.o0;
import za.s;
import za.z;
import zd.a0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final n Companion = new n();

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
    private static final r sessionFirelogPublisher = r.a(d0.class);

    @Deprecated
    private static final r sessionGenerator = r.a(j0.class);

    @Deprecated
    private static final r sessionsSettings = r.a(bb.h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final l getComponents$lambda-0(q9.b bVar) {
        Object h = bVar.h(firebaseApp);
        i.d(h, "container[firebaseApp]");
        Object h10 = bVar.h(sessionsSettings);
        i.d(h10, "container[sessionsSettings]");
        Object h11 = bVar.h(backgroundDispatcher);
        i.d(h11, "container[backgroundDispatcher]");
        return new l((h) h, (bb.h) h10, (id.h) h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 getComponents$lambda-1(q9.b bVar) {
        return new j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 getComponents$lambda-2(q9.b bVar) {
        Object h = bVar.h(firebaseApp);
        i.d(h, "container[firebaseApp]");
        Object h10 = bVar.h(firebaseInstallationsApi);
        i.d(h10, "container[firebaseInstallationsApi]");
        Object h11 = bVar.h(sessionsSettings);
        i.d(h11, "container[sessionsSettings]");
        pa.b e = bVar.e(transportFactory);
        i.d(e, "container.getProvider(transportFactory)");
        g3 g3Var = new g3(e, 29);
        Object h12 = bVar.h(backgroundDispatcher);
        i.d(h12, "container[backgroundDispatcher]");
        return new h0((h) h, (d) h10, (bb.h) h11, g3Var, (id.h) h12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bb.h getComponents$lambda-3(q9.b bVar) {
        Object h = bVar.h(firebaseApp);
        i.d(h, "container[firebaseApp]");
        Object h10 = bVar.h(blockingDispatcher);
        i.d(h10, "container[blockingDispatcher]");
        Object h11 = bVar.h(backgroundDispatcher);
        i.d(h11, "container[backgroundDispatcher]");
        Object h12 = bVar.h(firebaseInstallationsApi);
        i.d(h12, "container[firebaseInstallationsApi]");
        return new bb.h((h) h, (id.h) h10, (id.h) h11, (d) h12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s getComponents$lambda-4(q9.b bVar) {
        h hVar = (h) bVar.h(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object h = bVar.h(backgroundDispatcher);
        i.d(h, "container[backgroundDispatcher]");
        return new z(context, (id.h) h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 getComponents$lambda-5(q9.b bVar) {
        Object h = bVar.h(firebaseApp);
        i.d(h, "container[firebaseApp]");
        return new o0((h) h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        i0 a2 = q9.a.a(l.class);
        a2.d = LIBRARY_NAME;
        r rVar = firebaseApp;
        a2.a(j.b(rVar));
        r rVar2 = sessionsSettings;
        a2.a(j.b(rVar2));
        r rVar3 = backgroundDispatcher;
        a2.a(j.b(rVar3));
        a2.f = new z9.a(2);
        a2.c(2);
        q9.a b10 = a2.b();
        i0 a10 = q9.a.a(j0.class);
        a10.d = "session-generator";
        a10.f = new z9.a(3);
        q9.a b11 = a10.b();
        i0 a11 = q9.a.a(d0.class);
        a11.d = "session-publisher";
        a11.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        a11.a(j.b(rVar4));
        a11.a(new j(rVar2, 1, 0));
        a11.a(new j(transportFactory, 1, 1));
        a11.a(new j(rVar3, 1, 0));
        a11.f = new z9.a(4);
        q9.a b12 = a11.b();
        i0 a12 = q9.a.a(bb.h.class);
        a12.d = "sessions-settings";
        a12.a(new j(rVar, 1, 0));
        a12.a(j.b(blockingDispatcher));
        a12.a(new j(rVar3, 1, 0));
        a12.a(new j(rVar4, 1, 0));
        a12.f = new z9.a(5);
        q9.a b13 = a12.b();
        i0 a13 = q9.a.a(s.class);
        a13.d = "sessions-datastore";
        a13.a(new j(rVar, 1, 0));
        a13.a(new j(rVar3, 1, 0));
        a13.f = new z9.a(6);
        q9.a b14 = a13.b();
        i0 a14 = q9.a.a(n0.class);
        a14.d = "sessions-service-binder";
        a14.a(new j(rVar, 1, 0));
        a14.f = new z9.a(7);
        return hd.h.c(b10, b11, b12, b13, b14, a14.b(), o8.a(LIBRARY_NAME, "1.2.0"));
    }
}
