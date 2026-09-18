package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class k0 {
    public static final w b = new w(1);
    public final l0 a;

    public k0() {
        p0 p0Var;
        try {
            p0Var = (p0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            p0Var = b;
        }
        p0[] p0VarArr = {w.b, p0Var};
        l0 l0Var = new l0();
        l0Var.a = p0VarArr;
        Charset charset = a0.a;
        this.a = l0Var;
    }
}
