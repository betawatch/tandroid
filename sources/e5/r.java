package e5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r {
    public final d a;
    public final o b;
    public final q c;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Context context) {
        o oVar;
        DisplayManager displayManager;
        d dVar = new d();
        dVar.a = new c();
        dVar.b = new c();
        dVar.d = -9223372036854775807L;
        this.a = dVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            oVar = (g0.a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new p(displayManager);
            if (oVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    oVar = new k5.i(windowManager, 12);
                }
            }
            this.b = oVar;
            this.c = oVar != null ? q.e : null;
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
            this.f = -1.0f;
            this.i = 1.0f;
            this.j = 0;
        }
        oVar = null;
        this.b = oVar;
        this.c = oVar != null ? q.e : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (g0.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        n.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f10;
        float f11;
        if (g0.a < 30 || this.e == null) {
            return;
        }
        d dVar = this.a;
        if (!dVar.a.a()) {
            f10 = this.f;
        } else if (dVar.a.a()) {
            f10 = (float) (1.0E9d / (dVar.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f12 = this.g;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (dVar.a.a()) {
                if ((dVar.a.a() ? dVar.a.f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.02f;
                    if (Math.abs(f10 - this.g) < f11) {
                        return;
                    }
                }
            }
            f11 = 1.0f;
            if (Math.abs(f10 - this.g) < f11) {
            }
        } else if (f10 == -1.0f && dVar.e < 30) {
            return;
        }
        this.g = f10;
        c(false);
    }

    public final void c(boolean z10) {
        Surface surface;
        float f10;
        if (g0.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f11 = this.g;
            if (f11 != -1.0f) {
                f10 = f11 * this.i;
                if (z10 && this.h == f10) {
                    return;
                }
                this.h = f10;
                n.a(surface, f10);
            }
        }
        f10 = 0.0f;
        if (z10) {
        }
        this.h = f10;
        n.a(surface, f10);
    }
}
