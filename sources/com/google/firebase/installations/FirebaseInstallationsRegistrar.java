package com.google.firebase.installations;

import androidx.emoji2.text.w;
import c9.c;
import c9.l;
import c9.t;
import ca.d;
import com.google.firebase.components.ComponentRegistrar;
import d9.k;
import j7.l8;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w8.g;
import y8.a;
import y8.b;
import z9.e;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new ca.c((g) cVar.a(g.class), cVar.d(e.class), (ExecutorService) cVar.f(new t(a.class, ExecutorService.class)), new k((Executor) cVar.f(new t(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c9.b> getComponents() {
        c9.a b10 = c9.b.b(d.class);
        b10.a = LIBRARY_NAME;
        b10.a(l.b(g.class));
        b10.a(new l(0, 1, e.class));
        b10.a(new l(new t(a.class, ExecutorService.class), 1, 0));
        b10.a(new l(new t(b.class, Executor.class), 1, 0));
        b10.g = new w(8);
        c9.b b11 = b10.b();
        z9.d dVar = new z9.d(0);
        c9.a b12 = c9.b.b(z9.d.class);
        b12.c = 1;
        b12.g = new a1.c(dVar, 3);
        return Arrays.asList(b11, b12.b(), l8.a(LIBRARY_NAME, "17.2.0"));
    }
}
