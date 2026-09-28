package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class s {
    public static final s a = new s();

    public final OnBackInvokedCallback a(rd.l onBackStarted, rd.l onBackProgressed, rd.a onBackInvoked, rd.a onBackCancelled) {
        kotlin.jvm.internal.i.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.i.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.i.e(onBackCancelled, "onBackCancelled");
        return new r(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
