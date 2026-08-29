package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import h7.v7;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(a9.c cVar) {
        u8.g gVar = (u8.g) cVar.a(u8.g.class);
        if (cVar.a(y9.a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.c(ha.b.class), cVar.c(x9.f.class), (aa.d) cVar.a(aa.d.class), (v2.f) cVar.a(v2.f.class), (w9.b) cVar.a(w9.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a9.b> getComponents() {
        a9.a b10 = a9.b.b(FirebaseMessaging.class);
        b10.c = LIBRARY_NAME;
        b10.a(a9.m.b(u8.g.class));
        b10.a(new a9.m(0, 0, y9.a.class));
        b10.a(new a9.m(0, 1, ha.b.class));
        b10.a(new a9.m(0, 1, x9.f.class));
        b10.a(new a9.m(0, 0, v2.f.class));
        b10.a(a9.m.b(aa.d.class));
        b10.a(a9.m.b(w9.b.class));
        b10.g = new a9.f(26);
        b10.c(1);
        return Arrays.asList(b10.b(), v7.a(LIBRARY_NAME, "23.4.0"));
    }
}
