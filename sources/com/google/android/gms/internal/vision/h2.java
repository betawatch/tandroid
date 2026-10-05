package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
