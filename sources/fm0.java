// default package

import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fm0 implements s84 {
    public final int a;
    public final s84 b;
    public Interpolator c;
    public long d;
    public float e;
    public boolean f;
    public t84 h;

    public fm0(int i, s84 s84Var, Interpolator interpolator, long j, boolean z) {
        this.a = i;
        this.b = s84Var;
        this.c = interpolator;
        this.d = j;
        this.f = z;
        this.e = z ? 1.0f : 0.0f;
    }

    public final void a(boolean z, boolean z2) {
        if (this.f == z && z2) {
            return;
        }
        this.f = z;
        float f = z ? 1.0f : 0.0f;
        t84 t84Var = this.h;
        if (z2) {
            if (t84Var == null) {
                t84 t84Var2 = new t84(0, this, this.c, this.d, this.e);
                this.h = t84Var2;
                t84Var = t84Var2;
            }
            t84Var.a(f);
            return;
        }
        if (t84Var != null) {
            t84Var.c(f);
        }
        float f2 = this.e;
        if (f2 != f) {
            int i = this.a;
            s84 s84Var = this.b;
            if (f2 != f) {
                this.e = f;
                s84Var.t(i, f, -1.0f, null);
            }
            s84Var.v0(f, i);
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (this.e != f) {
            this.e = f;
            this.b.t(this.a, f, -1.0f, null);
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
        this.b.v0(f, this.a);
    }

    public fm0(int i, s84 s84Var, k43 k43Var, long j) {
        this(i, s84Var, k43Var, j, false);
    }

    public fm0(long j, View view, Interpolator interpolator) {
        this(0, new em0(view), interpolator, j, false);
    }
}
