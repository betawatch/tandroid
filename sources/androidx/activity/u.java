package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
