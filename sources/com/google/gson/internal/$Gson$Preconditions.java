package com.google.gson.internal;

/* loaded from: classes3.dex */
public abstract class $Gson$Preconditions {
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
