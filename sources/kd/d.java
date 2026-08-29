package kd;

import ab.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import jd.a0;
import jd.e0;
import jd.e2;
import jd.j0;
import jd.m;
import jd.m0;
import jd.o0;
import jd.w1;
import k1.i;
import kotlin.jvm.internal.j;
import od.p;
import sc.h;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends a0 implements j0 {
    public final Handler c;
    public final boolean d;
    public final d e;

    public d(Handler handler, boolean z10) {
        this.c = handler;
        this.d = z10;
        this.e = z10 ? this : new d(handler, true);
    }

    @Override // jd.j0
    public final o0 a(long j10, final e2 e2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(e2Var, j10)) {
            return new o0() { // from class: kd.c
                @Override // jd.o0
                public final void dispose() {
                    d.this.c.removeCallbacks(e2Var);
                }
            };
        }
        f(hVar, e2Var);
        return w1.a;
    }

    @Override // jd.j0
    public final void b(long j10, m mVar) {
        o oVar = new o(25, mVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(oVar, j10)) {
            mVar.u(new i(1, this, oVar));
        } else {
            f(mVar.e, oVar);
        }
    }

    @Override // jd.a0
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(hVar, runnable);
    }

    @Override // jd.a0
    public final boolean e() {
        return (this.d && j.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c == this.c && dVar.d == this.d;
    }

    public final void f(h hVar, Runnable runnable) {
        e0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m0.b.c(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // jd.a0
    public final String toString() {
        d dVar;
        String str;
        qd.e eVar = m0.a;
        d dVar2 = p.a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.e;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.c.toString();
        return this.d ? u3.c.k(handler, ".immediate") : handler;
    }
}
