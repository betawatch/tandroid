package ab;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
