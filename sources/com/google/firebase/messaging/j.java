package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j {
    public static final Object c = new Object();
    public static e0 d;
    public final Object a;
    public final Object b;

    public j(ExecutorService executorService) {
        this.b = new a0.f(0);
        this.a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        e0 e0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new e0(context);
                }
                e0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            return e0Var.b(intent).continueWith(new a3.a(2), new androidx.emoji2.text.w(23));
        }
        if (s.b().d(context)) {
            b0.c(context, e0Var, intent);
        } else {
            e0Var.b(intent);
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
        a3.a aVar = (a3.a) this.b;
        boolean z10 = u6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & TLObject.FLAG_28) != 0;
        return (!z10 || z11) ? Tasks.call(aVar, new h(0, context, intent)).continueWithTask(aVar, new i(context, intent, z11, 0)) : a(context, intent, z11);
    }

    public j(Context context) {
        this.a = context;
        this.b = new a3.a(2);
    }

    public j(e0.t tVar, String str) {
        this.a = tVar;
        this.b = str;
    }
}
