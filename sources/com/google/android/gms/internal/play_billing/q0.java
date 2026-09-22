package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import v7.w5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
            lVar.k(c10);
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
            c5.c0 c0Var = (c5.c0) lVar.d;
            if (intValue <= 0) {
                ((Runnable) lVar.c).run();
                return;
            }
            int i10 = lVar.a;
            int intValue2 = num.intValue();
            c0Var.getClass();
            c5.h a2 = c5.f0.a(intValue2, "Billing override value was set by a license tester.");
            c0Var.F(93, i10, a2);
            ((q0.a) lVar.b).accept(a2);
        } catch (ExecutionException e) {
            lVar.k(e.getCause());
        } catch (Throwable th3) {
            lVar.k(th3);
        }
    }

    public final String toString() {
        aa.a aVar = new aa.a(q0.class.getSimpleName(), 11);
        k kVar = new k();
        ((k) aVar.d).b = kVar;
        aVar.d = kVar;
        kVar.a = this.b;
        return aVar.toString();
    }
}
