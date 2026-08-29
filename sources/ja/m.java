package ja;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m {
    public final u8.g a;
    public final la.h b;

    public m(u8.g gVar, la.h hVar, sc.h hVar2) {
        this.a = gVar;
        this.b = hVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        gVar.a();
        Context applicationContext = gVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(s0.a);
            jd.e0.q(jd.e0.b(hVar2), new l(this, hVar2, null, 0));
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
