package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class x {
    public static WeakReference d;
    public final SharedPreferences a;
    public cf.c b;
    public final ScheduledThreadPoolExecutor c;

    public x(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized w a() {
        w wVar;
        String u10 = this.b.u();
        Pattern pattern = w.d;
        wVar = null;
        if (!TextUtils.isEmpty(u10)) {
            String[] split = u10.split("!", -1);
            if (split.length == 2) {
                wVar = new w(split[0], split[1]);
            }
        }
        return wVar;
    }

    public final synchronized void b() {
        this.b = cf.c.r(this.a, this.c);
    }

    public final synchronized void c(w wVar) {
        this.b.w(wVar.c);
    }
}
