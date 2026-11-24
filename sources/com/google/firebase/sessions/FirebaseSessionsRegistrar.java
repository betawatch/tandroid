package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final mh4 Companion = new mh4();
    private static final xw8 appContext = xw8.a(Context.class);
    private static final xw8 firebaseApp = xw8.a(jg4.class);
    private static final xw8 firebaseInstallationsApi = xw8.a(rg4.class);
    private static final xw8 backgroundDispatcher = new xw8(md0.class, vw2.class);
    private static final xw8 blockingDispatcher = new xw8(nk0.class, vw2.class);
    private static final xw8 transportFactory = xw8.a(f1c.class);
    private static final xw8 firebaseSessionsComponent = xw8.a(ih4.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final fh4 getComponents$lambda$0(xp2 xp2Var) {
        return (fh4) ((b53) ((ih4) xp2Var.i(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ih4 getComponents$lambda$1(xp2 xp2Var) {
        Object i = xp2Var.i(appContext);
        i.getClass();
        Object i2 = xp2Var.i(backgroundDispatcher);
        i2.getClass();
        Object i3 = xp2Var.i(blockingDispatcher);
        i3.getClass();
        Object i4 = xp2Var.i(firebaseApp);
        i4.getClass();
        Object i5 = xp2Var.i(firebaseInstallationsApi);
        i5.getClass();
        mt8 g = xp2Var.g(transportFactory);
        g.getClass();
        b53 b53Var = new b53();
        b53Var.a = mo5.a((jg4) i4);
        mo5 a = mo5.a((Context) i);
        b53Var.b = a;
        b53Var.c = yo3.a(new z24((Object) a, (byte) 13));
        b53Var.d = yo3.a(q9d.a);
        b53Var.e = mo5.a((rg4) i5);
        b53Var.f = yo3.a(new gi3(b53Var.a));
        mo5 a2 = mo5.a((sw2) i3);
        b53Var.g = a2;
        b53Var.h = yo3.a(new yk8(b53Var.f, a2));
        b53Var.i = mo5.a((sw2) i2);
        byte b = 3;
        b53Var.j = yo3.a(new sk4(b53Var.c, yo3.a(new gl2(b53Var.d, b53Var.e, b53Var.f, b53Var.h, yo3.a(new vk9(b53Var.i, b53Var.d, yo3.a(new tg2(b53Var.b, b53Var.g, (byte) 28)), b)), (byte) 11)), (byte) 23));
        kt8 a3 = yo3.a(r9d.a);
        b53Var.k = a3;
        b53Var.l = yo3.a(new wk4((Object) b53Var.d, (Object) a3, (byte) 26));
        b53Var.m = yo3.a(new gl2(b53Var.a, b53Var.e, b53Var.j, yo3.a(new qx4(mo5.a(g))), b53Var.i, (byte) 15));
        b53Var.n = yo3.a(new xl3(b53Var.b, b53Var.g, yo3.a(new v39(b53Var.l, (byte) 8)), b));
        kt8 a4 = yo3.a(new yk8(b53Var.b, b53Var.k));
        kt8 kt8Var = b53Var.j;
        kt8 kt8Var2 = b53Var.l;
        kt8 kt8Var3 = b53Var.m;
        kt8 kt8Var4 = b53Var.d;
        kt8 kt8Var5 = b53Var.n;
        mo5 mo5Var = b53Var.i;
        ntb ntbVar = new ntb();
        ntbVar.a = kt8Var;
        ntbVar.b = kt8Var2;
        ntbVar.c = kt8Var3;
        ntbVar.d = kt8Var4;
        ntbVar.e = kt8Var5;
        ntbVar.f = a4;
        ntbVar.h = mo5Var;
        kt8 a5 = yo3.a(ntbVar);
        b53Var.o = a5;
        b53Var.p = yo3.a(new c5a(b53Var.a, b53Var.j, b53Var.i, yo3.a(new g29((Object) a5, (byte) 9)), (byte) 5));
        return b53Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mp2> getComponents() {
        lp2 b = mp2.b(fh4.class);
        b.a = LIBRARY_NAME;
        b.a(wd3.a(firebaseSessionsComponent));
        b.f = new w44((byte) 21);
        b.c(2);
        mp2 b2 = b.b();
        lp2 b3 = mp2.b(ih4.class);
        b3.a = "fire-sessions-component";
        b3.a(wd3.a(appContext));
        b3.a(wd3.a(backgroundDispatcher));
        b3.a(wd3.a(blockingDispatcher));
        b3.a(wd3.a(firebaseApp));
        b3.a(wd3.a(firebaseInstallationsApi));
        b3.a(new wd3(transportFactory, 1, 1));
        b3.f = new w44((byte) 22);
        return zk2.b(b2, b3.b(), one.a(LIBRARY_NAME, "3.0.8"));
    }
}
