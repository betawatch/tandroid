package androidx.biometric;

import a8.a1;
import a8.h0;
import android.os.Looper;
import androidx.lifecycle.p0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class x extends p0 {
    public androidx.lifecycle.z A;
    public Executor d;
    public a1 e;
    public k6.m f;
    public t g;
    public h0 h;
    public rf.b i;
    public w j;
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
        k6.m mVar = this.f;
        if (mVar == null) {
            return 0;
        }
        t tVar = this.g;
        int i10 = mVar.a;
        return i10 != 0 ? i10 : tVar != null ? 15 : 255;
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
