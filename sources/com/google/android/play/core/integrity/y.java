package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import k8.g0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;
    private final g0 a = new g0("IntegrityDialogWrapper");
    private final Object d = new Object();

    public y(String str, long j10) {
        this.b = str;
        this.c = j10;
    }

    public final Task a(Activity activity, int i9) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    return Tasks.forResult(0);
                }
                this.e = true;
                g0 g0Var = this.a;
                Object[] objArr = {Integer.valueOf(i9)};
                g0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", g0.d(g0Var.a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle h = aa.d.h(i9, "dialog.intent.type");
                h.putString("package.name", this.b);
                h.putInt("playcore.integrity.version.major", 1);
                h.putInt("playcore.integrity.version.minor", 4);
                h.putInt("playcore.integrity.version.patch", 0);
                h.putLong("request.token.sid", this.c);
                return b(activity, h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
