package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class y {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final f0 a;

    public y(Context context, String str, b2.g1 g1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.a = new f0(this, context, str, g1Var, n0Var, n0Var2, n0Var3, aVar, bundle, bundle2, dVar, z10, z11);
    }

    public final void a(b2.g1 g1Var) {
        g1Var.getClass();
        u6.g(g1Var.P());
        Looper A0 = g1Var.A0();
        f0 f0Var = this.a;
        u6.g(A0 == f0Var.t.a.A0());
        u6.p(g1Var.A0() == Looper.myLooper());
        n1 n1Var = f0Var.t;
        if (g1Var == n1Var.a) {
            return;
        }
        f0Var.u(n1Var, new n1(g1Var));
    }
}
