package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
