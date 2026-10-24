package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class u {
    public static final u a = new u();

    public final OnBackInvokedCallback a(td.l onBackStarted, td.l onBackProgressed, td.a onBackInvoked, td.a onBackCancelled) {
        kotlin.jvm.internal.i.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.i.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.i.e(onBackCancelled, "onBackCancelled");
        return new t(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
