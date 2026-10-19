package com.google.firebase.installations;

import b2.m0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l9.h;
import n9.a;
import oa.e;
import qg.f0;
import qg.h0;
import r9.b;
import r9.r;
import ra.c;
import ra.d;
import s9.j;
import w7.w8;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.b(e.class), (ExecutorService) bVar.c(new r(a.class, ExecutorService.class)), new j((Executor) bVar.c(new r(n9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        m0 a2 = r9.a.a(d.class);
        a2.d = LIBRARY_NAME;
        a2.a(r9.j.a(h.class));
        a2.a(new r9.j(0, 1, e.class));
        a2.a(new r9.j(new r(a.class, ExecutorService.class), 1, 0));
        a2.a(new r9.j(new r(n9.b.class, Executor.class), 1, 0));
        a2.f = new f0(8);
        r9.a b10 = a2.b();
        oa.d dVar = new oa.d(0);
        m0 a10 = r9.a.a(oa.d.class);
        a10.b = 1;
        a10.f = new h0(dVar, 6);
        return Arrays.asList(b10, a10.b(), w8.a(LIBRARY_NAME, "17.2.0"));
    }
}
