package ab;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class m {
    public final l9.h a;
    public final cb.h b;

    public m(l9.h hVar, cb.h hVar2, kd.h hVar3) {
        this.a = hVar;
        this.b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(t0.a);
            be.f0.q(be.f0.b(hVar3), new l(this, hVar3, null, 0));
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
