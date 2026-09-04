package com.google.android.play.core.integrity;

import a9.i0;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;
    private final i0 a = new i0("IntegrityDialogWrapper");
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
                i0 i0Var = this.a;
                Object[] objArr = {Integer.valueOf(i10)};
                i0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", i0.d(i0Var.a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle e7 = p6.e(i10, "dialog.intent.type");
                e7.putString("package.name", this.b);
                e7.putInt("playcore.integrity.version.major", 1);
                e7.putInt("playcore.integrity.version.minor", 4);
                e7.putInt("playcore.integrity.version.patch", 0);
                e7.putLong("request.token.sid", this.c);
                return b(activity, e7);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
