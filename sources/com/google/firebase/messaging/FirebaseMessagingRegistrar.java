package com.google.firebase.messaging;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import w7.o5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(s9.b bVar) {
        m9.h hVar = (m9.h) bVar.a(m9.h.class);
        if (bVar.a(qa.a.class) == null) {
            return new FirebaseMessaging(hVar, bVar.d(za.b.class), bVar.d(pa.f.class), (sa.d) bVar.a(sa.d.class), (j5.f) bVar.a(j5.f.class), (oa.b) bVar.a(oa.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s9.a> getComponents() {
        n0 a2 = s9.a.a(FirebaseMessaging.class);
        a2.d = LIBRARY_NAME;
        a2.a(s9.j.a(m9.h.class));
        a2.a(new s9.j(0, 0, qa.a.class));
        a2.a(new s9.j(0, 1, za.b.class));
        a2.a(new s9.j(0, 1, pa.f.class));
        a2.a(new s9.j(0, 0, j5.f.class));
        a2.a(s9.j.a(sa.d.class));
        a2.a(s9.j.a(oa.b.class));
        a2.f = new c2.i(7);
        a2.c(1);
        return Arrays.asList(a2.b(), o5.a(LIBRARY_NAME, "23.4.0"));
    }
}
