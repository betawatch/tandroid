package id;

import android.os.Handler;
import android.os.Looper;
import androidx.biometric.j;
import hd.a0;
import hd.f0;
import hd.f2;
import hd.k0;
import hd.m;
import hd.n0;
import hd.p0;
import hd.x1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import md.o;
import qc.h;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // hd.k0
    public final p0 a(long j10, final f2 f2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(f2Var, j10)) {
            return new p0() { // from class: id.c
                @Override // hd.p0
                public final void dispose() {
                    e.this.c.removeCallbacks(f2Var);
                }
            };
        }
        f(hVar, f2Var);
        return x1.a;
    }

    @Override // hd.k0
    public final void b(long j10, m mVar) {
        j jVar = new j(mVar, this, false, 20);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(jVar, j10)) {
            mVar.u(new d(0, this, jVar));
        } else {
            f(mVar.e, jVar);
        }
    }

    @Override // hd.a0
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(hVar, runnable);
    }

    @Override // hd.a0
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
        f0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        n0.b.c(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // hd.a0
    public final String toString() {
        e eVar;
        String str;
        od.e eVar2 = n0.a;
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
        return this.d ? ta.b.j(handler, ".immediate") : handler;
    }
}
