package mg;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.wb;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ long c;

    public /* synthetic */ t0(long j10, un unVar) {
        this.a = 7;
        this.c = j10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        un unVar = this.b;
        long j10 = this.c;
        switch (i10) {
            case 0:
                cc.a0(unVar).I(R.raw.stars_topup, dd.L0(2131745110, null), org.telegram.messenger.i0.W2(dd.H(',', "StarsGiveawaySentPopupInfo", (int) j10))).k(true);
                break;
            case 1:
                un.s1(j10, unVar);
                break;
            case 2:
                unVar.getMessagesController().T2(0, j10, true);
                break;
            case 3:
                un unVar2 = this.b;
                wb v = cc.v(unVar2.getParentActivity(), unVar2, null, 1, this.c, 1, unVar2.getThemedColor(t6.tj), unVar2.getThemedColor(t6.vj), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 4:
                unVar.c6.put(j10, 0);
                p21 p21Var = unVar.f2;
                if (p21Var != null) {
                    p21Var.setAllTopicsHidden(false);
                }
                if (j10 == unVar.r4) {
                    unVar.C0.O(false);
                    break;
                }
                break;
            case 5:
                unVar.getClass();
                unVar.presentFragment(un.ma(j10));
                break;
            case 6:
                unVar.getClass();
                unVar.presentFragment(ProfileActivity.A4(j10));
                break;
            default:
                unVar.presentFragment(new ProfileActivity(org.telegram.ui.Cells.f1.k(j10, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ t0(un unVar, long j10, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = j10;
    }
}
