package com.google.firebase.sessions;

import a8.j8;
import a8.r7;
import ab.c0;
import android.content.Context;
import android.support.v4.media.session.a0;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import gb.i;
import gb.n;
import gb.r;
import gb.s;
import gb.t;
import gb.u;
import gb.w;
import ib.c;
import id.h;
import java.util.List;
import jb.m;
import kotlin.jvm.internal.j;
import l5.f;
import o9.g;
import q9.a;
import q9.b;
import u9.q;
import va.d;
import zd.x;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final w Companion = new w();
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
        iVar.a = e.a.a((g) e13);
        e.a a10 = e.a.a((Context) e10);
        iVar.b = a10;
        iVar.c = ib.a.a(new s(a10, 1));
        iVar.d = ib.a.a(u.a);
        iVar.e = e.a.a((d) e14);
        iVar.f = ib.a.a(new s(iVar.a, 0));
        e.a a11 = e.a.a((h) e12);
        iVar.g = a11;
        iVar.h = ib.a.a(new t(iVar.f, a11));
        iVar.i = e.a.a((h) e11);
        int i7 = 0;
        iVar.j = ib.a.a(new m(i7, iVar.c, ib.a.a(new r7(iVar.d, iVar.e, iVar.f, iVar.h, ib.a.a(new h6.m(iVar.i, iVar.d, ib.a.a(new t(iVar.b, (c) iVar.g)), false, 5)), 10))));
        c a12 = ib.a.a(u.b);
        iVar.k = a12;
        iVar.l = ib.a.a(new q4.q(iVar.d, a12, false, 22));
        iVar.m = ib.a.a(new r7(iVar.a, iVar.e, iVar.j, ib.a.a(new cb.c(e.a.a(f10), 28)), iVar.i, 6));
        iVar.n = ib.a.a(new a0(iVar.b, iVar.g, ib.a.a(new ob.c(iVar.l, 24)), false, 28));
        c a13 = ib.a.a(new wf.b(22, iVar.b, iVar.k));
        c cVar = iVar.j;
        c cVar2 = iVar.l;
        c cVar3 = iVar.m;
        c cVar4 = iVar.d;
        c cVar5 = iVar.n;
        e.a aVar = iVar.i;
        ga.d dVar = new ga.d();
        dVar.a = cVar;
        dVar.b = cVar2;
        dVar.c = cVar3;
        dVar.d = cVar4;
        dVar.e = cVar5;
        dVar.f = a13;
        dVar.h = aVar;
        c a14 = ib.a.a(dVar);
        iVar.o = a14;
        iVar.p = ib.a.a(new c0(iVar.a, iVar.j, iVar.i, ib.a.a(new cb.c(a14, 29)), 3));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<u9.a> getComponents() {
        j0 a10 = u9.a.a(n.class);
        a10.d = LIBRARY_NAME;
        a10.a(u9.i.b(firebaseSessionsComponent));
        a10.f = new g0.f(6);
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
        a11.f = new g0.f(7);
        return hd.g.c(b10, a11.b(), j8.a(LIBRARY_NAME, "3.0.8"));
    }
}
