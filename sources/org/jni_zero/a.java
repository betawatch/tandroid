package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniZero;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements JniPtrImplBase.TrackerFactory, JniPtrImplBase.Tracker {
    public final /* synthetic */ Object a;

    public /* synthetic */ a(Object obj) {
        this.a = obj;
    }

    @Override // org.jni_zero.JniPtrImplBase.TrackerFactory
    public final JniPtrImplBase.Tracker create(Object obj, String str) {
        JniPtrImplBase.Tracker lambda$setSafePointersTrackerFactory$0;
        lambda$setSafePointersTrackerFactory$0 = JniZero.lambda$setSafePointersTrackerFactory$0((JniZero.SafePointersTrackerFactory) this.a, obj, str);
        return lambda$setSafePointersTrackerFactory$0;
    }

    @Override // org.jni_zero.JniPtrImplBase.Tracker
    public final void destroy() {
        ((JniZero.SafePointersTracker) this.a).destroy();
    }
}
