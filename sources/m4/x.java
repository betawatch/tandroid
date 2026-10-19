package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.HashMap;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class x {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final f0 a;

    public x(Context context, String str, b2.f1 f1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.a = new f0(this, context, str, f1Var, n0Var, n0Var2, n0Var3, aVar, bundle, bundle2, dVar, z10, z11);
    }

    public final void a(b2.f1 f1Var) {
        f1Var.getClass();
        u6.g(f1Var.P());
        Looper A0 = f1Var.A0();
        f0 f0Var = this.a;
        u6.g(A0 == f0Var.t.a.A0());
        u6.p(f1Var.A0() == Looper.myLooper());
        m1 m1Var = f0Var.t;
        if (f1Var == m1Var.a) {
            return;
        }
        f0Var.u(m1Var, new m1(f1Var));
    }
}
