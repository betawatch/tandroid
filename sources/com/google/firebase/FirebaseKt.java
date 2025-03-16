package com.google.firebase;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class FirebaseKt {
    public static final FirebaseApp getApp(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseApp, "getInstance()");
        return firebaseApp;
    }
}
