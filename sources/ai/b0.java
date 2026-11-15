package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xe;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                if (!n0Var.k() && (q0Var = n0Var.s) != null) {
                    q0Var.setShown(false);
                    break;
                }
                break;
            case 1:
                n0 n0Var2 = this.b;
                if (!n0Var2.k() && (q0Var2 = n0Var2.s) != null) {
                    q0Var2.e();
                    break;
                }
                break;
            case 2:
                xe xeVar = this.b.f.b.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b.f.b;
                chatActivityEnterView.y1 = 0L;
                chatActivityEnterView.z1 = null;
                break;
            case 4:
                n0 n0Var3 = this.b;
                ae aeVar = n0Var3.f;
                String t6 = n0Var3.t();
                g0 g0Var = new g0(n0Var3, 0);
                aeVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = aeVar.b;
                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(chatActivityEnterView2.getContext(), chatActivityEnterView2.E4);
                d0Var.s1(t6);
                d0Var.f2 = g0Var;
                d0Var.show();
                break;
            case 5:
                xe xeVar2 = this.b.f.b.F0;
                if (xeVar2 != null) {
                    xeVar2.requestFocus();
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
                    n0Var6.B(true);
                    break;
                }
                break;
            case 9:
                n0 n0Var7 = this.b;
                if (n0Var7.r == 1) {
                    n0Var7.B(false);
                    break;
                }
                break;
            case 10:
                er erVar = er.h;
                n0 n0Var8 = this.b;
                n0Var8.b(0.0f, 320L, erVar);
                org.telegram.messenger.g0.i3(new b0(n0Var8, 1), 360L);
                break;
            default:
                n0 n0Var9 = this.b;
                if (!n0Var9.k()) {
                    n0Var9.f.b.A1(null, true);
                    n0Var9.b(0.0f, 240L, er.g);
                    break;
                }
                break;
        }
    }
}
