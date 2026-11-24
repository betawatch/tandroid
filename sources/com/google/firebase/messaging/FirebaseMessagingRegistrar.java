package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(yy8 yy8Var, ir2 ir2Var) {
        li4 li4Var = (li4) ir2Var.a(li4.class);
        if (ir2Var.a(vi4.class) == null) {
            return new FirebaseMessaging(li4Var, ir2Var.d(ge3.class), ir2Var.d(pf5.class), (ti4) ir2Var.a(ti4.class), ir2Var.f(yy8Var), (jcb) ir2Var.a(jcb.class));
        }
        rjb.p();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<xq2> getComponents() {
        yy8 yy8Var = new yy8(d3c.class, f3c.class);
        wq2 b = xq2.b(FirebaseMessaging.class);
        b.a = LIBRARY_NAME;
        b.a(if3.b(li4.class));
        b.a(new if3(0, 0, vi4.class));
        b.a(new if3(0, 1, ge3.class));
        b.a(new if3(0, 1, pf5.class));
        b.a(if3.b(ti4.class));
        b.a(new if3(yy8Var, 0, 1));
        b.a(if3.b(jcb.class));
        b.f = new yb3(yy8Var, (byte) 1);
        b.c(1);
        return Arrays.asList(b.b(), rpe.a(LIBRARY_NAME, "25.1.3"));
    }
}
