package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final qj4 Companion = new qj4();
    private static final yy8 appContext = yy8.a(Context.class);
    private static final yy8 firebaseApp = yy8.a(li4.class);
    private static final yy8 firebaseInstallationsApi = yy8.a(ti4.class);
    private static final yy8 backgroundDispatcher = new yy8(me0.class, fy2.class);
    private static final yy8 blockingDispatcher = new yy8(nl0.class, fy2.class);
    private static final yy8 transportFactory = yy8.a(f3c.class);
    private static final yy8 firebaseSessionsComponent = yy8.a(kj4.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final hj4 getComponents$lambda$0(ir2 ir2Var) {
        return (hj4) ((m63) ((kj4) ir2Var.i(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kj4 getComponents$lambda$1(ir2 ir2Var) {
        Object i = ir2Var.i(appContext);
        i.getClass();
        Object i2 = ir2Var.i(backgroundDispatcher);
        i2.getClass();
        Object i3 = ir2Var.i(blockingDispatcher);
        i3.getClass();
        Object i4 = ir2Var.i(firebaseApp);
        i4.getClass();
        Object i5 = ir2Var.i(firebaseInstallationsApi);
        i5.getClass();
        nv8 f = ir2Var.f(transportFactory);
        f.getClass();
        m63 m63Var = new m63();
        m63Var.a = lq5.a((li4) i4);
        lq5 a = lq5.a((Context) i);
        m63Var.b = a;
        m63Var.c = iq3.a(new n54(a, (byte) 1));
        m63Var.d = iq3.a(sbd.a);
        m63Var.e = lq5.a((ti4) i5);
        m63Var.f = iq3.a(new lj4(m63Var.a));
        lq5 a2 = lq5.a((cy2) i3);
        m63Var.g = a2;
        m63Var.h = iq3.a(new an8(m63Var.f, a2));
        m63Var.i = lq5.a((cy2) i2);
        byte b = 0;
        byte b2 = 3;
        m63Var.j = iq3.a(new mj4(m63Var.c, iq3.a(new sm2(m63Var.d, m63Var.e, m63Var.f, m63Var.h, iq3.a(new wm9(m63Var.i, m63Var.d, iq3.a(new mj4(m63Var.b, m63Var.g, b)), b2)), (byte) 12)), (byte) 25));
        lv8 a3 = iq3.a(tbd.a);
        m63Var.k = a3;
        m63Var.l = iq3.a(new wm4((Object) m63Var.d, (Object) a3, (byte) 26));
        m63Var.m = iq3.a(new sm2(m63Var.a, m63Var.e, m63Var.j, iq3.a(new n54(lq5.a(f), b)), m63Var.i, (byte) 16));
        m63Var.n = iq3.a(new in3(m63Var.b, m63Var.g, iq3.a(new oo8(m63Var.l, (byte) 11)), b2));
        lv8 a4 = iq3.a(new an8(m63Var.b, m63Var.k));
        lv8 lv8Var = m63Var.j;
        lv8 lv8Var2 = m63Var.l;
        lv8 lv8Var3 = m63Var.m;
        lv8 lv8Var4 = m63Var.d;
        lv8 lv8Var5 = m63Var.n;
        lq5 lq5Var = m63Var.i;
        ovb ovbVar = new ovb();
        ovbVar.a = lv8Var;
        ovbVar.b = lv8Var2;
        ovbVar.c = lv8Var3;
        ovbVar.d = lv8Var4;
        ovbVar.e = lv8Var5;
        ovbVar.f = a4;
        ovbVar.h = lq5Var;
        lv8 a5 = iq3.a(ovbVar);
        m63Var.o = a5;
        m63Var.p = iq3.a(new xvc(m63Var.a, m63Var.j, m63Var.i, iq3.a(new et8((Object) a5, (byte) 10)), (byte) 5));
        return m63Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<xq2> getComponents() {
        wq2 b = xq2.b(hj4.class);
        b.a = LIBRARY_NAME;
        b.a(if3.a(firebaseSessionsComponent));
        b.f = new h64((byte) 23);
        b.c(2);
        xq2 b2 = b.b();
        wq2 b3 = xq2.b(kj4.class);
        b3.a = "fire-sessions-component";
        b3.a(if3.a(appContext));
        b3.a(if3.a(backgroundDispatcher));
        b3.a(if3.a(blockingDispatcher));
        b3.a(if3.a(firebaseApp));
        b3.a(if3.a(firebaseInstallationsApi));
        b3.a(new if3(transportFactory, 1, 1));
        b3.f = new h64((byte) 24);
        return lm2.b(b2, b3.b(), rpe.a(LIBRARY_NAME, "3.0.8"));
    }
}
