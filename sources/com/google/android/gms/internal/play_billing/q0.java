package com.google.android.gms.internal.play_billing;

import g7.v5;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final t0 a;
    public final d5.x b;

    public q0(t0 t0Var, d5.x xVar) {
        this.a = t0Var;
        this.b = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable b10;
        t0 t0Var = this.a;
        boolean z10 = t0Var instanceof x0;
        d5.x xVar = this.b;
        if (z10 && (b10 = ((x0) t0Var).b()) != null) {
            xVar.k(b10);
            return;
        }
        try {
            boolean isDone = t0Var.isDone();
            boolean z11 = false;
            Future future = t0Var;
            if (!isDone) {
                throw new IllegalStateException(v5.a("Future was expected to be done: %s", t0Var));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    future = future;
                } catch (Throwable th) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            n2.x xVar2 = (n2.x) xVar.d;
            if (intValue <= 0) {
                ((Runnable) xVar.c).run();
                return;
            }
            int i10 = xVar.a;
            int intValue2 = num.intValue();
            xVar2.getClass();
            n2.g a2 = n2.a0.a(intValue2, "Billing override value was set by a license tester.");
            xVar2.F(93, i10, a2);
            ((q0.a) xVar.b).accept(a2);
        } catch (ExecutionException e9) {
            xVar.k(e9.getCause());
        } catch (Throwable th2) {
            xVar.k(th2);
        }
    }

    public final String toString() {
        a5.n nVar = new a5.n(q0.class.getSimpleName(), 8);
        k kVar = new k();
        ((k) nVar.d).b = kVar;
        nVar.d = kVar;
        kVar.a = this.b;
        return nVar.toString();
    }
}
