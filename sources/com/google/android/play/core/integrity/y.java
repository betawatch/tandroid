package com.google.android.play.core.integrity;

import a9.j0;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.Cells.r6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                Bundle e = r6.e(i10, "dialog.intent.type");
                e.putString("package.name", this.b);
                e.putInt("playcore.integrity.version.major", 1);
                e.putInt("playcore.integrity.version.minor", 4);
                e.putInt("playcore.integrity.version.patch", 0);
                e.putLong("request.token.sid", this.c);
                return b(activity, e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
