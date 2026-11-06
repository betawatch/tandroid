package com.google.firebase.installations;

import a8.h8;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o9.g;
import q9.a;
import sa.e;
import u9.b;
import u9.q;
import v0.j;
import v9.i;
import va.c;
import va.d;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((g) bVar.a(g.class), bVar.c(e.class), (ExecutorService) bVar.e(new q(a.class, ExecutorService.class)), new i((Executor) bVar.e(new q(q9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<u9.a> getComponents() {
        j0 a10 = u9.a.a(d.class);
        a10.d = LIBRARY_NAME;
        a10.a(u9.i.a(g.class));
        a10.a(new u9.i(0, 1, e.class));
        a10.a(new u9.i(new q(a.class, ExecutorService.class), 1, 0));
        a10.a(new u9.i(new q(q9.b.class, Executor.class), 1, 0));
        a10.f = new j(9);
        u9.a b10 = a10.b();
        sa.d dVar = new sa.d(0);
        j0 a11 = u9.a.a(sa.d.class);
        a11.b = 1;
        a11.f = new u5.e(dVar, 1);
        return Arrays.asList(b10, a11.b(), h8.a(LIBRARY_NAME, "19.1.2"));
    }
}
