package com.google.firebase.sessions;

import a8.h8;
import a8.r7;
import aa.n;
import ab.b0;
import android.content.Context;
import android.support.v4.media.session.a0;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import g6.d0;
import gb.e0;
import gb.i;
import gb.m;
import gb.o;
import gb.s;
import gb.t;
import gb.v;
import gb.w0;
import ib.c;
import id.h;
import java.util.List;
import kotlin.jvm.internal.j;
import l5.f;
import o9.g;
import q9.a;
import q9.b;
import u9.q;
import va.d;
import zd.x;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final v Companion = new v();
    private static final q appContext = q.a(Context.class);
    private static final q firebaseApp = q.a(g.class);
    private static final q firebaseInstallationsApi = q.a(d.class);
    private static final q backgroundDispatcher = new q(a.class, x.class);
    private static final q blockingDispatcher = new q(b.class, x.class);
    private static final q transportFactory = q.a(f.class);
    private static final q firebaseSessionsComponent = q.a(s.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final o getComponents$lambda$0(u9.b bVar) {
        return (o) ((i) ((s) bVar.e(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s getComponents$lambda$1(u9.b bVar) {
        Object e10 = bVar.e(appContext);
        j.d(e10, "get(...)");
        Object e11 = bVar.e(backgroundDispatcher);
        j.d(e11, "get(...)");
        Object e12 = bVar.e(blockingDispatcher);
        j.d(e12, "get(...)");
        Object e13 = bVar.e(firebaseApp);
        j.d(e13, "get(...)");
        Object e14 = bVar.e(firebaseInstallationsApi);
        j.d(e14, "get(...)");
        ua.b f10 = bVar.f(transportFactory);
        j.d(f10, "getProvider(...)");
        i iVar = new i();
        iVar.a = d9.o.b((g) e13);
        d9.o b10 = d9.o.b((Context) e10);
        iVar.b = b10;
        iVar.c = ib.a.a(new m(b10, 1));
        iVar.d = ib.a.a(t.a);
        iVar.e = d9.o.b((d) e14);
        iVar.f = ib.a.a(new d0(iVar.a, 1));
        d9.o b11 = d9.o.b((h) e12);
        iVar.g = b11;
        iVar.h = ib.a.a(new e0(iVar.f, b11));
        iVar.i = d9.o.b((h) e11);
        iVar.j = ib.a.a(new w0(iVar.c, ib.a.a(new r7(iVar.d, iVar.e, iVar.f, iVar.h, ib.a.a(new h6.m(iVar.i, iVar.d, ib.a.a(new q4.q(iVar.b, iVar.g, false, 24)), 3)), 10)), 1));
        c a10 = ib.a.a(t.b);
        iVar.k = a10;
        iVar.l = ib.a.a(new w0(iVar.d, a10, 0));
        iVar.m = ib.a.a(new r7(iVar.a, iVar.e, iVar.j, ib.a.a(new m(d9.o.b(f10), 0)), iVar.i, 7));
        iVar.n = ib.a.a(new a0(iVar.b, iVar.g, ib.a.a(new d6.i(iVar.l, 29)), false, 29));
        c a11 = ib.a.a(new ga.d(iVar.j, iVar.l, iVar.m, iVar.d, iVar.n, ib.a.a(new e0(iVar.b, iVar.k)), iVar.i, 2));
        iVar.o = a11;
        iVar.p = ib.a.a(new b0(iVar.a, iVar.j, iVar.i, ib.a.a(new n(a11, 28)), 3));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<u9.a> getComponents() {
        j0 a10 = u9.a.a(o.class);
        a10.d = LIBRARY_NAME;
        a10.a(u9.i.b(firebaseSessionsComponent));
        a10.f = new g2.c(3);
        a10.c(2);
        u9.a b10 = a10.b();
        j0 a11 = u9.a.a(s.class);
        a11.d = "fire-sessions-component";
        a11.a(u9.i.b(appContext));
        a11.a(u9.i.b(backgroundDispatcher));
        a11.a(u9.i.b(blockingDispatcher));
        a11.a(u9.i.b(firebaseApp));
        a11.a(u9.i.b(firebaseInstallationsApi));
        a11.a(new u9.i(transportFactory, 1, 1));
        a11.f = new g2.c(4);
        return hd.g.c(b10, a11.b(), h8.a(LIBRARY_NAME, "3.0.8"));
    }
}
