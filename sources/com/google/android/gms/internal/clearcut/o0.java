package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class o0 {
    public static final n0 a;
    public static final n0 b;

    static {
        n0 n0Var = null;
        try {
            n0Var = (n0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = n0Var;
        b = new n0();
    }
}
