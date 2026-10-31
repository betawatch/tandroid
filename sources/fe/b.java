package fe;

import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements e {
    public final int a;
    public final e b;
    public final Interpolator c;
    public final long d;
    public float e;
    public boolean f;
    public f h;

    public b(View view, Interpolator interpolator, long j10) {
        this(0, new a(view), interpolator, j10, false);
    }

    @Override // fe.e
    public final void E(float f7, int i10) {
        this.b.E(f7, this.a);
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
                bVar.h = new f(0, bVar, this.c, this.d, this.e);
            } else {
                bVar = this;
            }
            bVar.h.a(f7);
            return;
        }
        f fVar = this.h;
        if (fVar != null) {
            fVar.c(f7);
        }
        float f10 = this.e;
        if (f10 != f7) {
            int i10 = this.a;
            e eVar = this.b;
            if (f10 != f7) {
                this.e = f7;
                eVar.v(i10, f7, -1.0f, null);
            }
            eVar.E(f7, i10);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, f fVar) {
        if (this.e != f7) {
            this.e = f7;
            this.b.v(this.a, f7, -1.0f, null);
        }
    }

    public b(int i10, e eVar, Interpolator interpolator, long j10) {
        this(i10, eVar, interpolator, j10, false);
    }

    public b(int i10, e eVar, Interpolator interpolator, long j10, boolean z10) {
        this.a = i10;
        this.b = eVar;
        this.c = interpolator;
        this.d = j10;
        this.f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
