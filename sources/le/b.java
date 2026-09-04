package le;

import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b implements d {
    public final int a;
    public final d b;
    public final Interpolator c;
    public final long d;
    public float e;
    public boolean f;
    public e h;

    public b(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, e eVar) {
        if (this.e != f7) {
            this.e = f7;
            this.b.E(this.a, f7, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        b bVar;
        if (this.f == z10 && z11) {
            return;
        }
        this.f = z10;
        float f7 = z10 ? 1.0f : 0.0f;
        if (z11) {
            if (this.h == null) {
                bVar = this;
                bVar.h = new e(0, bVar, this.c, this.d, this.e);
            } else {
                bVar = this;
            }
            bVar.h.a(f7);
            return;
        }
        e eVar = this.h;
        if (eVar != null) {
            eVar.c(f7);
        }
        float f10 = this.e;
        if (f10 != f7) {
            int i10 = this.a;
            d dVar = this.b;
            if (f10 != f7) {
                this.e = f7;
                dVar.E(i10, f7, -1.0f, null);
            }
            dVar.z(f7, i10);
        }
    }

    @Override // le.d
    public final void z(float f7, int i10) {
        this.b.z(f7, this.a);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3) {
        this(i10, dVar, interpolator, j3, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j3, boolean z10) {
        this.a = i10;
        this.b = dVar;
        this.c = interpolator;
        this.d = j3;
        this.f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
