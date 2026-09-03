package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class v {
    public static WeakReference d;
    public final SharedPreferences a;
    public c5.j b;
    public final ScheduledThreadPoolExecutor c;

    public v(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized u a() {
        u uVar;
        String v = this.b.v();
        Pattern pattern = u.d;
        uVar = null;
        if (!TextUtils.isEmpty(v)) {
            String[] split = v.split("!", -1);
            if (split.length == 2) {
                uVar = new u(split[0], split[1]);
            }
        }
        return uVar;
    }

    public final synchronized void b() {
        this.b = c5.j.t(this.a, this.c);
    }

    public final synchronized void c(u uVar) {
        this.b.w(uVar.c);
    }
}
