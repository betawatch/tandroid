package ai;

import android.text.TextUtils;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ b1(l1 l1Var, String str, int i7) {
        this.a = i7;
        this.b = l1Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        g gVar = (g) obj;
        switch (this.a) {
            case 0:
                l1 l1Var = this.b;
                if (TextUtils.equals(l1Var.d, this.c)) {
                    boolean z9 = l1Var.t0 == null;
                    l1Var.t0 = gVar;
                    if (!l1Var.v0) {
                        if (!z9) {
                            l1Var.j1(gVar);
                            break;
                        } else {
                            l1Var.s0.a(gVar);
                            l1Var.invalidate();
                            break;
                        }
                    }
                }
                break;
            default:
                l1 l1Var2 = this.b;
                if (TextUtils.equals(l1Var2.e, this.c)) {
                    l1Var2.u0 = gVar;
                    if (l1Var2.v0 && l1Var2.w0 && l1Var2.A0) {
                        l1Var2.A0 = false;
                        l1Var2.z0 = System.currentTimeMillis() + 60000;
                        l1Var2.A2 = -1;
                    }
                    if (l1Var2.v0) {
                        l1Var2.j1(gVar);
                        break;
                    }
                }
                break;
        }
    }
}
