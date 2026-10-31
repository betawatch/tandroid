package bb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 implements Application.ActivityLifecycleCallbacks {
    public static final s0 a = new s0();
    public static boolean b;
    public static ji.f c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        ji.f fVar = c;
        if (fVar != null) {
            fVar.u(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ad.j jVar;
        kotlin.jvm.internal.i.e(activity, "activity");
        ji.f fVar = c;
        if (fVar != null) {
            fVar.u(1);
            jVar = ad.j.a;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }
}
