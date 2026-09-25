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
import q9.b;
import q9.j;
import q9.r;
import qa.c;
import qa.d;
import r9.i;
import w7.p8;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((h) bVar.a(h.class), bVar.c(e.class), (ExecutorService) bVar.i(new r(a.class, ExecutorService.class)), new i((Executor) bVar.i(new r(m9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        i0 a2 = q9.a.a(d.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(h.class));
        a2.a(new j(0, 1, e.class));
        a2.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        a2.a(new j(new r(m9.b.class, Executor.class), 1, 0));
        a2.f = new org.webrtc.audio.b(12);
        q9.a b10 = a2.b();
        na.d dVar = new na.d(0);
        i0 a10 = q9.a.a(na.d.class);
        a10.b = 1;
        a10.f = new le.b(dVar, 18);
        return Arrays.asList(b10, a10.b(), p8.a(LIBRARY_NAME, "17.2.0"));
    }
}
