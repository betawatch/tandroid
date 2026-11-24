// default package

import android.app.Activity;
import android.app.Application;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class dn8 {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.getClass();
        activityLifecycleCallbacks.getClass();
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
