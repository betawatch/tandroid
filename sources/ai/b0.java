package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ b0(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q0 q0Var;
        q0 q0Var2;
        q0 q0Var3;
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                if (!n0Var.o() && (q0Var = n0Var.s) != null) {
                    q0Var.setShown(false);
                    break;
                }
                break;
            case 1:
                n0 n0Var2 = this.b;
                if (!n0Var2.o() && (q0Var2 = n0Var2.s) != null) {
                    q0Var2.e();
                    break;
                }
                break;
            case 2:
                gf gfVar = this.b.f.a.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b.f.a;
                chatActivityEnterView.E1 = 0L;
                chatActivityEnterView.F1 = null;
                break;
            case 4:
                n0 n0Var3 = this.b;
                qf qfVar = n0Var3.f;
                String y10 = n0Var3.y();
                g0 g0Var = new g0(n0Var3, 0);
                qfVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = qfVar.a;
                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(chatActivityEnterView2.getContext(), chatActivityEnterView2.K4);
                m0Var.x1(y10);
                m0Var.f2 = g0Var;
                m0Var.show();
                break;
            case 5:
                gf gfVar2 = this.b.f.a.F0;
                if (gfVar2 != null) {
                    gfVar2.requestFocus();
                    break;
                }
                break;
            case 6:
                n0 n0Var4 = this.b;
                if (n0Var4.r == 3 && (q0Var3 = n0Var4.s) != null) {
                    q0Var3.e();
                    break;
                }
                break;
            case 7:
                n0 n0Var5 = this.b;
                int i7 = n0Var5.r;
                if (i7 == 3 || i7 == 4) {
                    n0Var5.w.setIsland(true);
                    break;
                }
                break;
            case 8:
                n0 n0Var6 = this.b;
                if (n0Var6.r == 1) {
                    n0Var6.J(true);
                    break;
                }
                break;
            case 9:
                n0 n0Var7 = this.b;
                if (n0Var7.r == 1) {
                    n0Var7.J(false);
                    break;
                }
                break;
            case 10:
                lr lrVar = lr.h;
                n0 n0Var8 = this.b;
                n0Var8.b(0.0f, 320L, lrVar);
                org.telegram.messenger.g0.h3(new b0(n0Var8, 1), 360L);
                break;
            default:
                n0 n0Var9 = this.b;
                if (!n0Var9.o()) {
                    n0Var9.f.a.I1(null, true);
                    n0Var9.b(0.0f, 240L, lr.g);
                    break;
                }
                break;
        }
    }
}
