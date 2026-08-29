package g5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import f5.d0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                    pVar = new m5.i(windowManager, 15);
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
        float f9;
        float f10;
        if (d0.a < 30 || this.e == null) {
            return;
        }
        e eVar = this.a;
        if (!eVar.a.a()) {
            f9 = this.f;
        } else if (eVar.a.a()) {
            f9 = (float) (1.0E9d / (eVar.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f9 = -1.0f;
        }
        float f11 = this.g;
        if (f9 == f11) {
            return;
        }
        if (f9 != -1.0f && f11 != -1.0f) {
            if (eVar.a.a()) {
                if ((eVar.a.a() ? eVar.a.f : -9223372036854775807L) >= 5000000000L) {
                    f10 = 0.02f;
                    if (Math.abs(f9 - this.g) < f10) {
                        return;
                    }
                }
            }
            f10 = 1.0f;
            if (Math.abs(f9 - this.g) < f10) {
            }
        } else if (f9 == -1.0f && eVar.e < 30) {
            return;
        }
        this.g = f9;
        c(false);
    }

    public final void c(boolean z10) {
        Surface surface;
        float f9;
        if (d0.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f10 = this.g;
            if (f10 != -1.0f) {
                f9 = f10 * this.i;
                if (z10 && this.h == f9) {
                    return;
                }
                this.h = f9;
                o.a(surface, f9);
            }
        }
        f9 = 0.0f;
        if (z10) {
        }
        this.h = f9;
        o.a(surface, f9);
    }
}
