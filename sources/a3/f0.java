package a3;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class f0 {
    public final h a;
    public final Context b;
    public c0 c;
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

    public f0(Context context) {
        this.b = context;
        h hVar = new h();
        hVar.a = new g();
        hVar.b = new g();
        hVar.d = -9223372036854775807L;
        this.a = hVar;
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
        float f7;
        float f10;
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        h hVar = this.a;
        if (!hVar.a.a()) {
            f7 = this.f;
        } else if (hVar.a.a()) {
            f7 = (float) (1.0E9d / (hVar.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f7 = -1.0f;
        }
        float f11 = this.g;
        if (f7 == f11) {
            return;
        }
        if (f7 != -1.0f && f11 != -1.0f) {
            if (hVar.a.a()) {
                if ((hVar.a.a() ? hVar.a.f : -9223372036854775807L) >= 5000000000L) {
                    f10 = 0.1f;
                    if (Math.abs(f7 - this.g) < f10) {
                        return;
                    }
                }
            }
            f10 = 1.0f;
            if (Math.abs(f7 - this.g) < f10) {
            }
        } else if (f7 == -1.0f && hVar.e < 30) {
            return;
        }
        this.g = f7;
        d(false);
    }

    public final void d(boolean z10) {
        Surface surface;
        float f7;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.d) {
            float f10 = this.g;
            if (f10 != -1.0f) {
                f7 = f10 * this.i;
                if (z10 && this.h == f7) {
                    return;
                }
                this.h = f7;
                g0.f.v(this.e, f7);
            }
        }
        f7 = 0.0f;
        if (z10) {
        }
        this.h = f7;
        g0.f.v(this.e, f7);
    }
}
