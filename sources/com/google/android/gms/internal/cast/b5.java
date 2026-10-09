package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
