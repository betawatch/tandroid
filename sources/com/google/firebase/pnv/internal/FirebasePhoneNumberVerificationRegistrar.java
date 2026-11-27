package com.google.firebase.pnv.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class FirebasePhoneNumberVerificationRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final zi4 getComponents$lambda$0(qq2 qq2Var) {
        ji4 ji4Var = (ji4) qq2Var.a(ji4.class);
        ji4Var.a();
        Context context = ji4Var.a;
        context.getClass();
        ji4Var.a();
        Context context2 = ji4Var.a;
        context2.getClass();
        t3d t3dVar = new t3d(context2, n4d.a, wn.g, g05.c);
        ji4Var.a();
        Context context3 = ji4Var.a;
        context3.getClass();
        vj0 vj0Var = new vj0(context3, (byte) 1);
        r4d r4dVar = new r4d();
        ji4Var.a();
        String str = ji4Var.c.b;
        str.getClass();
        ji4Var.a();
        String str2 = ji4Var.c.a;
        str2.getClass();
        return new y4d(context, t3dVar, vj0Var, r4dVar, str, str2);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<fq2> getComponents() {
        eq2 b = fq2.b(zi4.class);
        b.a(qe3.b(ji4.class));
        b.f = new xi4((byte) 1);
        return tl2.a(b.b());
    }
}
