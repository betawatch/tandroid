package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class u0 implements Runnable {
    public w0 a;

    @Override // java.lang.Runnable
    public final void run() {
        t0 t0Var;
        e0 e0Var;
        w0 w0Var = this.a;
        if (w0Var == null || (t0Var = w0Var.n) == null) {
            return;
        }
        this.a = null;
        if (t0Var.isDone()) {
            Object obj = w0Var.a;
            if (obj == null) {
                if (t0Var.isDone()) {
                    if (l0.h.f(w0Var, null, w0.h(t0Var))) {
                        w0.j(w0Var);
                        return;
                    }
                    return;
                }
                c0 c0Var = new c0(w0Var, t0Var);
                if (l0.h.f(w0Var, null, c0Var)) {
                    try {
                        t0Var.b(c0Var, p0.a);
                        return;
                    } catch (Throwable th2) {
                        try {
                            e0Var = new e0(th2);
                        } catch (Error | Exception unused) {
                            e0Var = e0.b;
                        }
                        l0.h.f(w0Var, c0Var, e0Var);
                        return;
                    }
                }
                obj = w0Var.a;
            }
            if (obj instanceof b0) {
                t0Var.cancel(((b0) obj).a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = w0Var.r;
            w0Var.r = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th3) {
                    if (l0.h.f(w0Var, null, new e0(new v0(str)))) {
                        w0.j(w0Var);
                    }
                    throw th3;
                }
            }
            if (l0.h.f(w0Var, null, new e0(new v0(str + ": " + t0Var.toString())))) {
                w0.j(w0Var);
            }
        } finally {
            t0Var.cancel(true);
        }
    }
}
