package com.google.firebase.messaging;

import b2.m0;
import ci.i1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import w7.x8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r9.b bVar) {
        l9.h hVar = (l9.h) bVar.a(l9.h.class);
        if (bVar.a(pa.a.class) == null) {
            return new FirebaseMessaging(hVar, bVar.b(ya.b.class), bVar.b(oa.f.class), (ra.d) bVar.a(ra.d.class), (i5.f) bVar.a(i5.f.class), (na.b) bVar.a(na.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        m0 a2 = r9.a.a(FirebaseMessaging.class);
        a2.d = LIBRARY_NAME;
        a2.a(r9.j.a(l9.h.class));
        a2.a(new r9.j(0, 0, pa.a.class));
        a2.a(new r9.j(0, 1, ya.b.class));
        a2.a(new r9.j(0, 1, oa.f.class));
        a2.a(new r9.j(0, 0, i5.f.class));
        a2.a(r9.j.a(ra.d.class));
        a2.a(r9.j.a(na.b.class));
        a2.f = new i1(10);
        a2.c(1);
        return Arrays.asList(a2.b(), x8.a(LIBRARY_NAME, "23.4.0"));
    }
}
