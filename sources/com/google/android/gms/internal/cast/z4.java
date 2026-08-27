package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
