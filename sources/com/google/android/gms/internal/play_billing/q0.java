package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import v7.x5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final t0 a;
    public final j6.m b;

    public q0(t0 t0Var, j6.m mVar) {
        this.a = t0Var;
        this.b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable c10;
        t0 t0Var = this.a;
        boolean z10 = t0Var instanceof x0;
        j6.m mVar = this.b;
        if (z10 && (c10 = ((x0) t0Var).c()) != null) {
            mVar.i(c10);
            return;
        }
        try {
            boolean isDone = t0Var.isDone();
            boolean z11 = false;
            Future future = t0Var;
            if (!isDone) {
                throw new IllegalStateException(x5.a("Future was expected to be done: %s", t0Var));
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
            c5.z zVar = (c5.z) mVar.d;
            if (intValue <= 0) {
                ((Runnable) mVar.c).run();
                return;
            }
            int i10 = mVar.a;
            int intValue2 = num.intValue();
            zVar.getClass();
            c5.g a2 = c5.c0.a(intValue2, "Billing override value was set by a license tester.");
            zVar.F(93, i10, a2);
            ((q0.a) mVar.b).accept(a2);
        } catch (ExecutionException e) {
            mVar.i(e.getCause());
        } catch (Throwable th3) {
            mVar.i(th3);
        }
    }

    public final String toString() {
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(q0.class.getSimpleName(), 12);
        k kVar = new k();
        ((k) a0Var.d).b = kVar;
        a0Var.d = kVar;
        kVar.a = this.b;
        return a0Var.toString();
    }
}
