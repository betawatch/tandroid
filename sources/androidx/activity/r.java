package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
