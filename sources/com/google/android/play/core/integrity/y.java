package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;
    private final q0d a = new q0d("IntegrityDialogWrapper");
    private final Object d = new Object();

    public y(String str, long j) {
        this.b = str;
        this.c = j;
    }

    public final Task a(Activity activity, int i) {
        synchronized (this.d) {
            if (this.e) {
                return Tasks.forResult(0);
            }
            this.e = true;
            q0d q0dVar = this.a;
            Object[] objArr = {Integer.valueOf(i)};
            q0dVar.getClass();
            if (Log.isLoggable("PlayCore", 3)) {
                Log.d("PlayCore", q0d.d(q0dVar.a, "checkAndShowDialog(%s)", objArr));
            }
            Bundle j = ls6.j(i, "dialog.intent.type");
            j.putString("package.name", this.b);
            j.putInt("playcore.integrity.version.major", 1);
            j.putInt("playcore.integrity.version.minor", 4);
            j.putInt("playcore.integrity.version.patch", 0);
            j.putLong("request.token.sid", this.c);
            return b(activity, j);
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
