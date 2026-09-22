package com.google.firebase.messaging;

import ai.w1;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import w7.p8;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(q9.b bVar) {
        k9.h hVar = (k9.h) bVar.b(k9.h.class);
        if (bVar.b(oa.a.class) == null) {
            return new FirebaseMessaging(hVar, bVar.e(xa.b.class), bVar.e(na.f.class), (qa.d) bVar.b(qa.d.class), (i5.f) bVar.b(i5.f.class), (ma.b) bVar.b(ma.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<q9.a> getComponents() {
        i0 a2 = q9.a.a(FirebaseMessaging.class);
        a2.d = LIBRARY_NAME;
        a2.a(q9.j.a(k9.h.class));
        a2.a(new q9.j(0, 0, oa.a.class));
        a2.a(new q9.j(0, 1, xa.b.class));
        a2.a(new q9.j(0, 1, na.f.class));
        a2.a(new q9.j(0, 0, i5.f.class));
        a2.a(q9.j.a(qa.d.class));
        a2.a(q9.j.a(ma.b.class));
        a2.f = new w1(28);
        a2.c(1);
        return Arrays.asList(a2.b(), p8.a(LIBRARY_NAME, "23.4.0"));
    }
}
