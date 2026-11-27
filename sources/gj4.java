// default package

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
