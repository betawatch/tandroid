package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
