package o4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b8.zb;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class x {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final e0 a;

    public x(Context context, String str, d2.e1 e1Var, g9.i0 i0Var, g9.i0 i0Var2, g9.i0 i0Var3, kb.a aVar, Bundle bundle, Bundle bundle2, g2.e eVar, boolean z10, boolean z11) {
        synchronized (b) {
            HashMap hashMap = c;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.a = new e0(this, context, str, e1Var, i0Var, i0Var2, i0Var3, aVar, bundle, bundle2, eVar, z10, z11);
    }

    public final void a(d2.e1 e1Var) {
        e1Var.getClass();
        zb.f(e1Var.N());
        Looper B0 = e1Var.B0();
        e0 e0Var = this.a;
        zb.f(B0 == e0Var.t.a.B0());
        zb.p(e1Var.B0() == Looper.myLooper());
        l1 l1Var = e0Var.t;
        if (e1Var == l1Var.a) {
            return;
        }
        e0Var.u(l1Var, new l1(e1Var));
    }
}
