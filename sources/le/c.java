package le;

import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class c implements e {
    public final int a;
    public final e b;
    public final Interpolator c;
    public final long d;
    public float e;
    public boolean f;
    public f h;

    public c(View view, Interpolator interpolator, long j3) {
        this(0, new a(view), interpolator, j3, false);
    }

    @Override // le.e
    public final void C(float f7, int i10) {
        this.b.C(f7, this.a);
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, f fVar) {
        if (this.e != f7) {
            this.e = f7;
            this.b.D(this.a, f7, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        c cVar;
        if (this.f == z10 && z11) {
            return;
        }
        this.f = z10;
        float f7 = z10 ? 1.0f : 0.0f;
        if (z11) {
            if (this.h == null) {
                cVar = this;
                cVar.h = new f(0, cVar, this.c, this.d, this.e);
            } else {
                cVar = this;
            }
            cVar.h.a(f7);
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
                eVar.D(i10, f7, -1.0f, null);
            }
            eVar.C(f7, i10);
        }
    }

    public c(int i10, e eVar, Interpolator interpolator, long j3) {
        this(i10, eVar, interpolator, j3, false);
    }

    public c(int i10, e eVar, Interpolator interpolator, long j3, boolean z10) {
        this.a = i10;
        this.b = eVar;
        this.c = interpolator;
        this.d = j3;
        this.f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
