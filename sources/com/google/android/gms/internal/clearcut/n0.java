package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class n0 {
    public static final m0 a;
    public static final m0 b;

    static {
        m0 m0Var = null;
        try {
            m0Var = (m0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = m0Var;
        b = new m0();
    }
}
