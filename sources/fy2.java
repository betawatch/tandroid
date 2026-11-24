// default package

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fy2 {
    public static final c6e c = new c6e();
    public final vq7 a;
    public final AtomicReference b = new AtomicReference(null);

    public fy2(vq7 vq7Var) {
        this.a = vq7Var;
        vq7Var.a(new vu2(this, (byte) 1));
    }

    public final c6e a() {
        fy2 fy2Var = (fy2) this.b.get();
        return fy2Var == null ? c : fy2Var.a();
    }

    public final boolean b() {
        fy2 fy2Var = (fy2) this.b.get();
        return fy2Var != null && fy2Var.b();
    }

    public final boolean c() {
        fy2 fy2Var = (fy2) this.b.get();
        return fy2Var != null && fy2Var.c();
    }

    public final void d(String str, long j, ma0 ma0Var) {
        String h = b00.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h, null);
        }
        this.a.a(new hs0((Object) str, j, (Object) ma0Var, (byte) 1));
    }
}
