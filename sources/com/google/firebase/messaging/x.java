package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        this.b = cf.c.q(this.a, this.c);
    }

    public final synchronized void c(w wVar) {
        this.b.w(wVar.c);
    }
}
