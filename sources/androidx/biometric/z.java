package androidx.biometric;

import android.os.Looper;
import androidx.lifecycle.p0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class z extends p0 {
    public androidx.lifecycle.z A;
    public Executor d;
    public h7.v e;
    public v5.l f;
    public v g;
    public e h;
    public ze.b i;
    public y j;
    public String k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public androidx.lifecycle.z r;
    public androidx.lifecycle.z s;
    public androidx.lifecycle.z t;
    public androidx.lifecycle.z u;
    public androidx.lifecycle.z v;
    public androidx.lifecycle.z x;
    public androidx.lifecycle.z z;
    public int l = 0;
    public boolean w = true;
    public int y = 0;

    public static void h(androidx.lifecycle.z zVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            zVar.j(obj);
        } else {
            zVar.h(obj);
        }
    }

    public final int c() {
        v5.l lVar = this.f;
        if (lVar == null) {
            return 0;
        }
        v vVar = this.g;
        int i10 = lVar.a;
        return i10 != 0 ? i10 : vVar != null ? 15 : 255;
    }

    public final void d(f fVar) {
        if (this.s == null) {
            this.s = new androidx.lifecycle.z();
        }
        h(this.s, fVar);
    }

    public final void e(CharSequence charSequence) {
        if (this.A == null) {
            this.A = new androidx.lifecycle.z();
        }
        h(this.A, charSequence);
    }

    public final void f(int i10) {
        if (this.z == null) {
            this.z = new androidx.lifecycle.z();
        }
        h(this.z, Integer.valueOf(i10));
    }

    public final void g(boolean z10) {
        if (this.v == null) {
            this.v = new androidx.lifecycle.z();
        }
        h(this.v, Boolean.valueOf(z10));
    }
}
