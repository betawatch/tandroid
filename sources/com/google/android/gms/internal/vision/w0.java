package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class w0 {
    public static final v0 a = new v0();
    public static final v0 b;

    static {
        v0 v0Var = null;
        try {
            v0Var = (v0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = v0Var;
    }
}
