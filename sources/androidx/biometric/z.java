package androidx.biometric;

import a8.l1;
import android.os.Looper;
import androidx.lifecycle.p0;
import java.util.concurrent.Executor;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class z extends p0 {
    public androidx.lifecycle.z A;
    public Executor d;
    public l1 e;
    public m6.n f;
    public v g;
    public android.support.v4.media.session.a0 h;
    public q4.q i;
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
        m6.n nVar = this.f;
        if (nVar == null) {
            return 0;
        }
        v vVar = this.g;
        int i7 = nVar.a;
        if (i7 != 0) {
            return i7;
        }
        if (vVar != null) {
            return 15;
        }
        return qs.e4;
    }

    public final void d(e eVar) {
        if (this.s == null) {
            this.s = new androidx.lifecycle.z();
        }
        h(this.s, eVar);
    }

    public final void e(CharSequence charSequence) {
        if (this.A == null) {
            this.A = new androidx.lifecycle.z();
        }
        h(this.A, charSequence);
    }

    public final void f(int i7) {
        if (this.z == null) {
            this.z = new androidx.lifecycle.z();
        }
        h(this.z, Integer.valueOf(i7));
    }

    public final void g(boolean z9) {
        if (this.v == null) {
            this.v = new androidx.lifecycle.z();
        }
        h(this.v, Boolean.valueOf(z9));
    }
}
