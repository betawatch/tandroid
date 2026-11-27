// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
