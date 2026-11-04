package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
