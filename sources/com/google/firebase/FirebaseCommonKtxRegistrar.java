package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<fq2> getComponents() {
        eq2 a = fq2.a(new i09(od0.class, px2.class));
        a.a(new qe3(new i09(od0.class, Executor.class), 1, 0));
        a.f = z3f.c;
        fq2 b = a.b();
        eq2 a2 = fq2.a(new i09(m36.class, px2.class));
        a2.a(new qe3(new i09(m36.class, Executor.class), 1, 0));
        a2.f = z6f.c;
        fq2 b2 = a2.b();
        eq2 a3 = fq2.a(new i09(ok0.class, px2.class));
        a3.a(new qe3(new i09(ok0.class, Executor.class), 1, 0));
        a3.f = faf.c;
        fq2 b3 = a3.b();
        eq2 a4 = fq2.a(new i09(m8c.class, px2.class));
        a4.a(new qe3(new i09(m8c.class, Executor.class), 1, 0));
        a4.f = uif.c;
        return tl2.b(b, b2, b3, a4.b());
    }
}
