package com.google.firebase.sessions;

import android.content.Context;
import bb.i;
import com.google.firebase.components.ComponentRegistrar;
import i5.f;
import java.util.List;
import k9.h;
import m9.a;
import m9.b;
import q9.j;
import q9.r;
import qa.d;
import v8.s;
import w7.o8;
import za.c0;
import za.g0;
import za.i0;
import za.l;
import za.m0;
import za.n;
import za.n0;
import za.y;
import zd.a0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    private static final r sessionFirelogPublisher = r.a(c0.class);

    @Deprecated
    private static final r sessionGenerator = r.a(i0.class);

    @Deprecated
    private static final r sessionsSettings = r.a(i.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final l getComponents$lambda-0(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        kotlin.jvm.internal.i.d(i10, "container[firebaseApp]");
        Object i11 = bVar.i(sessionsSettings);
        kotlin.jvm.internal.i.d(i11, "container[sessionsSettings]");
        Object i12 = bVar.i(backgroundDispatcher);
        kotlin.jvm.internal.i.d(i12, "container[backgroundDispatcher]");
        return new l((h) i10, (i) i11, (id.h) i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 getComponents$lambda-1(q9.b bVar) {
        return new i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 getComponents$lambda-2(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        kotlin.jvm.internal.i.d(i10, "container[firebaseApp]");
        Object i11 = bVar.i(firebaseInstallationsApi);
        kotlin.jvm.internal.i.d(i11, "container[firebaseInstallationsApi]");
        Object i12 = bVar.i(sessionsSettings);
        kotlin.jvm.internal.i.d(i12, "container[sessionsSettings]");
        pa.b f7 = bVar.f(transportFactory);
        kotlin.jvm.internal.i.d(f7, "container.getProvider(transportFactory)");
        s sVar = new s(f7);
        Object i13 = bVar.i(backgroundDispatcher);
        kotlin.jvm.internal.i.d(i13, "container[backgroundDispatcher]");
        return new g0((h) i10, (d) i11, (i) i12, sVar, (id.h) i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i getComponents$lambda-3(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        kotlin.jvm.internal.i.d(i10, "container[firebaseApp]");
        Object i11 = bVar.i(blockingDispatcher);
        kotlin.jvm.internal.i.d(i11, "container[blockingDispatcher]");
        Object i12 = bVar.i(backgroundDispatcher);
        kotlin.jvm.internal.i.d(i12, "container[backgroundDispatcher]");
        Object i13 = bVar.i(firebaseInstallationsApi);
        kotlin.jvm.internal.i.d(i13, "container[firebaseInstallationsApi]");
        return new i((h) i10, (id.h) i11, (id.h) i12, (d) i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final za.s getComponents$lambda-4(q9.b bVar) {
        h hVar = (h) bVar.i(firebaseApp);
        hVar.a();
        Context context = hVar.a;
        kotlin.jvm.internal.i.d(context, "container[firebaseApp].applicationContext");
        Object i10 = bVar.i(backgroundDispatcher);
        kotlin.jvm.internal.i.d(i10, "container[backgroundDispatcher]");
        return new y(context, (id.h) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 getComponents$lambda-5(q9.b bVar) {
        Object i10 = bVar.i(firebaseApp);
        kotlin.jvm.internal.i.d(i10, "container[firebaseApp]");
        return new n0((h) i10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        b2.i0 a2 = q9.a.a(l.class);
        a2.d = LIBRARY_NAME;
        r rVar = firebaseApp;
        a2.a(j.b(rVar));
        r rVar2 = sessionsSettings;
        a2.a(j.b(rVar2));
        r rVar3 = backgroundDispatcher;
        a2.a(j.b(rVar3));
        a2.f = new z9.a(7);
        a2.c(2);
        q9.a b10 = a2.b();
        b2.i0 a10 = q9.a.a(i0.class);
        a10.d = "session-generator";
        a10.f = new z9.a(8);
        q9.a b11 = a10.b();
        b2.i0 a11 = q9.a.a(c0.class);
        a11.d = "session-publisher";
        a11.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        a11.a(j.b(rVar4));
        a11.a(new j(rVar2, 1, 0));
        a11.a(new j(transportFactory, 1, 1));
        a11.a(new j(rVar3, 1, 0));
        a11.f = new z9.a(9);
        q9.a b12 = a11.b();
        b2.i0 a12 = q9.a.a(i.class);
        a12.d = "sessions-settings";
        a12.a(new j(rVar, 1, 0));
        a12.a(j.b(blockingDispatcher));
        a12.a(new j(rVar3, 1, 0));
        a12.a(new j(rVar4, 1, 0));
        a12.f = new z9.a(10);
        q9.a b13 = a12.b();
        b2.i0 a13 = q9.a.a(za.s.class);
        a13.d = "sessions-datastore";
        a13.a(new j(rVar, 1, 0));
        a13.a(new j(rVar3, 1, 0));
        a13.f = new z9.a(11);
        q9.a b14 = a13.b();
        b2.i0 a14 = q9.a.a(m0.class);
        a14.d = "sessions-service-binder";
        a14.a(new j(rVar, 1, 0));
        a14.f = new z9.a(12);
        return hd.h.c(b10, b11, b12, b13, b14, a14.b(), o8.a(LIBRARY_NAME, "1.2.0"));
    }
}
