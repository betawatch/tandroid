package com.google.firebase.sessions;

import a8.i8;
import a8.r7;
import ab.c0;
import android.content.Context;
import android.support.v4.media.session.a0;
import com.google.firebase.components.ComponentRegistrar;
import d9.o;
import e2.j0;
import g0.e;
import gb.i;
import gb.n;
import gb.r;
import gb.s;
import gb.t;
import gb.v;
import h6.m;
import hi.t5;
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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    private static final q firebaseSessionsComponent = q.a(r.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final n getComponents$lambda$0(u9.b bVar) {
        return (n) ((i) ((r) bVar.e(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r getComponents$lambda$1(u9.b bVar) {
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
        iVar.a = o.b((g) e13);
        o b10 = o.b((Context) e10);
        iVar.b = b10;
        iVar.c = ib.a.a(new t5(b10, 5));
        iVar.d = ib.a.a(t.a);
        iVar.e = o.b((d) e14);
        iVar.f = ib.a.a(new d6.i(iVar.a, 25));
        o b11 = o.b((h) e12);
        iVar.g = b11;
        iVar.h = ib.a.a(new s(iVar.f, b11));
        iVar.i = o.b((h) e11);
        int i7 = 29;
        iVar.j = ib.a.a(new wf.b(i7, iVar.c, ib.a.a(new r7(iVar.d, iVar.e, iVar.f, iVar.h, ib.a.a(new m(iVar.i, iVar.d, ib.a.a(new s(iVar.b, (c) iVar.g)), false, 4)), 10))));
        c a10 = ib.a.a(t.b);
        iVar.k = a10;
        iVar.l = ib.a.a(new q4.q(iVar.d, a10, false, 22));
        iVar.m = ib.a.a(new r7(iVar.a, iVar.e, iVar.j, ib.a.a(new cb.c(o.b(f10), 27)), iVar.i, 6));
        iVar.n = ib.a.a(new a0(iVar.b, iVar.g, ib.a.a(new ob.c(iVar.l, 25)), false, 28));
        c a11 = ib.a.a(new ga.d(iVar.j, iVar.l, iVar.m, iVar.d, iVar.n, ib.a.a(new wf.b(22, iVar.b, iVar.k)), iVar.i, 2));
        iVar.o = a11;
        iVar.p = ib.a.a(new c0(iVar.a, iVar.j, iVar.i, ib.a.a(new cb.c(a11, 28)), 3));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<u9.a> getComponents() {
        j0 a10 = u9.a.a(n.class);
        a10.d = LIBRARY_NAME;
        a10.a(u9.i.b(firebaseSessionsComponent));
        a10.f = new e(6);
        a10.c(2);
        u9.a b10 = a10.b();
        j0 a11 = u9.a.a(r.class);
        a11.d = "fire-sessions-component";
        a11.a(u9.i.b(appContext));
        a11.a(u9.i.b(backgroundDispatcher));
        a11.a(u9.i.b(blockingDispatcher));
        a11.a(u9.i.b(firebaseApp));
        a11.a(u9.i.b(firebaseInstallationsApi));
        a11.a(new u9.i(transportFactory, 1, 1));
        a11.f = new e(7);
        return hd.g.c(b10, a11.b(), i8.a(LIBRARY_NAME, "3.0.8"));
    }
}
