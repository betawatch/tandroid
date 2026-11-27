// default package

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class le5 extends px2 implements vd3 {
    public final Handler c;
    public final boolean d;
    public final le5 e;

    public le5(Handler handler, boolean z) {
        this.c = handler;
        this.d = z;
        this.e = z ? this : new le5(handler, true);
    }

    @Override // vd3
    public final ep3 a(long j, nsb nsbVar, mx2 mx2Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(nsbVar, j)) {
            return new ke5(this, nsbVar, (byte) 0);
        }
        f(mx2Var, nsbVar);
        return rm7.a;
    }

    @Override // vd3
    public final void b(long j, va1 va1Var) {
        iqd iqdVar = new iqd(va1Var, this, (byte) 5);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(iqdVar, j)) {
            va1Var.u(new m23(this, iqdVar, (byte) 3));
        } else {
            f(va1Var.e, iqdVar);
        }
    }

    @Override // px2
    public final void c(mx2 mx2Var, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(mx2Var, runnable);
    }

    @Override // px2
    public final boolean d(mx2 mx2Var) {
        return (this.d && ur5.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof le5)) {
            return false;
        }
        le5 le5Var = (le5) obj;
        return le5Var.c == this.c && le5Var.d == this.d;
    }

    public final void f(mx2 mx2Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
        if (ev5Var != null) {
            ev5Var.cancel(cancellationException);
        }
        qc3 qc3Var = bp3.a;
        qb3.c.c(mx2Var, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // px2
    public final String toString() {
        le5 le5Var;
        String str;
        qc3 qc3Var = bp3.a;
        le5 le5Var2 = zi6.a;
        if (this == le5Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                le5Var = le5Var2.e;
            } catch (UnsupportedOperationException unused) {
                le5Var = null;
            }
            str = this == le5Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.c.toString();
        return this.d ? qd4.o(handler, ".immediate") : handler;
    }
}
