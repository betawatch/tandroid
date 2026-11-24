package com.google.firebase.pnv.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class FirebasePhoneNumberVerificationRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final yg4 getComponents$lambda$0(xp2 xp2Var) {
        jg4 jg4Var = (jg4) xp2Var.a(jg4.class);
        jg4Var.a();
        Context context = jg4Var.a;
        context.getClass();
        jg4Var.a();
        Context context2 = jg4Var.a;
        context2.getClass();
        czc czcVar = new czc(context2, wzc.a, vn.g, ay4.c);
        jg4Var.a();
        Context context3 = jg4Var.a;
        context3.getClass();
        p13 p13Var = new p13(context3, (byte) 0);
        a0d a0dVar = new a0d();
        jg4Var.a();
        String str = jg4Var.c.b;
        str.getClass();
        jg4Var.a();
        String str2 = jg4Var.c.a;
        str2.getClass();
        return new h0d(context, czcVar, p13Var, a0dVar, str, str2);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mp2> getComponents() {
        lp2 b = mp2.b(yg4.class);
        b.a(wd3.b(jg4.class));
        b.f = new w44((byte) 19);
        return zk2.a(b.b());
    }
}
