package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class c2 {
    public static final b2 a;
    public static final b2 b;

    static {
        b2 b2Var = null;
        try {
            b2Var = (b2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = b2Var;
        b = new b2();
    }
}
