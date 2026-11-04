package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t {
    public static final t a = new t();

    public final OnBackInvokedCallback a(od.l onBackStarted, od.l onBackProgressed, od.a onBackInvoked, od.a onBackCancelled) {
        kotlin.jvm.internal.j.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.j.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.j.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.j.e(onBackCancelled, "onBackCancelled");
        return new s(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
