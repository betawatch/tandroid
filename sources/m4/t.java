package m4;

import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class t {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final a0 a;

    public t(LaunchActivity launchActivity, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey("pip-media-session")) {
                throw new IllegalStateException("Session ID must be unique. ID=pip-media-session");
            }
            hashMap.put("pip-media-session", this);
        }
        this.a = new a0(this, launchActivity, b1Var, i0Var, i0Var2, i0Var3, dVar, bundle, bundle2, yVar);
    }

    public final void a(b2.b1 b1Var) {
        b1Var.getClass();
        e2.d.b(b1Var.Q());
        Looper y02 = b1Var.y0();
        a0 a0Var = this.a;
        e2.d.b(y02 == a0Var.t.a.y0());
        e2.d.g(b1Var.y0() == Looper.myLooper());
        k1 k1Var = a0Var.t;
        if (b1Var == k1Var.a) {
            return;
        }
        a0Var.u(k1Var, new k1(b1Var));
    }
}
