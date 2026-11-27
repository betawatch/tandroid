package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(i09 i09Var, qq2 qq2Var) {
        ji4 ji4Var = (ji4) qq2Var.a(ji4.class);
        if (qq2Var.a(ti4.class) == null) {
            return new FirebaseMessaging(ji4Var, qq2Var.d(md3.class), qq2Var.d(sf5.class), (ri4) qq2Var.a(ri4.class), qq2Var.g(i09Var), (feb) qq2Var.a(feb.class));
        }
        grb.o();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<fq2> getComponents() {
        i09 i09Var = new i09(c5c.class, e5c.class);
        eq2 b = fq2.b(FirebaseMessaging.class);
        b.a = LIBRARY_NAME;
        b.a(qe3.b(ji4.class));
        b.a(new qe3(0, 0, ti4.class));
        b.a(new qe3(0, 1, md3.class));
        b.a(new qe3(0, 1, sf5.class));
        b.a(qe3.b(ri4.class));
        b.a(new qe3(i09Var, 0, 1));
        b.a(qe3.b(feb.class));
        b.f = new fb3(i09Var, (byte) 1);
        b.c(1);
        return Arrays.asList(b.b(), ise.a(LIBRARY_NAME, "25.1.3"));
    }
}
