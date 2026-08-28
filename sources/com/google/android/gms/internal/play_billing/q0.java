package com.google.android.gms.internal.play_billing;

import f7.w5;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final t0 a;
    public final d5.w b;

    public q0(t0 t0Var, d5.w wVar) {
        this.a = t0Var;
        this.b = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable b10;
        t0 t0Var = this.a;
        boolean z10 = t0Var instanceof x0;
        d5.w wVar = this.b;
        if (z10 && (b10 = ((x0) t0Var).b()) != null) {
            wVar.k(b10);
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
            n2.y yVar = (n2.y) wVar.d;
            if (intValue <= 0) {
                ((Runnable) wVar.c).run();
                return;
            }
            int i9 = wVar.a;
            int intValue2 = num.intValue();
            yVar.getClass();
            n2.g a2 = n2.b0.a(intValue2, "Billing override value was set by a license tester.");
            yVar.F(93, i9, a2);
            ((q0.a) wVar.b).accept(a2);
        } catch (ExecutionException e10) {
            wVar.k(e10.getCause());
        } catch (Throwable th2) {
            wVar.k(th2);
        }
    }

    public final String toString() {
        a5.m mVar = new a5.m(q0.class.getSimpleName(), 9);
        k kVar = new k();
        ((k) mVar.d).b = kVar;
        mVar.d = kVar;
        kVar.a = this.b;
        return mVar.toString();
    }
}
