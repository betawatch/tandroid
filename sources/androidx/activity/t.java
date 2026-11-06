package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class t {
    public static final t a = new t();

    public final OnBackInvokedCallback a(rd.l onBackStarted, rd.l onBackProgressed, rd.a onBackInvoked, rd.a onBackCancelled) {
        kotlin.jvm.internal.j.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.j.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.j.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.j.e(onBackCancelled, "onBackCancelled");
        return new s(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
