package com.google.firebase.installations;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l9.h;
import mg.l;
import n9.a;
import oa.e;
import org.telegram.utils.twidget.t;
import r9.b;
import r9.r;
import ra.c;
import ra.d;
import s9.j;
import w7.v9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.b(h.class), bVar.c(e.class), (ExecutorService) bVar.d(new r(a.class, ExecutorService.class)), new j((Executor) bVar.d(new r(n9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        n0 a2 = r9.a.a(d.class);
        a2.d = LIBRARY_NAME;
        a2.a(r9.j.a(h.class));
        a2.a(new r9.j(0, 1, e.class));
        a2.a(new r9.j(new r(a.class, ExecutorService.class), 1, 0));
        a2.a(new r9.j(new r(n9.b.class, Executor.class), 1, 0));
        a2.f = new t(23);
        r9.a b10 = a2.b();
        oa.d dVar = new oa.d(0);
        n0 a10 = r9.a.a(oa.d.class);
        a10.b = 1;
        a10.f = new l(dVar, 27);
        return Arrays.asList(b10, a10.b(), v9.a(LIBRARY_NAME, "17.2.0"));
    }
}
