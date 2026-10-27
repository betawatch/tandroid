package com.google.firebase.messaging;

import a8.me;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u {
    public static WeakReference d;
    public final SharedPreferences a;
    public me b;
    public final ScheduledThreadPoolExecutor c;

    public u(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized t a() {
        t tVar;
        String v = this.b.v();
        Pattern pattern = t.d;
        tVar = null;
        if (!TextUtils.isEmpty(v)) {
            String[] split = v.split("!", -1);
            if (split.length == 2) {
                tVar = new t(split[0], split[1]);
            }
        }
        return tVar;
    }

    public final synchronized void b() {
        this.b = me.t(this.a, this.c);
    }

    public final synchronized void c(t tVar) {
        this.b.w(tVar.c);
    }
}
