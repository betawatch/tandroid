package com.google.firebase.installations;

import a9.c;
import a9.f;
import a9.m;
import a9.v;
import aa.d;
import b9.l;
import com.google.firebase.components.ComponentRegistrar;
import h7.v7;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u8.g;
import w8.a;
import w8.b;
import x9.e;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new aa.c((g) cVar.a(g.class), cVar.c(e.class), (ExecutorService) cVar.d(new v(a.class, ExecutorService.class)), new l((Executor) cVar.d(new v(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a9.b> getComponents() {
        a9.a b10 = a9.b.b(d.class);
        b10.c = LIBRARY_NAME;
        b10.a(m.b(g.class));
        b10.a(new m(0, 1, e.class));
        b10.a(new m(new v(a.class, ExecutorService.class), 1, 0));
        b10.a(new m(new v(b.class, Executor.class), 1, 0));
        int i10 = 2;
        b10.g = new f(i10);
        a9.b b11 = b10.b();
        x9.d dVar = new x9.d(0);
        a9.a b12 = a9.b.b(x9.d.class);
        b12.b = 1;
        b12.g = new a1.c(dVar, i10);
        return Arrays.asList(b11, b12.b(), v7.a(LIBRARY_NAME, "17.2.0"));
    }
}
