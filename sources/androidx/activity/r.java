package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r {
    public static final r a = new r();

    public final OnBackInvokedCallback a(rd.a onBackInvoked) {
        kotlin.jvm.internal.j.e(onBackInvoked, "onBackInvoked");
        return new q(onBackInvoked, 0);
    }

    public final void b(Object dispatcher, int i7, Object callback) {
        kotlin.jvm.internal.j.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.j.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        kotlin.jvm.internal.j.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.j.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
