package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
