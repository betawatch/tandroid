package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
