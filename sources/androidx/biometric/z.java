package androidx.biometric;

import android.os.Looper;
import androidx.lifecycle.p0;
import com.google.android.gms.internal.play_billing.s1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class z extends p0 {
    public androidx.lifecycle.z A;
    public Executor d;
    public s1 e;
    public x5.k f;
    public v g;
    public af.d h;
    public af.c i;
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
        x5.k kVar = this.f;
        if (kVar == null) {
            return 0;
        }
        v vVar = this.g;
        int i10 = kVar.a;
        return i10 != 0 ? i10 : vVar != null ? 15 : 255;
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

    public final void g(boolean z4) {
        if (this.v == null) {
            this.v = new androidx.lifecycle.z();
        }
        h(this.v, Boolean.valueOf(z4));
    }
}
