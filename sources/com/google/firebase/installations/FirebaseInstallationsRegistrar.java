package com.google.firebase.installations;

import c9.c;
import c9.m;
import c9.u;
import ca.d;
import com.google.firebase.components.ComponentRegistrar;
import d9.k;
import j7.m8;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w8.g;
import y8.a;
import y8.b;
import z9.e;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new ca.c((g) cVar.a(g.class), cVar.c(e.class), (ExecutorService) cVar.f(new u(a.class, ExecutorService.class)), new k((Executor) cVar.f(new u(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c9.b> getComponents() {
        c9.a b10 = c9.b.b(d.class);
        b10.a = LIBRARY_NAME;
        b10.a(m.b(g.class));
        b10.a(new m(0, 1, e.class));
        b10.a(new m(new u(a.class, ExecutorService.class), 1, 0));
        b10.a(new m(new u(b.class, Executor.class), 1, 0));
        b10.g = new af.a(8);
        c9.b b11 = b10.b();
        z9.d dVar = new z9.d(0);
        c9.a b12 = c9.b.b(z9.d.class);
        b12.c = 1;
        b12.g = new a1.c(dVar, 3);
        return Arrays.asList(b11, b12.b(), m8.a(LIBRARY_NAME, "17.2.0"));
    }
}
