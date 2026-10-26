package m4;

import a8.yb;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class y {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final f0 a;

    public y(Context context, String str, b2.g1 g1Var, f9.i0 i0Var, f9.i0 i0Var2, f9.i0 i0Var3, qb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.a = new f0(this, context, str, g1Var, i0Var, i0Var2, i0Var3, aVar, bundle, bundle2, dVar, z10, z11);
    }

    public final void a(b2.g1 g1Var) {
        g1Var.getClass();
        yb.g(g1Var.P());
        Looper A0 = g1Var.A0();
        f0 f0Var = this.a;
        yb.g(A0 == f0Var.t.a.A0());
        yb.p(g1Var.A0() == Looper.myLooper());
        n1 n1Var = f0Var.t;
        if (g1Var == n1Var.a) {
            return;
        }
        f0Var.u(n1Var, new n1(g1Var));
    }
}
