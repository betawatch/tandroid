package com.google.firebase.pnv.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class FirebasePhoneNumberVerificationRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final aj4 getComponents$lambda$0(ir2 ir2Var) {
        li4 li4Var = (li4) ir2Var.a(li4.class);
        li4Var.a();
        Context context = li4Var.a;
        context.getClass();
        li4Var.a();
        Context context2 = li4Var.a;
        context2.getClass();
        d1d d1dVar = new d1d(context2, x1d.a, wo.g, b05.c);
        li4Var.a();
        Context context3 = li4Var.a;
        context3.getClass();
        uk0 uk0Var = new uk0(context3, (byte) 1);
        b2d b2dVar = new b2d();
        li4Var.a();
        String str = li4Var.c.b;
        str.getClass();
        li4Var.a();
        String str2 = li4Var.c.a;
        str2.getClass();
        return new j2d(context, d1dVar, uk0Var, b2dVar, str, str2);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<xq2> getComponents() {
        wq2 b = xq2.b(aj4.class);
        b.a(if3.b(li4.class));
        b.f = new h64((byte) 21);
        return lm2.a(b.b());
    }
}
