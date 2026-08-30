package la;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l {
    public final w8.g a;
    public final na.h b;

    public l(w8.g gVar, na.h hVar, uc.h hVar2) {
        this.a = gVar;
        this.b = hVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        gVar.a();
        Context applicationContext = gVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(p0.a);
            ld.e0.q(ld.e0.b(hVar2), new k1.c(this, hVar2, null, 3));
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
