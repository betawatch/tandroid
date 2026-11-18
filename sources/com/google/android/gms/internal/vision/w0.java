package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class w0 {
    public static final v0 a = new v0();
    public static final v0 b;

    static {
        v0 v0Var = null;
        try {
            v0Var = (v0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = v0Var;
    }
}
