package com.google.android.gms.internal.play_billing;

import j7.f6;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final t0 a;
    public final h5.u b;

    public q0(t0 t0Var, h5.u uVar) {
        this.a = t0Var;
        this.b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable b10;
        t0 t0Var = this.a;
        boolean z4 = t0Var instanceof x0;
        h5.u uVar = this.b;
        if (z4 && (b10 = ((x0) t0Var).b()) != null) {
            uVar.i(b10);
            return;
        }
        try {
            boolean isDone = t0Var.isDone();
            boolean z10 = false;
            Future future = t0Var;
            if (!isDone) {
                throw new IllegalStateException(f6.a("Future was expected to be done: %s", t0Var));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            p2.x xVar = (p2.x) uVar.d;
            if (intValue <= 0) {
                ((Runnable) uVar.c).run();
                return;
            }
            int i10 = uVar.a;
            int intValue2 = num.intValue();
            xVar.getClass();
            p2.h a2 = p2.a0.a(intValue2, "Billing override value was set by a license tester.");
            xVar.F(93, i10, a2);
            ((q0.a) uVar.b).accept(a2);
        } catch (ExecutionException e6) {
            uVar.i(e6.getCause());
        } catch (Throwable th3) {
            uVar.i(th3);
        }
    }

    public final String toString() {
        androidx.biometric.e eVar = new androidx.biometric.e(q0.class.getSimpleName(), 10);
        k kVar = new k();
        ((k) eVar.d).b = kVar;
        eVar.d = kVar;
        kVar.a = this.b;
        return eVar.toString();
    }
}
