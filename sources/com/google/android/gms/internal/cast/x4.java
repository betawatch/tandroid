package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class x4 {
    public static final w4 a = new w4();
    public static final w4 b;

    static {
        w4 w4Var = null;
        try {
            w4Var = (w4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = w4Var;
    }
}
