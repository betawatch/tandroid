// default package

import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fn0 implements g94 {
    public final int a;
    public final g94 b;
    public final Interpolator c;
    public final short d;
    public float e;
    public boolean f;
    public h94 h;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public fn0(int i, g94 g94Var, Interpolator interpolator, long j, boolean z) {
        this.a = i;
        this.b = g94Var;
        this.c = interpolator;
        this.d = (int) j;
        this.f = z;
        this.e = z ? 1.0f : 0.0f;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (this.e != f) {
            this.e = f;
            this.b.D(this.a, f, -1.0f, null);
        }
    }

    @Override // g94
    public final void V(float f, int i) {
        this.b.V(f, this.a);
    }

    public final void a(boolean z, boolean z2) {
        if (this.f == z && z2) {
            return;
        }
        this.f = z;
        float f = z ? 1.0f : 0.0f;
        h94 h94Var = this.h;
        if (z2) {
            if (h94Var == null) {
                h94 h94Var2 = new h94(0, this, this.c, this.d, this.e);
                this.h = h94Var2;
                h94Var = h94Var2;
            }
            h94Var.a(f);
            return;
        }
        if (h94Var != null) {
            h94Var.c(f);
        }
        float f2 = this.e;
        if (f2 != f) {
            int i = this.a;
            g94 g94Var = this.b;
            if (f2 != f) {
                this.e = f;
                g94Var.D(i, f, -1.0f, null);
            }
            g94Var.V(f, i);
        }
    }

    public fn0(int i, g94 g94Var, d53 d53Var, long j) {
        this(i, g94Var, d53Var, j, false);
    }

    public fn0(long j, View view, Interpolator interpolator) {
        this(0, new en0(view), interpolator, j, false);
    }
}
