package gb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w0 implements Application.ActivityLifecycleCallbacks {
    public final d1 a;

    public w0(d1 sharedSessionRepository) {
        kotlin.jvm.internal.j.e(sharedSessionRepository, "sharedSessionRepository");
        this.a = sharedSessionRepository;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        this.a.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        this.a.c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.j.e(activity, "activity");
        kotlin.jvm.internal.j.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
    }
}
