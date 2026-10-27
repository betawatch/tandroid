package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import b9.h0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;
    private final h0 a = new h0("IntegrityDialogWrapper");
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
                h0 h0Var = this.a;
                Object[] objArr = {Integer.valueOf(i10)};
                h0Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", h0.d(h0Var.a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle g7 = b10.g(i10, "dialog.intent.type");
                g7.putString("package.name", this.b);
                g7.putInt("playcore.integrity.version.major", 1);
                g7.putInt("playcore.integrity.version.minor", 4);
                g7.putInt("playcore.integrity.version.patch", 0);
                g7.putLong("request.token.sid", this.c);
                return b(activity, g7);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
