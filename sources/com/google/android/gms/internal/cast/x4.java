package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
