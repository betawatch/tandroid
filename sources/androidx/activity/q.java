package androidx.activity;

import ai.rb;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class q {
    public static final q a = new q();

    public final OnBackInvokedCallback a(rd.a onBackInvoked) {
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        return new rb(onBackInvoked, 1);
    }

    public final void b(Object dispatcher, int i10, Object callback) {
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
