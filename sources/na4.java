// default package

import android.os.SystemClock;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class na4 {
    public final y94 a;
    public ha4 b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public e g;

    public na4(su3 su3Var, y94 y94Var) {
        this.a = y94Var;
    }

    public final void a(ha4 ha4Var, boolean z, boolean z2) {
        b();
        this.b = ha4Var;
        this.c = SystemClock.uptimeMillis();
        this.d = z;
        this.e = z && z2;
        this.g = null;
        this.f = true;
    }

    public final void b() {
        ha4 ha4Var = this.b;
        if (ha4Var != null) {
            this.b = null;
            Integer valueOf = this.e ? Integer.valueOf((int) (SystemClock.uptimeMillis() - this.c)) : null;
            String str = this.a.b;
            if (ha4Var == ea4.h) {
                ea4.h = null;
            }
            ha4Var.i = valueOf;
            if (str != null) {
                ea4.e.postRunnable(new x94(str, ha4Var, (byte) 0));
            }
        }
    }

    public final void c(boolean z, boolean z2, boolean z3, e eVar) {
        boolean z4 = false;
        boolean z5 = this.b != null && SystemClock.uptimeMillis() - this.c >= 3600000;
        ha4 ha4Var = this.b;
        if (ha4Var != null && (!z || z5)) {
            this.e = true;
        }
        if (ha4Var != null && !z && this.g == null) {
            this.g = eVar;
        }
        e eVar2 = this.g;
        if (eVar2 != null && eVar != eVar2) {
            z4 = true;
        }
        if (ha4Var != null && this.e && (z5 || (!this.d ? !((!z2 || this.f) && !z4) : !z3))) {
            b();
        }
        this.f = z2;
    }

    public final void d(long j) {
        if (this.b != null) {
            if (!(this.d && this.e) && j >= this.c + 1000) {
                b();
            }
        }
    }
}
