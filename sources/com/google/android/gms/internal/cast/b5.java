package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b5 {
    public static final a5 a = new a5();
    public static final a5 b;

    static {
        a5 a5Var = null;
        try {
            a5Var = (a5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = a5Var;
    }
}
