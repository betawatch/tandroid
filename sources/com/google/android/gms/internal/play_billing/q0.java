package com.google.android.gms.internal.play_billing;

import h7.e6;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final t0 a;
    public final f5.u b;

    public q0(t0 t0Var, f5.u uVar) {
        this.a = t0Var;
        this.b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable b10;
        t0 t0Var = this.a;
        boolean z10 = t0Var instanceof x0;
        f5.u uVar = this.b;
        if (z10 && (b10 = ((x0) t0Var).b()) != null) {
            uVar.k(b10);
            return;
        }
        try {
            boolean isDone = t0Var.isDone();
            boolean z11 = false;
            Future future = t0Var;
            if (!isDone) {
                throw new IllegalStateException(e6.a("Future was expected to be done: %s", t0Var));
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
            p2.w wVar = (p2.w) uVar.d;
            if (intValue <= 0) {
                ((Runnable) uVar.c).run();
                return;
            }
            int i10 = uVar.a;
            int intValue2 = num.intValue();
            wVar.getClass();
            p2.g a2 = p2.z.a(intValue2, "Billing override value was set by a license tester.");
            wVar.F(93, i10, a2);
            ((q0.a) uVar.b).accept(a2);
        } catch (ExecutionException e10) {
            uVar.k(e10.getCause());
        } catch (Throwable th3) {
            uVar.k(th3);
        }
    }

    public final String toString() {
        androidx.biometric.e eVar = new androidx.biometric.e(q0.class.getSimpleName(), 6);
        k kVar = new k();
        ((k) eVar.d).b = kVar;
        eVar.d = kVar;
        kVar.a = this.b;
        return eVar.toString();
    }
}
