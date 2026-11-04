package com.google.firebase.sessions;

import android.content.Context;
import android.support.v4.media.c;
import android.support.v4.media.session.a0;
import b8.ke;
import b8.r1;
import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import d2.t1;
import db.d0;
import db.i;
import db.n;
import db.s;
import db.u;
import db.v0;
import java.util.List;
import k5.f;
import kotlin.jvm.internal.j;
import n9.h;
import p9.a;
import p9.b;
import t9.r;
import ua.e;
import wd.x;
import za.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final u Companion = new u();
    private static final r appContext = r.a(Context.class);
    private static final r firebaseApp = r.a(h.class);
    private static final r firebaseInstallationsApi = r.a(e.class);
    private static final r backgroundDispatcher = new r(a.class, x.class);
    private static final r blockingDispatcher = new r(b.class, x.class);
    private static final r transportFactory = r.a(f.class);
    private static final r firebaseSessionsComponent = r.a(db.r.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final n getComponents$lambda$0(t9.b bVar) {
        return (n) ((i) ((db.r) bVar.g(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final db.r getComponents$lambda$1(t9.b bVar) {
        Object g7 = bVar.g(appContext);
        j.d(g7, "get(...)");
        Object g10 = bVar.g(backgroundDispatcher);
        j.d(g10, "get(...)");
        Object g11 = bVar.g(blockingDispatcher);
        j.d(g11, "get(...)");
        Object g12 = bVar.g(firebaseApp);
        j.d(g12, "get(...)");
        Object g13 = bVar.g(firebaseInstallationsApi);
        j.d(g13, "get(...)");
        ta.b c2 = bVar.c(transportFactory);
        j.d(c2, "getProvider(...)");
        i iVar = new i();
        iVar.a = e.a.a((h) g12);
        e.a a10 = e.a.a((Context) g7);
        iVar.b = a10;
        iVar.c = fb.a.a(new c(a10, 25));
        iVar.d = fb.a.a(s.a);
        iVar.e = e.a.a((e) g13);
        iVar.f = fb.a.a(new c6.i(iVar.a, 16));
        e.a a11 = e.a.a((fd.h) g11);
        iVar.g = a11;
        iVar.h = fb.a.a(new d0(iVar.f, a11));
        iVar.i = e.a.a((fd.h) g10);
        iVar.j = fb.a.a(new v0(iVar.c, fb.a.a(new ke(iVar.d, iVar.e, iVar.f, iVar.h, fb.a.a(new a0(iVar.i, iVar.d, fb.a.a(new tf.b(iVar.b, iVar.g)), 24)), 4)), 1));
        fb.c a12 = fb.a.a(s.b);
        iVar.k = a12;
        iVar.l = fb.a.a(new v0(iVar.d, a12, 0));
        iVar.m = fb.a.a(new ke(iVar.a, iVar.e, iVar.j, fb.a.a(new bb.c(e.a.a(c2), 15)), iVar.i, 3));
        iVar.n = fb.a.a(new a0(iVar.b, iVar.g, fb.a.a(new c(iVar.l, 14)), 14));
        fb.c a13 = fb.a.a(new fa.f(iVar.j, iVar.l, iVar.m, iVar.d, iVar.n, fb.a.a(new d0(iVar.b, iVar.k)), iVar.i, 2));
        iVar.o = a13;
        iVar.p = fb.a.a(new p(iVar.a, iVar.j, iVar.i, fb.a.a(new bb.c(a13, 16))));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<t9.a> getComponents() {
        l0 a10 = t9.a.a(n.class);
        a10.d = LIBRARY_NAME;
        a10.a(t9.j.b(firebaseSessionsComponent));
        a10.f = new t1(9);
        a10.c(2);
        t9.a b10 = a10.b();
        l0 a11 = t9.a.a(db.r.class);
        a11.d = "fire-sessions-component";
        a11.a(t9.j.b(appContext));
        a11.a(t9.j.b(backgroundDispatcher));
        a11.a(t9.j.b(blockingDispatcher));
        a11.a(t9.j.b(firebaseApp));
        a11.a(t9.j.b(firebaseInstallationsApi));
        a11.a(new t9.j(transportFactory, 1, 1));
        a11.f = new t1(10);
        return ed.h.c(b10, a11.b(), r1.a(LIBRARY_NAME, "3.0.8"));
    }
}
