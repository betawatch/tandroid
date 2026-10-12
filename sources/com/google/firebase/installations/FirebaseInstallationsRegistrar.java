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
import r9.b;
import r9.j;
import r9.r;
import ra.c;
import ra.d;
import s9.k;
import w7.w8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.b(e.class), (ExecutorService) bVar.e(new r(a.class, ExecutorService.class)), new k((Executor) bVar.e(new r(n9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        n0 a2 = r9.a.a(d.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(h.class));
        a2.a(new j(0, 1, e.class));
        a2.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        a2.a(new j(new r(n9.b.class, Executor.class), 1, 0));
        a2.f = new r0.h(6);
        r9.a b10 = a2.b();
        oa.d dVar = new oa.d(0);
        n0 a10 = r9.a.a(oa.d.class);
        a10.b = 1;
        a10.f = new m5(dVar, 27);
        return Arrays.asList(b10, a10.b(), w8.a(LIBRARY_NAME, "17.2.0"));
    }
}
