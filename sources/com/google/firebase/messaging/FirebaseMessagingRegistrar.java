package com.google.firebase.messaging;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import l9.h;
import oa.f;
import pa.a;
import r9.b;
import r9.j;
import ra.d;
import th.m1;
import w7.v9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(b bVar) {
        h hVar = (h) bVar.b(h.class);
        if (bVar.b(a.class) == null) {
            return new FirebaseMessaging(hVar, bVar.c(za.b.class), bVar.c(f.class), (d) bVar.b(d.class), (i5.f) bVar.b(i5.f.class), (na.b) bVar.b(na.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<r9.a> getComponents() {
        n0 a2 = r9.a.a(FirebaseMessaging.class);
        a2.d = LIBRARY_NAME;
        a2.a(j.a(h.class));
        a2.a(new j(0, 0, a.class));
        a2.a(new j(0, 1, za.b.class));
        a2.a(new j(0, 1, f.class));
        a2.a(new j(0, 0, i5.f.class));
        a2.a(j.a(d.class));
        a2.a(j.a(na.b.class));
        a2.f = new m1(26);
        a2.c(1);
        return Arrays.asList(a2.b(), v9.a(LIBRARY_NAME, "23.4.0"));
    }
}
