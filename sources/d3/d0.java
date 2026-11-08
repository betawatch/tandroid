package d3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d0 {
    public final g a;
    public final Context b;
    public a0 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;

    public d0(Context context) {
        this.b = context;
        g gVar = new g();
        gVar.a = new f();
        gVar.b = new f();
        gVar.d = -9223372036854775807L;
        this.a = gVar;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f || !surface.isValid()) {
            return;
        }
        this.h = 0.0f;
        g0.f.v(this.e, 0.0f);
    }

    public final void b() {
        this.m = 0L;
        this.q = -1L;
        this.n = -1L;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        float f10;
        float f11;
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        g gVar = this.a;
        if (!gVar.a.a()) {
            f10 = this.f;
        } else if (gVar.a.a()) {
            f10 = (float) (1.0E9d / (gVar.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f12 = this.g;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (gVar.a.a()) {
                if ((gVar.a.a() ? gVar.a.f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.1f;
                    if (Math.abs(f10 - this.g) < f11) {
                        return;
                    }
                }
            }
            f11 = 1.0f;
            if (Math.abs(f10 - this.g) < f11) {
            }
        } else if (f10 == -1.0f && gVar.e < 30) {
            return;
        }
        this.g = f10;
        d(false);
    }

    public final void d(boolean z9) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.d) {
            float f11 = this.g;
            if (f11 != -1.0f) {
                f10 = f11 * this.i;
                if (z9 && this.h == f10) {
                    return;
                }
                this.h = f10;
                g0.f.v(this.e, f10);
            }
        }
        f10 = 0.0f;
        if (z9) {
        }
        this.h = f10;
        g0.f.v(this.e, f10);
    }
}
