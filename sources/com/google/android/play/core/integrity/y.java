package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import l8.f0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;
    private final f0 a = new f0("IntegrityDialogWrapper");
    private final Object d = new Object();

    public y(String str, long j10) {
        this.b = str;
        this.c = j10;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    return Tasks.forResult(0);
                }
                this.e = true;
                f0 f0Var = this.a;
                Object[] objArr = {Integer.valueOf(i10)};
                f0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", f0.d(f0Var.a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle g10 = a9.p.g(i10, "dialog.intent.type");
                g10.putString("package.name", this.b);
                g10.putInt("playcore.integrity.version.major", 1);
                g10.putInt("playcore.integrity.version.minor", 4);
                g10.putInt("playcore.integrity.version.patch", 0);
                g10.putLong("request.token.sid", this.c);
                return b(activity, g10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
