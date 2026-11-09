package bg;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.n11;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ long c;

    public /* synthetic */ j0(long j3, cn cnVar) {
        this.a = 0;
        this.c = j3;
        this.b = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        cn cnVar = this.b;
        switch (i7) {
            case 0:
                cnVar.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                break;
            case 1:
                cn.z1(j3, cnVar);
                break;
            case 2:
                cnVar.getMessagesController().V2(0, j3, true);
                break;
            case 3:
                cnVar.c6.put(j3, 0);
                n11 n11Var = cnVar.f2;
                if (n11Var != null) {
                    n11Var.setAllTopicsHidden(false);
                }
                if (j3 == cnVar.r4) {
                    cnVar.C0.O(false);
                    break;
                }
                break;
            case 4:
                cn cnVar2 = this.b;
                cc v = hc.v(cnVar2.getParentActivity(), cnVar2, null, 1, this.c, 1, cnVar2.getThemedColor(l6.tj), cnVar2.getThemedColor(l6.vj), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 5:
                cnVar.getClass();
                cnVar.presentFragment(cn.ta(j3));
                break;
            case 6:
                cnVar.getClass();
                cnVar.presentFragment(ProfileActivity.D4(j3));
                break;
            default:
                hc.a0(cnVar).I(R.raw.stars_topup, id.M0(2131745092, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                break;
        }
    }

    public /* synthetic */ j0(cn cnVar, long j3, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = j3;
    }
}
