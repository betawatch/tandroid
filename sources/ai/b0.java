package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sf;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ b0(p0 p0Var, int i7) {
        this.a = i7;
        this.b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                if (!p0Var.p() && (s0Var = p0Var.s) != null) {
                    s0Var.setShown(false);
                    break;
                }
                break;
            case 1:
                p0 p0Var2 = this.b;
                if (!p0Var2.p() && (s0Var2 = p0Var2.s) != null) {
                    s0Var2.e();
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
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                break;
            case 4:
                p0 p0Var3 = this.b;
                sf sfVar = p0Var3.f;
                String z10 = p0Var3.z();
                h0 h0Var = new h0(p0Var3, 0);
                sfVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = sfVar.a;
                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(chatActivityEnterView2.getContext(), chatActivityEnterView2.M4);
                n0Var.x1(z10);
                n0Var.f2 = h0Var;
                n0Var.show();
                break;
            case 5:
                gf gfVar2 = this.b.f.a.F0;
                if (gfVar2 != null) {
                    gfVar2.requestFocus();
                    break;
                }
                break;
            case 6:
                p0 p0Var4 = this.b;
                if (p0Var4.r == 3 && (s0Var3 = p0Var4.s) != null) {
                    s0Var3.e();
                    break;
                }
                break;
            case 7:
                p0 p0Var5 = this.b;
                int i7 = p0Var5.r;
                if (i7 == 3 || i7 == 4) {
                    p0Var5.w.setIsland(true);
                    break;
                }
                break;
            case 8:
                p0 p0Var6 = this.b;
                if (p0Var6.r == 1) {
                    p0Var6.M(true);
                    break;
                }
                break;
            case 9:
                p0 p0Var7 = this.b;
                if (p0Var7.r == 1) {
                    p0Var7.M(false);
                    break;
                }
                break;
            case 10:
                nr nrVar = nr.h;
                p0 p0Var8 = this.b;
                p0Var8.b(0.0f, 320L, nrVar);
                org.telegram.messenger.g0.h3(new b0(p0Var8, 1), 360L);
                break;
            default:
                p0 p0Var9 = this.b;
                if (!p0Var9.p()) {
                    p0Var9.f.a.M1(null, true);
                    p0Var9.b(0.0f, 240L, nr.g);
                    break;
                }
                break;
        }
    }
}
