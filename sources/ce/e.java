package ce;

import android.os.Handler;
import android.os.Looper;
import be.a0;
import be.f0;
import be.f2;
import be.k0;
import be.m;
import be.n0;
import be.p0;
import be.x1;
import ge.o;
import j9.u;
import java.util.concurrent.CancellationException;
import kd.h;
import kotlin.jvm.internal.i;
import si.o0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class e extends a0 implements k0 {
    public final Handler c;
    public final boolean d;
    public final e e;

    public e(Handler handler, boolean z10) {
        this.c = handler;
        this.d = z10;
        this.e = z10 ? this : new e(handler, true);
    }

    @Override // be.k0
    public final void a(long j10, m mVar) {
        u uVar = new u(9, mVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(uVar, j10)) {
            mVar.u(new d(0, this, uVar));
        } else {
            f(mVar.e, uVar);
        }
    }

    @Override // be.k0
    public final p0 b(long j10, final f2 f2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(f2Var, j10)) {
            return new p0() { // from class: ce.c
                @Override // be.p0
                public final void dispose() {
                    e.this.c.removeCallbacks(f2Var);
                }
            };
        }
        f(hVar, f2Var);
        return x1.a;
    }

    @Override // be.a0
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(hVar, runnable);
    }

    @Override // be.a0
    public final boolean d() {
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
        f0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        n0.b.c(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // be.a0
    public final String toString() {
        e eVar;
        String str;
        ie.e eVar2 = n0.a;
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
        return this.d ? o0.u(handler, ".immediate") : handler;
    }
}
