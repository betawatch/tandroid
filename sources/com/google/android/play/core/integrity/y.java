package com.google.android.play.core.integrity;

import a9.j0;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.Cells.c1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;
    private final j0 a = new j0("IntegrityDialogWrapper");
    private final Object d = new Object();

    public y(String str, long j3) {
        this.b = str;
        this.c = j3;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    return Tasks.forResult(0);
                }
                this.e = true;
                j0 j0Var = this.a;
                Object[] objArr = {Integer.valueOf(i10)};
                j0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", j0.d(j0Var.a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle f7 = c1.f(i10, "dialog.intent.type");
                f7.putString("package.name", this.b);
                f7.putInt("playcore.integrity.version.major", 1);
                f7.putInt("playcore.integrity.version.minor", 4);
                f7.putInt("playcore.integrity.version.patch", 0);
                f7.putLong("request.token.sid", this.c);
                return b(activity, f7);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
