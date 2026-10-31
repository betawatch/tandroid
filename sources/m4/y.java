package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class y {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final f0 a;

    public y(Context context, String str, b2.f1 f1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, oa.d dVar, Bundle bundle, Bundle bundle2, e2.d dVar2, boolean z10, boolean z11) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.a = new f0(this, context, str, f1Var, n0Var, n0Var2, n0Var3, dVar, bundle, bundle2, dVar2, z10, z11);
    }

    public final void a(b2.f1 f1Var) {
        f1Var.getClass();
        t6.f(f1Var.O());
        Looper A0 = f1Var.A0();
        f0 f0Var = this.a;
        t6.f(A0 == f0Var.t.a.A0());
        t6.p(f1Var.A0() == Looper.myLooper());
        n1 n1Var = f0Var.t;
        if (f1Var == n1Var.a) {
            return;
        }
        f0Var.u(n1Var, new n1(f1Var));
    }
}
