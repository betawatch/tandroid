package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
