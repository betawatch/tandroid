package com.google.android.play.core.integrity;

import a9.j0;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;
    private final j0 a = new j0("IntegrityDialogWrapper");
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
                j0 j0Var = this.a;
                Object[] objArr = {Integer.valueOf(i10)};
                j0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", j0.d(j0Var.a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle i11 = f1.i(i10, "dialog.intent.type");
                i11.putString("package.name", this.b);
                i11.putInt("playcore.integrity.version.major", 1);
                i11.putInt("playcore.integrity.version.minor", 4);
                i11.putInt("playcore.integrity.version.patch", 0);
                i11.putLong("request.token.sid", this.c);
                return b(activity, i11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
