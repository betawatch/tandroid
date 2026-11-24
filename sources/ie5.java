// default package

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ie5 extends fy2 implements pe3 {
    public final Handler c;
    public final boolean d;
    public final ie5 e;

    public ie5(Handler handler, boolean z) {
        this.c = handler;
        this.d = z;
        this.e = z ? this : new ie5(handler, true);
    }

    @Override // pe3
    public final xp3 a(long j, oqb oqbVar, cy2 cy2Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(oqbVar, j)) {
            return new he5(this, oqbVar, (byte) 0);
        }
        f(cy2Var, oqbVar);
        return vl7.a;
    }

    @Override // pe3
    public final void b(long j, vb1 vb1Var) {
        tnd tndVar = new tnd(vb1Var, this, (byte) 5);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(tndVar, j)) {
            vb1Var.u(new f33(this, tndVar, (byte) 3));
        } else {
            f(vb1Var.e, tndVar);
        }
    }

    @Override // fy2
    public final void c(cy2 cy2Var, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(cy2Var, runnable);
    }

    @Override // fy2
    public final boolean d(cy2 cy2Var) {
        return (this.d && rr5.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ie5)) {
            return false;
        }
        ie5 ie5Var = (ie5) obj;
        return ie5Var.c == this.c && ie5Var.d == this.d;
    }

    public final void f(cy2 cy2Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        av5 av5Var = (av5) cy2Var.get(nf5.c);
        if (av5Var != null) {
            av5Var.cancel(cancellationException);
        }
        jd3 jd3Var = up3.a;
        jc3.c.c(cy2Var, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // fy2
    public final String toString() {
        ie5 ie5Var;
        String str;
        jd3 jd3Var = up3.a;
        ie5 ie5Var2 = vi6.a;
        if (this == ie5Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ie5Var = ie5Var2.e;
            } catch (UnsupportedOperationException unused) {
                ie5Var = null;
            }
            str = this == ie5Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.c.toString();
        return this.d ? td4.p(handler, ".immediate") : handler;
    }
}
