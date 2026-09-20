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
import q9.s;
import qa.d;
import w7.q8;
import za.c0;
import za.g0;
import za.i0;
import za.l;
import za.m0;
import za.n;
import za.n0;
import za.y;
import zd.a0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final n Companion = new n();

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
    private static final s sessionFirelogPublisher = s.a(c0.class);

    @Deprecated
    private static final s sessionGenerator = s.a(i0.class);

    @Deprecated
    private static final s sessionsSettings = s.a(bb.h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final l getComponents$lambda-0(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        i.d(i10, "container[firebaseApp]");
        Object i11 = bVar.i(sessionsSettings);
        i.d(i11, "container[sessionsSettings]");
        Object i12 = bVar.i(backgroundDispatcher);
        i.d(i12, "container[backgroundDispatcher]");
        return new l((h) i10, (bb.h) i11, (id.h) i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 getComponents$lambda-1(q9.b bVar) {
        return new i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 getComponents$lambda-2(q9.b bVar) {
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
        return new g0((h) i10, (d) i11, (bb.h) i12, bVar2, (id.h) i13);
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
    public static final za.s getComponents$lambda-4(q9.b bVar) {
        h hVar = (h) bVar.i(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        i.d(context, "container[firebaseApp].applicationContext");
        Object i10 = bVar.i(backgroundDispatcher);
        i.d(i10, "container[backgroundDispatcher]");
        return new y(context, (id.h) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 getComponents$lambda-5(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        i.d(i10, "container[firebaseApp]");
        return new n0((h) i10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        b2.i0 a2 = q9.a.a(l.class);
        a2.d = LIBRARY_NAME;
        s sVar = firebaseApp;
        a2.a(j.b(sVar));
        s sVar2 = sessionsSettings;
        a2.a(j.b(sVar2));
        s sVar3 = backgroundDispatcher;
        a2.a(j.b(sVar3));
        a2.f = new x2.h(18);
        a2.c(2);
        q9.a b10 = a2.b();
        b2.i0 a10 = q9.a.a(i0.class);
        a10.d = "session-generator";
        a10.f = new x2.h(19);
        q9.a b11 = a10.b();
        b2.i0 a11 = q9.a.a(c0.class);
        a11.d = "session-publisher";
        a11.a(new j(sVar, 1, 0));
        s sVar4 = firebaseInstallationsApi;
        a11.a(j.b(sVar4));
        a11.a(new j(sVar2, 1, 0));
        a11.a(new j(transportFactory, 1, 1));
        a11.a(new j(sVar3, 1, 0));
        a11.f = new x2.h(20);
        q9.a b12 = a11.b();
        b2.i0 a12 = q9.a.a(bb.h.class);
        a12.d = "sessions-settings";
        a12.a(new j(sVar, 1, 0));
        a12.a(j.b(blockingDispatcher));
        a12.a(new j(sVar3, 1, 0));
        a12.a(new j(sVar4, 1, 0));
        a12.f = new x2.h(21);
        q9.a b13 = a12.b();
        b2.i0 a13 = q9.a.a(za.s.class);
        a13.d = "sessions-datastore";
        a13.a(new j(sVar, 1, 0));
        a13.a(new j(sVar3, 1, 0));
        a13.f = new x2.h(22);
        q9.a b14 = a13.b();
        b2.i0 a14 = q9.a.a(m0.class);
        a14.d = "sessions-service-binder";
        a14.a(new j(sVar, 1, 0));
        a14.f = new x2.h(23);
        return hd.h.c(b10, b11, b12, b13, b14, a14.b(), q8.a(LIBRARY_NAME, "1.2.0"));
    }
}
