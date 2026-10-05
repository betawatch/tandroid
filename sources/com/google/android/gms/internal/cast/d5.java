package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class d5 {
    public static final c5 a = new c5();
    public static final c5 b;

    static {
        c5 c5Var = null;
        try {
            c5Var = (c5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c5Var;
    }
}
