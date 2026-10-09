package be;

import ae.b0;
import ae.g0;
import ae.g2;
import ae.l0;
import ae.m;
import ae.o0;
import ae.q0;
import ae.y1;
import android.os.Handler;
import android.os.Looper;
import fe.o;
import i9.s;
import java.util.concurrent.CancellationException;
import jd.h;
import kotlin.jvm.internal.i;
import sc.v;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e extends b0 implements l0 {
    public final Handler c;
    public final boolean d;
    public final e e;

    public e(Handler handler, boolean z10) {
        this.c = handler;
        this.d = z10;
        this.e = z10 ? this : new e(handler, true);
    }

    @Override // ae.l0
    public final q0 a(long j3, final g2 g2Var, h hVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.c.postDelayed(g2Var, j3)) {
            return new q0() { // from class: be.c
                @Override // ae.q0
                public final void dispose() {
                    e.this.c.removeCallbacks(g2Var);
                }
            };
        }
        f(hVar, g2Var);
        return y1.a;
    }

    @Override // ae.l0
    public final void b(long j3, m mVar) {
        s sVar = new s(3, mVar, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.c.postDelayed(sVar, j3)) {
            mVar.u(new d(0, this, sVar));
        } else {
            f(mVar.e, sVar);
        }
    }

    @Override // ae.b0
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(hVar, runnable);
    }

    @Override // ae.b0
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
        g0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        o0.b.c(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // ae.b0
    public final String toString() {
        e eVar;
        String str;
        he.e eVar2 = o0.a;
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
        return this.d ? v.v(handler, ".immediate") : handler;
    }
}
