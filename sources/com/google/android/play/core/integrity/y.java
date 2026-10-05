package com.google.android.play.core.integrity;

import a9.j0;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.Cells.c1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                Bundle h = c1.h(i10, "dialog.intent.type");
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
