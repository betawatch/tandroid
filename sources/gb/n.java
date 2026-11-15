package gb;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class n {
    public final o9.g a;
    public final jb.l b;

    public n(o9.g firebaseApp, jb.l settings, id.h backgroundDispatcher, w0 sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.j.e(settings, "settings");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.a = firebaseApp;
        this.b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.8.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            zd.b0.q(zd.b0.b(backgroundDispatcher), new be.l(this, sessionsActivityLifecycleCallbacks, null, 4));
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
