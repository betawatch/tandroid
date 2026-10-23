package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
