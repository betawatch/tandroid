package com.google.firebase.installations;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m9.h;
import o9.a;
import org.telegram.ui.Components.voip.j1;
import pa.e;
import s9.b;
import s9.r;
import sa.c;
import sa.d;
import t9.j;
import w7.o5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.d(e.class), (ExecutorService) bVar.n(new r(a.class, ExecutorService.class)), new j((Executor) bVar.n(new r(o9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s9.a> getComponents() {
        n0 a2 = s9.a.a(d.class);
        a2.d = LIBRARY_NAME;
        a2.a(s9.j.a(h.class));
        a2.a(new s9.j(0, 1, e.class));
        a2.a(new s9.j(new r(a.class, ExecutorService.class), 1, 0));
        a2.a(new s9.j(new r(o9.b.class, Executor.class), 1, 0));
        a2.f = new s0.b(6);
        s9.a b10 = a2.b();
        pa.d dVar = new pa.d();
        n0 a10 = s9.a.a(pa.d.class);
        a10.b = 1;
        a10.f = new j1(dVar, 10);
        return Arrays.asList(b10, a10.b(), o5.a(LIBRARY_NAME, "17.2.0"));
    }
}
