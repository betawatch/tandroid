package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.z5;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        this.b = z5.p(this.a, this.c);
    }

    public final synchronized void c(v vVar) {
        this.b.x(vVar.c);
    }
}
