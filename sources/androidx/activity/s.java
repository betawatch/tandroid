package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
