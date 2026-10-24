package ne;

import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b implements d {
    public final int a;
    public final d b;
    public final Interpolator c;
    public final long d;
    public float e;
    public boolean f;
    public e h;

    public b(View view, Interpolator interpolator, long j10) {
        this(0, new a(view), interpolator, j10, false);
    }

    @Override // ne.d
    public final void H(float f7, int i10) {
        this.b.H(f7, this.a);
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
                dVar.o(i10, f7, -1.0f, null);
            }
            dVar.H(f7, i10);
        }
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, e eVar) {
        if (this.e != f7) {
            this.e = f7;
            this.b.o(this.a, f7, -1.0f, null);
        }
    }

    public b(int i10, d dVar, Interpolator interpolator, long j10) {
        this(i10, dVar, interpolator, j10, false);
    }

    public b(int i10, d dVar, Interpolator interpolator, long j10, boolean z10) {
        this.a = i10;
        this.b = dVar;
        this.c = interpolator;
        this.d = j10;
        this.f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
