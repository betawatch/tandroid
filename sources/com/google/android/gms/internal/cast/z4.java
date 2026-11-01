package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class z4 {
    public static final y4 a = new y4();
    public static final y4 b;

    static {
        y4 y4Var = null;
        try {
            y4Var = (y4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = y4Var;
    }
}
