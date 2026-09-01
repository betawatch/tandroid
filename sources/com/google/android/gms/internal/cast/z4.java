package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
