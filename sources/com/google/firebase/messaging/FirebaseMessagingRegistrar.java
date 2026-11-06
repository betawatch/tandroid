package com.google.firebase.messaging;

import a8.h8;
import ab.r;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.Arrays;
import java.util.List;
import o9.g;
import sa.f;
import ta.a;
import u9.b;
import u9.i;
import u9.q;
import va.d;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(q qVar, b bVar) {
        g gVar = (g) bVar.a(g.class);
        if (bVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, bVar.c(cb.b.class), bVar.c(f.class), (d) bVar.a(d.class), bVar.f(qVar), (ra.b) bVar.a(ra.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<u9.a> getComponents() {
        q qVar = new q(la.b.class, l5.f.class);
        j0 a10 = u9.a.a(FirebaseMessaging.class);
        a10.d = LIBRARY_NAME;
        a10.a(i.a(g.class));
        a10.a(new i(0, 0, a.class));
        a10.a(new i(0, 1, cb.b.class));
        a10.a(new i(0, 1, f.class));
        a10.a(i.a(d.class));
        a10.a(new i(qVar, 0, 1));
        a10.a(i.a(ra.b.class));
        a10.f = new r(qVar, 0);
        a10.c(1);
        return Arrays.asList(a10.b(), h8.a(LIBRARY_NAME, "25.1.3"));
    }
}
