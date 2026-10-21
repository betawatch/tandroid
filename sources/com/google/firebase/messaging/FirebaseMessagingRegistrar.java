package com.google.firebase.messaging;

import b2.m0;
import ci.i1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import w7.w8;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r9.b bVar) {
        l9.h hVar = (l9.h) bVar.a(l9.h.class);
        if (bVar.a(pa.a.class) == null) {
            return new FirebaseMessaging(hVar, bVar.b(ya.c.class), bVar.b(oa.f.class), (ra.d) bVar.a(ra.d.class), (i5.f) bVar.a(i5.f.class), (na.b) bVar.a(na.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        m0 a2 = r9.a.a(FirebaseMessaging.class);
        a2.d = LIBRARY_NAME;
        a2.a(r9.j.a(l9.h.class));
        a2.a(new r9.j(0, 0, pa.a.class));
        a2.a(new r9.j(0, 1, ya.c.class));
        a2.a(new r9.j(0, 1, oa.f.class));
        a2.a(new r9.j(0, 0, i5.f.class));
        a2.a(r9.j.a(ra.d.class));
        a2.a(r9.j.a(na.b.class));
        a2.f = new i1(10);
        a2.c(1);
        return Arrays.asList(a2.b(), w8.a(LIBRARY_NAME, "23.4.0"));
    }
}
