package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import v7.w5;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final t0 a;
    public final j6.l b;

    public q0(t0 t0Var, j6.l lVar) {
        this.a = t0Var;
        this.b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable c10;
        t0 t0Var = this.a;
        boolean z10 = t0Var instanceof x0;
        j6.l lVar = this.b;
        if (z10 && (c10 = ((x0) t0Var).c()) != null) {
            lVar.i(c10);
            return;
        }
        try {
            boolean isDone = t0Var.isDone();
            boolean z11 = false;
            Future future = t0Var;
            if (!isDone) {
                throw new IllegalStateException(w5.a("Future was expected to be done: %s", t0Var));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            c5.e0 e0Var = (c5.e0) lVar.d;
            if (intValue <= 0) {
                ((Runnable) lVar.c).run();
                return;
            }
            int i10 = lVar.a;
            int intValue2 = num.intValue();
            e0Var.getClass();
            c5.i a2 = c5.h0.a(intValue2, "Billing override value was set by a license tester.");
            e0Var.F(93, i10, a2);
            ((q0.a) lVar.b).accept(a2);
        } catch (ExecutionException e) {
            lVar.i(e.getCause());
        } catch (Throwable th3) {
            lVar.i(th3);
        }
    }

    public final String toString() {
        androidx.biometric.e eVar = new androidx.biometric.e(q0.class.getSimpleName(), 9);
        k kVar = new k();
        ((k) eVar.d).b = kVar;
        eVar.d = kVar;
        kVar.a = this.b;
        return eVar.toString();
    }
}
