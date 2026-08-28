package androidx.biometric;

import android.os.Looper;
import androidx.lifecycle.p0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class y extends p0 {
    public androidx.lifecycle.z A;
    public Executor d;
    public f7.n e;
    public t5.l f;
    public u g;
    public a5.m h;
    public we.b i;
    public x j;
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
        t5.l lVar = this.f;
        if (lVar == null) {
            return 0;
        }
        u uVar = this.g;
        int i9 = lVar.a;
        return i9 != 0 ? i9 : uVar != null ? 15 : 255;
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

    public final void f(int i9) {
        if (this.z == null) {
            this.z = new androidx.lifecycle.z();
        }
        h(this.z, Integer.valueOf(i9));
    }

    public final void g(boolean z10) {
        if (this.v == null) {
            this.v = new androidx.lifecycle.z();
        }
        h(this.v, Boolean.valueOf(z10));
    }
}
