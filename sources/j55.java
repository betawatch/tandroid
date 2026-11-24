// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class j55 {
    public final mk7 a;
    public final h55 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public bm3 h;

    public j55(mk7 mk7Var, h55 h55Var) {
        this.a = mk7Var;
        this.b = h55Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
