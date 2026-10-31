package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u {
    public static final u a = new u();

    public final OnBackInvokedCallback a(ld.l onBackStarted, ld.l onBackProgressed, ld.a onBackInvoked, ld.a onBackCancelled) {
        kotlin.jvm.internal.i.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.i.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.i.e(onBackCancelled, "onBackCancelled");
        return new t(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
