package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class x {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final e0 a;

    public x(Context context, String str, b2.g1 g1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.a = new e0(this, context, str, g1Var, n0Var, n0Var2, n0Var3, aVar, bundle, bundle2, dVar, z10, z11);
    }

    public final void a(b2.g1 g1Var) {
        g1Var.getClass();
        u6.g(g1Var.P());
        Looper A0 = g1Var.A0();
        e0 e0Var = this.a;
        u6.g(A0 == e0Var.t.a.A0());
        u6.p(g1Var.A0() == Looper.myLooper());
        m1 m1Var = e0Var.t;
        if (g1Var == m1Var.a) {
            return;
        }
        e0Var.u(m1Var, new m1(g1Var));
    }
}
