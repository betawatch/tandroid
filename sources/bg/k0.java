package bg;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.z11;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ long c;

    public /* synthetic */ k0(long j3, bn bnVar) {
        this.a = 0;
        this.c = j3;
        this.b = bnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        bn bnVar = this.b;
        switch (i7) {
            case 0:
                bnVar.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                break;
            case 1:
                bn.z1(j3, bnVar);
                break;
            case 2:
                bnVar.getMessagesController().b3(0, j3, true);
                break;
            case 3:
                bnVar.e6.put(j3, 0);
                z11 z11Var = bnVar.g2;
                if (z11Var != null) {
                    z11Var.setAllTopicsHidden(false);
                }
                if (j3 == bnVar.s4) {
                    bnVar.D0.O(false);
                    break;
                }
                break;
            case 4:
                bn bnVar2 = this.b;
                gc v = lc.v(bnVar2.getParentActivity(), bnVar2, null, 1, this.c, 1, bnVar2.getThemedColor(n6.wj), bnVar2.getThemedColor(n6.yj), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 5:
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(j3));
                break;
            case 6:
                bnVar.getClass();
                bnVar.presentFragment(ProfileActivity.D4(j3));
                break;
            default:
                lc.b0(bnVar).I(R.raw.stars_topup, gd.M0(2131744857, null), org.telegram.messenger.g0.W2(gd.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                break;
        }
    }

    public /* synthetic */ k0(bn bnVar, long j3, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = j3;
    }
}
