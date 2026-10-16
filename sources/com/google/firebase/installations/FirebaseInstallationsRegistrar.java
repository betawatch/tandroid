package com.google.firebase.installations;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ji.m5;
import l9.h;
import n9.a;
import oa.e;
import r0.s0;
import r9.b;
import r9.j;
import r9.r;
import ra.c;
import ra.d;
import s9.k;
import w7.w8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.b(e.class), (ExecutorService) bVar.d(new r(a.class, ExecutorService.class)), new k((Executor) bVar.d(new r(n9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        n0 a2 = r9.a.a(d.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(h.class));
        a2.a(new j(0, 1, e.class));
        a2.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        a2.a(new j(new r(n9.b.class, Executor.class), 1, 0));
        a2.f = new s0(4);
        r9.a b10 = a2.b();
        oa.d dVar = new oa.d(0);
        n0 a10 = r9.a.a(oa.d.class);
        a10.b = 1;
        a10.f = new m5(dVar, 27);
        return Arrays.asList(b10, a10.b(), w8.a(LIBRARY_NAME, "17.2.0"));
    }
}
