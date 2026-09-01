package la;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
