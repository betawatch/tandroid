package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class j0 {
    public static final v b = new v(1);
    public final k0 a;

    public j0() {
        o0 o0Var;
        try {
            o0Var = (o0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o0Var = b;
        }
        o0[] o0VarArr = {v.b, o0Var};
        k0 k0Var = new k0();
        k0Var.a = o0VarArr;
        Charset charset = z.a;
        this.a = k0Var;
    }
}
