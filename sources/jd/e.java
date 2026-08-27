package jd;

import a9.o;
import android.os.Handler;
import android.os.Looper;
import id.a0;
import id.f0;
import id.f2;
import id.k0;
import id.m;
import id.n0;
import id.p0;
import id.x1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import rc.h;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // id.k0
    public final void a(long j10, m mVar) {
        o oVar = new o(mVar, this, false, 21);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(oVar, j10)) {
            mVar.u(new d(0, this, oVar));
        } else {
            f(mVar.e, oVar);
        }
    }

    @Override // id.k0
    public final p0 b(long j10, final f2 f2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(f2Var, j10)) {
            return new p0() { // from class: jd.c
                @Override // id.p0
                public final void dispose() {
                    e.this.c.removeCallbacks(f2Var);
                }
            };
        }
        f(hVar, f2Var);
        return x1.a;
    }

    @Override // id.a0
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(hVar, runnable);
    }

    @Override // id.a0
    public final boolean e() {
        return (this.d && j.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
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

    @Override // id.a0
    public final String toString() {
        e eVar;
        String str;
        pd.e eVar2 = n0.a;
        e eVar3 = nd.o.a;
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
        return this.d ? s3.c.l(handler, ".immediate") : handler;
    }
}
