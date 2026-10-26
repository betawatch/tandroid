package com.google.android.gms.internal.play_billing;

import a8.pa;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final t0 a;
    public final k6.m b;

    public q0(t0 t0Var, k6.m mVar) {
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
        k6.m mVar = this.b;
        if (z10 && (c10 = ((x0) t0Var).c()) != null) {
            mVar.i(c10);
            return;
        }
        try {
            boolean isDone = t0Var.isDone();
            boolean z11 = false;
            Future future = t0Var;
            if (!isDone) {
                throw new IllegalStateException(pa.a("Future was expected to be done: %s", t0Var));
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
            d5.b0 b0Var = (d5.b0) mVar.d;
            if (intValue <= 0) {
                ((Runnable) mVar.c).run();
                return;
            }
            int i10 = mVar.a;
            int intValue2 = num.intValue();
            b0Var.getClass();
            d5.i a2 = d5.e0.a(intValue2, "Billing override value was set by a license tester.");
            b0Var.F(93, i10, a2);
            ((q0.a) mVar.b).accept(a2);
        } catch (ExecutionException e) {
            mVar.i(e.getCause());
        } catch (Throwable th3) {
            mVar.i(th3);
        }
    }

    public final String toString() {
        a8.h0 h0Var = new a8.h0(q0.class.getSimpleName(), 10);
        k kVar = new k();
        ((k) h0Var.d).b = kVar;
        h0Var.d = kVar;
        kVar.a = this.b;
        return h0Var.toString();
    }
}
