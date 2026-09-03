package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import j7.m8;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(c9.c cVar) {
        w8.g gVar = (w8.g) cVar.a(w8.g.class);
        if (cVar.a(aa.a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.c(ja.b.class), cVar.c(z9.f.class), (ca.d) cVar.a(ca.d.class), (v2.f) cVar.a(v2.f.class), (y9.b) cVar.a(y9.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c9.b> getComponents() {
        c9.a b10 = c9.b.b(FirebaseMessaging.class);
        b10.a = LIBRARY_NAME;
        b10.a(c9.m.b(w8.g.class));
        b10.a(new c9.m(0, 0, aa.a.class));
        b10.a(new c9.m(0, 1, ja.b.class));
        b10.a(new c9.m(0, 1, z9.f.class));
        b10.a(new c9.m(0, 0, v2.f.class));
        b10.a(c9.m.b(ca.d.class));
        b10.a(c9.m.b(y9.b.class));
        b10.g = new af.a(19);
        b10.c(1);
        return Arrays.asList(b10.b(), m8.a(LIBRARY_NAME, "23.4.0"));
    }
}
