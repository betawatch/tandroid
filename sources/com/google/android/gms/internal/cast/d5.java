package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class d5 {
    public static final c5 a = new c5();
    public static final c5 b;

    static {
        c5 c5Var = null;
        try {
            c5Var = (c5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c5Var;
    }
}
