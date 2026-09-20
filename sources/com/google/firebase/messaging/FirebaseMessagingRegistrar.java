package com.google.firebase.messaging;

import ai.w1;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import w7.q8;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(q9.b bVar) {
        k9.h hVar = (k9.h) bVar.a(k9.h.class);
        if (bVar.a(oa.a.class) == null) {
            return new FirebaseMessaging(hVar, bVar.c(xa.b.class), bVar.c(na.f.class), (qa.d) bVar.a(qa.d.class), (i5.f) bVar.a(i5.f.class), (ma.b) bVar.a(ma.b.class));
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
        return Arrays.asList(a2.b(), q8.a(LIBRARY_NAME, "23.4.0"));
    }
}
