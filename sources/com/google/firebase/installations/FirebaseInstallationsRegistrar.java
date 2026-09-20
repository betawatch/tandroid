package com.google.firebase.installations;

import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k2.v;
import k9.h;
import m9.a;
import na.e;
import q9.b;
import q9.j;
import q9.p;
import q9.s;
import qa.c;
import qa.d;
import r9.i;
import w7.q8;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.c(e.class), (ExecutorService) bVar.i(new s(a.class, ExecutorService.class)), new i((Executor) bVar.i(new s(m9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        i0 a2 = q9.a.a(d.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(h.class));
        a2.a(new j(0, 1, e.class));
        a2.a(new j(new s(a.class, ExecutorService.class), 1, 0));
        a2.a(new j(new s(m9.b.class, Executor.class), 1, 0));
        a2.f = new p(1);
        q9.a b10 = a2.b();
        na.d dVar = new na.d(0);
        i0 a10 = q9.a.a(na.d.class);
        a10.b = 1;
        a10.f = new v(dVar, 18);
        return Arrays.asList(b10, a10.b(), q8.a(LIBRARY_NAME, "17.2.0"));
    }
}
