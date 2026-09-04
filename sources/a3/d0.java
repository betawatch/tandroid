package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d0 {
    public final g a;
    public final b0 b;
    public final c0 c;
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

    public d0(Context context) {
        DisplayManager displayManager;
        g gVar = new g();
        gVar.a = new f();
        gVar.b = new f();
        gVar.d = -9223372036854775807L;
        this.a = gVar;
        b0 b0Var = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new b0(this, displayManager);
        this.b = b0Var;
        this.c = b0Var != null ? c0.e : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static void a(d0 d0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            d0Var.k = refreshRate;
            d0Var.l = (refreshRate * 80) / 100;
        } else {
            e2.a.n("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            d0Var.k = -9223372036854775807L;
            d0Var.l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        g0.f.v(surface, 0.0f);
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
        g gVar = this.a;
        if (!gVar.a.a()) {
            f7 = this.f;
        } else if (gVar.a.a()) {
            f7 = (float) (1.0E9d / (gVar.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f7 = -1.0f;
        }
        float f11 = this.g;
        if (f7 == f11) {
            return;
        }
        if (f7 != -1.0f && f11 != -1.0f) {
            if (gVar.a.a()) {
                if ((gVar.a.a() ? gVar.a.f : -9223372036854775807L) >= 5000000000L) {
                    f10 = 0.02f;
                    if (Math.abs(f7 - this.g) < f10) {
                        return;
                    }
                }
            }
            f10 = 1.0f;
            if (Math.abs(f7 - this.g) < f10) {
            }
        } else if (f7 == -1.0f && gVar.e < 30) {
            return;
        }
        this.g = f7;
        d(false);
    }

    public final void d(boolean z10) {
        Surface surface;
        float f7;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
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
                g0.f.v(surface, f7);
            }
        }
        f7 = 0.0f;
        if (z10) {
        }
        this.h = f7;
        g0.f.v(surface, f7);
    }
}
