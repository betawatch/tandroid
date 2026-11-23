package ab;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k {
    public static final Object c = new Object();
    public static p0 d;
    public final Object a;
    public final Object b;

    public k(ExecutorService executorService) {
        this.b = new a0.f(0);
        this.a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        p0 p0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new p0(context);
                }
                p0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            return p0Var.b(intent).continueWith(new d3.b(3), new a3.l(8));
        }
        if (c0.v().A(context)) {
            m0.c(context, p0Var, intent);
        } else {
            p0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.a;
        d3.b bVar = (d3.b) this.b;
        boolean z10 = x6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & TLObject.FLAG_28) != 0;
        return (!z10 || z11) ? Tasks.call(bVar, new i(0, context, intent)).continueWithTask(bVar, new j(context, intent, z11, 0)) : a(context, intent, z11);
    }

    public k(Context context) {
        this.a = context;
        this.b = new d3.b(3);
    }

    public k(e0.q qVar, String str) {
        this.a = qVar;
        this.b = str;
    }
}
