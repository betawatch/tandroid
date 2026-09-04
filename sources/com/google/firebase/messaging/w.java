package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class w {
    public static WeakReference d;
    public final SharedPreferences a;
    public cf.c b;
    public final ScheduledThreadPoolExecutor c;

    public w(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized v a() {
        v vVar;
        String q6 = this.b.q();
        Pattern pattern = v.d;
        vVar = null;
        if (!TextUtils.isEmpty(q6)) {
            String[] split = q6.split("!", -1);
            if (split.length == 2) {
                vVar = new v(split[0], split[1]);
            }
        }
        return vVar;
    }

    public final synchronized void b() {
        this.b = cf.c.o(this.a, this.c);
    }

    public final synchronized void c(v vVar) {
        this.b.r(vVar.c);
    }
}
