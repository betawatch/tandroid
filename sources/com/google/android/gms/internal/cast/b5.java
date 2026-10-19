package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class b5 {
    public static final a5 a = new a5();
    public static final a5 b;

    static {
        a5 a5Var = null;
        try {
            a5Var = (a5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = a5Var;
    }
}
