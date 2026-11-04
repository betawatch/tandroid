package cg;

import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g11;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ long c;

    public /* synthetic */ i0(long j10, wm wmVar) {
        this.a = 0;
        this.c = j10;
        this.b = wmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.c;
        wm wmVar = this.b;
        switch (i3) {
            case 0:
                wmVar.presentFragment(new ProfileActivity(a1.g.j(j10, "user_id"), null));
                break;
            case 1:
                wm.v1(j10, wmVar);
                break;
            case 2:
                wmVar.getMessagesController().V2(0, j10, true);
                break;
            case 3:
                wmVar.d6.put(j10, 0);
                g11 g11Var = wmVar.g2;
                if (g11Var != null) {
                    g11Var.setAllTopicsHidden(false);
                }
                if (j10 == wmVar.s4) {
                    wmVar.D0.O(false);
                    break;
                }
                break;
            case 4:
                wm wmVar2 = this.b;
                ac v = fc.v(wmVar2.getParentActivity(), wmVar2, null, 1, this.c, 1, wmVar2.getThemedColor(k6.tj), wmVar2.getThemedColor(k6.vj), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 5:
                wmVar.getClass();
                wmVar.presentFragment(wm.ra(j10));
                break;
            case 6:
                wmVar.getClass();
                wmVar.presentFragment(ProfileActivity.A4(j10));
                break;
            default:
                fc.a0(wmVar).I(R.raw.stars_topup, bd.M0(2131745102, null), org.telegram.messenger.g0.X2(bd.H(',', "StarsGiveawaySentPopupInfo", (int) j10))).k(true);
                break;
        }
    }

    public /* synthetic */ i0(wm wmVar, long j10, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = j10;
    }
}
