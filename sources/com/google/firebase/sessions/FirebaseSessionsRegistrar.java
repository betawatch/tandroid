package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import i5.f;
import java.util.List;
import k9.h;
import kotlin.jvm.internal.i;
import m9.a;
import m9.b;
import q9.j;
import q9.r;
import qa.d;
import w7.p8;
import za.e0;
import za.i0;
import za.k0;
import za.m;
import za.n;
import za.o0;
import za.p;
import za.p0;
import za.u;
import zd.a0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final p Companion = new p();

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
    private static final r sessionFirelogPublisher = r.a(e0.class);

    @Deprecated
    private static final r sessionGenerator = r.a(k0.class);

    @Deprecated
    private static final r sessionsSettings = r.a(bb.h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final n getComponents$lambda-0(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        i.d(i10, "container[firebaseApp]");
        Object i11 = bVar.i(sessionsSettings);
        i.d(i11, "container[sessionsSettings]");
        Object i12 = bVar.i(backgroundDispatcher);
        i.d(i12, "container[backgroundDispatcher]");
        return new n((h) i10, (bb.h) i11, (id.h) i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k0 getComponents$lambda-1(q9.b bVar) {
        return new k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 getComponents$lambda-2(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        i.d(i10, "container[firebaseApp]");
        Object i11 = bVar.i(firebaseInstallationsApi);
        i.d(i11, "container[firebaseInstallationsApi]");
        Object i12 = bVar.i(sessionsSettings);
        i.d(i12, "container[sessionsSettings]");
        pa.b e = bVar.e(transportFactory);
        i.d(e, "container.getProvider(transportFactory)");
        w3.b bVar2 = new w3.b(e);
        Object i13 = bVar.i(backgroundDispatcher);
        i.d(i13, "container[backgroundDispatcher]");
        return new i0((h) i10, (d) i11, (bb.h) i12, bVar2, (id.h) i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bb.h getComponents$lambda-3(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        i.d(i10, "container[firebaseApp]");
        Object i11 = bVar.i(blockingDispatcher);
        i.d(i11, "container[blockingDispatcher]");
        Object i12 = bVar.i(backgroundDispatcher);
        i.d(i12, "container[backgroundDispatcher]");
        Object i13 = bVar.i(firebaseInstallationsApi);
        i.d(i13, "container[firebaseInstallationsApi]");
        return new bb.h((h) i10, (id.h) i11, (id.h) i12, (d) i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u getComponents$lambda-4(q9.b bVar) {
        h hVar = (h) bVar.i(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object i10 = bVar.i(backgroundDispatcher);
        i.d(i10, "container[backgroundDispatcher]");
        return new za.a0(context, (id.h) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 getComponents$lambda-5(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        i.d(i10, "container[firebaseApp]");
        return new p0((h) i10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        b2.i0 a2 = q9.a.a(n.class);
        a2.d = LIBRARY_NAME;
        r rVar = firebaseApp;
        a2.a(j.b(rVar));
        r rVar2 = sessionsSettings;
        a2.a(j.b(rVar2));
        r rVar3 = backgroundDispatcher;
        a2.a(j.b(rVar3));
        a2.f = new m(1);
        a2.c(2);
        q9.a b10 = a2.b();
        b2.i0 a10 = q9.a.a(k0.class);
        a10.d = "session-generator";
        a10.f = new m(2);
        q9.a b11 = a10.b();
        b2.i0 a11 = q9.a.a(e0.class);
        a11.d = "session-publisher";
        a11.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        a11.a(j.b(rVar4));
        a11.a(new j(rVar2, 1, 0));
        a11.a(new j(transportFactory, 1, 1));
        a11.a(new j(rVar3, 1, 0));
        a11.f = new m(3);
        q9.a b12 = a11.b();
        b2.i0 a12 = q9.a.a(bb.h.class);
        a12.d = "sessions-settings";
        a12.a(new j(rVar, 1, 0));
        a12.a(j.b(blockingDispatcher));
        a12.a(new j(rVar3, 1, 0));
        a12.a(new j(rVar4, 1, 0));
        a12.f = new m(4);
        q9.a b13 = a12.b();
        b2.i0 a13 = q9.a.a(u.class);
        a13.d = "sessions-datastore";
        a13.a(new j(rVar, 1, 0));
        a13.a(new j(rVar3, 1, 0));
        a13.f = new m(5);
        q9.a b14 = a13.b();
        b2.i0 a14 = q9.a.a(o0.class);
        a14.d = "sessions-service-binder";
        a14.a(new j(rVar, 1, 0));
        a14.f = new m(6);
        return hd.h.c(b10, b11, b12, b13, b14, a14.b(), p8.a(LIBRARY_NAME, "1.2.0"));
    }
}
