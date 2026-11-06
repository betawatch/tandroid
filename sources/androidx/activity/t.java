package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
