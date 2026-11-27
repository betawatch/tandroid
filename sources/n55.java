// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class n55 {
    public final sk7 a;
    public final l55 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public hl3 h;

    public n55(sk7 sk7Var, l55 l55Var) {
        this.a = sk7Var;
        this.b = l55Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
