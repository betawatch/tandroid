package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rf;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ x(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0 o0Var;
        o0 o0Var2;
        o0 o0Var3;
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                if (!l0Var.n() && (o0Var = l0Var.s) != null) {
                    o0Var.setShown(false);
                    break;
                }
                break;
            case 1:
                l0 l0Var2 = this.b;
                if (!l0Var2.n() && (o0Var2 = l0Var2.s) != null) {
                    o0Var2.e();
                    break;
                }
                break;
            case 2:
                hf hfVar = this.b.f.a.F0;
                if (hfVar != null) {
                    hfVar.requestFocus();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b.f.a;
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                break;
            case 4:
                l0 l0Var3 = this.b;
                rf rfVar = l0Var3.f;
                String x10 = l0Var3.x();
                d0 d0Var = new d0(l0Var3, 0);
                rfVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = rfVar.a;
                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(chatActivityEnterView2.getContext(), chatActivityEnterView2.M4);
                m0Var.x1(x10);
                m0Var.f2 = d0Var;
                m0Var.show();
                break;
            case 5:
                hf hfVar2 = this.b.f.a.F0;
                if (hfVar2 != null) {
                    hfVar2.requestFocus();
                    break;
                }
                break;
            case 6:
                l0 l0Var4 = this.b;
                if (l0Var4.r == 3 && (o0Var3 = l0Var4.s) != null) {
                    o0Var3.e();
                    break;
                }
                break;
            case 7:
                l0 l0Var5 = this.b;
                int i7 = l0Var5.r;
                if (i7 == 3 || i7 == 4) {
                    l0Var5.w.setIsland(true);
                    break;
                }
                break;
            case 8:
                l0 l0Var6 = this.b;
                if (l0Var6.r == 1) {
                    l0Var6.K(true);
                    break;
                }
                break;
            case 9:
                l0 l0Var7 = this.b;
                if (l0Var7.r == 1) {
                    l0Var7.K(false);
                    break;
                }
                break;
            case 10:
                kr krVar = kr.h;
                l0 l0Var8 = this.b;
                l0Var8.b(0.0f, 320L, krVar);
                org.telegram.messenger.g0.h3(new x(l0Var8, 1), 360L);
                break;
            default:
                l0 l0Var9 = this.b;
                if (!l0Var9.n()) {
                    l0Var9.f.a.N1(null, true);
                    l0Var9.b(0.0f, 240L, kr.g);
                    break;
                }
                break;
        }
    }
}
