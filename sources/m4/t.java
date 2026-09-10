package m4;

import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class t {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final b0 a;

    public t(LaunchActivity launchActivity, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, of.b bVar) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey("pip-media-session")) {
                throw new IllegalStateException("Session ID must be unique. ID=pip-media-session");
            }
            hashMap.put("pip-media-session", this);
        }
        this.a = new b0(this, launchActivity, b1Var, i0Var, i0Var2, i0Var3, dVar, bundle, bundle2, bVar);
    }

    public final void a(b2.b1 b1Var) {
        b1Var.getClass();
        e2.d.b(b1Var.Q());
        Looper y02 = b1Var.y0();
        b0 b0Var = this.a;
        e2.d.b(y02 == b0Var.t.a.y0());
        e2.d.g(b1Var.y0() == Looper.myLooper());
        l1 l1Var = b0Var.t;
        if (b1Var == l1Var.a) {
            return;
        }
        b0Var.u(l1Var, new l1(b1Var));
    }
}
