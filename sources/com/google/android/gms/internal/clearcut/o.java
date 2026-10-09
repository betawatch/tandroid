package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class o {
    public static final Class a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
