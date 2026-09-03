package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import o8.f0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                Bundle h = android.support.v4.media.a.h(i10, "dialog.intent.type");
                h.putString("package.name", this.b);
                h.putInt("playcore.integrity.version.major", 1);
                h.putInt("playcore.integrity.version.minor", 4);
                h.putInt("playcore.integrity.version.patch", 0);
                h.putLong("request.token.sid", this.c);
                return b(activity, h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
