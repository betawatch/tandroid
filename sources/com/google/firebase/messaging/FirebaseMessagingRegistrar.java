package com.google.firebase.messaging;

import b8.r1;
import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import java.util.Arrays;
import java.util.List;
import k5.f;
import n9.h;
import ra.g;
import sa.a;
import t9.b;
import t9.j;
import t9.r;
import ua.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r rVar, b bVar) {
        h hVar = (h) bVar.a(h.class);
        if (bVar.a(a.class) == null) {
            return new FirebaseMessaging(hVar, bVar.f(bb.b.class), bVar.f(g.class), (e) bVar.a(e.class), bVar.c(rVar), (qa.b) bVar.a(qa.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<t9.a> getComponents() {
        r rVar = new r(ka.b.class, f.class);
        l0 a10 = t9.a.a(FirebaseMessaging.class);
        a10.d = LIBRARY_NAME;
        a10.a(j.a(h.class));
        a10.a(new j(0, 0, a.class));
        a10.a(new j(0, 1, bb.b.class));
        a10.a(new j(0, 1, g.class));
        a10.a(j.a(e.class));
        a10.a(new j(rVar, 0, 1));
        a10.a(j.a(qa.b.class));
        a10.f = new ra.b(rVar, 1);
        a10.c(1);
        return Arrays.asList(a10.b(), r1.a(LIBRARY_NAME, "25.1.3"));
    }
}
