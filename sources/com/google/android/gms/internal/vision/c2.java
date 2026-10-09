package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
