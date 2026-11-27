package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static ri4 lambda$getComponents$0(qq2 qq2Var) {
        return new qi4((ji4) qq2Var.a(ji4.class), qq2Var.d(rf5.class), (ExecutorService) qq2Var.h(new h09(od0.class, ExecutorService.class)), new n8a((Executor) qq2Var.h(new h09(ok0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<fq2> getComponents() {
        eq2 b = fq2.b(ri4.class);
        b.a = LIBRARY_NAME;
        b.a(qe3.b(ji4.class));
        b.a(new qe3(0, 1, rf5.class));
        b.a(new qe3(new h09(od0.class, ExecutorService.class), 1, 0));
        b.a(new qe3(new h09(ok0.class, Executor.class), 1, 0));
        b.f = new su3((byte) 29);
        fq2 b2 = b.b();
        qf5 qf5Var = new qf5((byte) 0);
        eq2 b3 = fq2.b(qf5.class);
        b3.e = true;
        b3.f = new dq2(qf5Var, (byte) 1);
        return Arrays.asList(b2, b3.b(), ise.a(LIBRARY_NAME, "19.1.2"));
    }
}
