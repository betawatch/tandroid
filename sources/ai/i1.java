package ai;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ i1(t1 t1Var, String str, int i10) {
        this.a = i10;
        this.b = t1Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        g gVar = (g) obj;
        switch (this.a) {
            case 0:
                t1 t1Var = this.b;
                if (TextUtils.equals(t1Var.d, this.c)) {
                    boolean z10 = t1Var.t0 == null;
                    t1Var.t0 = gVar;
                    if (!t1Var.v0) {
                        if (!z10) {
                            t1Var.j1(gVar);
                            break;
                        } else {
                            t1Var.s0.a(gVar);
                            t1Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                t1 t1Var2 = this.b;
                if (TextUtils.equals(t1Var2.e, this.c)) {
                    t1Var2.u0 = gVar;
                    if (t1Var2.v0 && t1Var2.w0 && t1Var2.A0) {
                        t1Var2.A0 = false;
                        t1Var2.z0 = System.currentTimeMillis() + 60000;
                        t1Var2.A2 = -1;
                    }
                    if (t1Var2.v0) {
                        t1Var2.j1(gVar);
                        break;
                    }
                }
                break;
        }
    }
}
