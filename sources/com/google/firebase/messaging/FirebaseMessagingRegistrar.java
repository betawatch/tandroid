package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import f7.c7;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(y8.b bVar) {
        s8.h hVar = (s8.h) bVar.a(s8.h.class);
        if (bVar.a(w9.a.class) == null) {
            return new FirebaseMessaging(hVar, bVar.e(fa.b.class), bVar.e(v9.f.class), (y9.d) bVar.a(y9.d.class), (t2.f) bVar.a(t2.f.class), (u9.b) bVar.a(u9.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<y8.a> getComponents() {
        tg.b a2 = y8.a.a(FirebaseMessaging.class);
        a2.c = LIBRARY_NAME;
        a2.a(y8.j.a(s8.h.class));
        a2.a(new y8.j(0, 0, w9.a.class));
        a2.a(new y8.j(0, 1, fa.b.class));
        a2.a(new y8.j(0, 1, v9.f.class));
        a2.a(new y8.j(0, 0, t2.f.class));
        a2.a(y8.j.a(y9.d.class));
        a2.a(y8.j.a(u9.b.class));
        a2.f = new a9.b(17);
        a2.c(1);
        return Arrays.asList(a2.b(), c7.a(LIBRARY_NAME, "23.4.0"));
    }
}
