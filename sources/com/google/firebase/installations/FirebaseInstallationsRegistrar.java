package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import f7.c7;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s8.h;
import u8.a;
import v0.l;
import v9.e;
import y8.b;
import y8.j;
import y8.r;
import y9.c;
import y9.d;
import z8.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.e(e.class), (ExecutorService) bVar.c(new r(a.class, ExecutorService.class)), new i((Executor) bVar.c(new r(u8.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<y8.a> getComponents() {
        tg.b a2 = y8.a.a(d.class);
        a2.c = LIBRARY_NAME;
        a2.a(j.a(h.class));
        a2.a(new j(0, 1, e.class));
        a2.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        a2.a(new j(new r(u8.b.class, Executor.class), 1, 0));
        a2.f = new l(12);
        y8.a b10 = a2.b();
        v9.d dVar = new v9.d(0);
        tg.b a3 = y8.a.a(v9.d.class);
        a3.b = 1;
        a3.f = new t0.c(dVar, 7);
        return Arrays.asList(b10, a3.b(), c7.a(LIBRARY_NAME, "17.2.0"));
    }
}
