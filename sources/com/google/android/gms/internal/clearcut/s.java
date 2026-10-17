package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class s {
    public static final r a = new r();
    public static final r b;

    static {
        r rVar = null;
        try {
            rVar = (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = rVar;
    }
}
