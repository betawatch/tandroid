package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class y {
    public static WeakReference d;
    public final SharedPreferences a;
    public cf.c b;
    public final ScheduledThreadPoolExecutor c;

    public y(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized x a() {
        x xVar;
        String u10 = this.b.u();
        Pattern pattern = x.d;
        xVar = null;
        if (!TextUtils.isEmpty(u10)) {
            String[] split = u10.split("!", -1);
            if (split.length == 2) {
                xVar = new x(split[0], split[1]);
            }
        }
        return xVar;
    }

    public final synchronized void b() {
        this.b = cf.c.s(this.a, this.c);
    }

    public final synchronized void c(x xVar) {
        this.b.v(xVar.c);
    }
}
