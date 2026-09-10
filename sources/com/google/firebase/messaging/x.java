package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import bi.u6;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class x {
    public static WeakReference d;
    public final SharedPreferences a;
    public u6 b;
    public final ScheduledThreadPoolExecutor c;

    public x(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized w a() {
        w wVar;
        String v = this.b.v();
        Pattern pattern = w.d;
        wVar = null;
        if (!TextUtils.isEmpty(v)) {
            String[] split = v.split("!", -1);
            if (split.length == 2) {
                wVar = new w(split[0], split[1]);
            }
        }
        return wVar;
    }

    public final synchronized void b() {
        this.b = u6.o(this.a, this.c);
    }

    public final synchronized void c(w wVar) {
        this.b.w(wVar.c);
    }
}
