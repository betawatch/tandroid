// default package

import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fm0 implements x74 {
    public final int a;
    public final x74 b;
    public final Interpolator c;
    public final short d;
    public float e;
    public boolean f;
    public y74 h;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public fm0(int i, x74 x74Var, Interpolator interpolator, long j, boolean z) {
        this.a = i;
        this.b = x74Var;
        this.c = interpolator;
        this.d = (int) j;
        this.f = z;
        this.e = z ? 1.0f : 0.0f;
    }

    @Override // x74
    public final void F(float f, int i) {
        this.b.F(f, this.a);
    }

    public final void a(boolean z, boolean z2) {
        if (this.f == z && z2) {
            return;
        }
        this.f = z;
        float f = z ? 1.0f : 0.0f;
        y74 y74Var = this.h;
        if (z2) {
            if (y74Var == null) {
                y74 y74Var2 = new y74(0, this, this.c, this.d, this.e);
                this.h = y74Var2;
                y74Var = y74Var2;
            }
            y74Var.a(f);
            return;
        }
        if (y74Var != null) {
            y74Var.c(f);
        }
        float f2 = this.e;
        if (f2 != f) {
            int i = this.a;
            x74 x74Var = this.b;
            if (f2 != f) {
                this.e = f;
                x74Var.p(i, f, -1.0f, null);
            }
            x74Var.F(f, i);
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (this.e != f) {
            this.e = f;
            this.b.p(this.a, f, -1.0f, null);
        }
    }

    public fm0(int i, x74 x74Var, s33 s33Var, long j) {
        this(i, x74Var, s33Var, j, false);
    }

    public fm0(long j, View view, Interpolator interpolator) {
        this(0, new em0(view), interpolator, j, false);
    }
}
