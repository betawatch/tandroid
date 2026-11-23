package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
