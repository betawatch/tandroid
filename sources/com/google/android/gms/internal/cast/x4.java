package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
