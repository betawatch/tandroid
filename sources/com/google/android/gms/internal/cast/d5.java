package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
