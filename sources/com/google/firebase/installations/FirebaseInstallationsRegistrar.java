package com.google.firebase.installations;

import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ji.k5;
import k9.h;
import m9.a;
import na.e;
import org.telegram.ui.sw0;
import q9.b;
import q9.r;
import qa.c;
import qa.d;
import r9.j;
import w7.o8;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.c(e.class), (ExecutorService) bVar.i(new r(a.class, ExecutorService.class)), new j((Executor) bVar.i(new r(m9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        i0 a2 = q9.a.a(d.class);
        a2.d = LIBRARY_NAME;
        a2.a(q9.j.a(h.class));
        a2.a(new q9.j(0, 1, e.class));
        a2.a(new q9.j(new r(a.class, ExecutorService.class), 1, 0));
        a2.a(new q9.j(new r(m9.b.class, Executor.class), 1, 0));
        int i10 = 16;
        a2.f = new sw0(i10);
        q9.a b10 = a2.b();
        na.d dVar = new na.d();
        i0 a10 = q9.a.a(na.d.class);
        a10.b = 1;
        a10.f = new k5(dVar, i10);
        return Arrays.asList(b10, a10.b(), o8.a(LIBRARY_NAME, "17.2.0"));
    }
}
