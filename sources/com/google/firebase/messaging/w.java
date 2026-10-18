package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.z5;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        String w9 = this.b.w();
        Pattern pattern = v.d;
        vVar = null;
        if (!TextUtils.isEmpty(w9)) {
            String[] split = w9.split("!", -1);
            if (split.length == 2) {
                vVar = new v(split[0], split[1]);
            }
        }
        return vVar;
    }

    public final synchronized void b() {
        this.b = z5.t(this.a, this.c);
    }

    public final synchronized void c(v vVar) {
        this.b.x(vVar.c);
    }
}
