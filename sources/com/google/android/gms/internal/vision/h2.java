package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
