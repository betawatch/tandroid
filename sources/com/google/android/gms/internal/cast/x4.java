package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
