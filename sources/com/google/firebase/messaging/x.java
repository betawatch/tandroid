package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x {
    public static WeakReference d;
    public final SharedPreferences a;
    public af.h b;
    public final ScheduledThreadPoolExecutor c;

    public x(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized w a() {
        w wVar;
        String w10 = this.b.w();
        Pattern pattern = w.d;
        wVar = null;
        if (!TextUtils.isEmpty(w10)) {
            String[] split = w10.split("!", -1);
            if (split.length == 2) {
                wVar = new w(split[0], split[1]);
            }
        }
        return wVar;
    }

    public final synchronized void b() {
        this.b = af.h.u(this.a, this.c);
    }

    public final synchronized void c(w wVar) {
        this.b.x(wVar.c);
    }
}
