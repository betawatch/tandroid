package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import g7.i7;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import t8.h;
import u3.k;
import v8.a;
import w9.e;
import z8.b;
import z8.i;
import z8.q;
import z9.c;
import z9.d;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.e(e.class), (ExecutorService) bVar.b(new q(a.class, ExecutorService.class)), new a9.q((Executor) bVar.b(new q(v8.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<z8.a> getComponents() {
        ug.b a2 = z8.a.a(d.class);
        a2.c = LIBRARY_NAME;
        a2.a(i.a(h.class));
        a2.a(new i(0, 1, e.class));
        a2.a(new i(new q(a.class, ExecutorService.class), 1, 0));
        a2.a(new i(new q(v8.b.class, Executor.class), 1, 0));
        a2.f = new k(17);
        z8.a b10 = a2.b();
        w9.d dVar = new w9.d(0);
        ug.b a3 = z8.a.a(w9.d.class);
        a3.b = 1;
        a3.f = new t0.c(dVar, 7);
        return Arrays.asList(b10, a3.b(), i7.a(LIBRARY_NAME, "17.2.0"));
    }
}
