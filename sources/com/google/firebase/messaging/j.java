package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.tb0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j {
    public static final Object c = new Object();
    public static d0 d;
    public final Object a;
    public final Object b;

    public j(ExecutorService executorService) {
        this.b = new a0.f(0);
        this.a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z4) {
        d0 d0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new d0(context);
                }
                d0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z4) {
            return d0Var.b(intent).continueWith(new tb0(1), new af.a(17));
        }
        if (r.f().h(context)) {
            a0.c(context, d0Var, intent);
        } else {
            d0Var.b(intent);
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
        tb0 tb0Var = (tb0) this.b;
        boolean z4 = i6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z10 = (intent.getFlags() & TLObject.FLAG_28) != 0;
        return (!z4 || z10) ? Tasks.call(tb0Var, new h(0, context, intent)).continueWithTask(tb0Var, new i(context, intent, z10, 0)) : a(context, intent, z10);
    }

    public j(Context context) {
        this.a = context;
        this.b = new tb0(1);
    }

    public j(e0.t tVar, String str) {
        this.a = tVar;
        this.b = str;
    }
}
