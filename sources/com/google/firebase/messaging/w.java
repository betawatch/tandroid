package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.z5;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class w {
    public static WeakReference d;
    public final SharedPreferences a;
    public z5 b;
    public final ScheduledThreadPoolExecutor c;

    public w(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized v a() {
        v vVar;
        String t10 = this.b.t();
        Pattern pattern = v.d;
        vVar = null;
        if (!TextUtils.isEmpty(t10)) {
            String[] split = t10.split("!", -1);
            if (split.length == 2) {
                vVar = new v(split[0], split[1]);
            }
        }
        return vVar;
    }

    public final synchronized void b() {
        this.b = z5.q(this.a, this.c);
    }

    public final synchronized void c(v vVar) {
        this.b.u(vVar.c);
    }
}
