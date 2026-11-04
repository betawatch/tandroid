package com.google.firebase.installations;

import b8.r1;
import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n9.h;
import org.telegram.ui.ActionBar.e3;
import p9.a;
import ra.f;
import t9.b;
import t9.j;
import t9.r;
import u9.l;
import ua.d;
import ua.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(b bVar) {
        return new d((h) bVar.a(h.class), bVar.f(f.class), (ExecutorService) bVar.g(new r(a.class, ExecutorService.class)), new l((Executor) bVar.g(new r(p9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<t9.a> getComponents() {
        l0 a10 = t9.a.a(e.class);
        a10.d = LIBRARY_NAME;
        a10.a(j.a(h.class));
        a10.a(new j(0, 1, f.class));
        a10.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        a10.a(new j(new r(p9.b.class, Executor.class), 1, 0));
        a10.f = new u9.j(1);
        t9.a b10 = a10.b();
        ra.e eVar = new ra.e(0);
        l0 a11 = t9.a.a(ra.e.class);
        a11.b = 1;
        a11.f = new e3(eVar, 15);
        return Arrays.asList(b10, a11.b(), r1.a(LIBRARY_NAME, "19.1.2"));
    }
}
