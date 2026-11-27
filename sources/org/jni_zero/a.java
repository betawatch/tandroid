package org.jni_zero;

import org.jni_zero.JniPtrImplBase;
import org.jni_zero.JniZero;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
