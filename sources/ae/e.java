package ae;

import android.os.Handler;
import android.os.Looper;
import ee.o;
import i9.s;
import id.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import org.telegram.ui.Cells.p6;
import zd.a0;
import zd.e0;
import zd.e2;
import zd.j0;
import zd.m;
import zd.m0;
import zd.o0;
import zd.w1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e extends a0 implements j0 {
    public final Handler c;
    public final boolean d;
    public final e e;

    public e(Handler handler, boolean z10) {
        this.c = handler;
        this.d = z10;
        this.e = z10 ? this : new e(handler, true);
    }

    @Override // zd.j0
    public final o0 a(long j3, final e2 e2Var, h hVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.c.postDelayed(e2Var, j3)) {
            return new o0() { // from class: ae.c
                @Override // zd.o0
                public final void dispose() {
                    e.this.c.removeCallbacks(e2Var);
                }
            };
        }
        f(hVar, e2Var);
        return w1.a;
    }

    @Override // zd.j0
    public final void b(long j3, m mVar) {
        s sVar = new s(1, mVar, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.c.postDelayed(sVar, j3)) {
            mVar.u(new d(0, this, sVar));
        } else {
            f(mVar.e, sVar);
        }
    }

    @Override // zd.a0
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(hVar, runnable);
    }

    @Override // zd.a0
    public final boolean e() {
        return (this.d && i.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.c == this.c && eVar.d == this.d;
    }

    public final void f(h hVar, Runnable runnable) {
        e0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m0.b.c(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // zd.a0
    public final String toString() {
        e eVar;
        String str;
        ge.e eVar2 = m0.a;
        e eVar3 = o.a;
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
        return this.d ? p6.t(handler, ".immediate") : handler;
    }
}
