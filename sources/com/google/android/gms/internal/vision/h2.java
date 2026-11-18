package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class h2 {
    public static final i2 a;
    public static final i2 b;

    static {
        i2 i2Var = null;
        try {
            i2Var = (i2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = i2Var;
        b = new i2();
    }
}
