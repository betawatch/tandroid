package m4;

import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class t {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final a0 a;

    public t(LaunchActivity launchActivity, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, ob.a aVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey("pip-media-session")) {
                throw new IllegalStateException("Session ID must be unique. ID=pip-media-session");
            }
            hashMap.put("pip-media-session", this);
        }
        this.a = new a0(this, launchActivity, b1Var, i0Var, i0Var2, i0Var3, aVar, bundle, bundle2, yVar);
    }

    public final void a(b2.b1 b1Var) {
        b1Var.getClass();
        e2.d.b(b1Var.Q());
        Looper y02 = b1Var.y0();
        a0 a0Var = this.a;
        e2.d.b(y02 == a0Var.t.a.y0());
        e2.d.g(b1Var.y0() == Looper.myLooper());
        j1 j1Var = a0Var.t;
        if (b1Var == j1Var.a) {
            return;
        }
        a0Var.u(j1Var, new j1(b1Var));
    }
}
