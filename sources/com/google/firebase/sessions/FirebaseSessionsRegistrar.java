package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import g7.i7;
import ia.d0;
import ia.h0;
import ia.l;
import ia.l0;
import ia.n;
import ia.n0;
import ia.p;
import ia.r0;
import ia.s0;
import ia.u;
import id.a0;
import java.util.List;
import kotlin.jvm.internal.j;
import t2.f;
import t8.h;
import v8.a;
import v8.b;
import z8.i;
import z8.q;
import z9.d;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final p Companion = new p();

    @Deprecated
    private static final q firebaseApp = q.a(h.class);

    @Deprecated
    private static final q firebaseInstallationsApi = q.a(d.class);

    @Deprecated
    private static final q backgroundDispatcher = new q(a.class, a0.class);

    @Deprecated
    private static final q blockingDispatcher = new q(b.class, a0.class);

    @Deprecated
    private static final q transportFactory = q.a(f.class);

    @Deprecated
    private static final q sessionFirelogPublisher = q.a(h0.class);

    @Deprecated
    private static final q sessionGenerator = q.a(n0.class);

    @Deprecated
    private static final q sessionsSettings = q.a(ka.h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final n getComponents$lambda-0(z8.b bVar) {
        Object b10 = bVar.b(firebaseApp);
        j.d(b10, "container[firebaseApp]");
        Object b11 = bVar.b(sessionsSettings);
        j.d(b11, "container[sessionsSettings]");
        Object b12 = bVar.b(backgroundDispatcher);
        j.d(b12, "container[backgroundDispatcher]");
        return new n((h) b10, (ka.h) b11, (rc.h) b12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 getComponents$lambda-1(z8.b bVar) {
        return new n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 getComponents$lambda-2(z8.b bVar) {
        Object b10 = bVar.b(firebaseApp);
        j.d(b10, "container[firebaseApp]");
        Object b11 = bVar.b(firebaseInstallationsApi);
        j.d(b11, "container[firebaseInstallationsApi]");
        Object b12 = bVar.b(sessionsSettings);
        j.d(b12, "container[sessionsSettings]");
        y9.b d = bVar.d(transportFactory);
        j.d(d, "container.getProvider(transportFactory)");
        ae.b bVar2 = new ae.b(d, 19);
        Object b13 = bVar.b(backgroundDispatcher);
        j.d(b13, "container[backgroundDispatcher]");
        return new l0((h) b10, (d) b11, (ka.h) b12, bVar2, (rc.h) b13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ka.h getComponents$lambda-3(z8.b bVar) {
        Object b10 = bVar.b(firebaseApp);
        j.d(b10, "container[firebaseApp]");
        Object b11 = bVar.b(blockingDispatcher);
        j.d(b11, "container[blockingDispatcher]");
        Object b12 = bVar.b(backgroundDispatcher);
        j.d(b12, "container[backgroundDispatcher]");
        Object b13 = bVar.b(firebaseInstallationsApi);
        j.d(b13, "container[firebaseInstallationsApi]");
        return new ka.h((h) b10, (rc.h) b11, (rc.h) b12, (d) b13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u getComponents$lambda-4(z8.b bVar) {
        h hVar = (h) bVar.b(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        j.d(context, "container[firebaseApp].applicationContext");
        Object b10 = bVar.b(backgroundDispatcher);
        j.d(b10, "container[backgroundDispatcher]");
        return new d0(context, (rc.h) b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 getComponents$lambda-5(z8.b bVar) {
        Object b10 = bVar.b(firebaseApp);
        j.d(b10, "container[firebaseApp]");
        return new s0((h) b10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<z8.a> getComponents() {
        ug.b a2 = z8.a.a(n.class);
        a2.c = LIBRARY_NAME;
        q qVar = firebaseApp;
        a2.a(i.b(qVar));
        q qVar2 = sessionsSettings;
        a2.a(i.b(qVar2));
        q qVar3 = backgroundDispatcher;
        a2.a(i.b(qVar3));
        a2.f = new l(1);
        a2.c(2);
        z8.a b10 = a2.b();
        ug.b a3 = z8.a.a(n0.class);
        a3.c = "session-generator";
        a3.f = new l(2);
        z8.a b11 = a3.b();
        ug.b a10 = z8.a.a(h0.class);
        a10.c = "session-publisher";
        a10.a(new i(qVar, 1, 0));
        q qVar4 = firebaseInstallationsApi;
        a10.a(i.b(qVar4));
        a10.a(new i(qVar2, 1, 0));
        a10.a(new i(transportFactory, 1, 1));
        a10.a(new i(qVar3, 1, 0));
        a10.f = new l(3);
        z8.a b12 = a10.b();
        ug.b a11 = z8.a.a(ka.h.class);
        a11.c = "sessions-settings";
        a11.a(new i(qVar, 1, 0));
        a11.a(i.b(blockingDispatcher));
        a11.a(new i(qVar3, 1, 0));
        a11.a(new i(qVar4, 1, 0));
        a11.f = new l(4);
        z8.a b13 = a11.b();
        ug.b a12 = z8.a.a(u.class);
        a12.c = "sessions-datastore";
        a12.a(new i(qVar, 1, 0));
        a12.a(new i(qVar3, 1, 0));
        a12.f = new l(5);
        z8.a b14 = a12.b();
        ug.b a13 = z8.a.a(r0.class);
        a13.c = "sessions-service-binder";
        a13.a(new i(qVar, 1, 0));
        a13.f = new l(6);
        return qc.h.c(b10, b11, b12, b13, b14, a13.b(), i7.a(LIBRARY_NAME, "1.2.0"));
    }
}
