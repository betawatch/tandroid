package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import j7.m8;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        b10.a(c9.l.b(w8.g.class));
        b10.a(new c9.l(0, 0, aa.a.class));
        b10.a(new c9.l(0, 1, ja.b.class));
        b10.a(new c9.l(0, 1, z9.f.class));
        b10.a(new c9.l(0, 0, v2.f.class));
        b10.a(c9.l.b(ca.d.class));
        b10.a(c9.l.b(y9.b.class));
        b10.g = new androidx.emoji2.text.w(13);
        b10.c(1);
        return Arrays.asList(b10.b(), m8.a(LIBRARY_NAME, "23.4.0"));
    }
}
