package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static ti4 lambda$getComponents$0(ir2 ir2Var) {
        return new si4((li4) ir2Var.a(li4.class), ir2Var.d(of5.class), (ExecutorService) ir2Var.i(new yy8(me0.class, ExecutorService.class)), new x6a((Executor) ir2Var.i(new yy8(nl0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<xq2> getComponents() {
        wq2 b = xq2.b(ti4.class);
        b.a = LIBRARY_NAME;
        b.a(if3.b(li4.class));
        b.a(new if3(0, 1, of5.class));
        b.a(new if3(new yy8(me0.class, ExecutorService.class), 1, 0));
        b.a(new if3(new yy8(nl0.class, Executor.class), 1, 0));
        b.f = new h64((byte) 19);
        xq2 b2 = b.b();
        nf5 nf5Var = new nf5((byte) 0);
        wq2 b3 = xq2.b(nf5.class);
        b3.e = true;
        b3.f = new vq2(nf5Var, (byte) 1);
        return Arrays.asList(b2, b3.b(), rpe.a(LIBRARY_NAME, "19.1.2"));
    }
}
