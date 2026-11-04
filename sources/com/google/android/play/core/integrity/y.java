package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import c9.g0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public final Task a(Activity activity, int i3) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    return Tasks.forResult(0);
                }
                this.e = true;
                g0 g0Var = this.a;
                Object[] objArr = {Integer.valueOf(i3)};
                g0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", g0.d(g0Var.a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle k10 = f1.k(i3, "dialog.intent.type");
                k10.putString("package.name", this.b);
                k10.putInt("playcore.integrity.version.major", 1);
                k10.putInt("playcore.integrity.version.minor", 4);
                k10.putInt("playcore.integrity.version.patch", 0);
                k10.putLong("request.token.sid", this.c);
                return b(activity, k10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
