package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final oj4 Companion = new oj4();
    private static final i09 appContext = i09.a(Context.class);
    private static final i09 firebaseApp = i09.a(ji4.class);
    private static final i09 firebaseInstallationsApi = i09.a(ri4.class);
    private static final i09 backgroundDispatcher = new i09(od0.class, px2.class);
    private static final i09 blockingDispatcher = new i09(ok0.class, px2.class);
    private static final i09 transportFactory = i09.a(e5c.class);
    private static final i09 firebaseSessionsComponent = i09.a(jj4.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final gj4 getComponents$lambda$0(qq2 qq2Var) {
        return (gj4) ((t53) ((jj4) qq2Var.h(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jj4 getComponents$lambda$1(qq2 qq2Var) {
        Object h = qq2Var.h(appContext);
        h.getClass();
        Object h2 = qq2Var.h(backgroundDispatcher);
        h2.getClass();
        Object h3 = qq2Var.h(blockingDispatcher);
        h3.getClass();
        Object h4 = qq2Var.h(firebaseApp);
        h4.getClass();
        Object h5 = qq2Var.h(firebaseInstallationsApi);
        h5.getClass();
        vw8 g = qq2Var.g(transportFactory);
        g.getClass();
        t53 t53Var = new t53();
        t53Var.a = aj3.Q((ji4) h4);
        aj3 Q = aj3.Q((Context) h);
        t53Var.b = Q;
        t53Var.c = pp3.a(new y44(Q, (byte) 1));
        t53Var.d = pp3.a(jed.a);
        t53Var.e = aj3.Q((ri4) h5);
        t53Var.f = pp3.a(new kj4((Object) t53Var.a, (byte) 0));
        aj3 Q2 = aj3.Q((mx2) h3);
        t53Var.g = Q2;
        t53Var.h = pp3.a(new lo8(t53Var.f, Q2));
        t53Var.i = aj3.Q((mx2) h2);
        byte b = 3;
        t53Var.j = pp3.a(new ym4(t53Var.c, pp3.a(new am2(t53Var.d, t53Var.e, t53Var.f, t53Var.h, pp3.a(new ko9(t53Var.i, t53Var.d, pp3.a(new qx6(t53Var.b, t53Var.g, 0 == true ? 1 : 0, (byte) 28)), b)), (byte) 11)), (byte) 23));
        tw8 a = pp3.a(ked.a);
        t53Var.k = a;
        t53Var.l = pp3.a(new um4((Object) t53Var.d, (Object) a, (byte) 27));
        t53Var.m = pp3.a(new am2(t53Var.a, t53Var.e, t53Var.j, pp3.a(new y44(aj3.Q(g), 0 == true ? 1 : 0)), t53Var.i, (byte) 15));
        t53Var.n = pp3.a(new pm3(t53Var.b, t53Var.g, pp3.a(new l09(t53Var.l, (byte) 8)), b));
        tw8 a2 = pp3.a(new lo8(t53Var.b, t53Var.k));
        tw8 tw8Var = t53Var.j;
        tw8 tw8Var2 = t53Var.l;
        tw8 tw8Var3 = t53Var.m;
        tw8 tw8Var4 = t53Var.d;
        tw8 tw8Var5 = t53Var.n;
        aj3 aj3Var = t53Var.i;
        oxb oxbVar = new oxb();
        oxbVar.a = tw8Var;
        oxbVar.b = tw8Var2;
        oxbVar.c = tw8Var3;
        oxbVar.d = tw8Var4;
        oxbVar.e = tw8Var5;
        oxbVar.f = a2;
        oxbVar.h = aj3Var;
        tw8 a3 = pp3.a(oxbVar);
        t53Var.o = a3;
        t53Var.p = pp3.a(new lyc(t53Var.a, t53Var.j, t53Var.i, pp3.a(new pq8((Object) a3, (byte) 13)), (byte) 5));
        return t53Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<fq2> getComponents() {
        eq2 b = fq2.b(gj4.class);
        b.a = LIBRARY_NAME;
        b.a(qe3.a(firebaseSessionsComponent));
        b.f = new xi4((byte) 3);
        b.c(2);
        fq2 b2 = b.b();
        eq2 b3 = fq2.b(jj4.class);
        b3.a = "fire-sessions-component";
        b3.a(qe3.a(appContext));
        b3.a(qe3.a(backgroundDispatcher));
        b3.a(qe3.a(blockingDispatcher));
        b3.a(qe3.a(firebaseApp));
        b3.a(qe3.a(firebaseInstallationsApi));
        b3.a(new qe3(transportFactory, 1, 1));
        b3.f = new xi4((byte) 4);
        return tl2.b(b2, b3.b(), ise.a(LIBRARY_NAME, "3.0.8"));
    }
}
