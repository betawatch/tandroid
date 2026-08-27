package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import g7.i7;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(z8.b bVar) {
        t8.h hVar = (t8.h) bVar.a(t8.h.class);
        if (bVar.a(x9.a.class) == null) {
            return new FirebaseMessaging(hVar, bVar.e(ga.b.class), bVar.e(w9.f.class), (z9.d) bVar.a(z9.d.class), (t2.f) bVar.a(t2.f.class), (v9.b) bVar.a(v9.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<z8.a> getComponents() {
        ug.b a2 = z8.a.a(FirebaseMessaging.class);
        a2.c = LIBRARY_NAME;
        a2.a(z8.i.a(t8.h.class));
        a2.a(new z8.i(0, 0, x9.a.class));
        a2.a(new z8.i(0, 1, ga.b.class));
        a2.a(new z8.i(0, 1, w9.f.class));
        a2.a(new z8.i(0, 0, t2.f.class));
        a2.a(z8.i.a(z9.d.class));
        a2.a(z8.i.a(v9.b.class));
        a2.f = new a9.m(23);
        a2.c(1);
        return Arrays.asList(a2.b(), i7.a(LIBRARY_NAME, "23.4.0"));
    }
}
