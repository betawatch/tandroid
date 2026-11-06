package ae;

import android.os.Handler;
import android.os.Looper;
import ee.n;
import id.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import m9.u;
import zd.a1;
import zd.g0;
import zd.j0;
import zd.l0;
import zd.m;
import zd.p1;
import zd.x;
import zd.y;
import zd.y1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e extends x implements g0 {
    public final Handler c;
    public final boolean d;
    public final e e;

    public e(Handler handler, boolean z9) {
        this.c = handler;
        this.d = z9;
        this.e = z9 ? this : new e(handler, true);
    }

    @Override // zd.g0
    public final l0 a(long j3, y1 y1Var, h hVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.c.postDelayed(y1Var, j3)) {
            return new c(0, this, y1Var);
        }
        g(hVar, y1Var);
        return p1.a;
    }

    @Override // zd.g0
    public final void b(long j3, m mVar) {
        u uVar = new u(6, mVar, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.c.postDelayed(uVar, j3)) {
            mVar.u(new d(0, this, uVar));
        } else {
            g(mVar.e, uVar);
        }
    }

    @Override // zd.x
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        g(hVar, runnable);
    }

    @Override // zd.x
    public final boolean d(h hVar) {
        return (this.d && j.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.c == this.c && eVar.d == this.d;
    }

    public final void g(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        a1 a1Var = (a1) hVar.get(y.b);
        if (a1Var != null) {
            a1Var.cancel(cancellationException);
        }
        ge.e eVar = j0.a;
        ge.d.c.c(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // zd.x
    public final String toString() {
        e eVar;
        String str;
        ge.e eVar2 = j0.a;
        e eVar3 = n.a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.e;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.c.toString();
        return this.d ? rf.b.q(handler, ".immediate") : handler;
    }
}
