package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
