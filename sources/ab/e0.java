package ab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e0 extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public Context b;
    public Object c;

    public /* synthetic */ e0() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        f0 f0Var = (f0) this.c;
        if (f0Var != null) {
            Context context = f0Var.c.b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public synchronized void b() {
        try {
            Context context = this.b;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.b = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.c;
                if (f0Var != null && f0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    f0 f0Var2 = (f0) this.c;
                    f0Var2.c.getClass();
                    FirebaseMessaging.b(f0Var2, 0L);
                    Context context2 = this.b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.c = null;
                    break;
                }
                break;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((cb.c) this.c).D();
                    b();
                    break;
                }
                break;
        }
    }

    public e0(cb.c cVar) {
        this.c = cVar;
    }
}
