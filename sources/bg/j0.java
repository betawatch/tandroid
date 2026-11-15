package bg;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.xb;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ long c;

    public /* synthetic */ j0(long j3, an anVar) {
        this.a = 0;
        this.c = j3;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.c;
        an anVar = this.b;
        switch (i7) {
            case 0:
                anVar.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                break;
            case 1:
                an.z1(j3, anVar);
                break;
            case 2:
                anVar.getMessagesController().V2(0, j3, true);
                break;
            case 3:
                anVar.d6.put(j3, 0);
                p11 p11Var = anVar.g2;
                if (p11Var != null) {
                    p11Var.setAllTopicsHidden(false);
                }
                if (j3 == anVar.s4) {
                    anVar.D0.O(false);
                    break;
                }
                break;
            case 4:
                an anVar2 = this.b;
                xb v = cc.v(anVar2.getParentActivity(), anVar2, null, 1, this.c, 1, anVar2.getThemedColor(j6.wj), anVar2.getThemedColor(j6.yj), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 5:
                anVar.getClass();
                anVar.presentFragment(an.ua(j3));
                break;
            case 6:
                anVar.getClass();
                anVar.presentFragment(ProfileActivity.C4(j3));
                break;
            default:
                cc.a0(anVar).I(R.raw.stars_topup, hd.M0(2131745092, null), org.telegram.messenger.g0.X2(hd.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                break;
        }
    }

    public /* synthetic */ j0(an anVar, long j3, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = j3;
    }
}
