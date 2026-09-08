package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e0 {
    public final h a;
    public final c0 b;
    public final d0 c;
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

    public e0(Context context) {
        DisplayManager displayManager;
        h hVar = new h();
        hVar.a = new g();
        hVar.b = new g();
        hVar.d = -9223372036854775807L;
        this.a = hVar;
        c0 c0Var = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new c0(this, displayManager);
        this.b = c0Var;
        this.c = c0Var != null ? d0.e : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static void a(e0 e0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            e0Var.k = refreshRate;
            e0Var.l = (refreshRate * 80) / 100;
        } else {
            e2.a.n("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            e0Var.k = -9223372036854775807L;
            e0Var.l = -9223372036854775807L;
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
                    f10 = 0.02f;
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
