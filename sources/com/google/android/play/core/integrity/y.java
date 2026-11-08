package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d9.g0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;
    private final g0 a = new g0("IntegrityDialogWrapper");
    private final Object d = new Object();

    public y(String str, long j3) {
        this.b = str;
        this.c = j3;
    }

    public final Task a(Activity activity, int i7) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    return Tasks.forResult(0);
                }
                this.e = true;
                g0 g0Var = this.a;
                Object[] objArr = {Integer.valueOf(i7)};
                g0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", g0.d(g0Var.a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle f10 = rf.b.f(i7, "dialog.intent.type");
                f10.putString("package.name", this.b);
                f10.putInt("playcore.integrity.version.major", 1);
                f10.putInt("playcore.integrity.version.minor", 4);
                f10.putInt("playcore.integrity.version.patch", 0);
                f10.putLong("request.token.sid", this.c);
                return b(activity, f10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
