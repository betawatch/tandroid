package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u {
    public static final u a = new u();

    public final OnBackInvokedCallback a(dd.l onBackStarted, dd.l onBackProgressed, dd.a onBackInvoked, dd.a onBackCancelled) {
        kotlin.jvm.internal.j.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.j.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.j.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.j.e(onBackCancelled, "onBackCancelled");
        return new t(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
