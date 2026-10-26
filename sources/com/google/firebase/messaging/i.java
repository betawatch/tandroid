package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import bi.z3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i {
    public static final Object c = new Object();
    public static c0 d;
    public final Object a;
    public final Object b;

    public i(ExecutorService executorService) {
        this.b = new a0.f(0);
        this.a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        c0 c0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new c0(context);
                }
                c0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            return c0Var.b(intent).continueWith(new a3.b(2), new c2.i(5));
        }
        if (q.m().r(context)) {
            z.c(context, c0Var, intent);
        } else {
            c0Var.b(intent);
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
        a3.b bVar = (a3.b) this.b;
        boolean z10 = v6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & TLObject.FLAG_28) != 0;
        return (!z10 || z11) ? Tasks.call(bVar, new h(0, context, intent)).continueWithTask(bVar, new z3(context, intent, z11, 1)) : a(context, intent, z11);
    }

    public i(Context context) {
        this.a = context;
        this.b = new a3.b(2);
    }

    public i(e0.q qVar, String str) {
        this.a = qVar;
        this.b = str;
    }
}
