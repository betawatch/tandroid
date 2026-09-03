package md;

import android.os.Handler;
import android.os.Looper;
import androidx.biometric.k;
import java.util.concurrent.CancellationException;
import k1.j;
import ld.a0;
import ld.e0;
import ld.e2;
import ld.j0;
import ld.m;
import ld.m0;
import ld.o0;
import ld.w1;
import qd.o;
import uc.h;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends a0 implements j0 {
    public final Handler c;
    public final boolean d;
    public final d e;

    public d(Handler handler, boolean z4) {
        this.c = handler;
        this.d = z4;
        this.e = z4 ? this : new d(handler, true);
    }

    @Override // ld.j0
    public final o0 a(long j10, final e2 e2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(e2Var, j10)) {
            return new o0() { // from class: md.c
                @Override // ld.o0
                public final void dispose() {
                    d.this.c.removeCallbacks(e2Var);
                }
            };
        }
        f(hVar, e2Var);
        return w1.a;
    }

    @Override // ld.j0
    public final void b(long j10, m mVar) {
        k kVar = new k(mVar, this, false, 25);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(kVar, j10)) {
            mVar.u(new j(1, this, kVar));
        } else {
            f(mVar.e, kVar);
        }
    }

    @Override // ld.a0
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(hVar, runnable);
    }

    @Override // ld.a0
    public final boolean e() {
        return (this.d && kotlin.jvm.internal.j.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
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

    @Override // ld.a0
    public final String toString() {
        d dVar;
        String str;
        sd.e eVar = m0.a;
        d dVar2 = o.a;
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
        return this.d ? w.c.e(handler, ".immediate") : handler;
    }
}
