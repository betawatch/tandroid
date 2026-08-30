package i5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import h5.d0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class s {
    public final e a;
    public final p b;
    public final r c;
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
    public s(Context context) {
        p pVar;
        DisplayManager displayManager;
        e eVar = new e();
        eVar.a = new d();
        eVar.b = new d();
        eVar.d = -9223372036854775807L;
        this.a = eVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            pVar = (d0.a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new q(displayManager);
            if (pVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    pVar = new a3.c(windowManager, 18);
                }
            }
            this.b = pVar;
            this.c = pVar != null ? r.e : null;
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
            this.f = -1.0f;
            this.i = 1.0f;
            this.j = 0;
        }
        pVar = null;
        this.b = pVar;
        this.c = pVar != null ? r.e : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (d0.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        o.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f10;
        float f11;
        if (d0.a < 30 || this.e == null) {
            return;
        }
        e eVar = this.a;
        if (!eVar.a.a()) {
            f10 = this.f;
        } else if (eVar.a.a()) {
            f10 = (float) (1.0E9d / (eVar.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f12 = this.g;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (eVar.a.a()) {
                if ((eVar.a.a() ? eVar.a.f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.02f;
                    if (Math.abs(f10 - this.g) < f11) {
                        return;
                    }
                }
            }
            f11 = 1.0f;
            if (Math.abs(f10 - this.g) < f11) {
            }
        } else if (f10 == -1.0f && eVar.e < 30) {
            return;
        }
        this.g = f10;
        c(false);
    }

    public final void c(boolean z4) {
        Surface surface;
        float f10;
        if (d0.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f11 = this.g;
            if (f11 != -1.0f) {
                f10 = f11 * this.i;
                if (z4 && this.h == f10) {
                    return;
                }
                this.h = f10;
                o.a(surface, f10);
            }
        }
        f10 = 0.0f;
        if (z4) {
        }
        this.h = f10;
        o.a(surface, f10);
    }
}
