package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
abstract class y {
    private final String b;
    private final long c;
    private boolean e;
    private final s2d a = new s2d("IntegrityDialogWrapper");
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
            s2d s2dVar = this.a;
            Object[] objArr = {Integer.valueOf(i)};
            s2dVar.getClass();
            if (Log.isLoggable("PlayCore", 3)) {
                Log.d("PlayCore", s2d.d(s2dVar.a, "checkAndShowDialog(%s)", objArr));
            }
            Bundle j = kt6.j(i, "dialog.intent.type");
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
