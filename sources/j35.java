// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class j35 {
    public final ki7 a;
    public final h35 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public sm3 h;

    public j35(ki7 ki7Var, h35 h35Var) {
        this.a = ki7Var;
        this.b = h35Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
