package m4;

import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        e1 e1Var = a0Var.t;
        if (b1Var == e1Var.a) {
            return;
        }
        a0Var.u(e1Var, new e1(b1Var));
    }
}
