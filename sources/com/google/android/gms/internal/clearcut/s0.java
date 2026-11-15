package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class s0 {
    public static final r0 a;
    public static final r0 b;

    static {
        r0 r0Var = null;
        try {
            r0Var = (r0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = r0Var;
        b = new r0();
    }
}
