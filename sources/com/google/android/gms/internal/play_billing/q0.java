package com.google.android.gms.internal.play_billing;

import a8.d9;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final t0 a;
    public final m6.n b;

    public q0(t0 t0Var, m6.n nVar) {
        this.a = t0Var;
        this.b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable a10;
        t0 t0Var = this.a;
        boolean z10 = t0Var instanceof x0;
        m6.n nVar = this.b;
        if (z10 && (a10 = ((x0) t0Var).a()) != null) {
            nVar.j(a10);
            return;
        }
        try {
            boolean isDone = t0Var.isDone();
            boolean z11 = false;
            Future future = t0Var;
            if (!isDone) {
                throw new IllegalStateException(d9.a("Future was expected to be done: %s", t0Var));
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
            f5.w wVar = (f5.w) nVar.d;
            if (intValue <= 0) {
                ((Runnable) nVar.c).run();
                return;
            }
            int i7 = nVar.a;
            int intValue2 = num.intValue();
            wVar.getClass();
            f5.f a11 = f5.z.a(intValue2, "Billing override value was set by a license tester.");
            wVar.G(93, i7, a11);
            ((q0.a) nVar.b).accept(a11);
        } catch (ExecutionException e10) {
            nVar.j(e10.getCause());
        } catch (Throwable th3) {
            nVar.j(th3);
        }
    }

    public final String toString() {
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(q0.class.getSimpleName(), 20);
        k kVar = new k();
        ((k) a0Var.d).b = kVar;
        a0Var.d = kVar;
        kVar.a = this.b;
        return a0Var.toString();
    }
}
