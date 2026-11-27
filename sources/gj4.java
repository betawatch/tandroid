// default package

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gj4 {
    public final ji4 a;
    public final bba b;

    public gj4(ji4 ji4Var, bba bbaVar, mx2 mx2Var, zaa zaaVar) {
        ji4Var.getClass();
        bbaVar.getClass();
        mx2Var.getClass();
        zaaVar.getClass();
        this.a = ji4Var;
        this.b = bbaVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.8.");
        ji4Var.a();
        Context applicationContext = ji4Var.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(zaaVar);
            fud.b(xde.a(mx2Var), new fj4(this, zaaVar, null, (byte) 0));
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
