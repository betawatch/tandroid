package com.google.android.exoplayer2.upstream;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 implements r0 {
    public static final k0 d = new k0(0, -9223372036854775807L, false);
    public static final k0 e = new k0(2, -9223372036854775807L, false);
    public static final k0 f = new k0(3, -9223372036854775807L, false);
    public final ExecutorService a;
    public m0 b;
    public IOException c;

    public q0(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i9 = d5.f0.a;
        this.a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(concat, 1));
    }

    @Override // com.google.android.exoplayer2.upstream.r0
    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        m0 m0Var = this.b;
        if (m0Var != null) {
            int i9 = m0Var.a;
            IOException iOException2 = m0Var.e;
            if (iOException2 != null && m0Var.f > i9) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        m0 m0Var = this.b;
        d5.a.j(m0Var);
        m0Var.a(false);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(o0 o0Var) {
        m0 m0Var = this.b;
        if (m0Var != null) {
            m0Var.a(true);
        }
        ExecutorService executorService = this.a;
        if (o0Var != null) {
            executorService.execute(new androidx.activity.i(o0Var, 11));
        }
        executorService.shutdown();
    }

    public final long f(n0 n0Var, l0 l0Var, int i9) {
        Looper myLooper = Looper.myLooper();
        d5.a.j(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m0 m0Var = new m0(this, myLooper, n0Var, l0Var, i9, elapsedRealtime);
        d5.a.i(this.b == null);
        this.b = m0Var;
        m0Var.e = null;
        this.a.execute(m0Var);
        return elapsedRealtime;
    }
}
