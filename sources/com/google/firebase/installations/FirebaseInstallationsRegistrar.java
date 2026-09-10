package com.google.firebase.installations;

import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k9.h;
import m9.a;
import na.e;
import org.telegram.ui.js0;
import q9.b;
import q9.j;
import q9.r;
import qa.c;
import qa.d;
import r9.i;
import w7.o8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.c(e.class), (ExecutorService) bVar.h(new r(a.class, ExecutorService.class)), new i((Executor) bVar.h(new r(m9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        i0 a2 = q9.a.a(d.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(h.class));
        a2.a(new j(0, 1, e.class));
        a2.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        a2.a(new j(new r(m9.b.class, Executor.class), 1, 0));
        a2.f = new js0(16);
        q9.a b10 = a2.b();
        na.d dVar = new na.d(0);
        i0 a10 = q9.a.a(na.d.class);
        a10.b = 1;
        a10.f = new org.telegram.tgnet.j(dVar, 17);
        return Arrays.asList(b10, a10.b(), o8.a(LIBRARY_NAME, "17.2.0"));
    }
}
