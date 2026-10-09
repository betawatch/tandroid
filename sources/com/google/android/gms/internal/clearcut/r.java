package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class r {
    public static final q a = new q();
    public static final q b;

    static {
        q qVar = null;
        try {
            qVar = (q) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = qVar;
    }
}
