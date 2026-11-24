package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(xw8 xw8Var, xp2 xp2Var) {
        jg4 jg4Var = (jg4) xp2Var.a(jg4.class);
        if (xp2Var.a(tg4.class) == null) {
            return new FirebaseMessaging(jg4Var, xp2Var.d(tc3.class), xp2Var.d(rd5.class), (rg4) xp2Var.a(rg4.class), xp2Var.g(xw8Var), (hab) xp2Var.a(hab.class));
        }
        fyb.g();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mp2> getComponents() {
        xw8 xw8Var = new xw8(d1c.class, f1c.class);
        lp2 b = mp2.b(FirebaseMessaging.class);
        b.a = LIBRARY_NAME;
        b.a(wd3.b(jg4.class));
        b.a(new wd3(0, 0, tg4.class));
        b.a(new wd3(0, 1, tc3.class));
        b.a(new wd3(0, 1, rd5.class));
        b.a(wd3.b(rg4.class));
        b.a(new wd3(xw8Var, 0, 1));
        b.a(wd3.b(hab.class));
        b.f = new ma3(xw8Var, (byte) 1);
        b.c(1);
        return Arrays.asList(b.b(), one.a(LIBRARY_NAME, "25.1.3"));
    }
}
