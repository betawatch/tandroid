package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class t0 {
    public static final s0 a;
    public static final s0 b;

    static {
        s0 s0Var = null;
        try {
            s0Var = (s0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = s0Var;
        b = new s0();
    }
}
