package bg;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.m11;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                an.v1(j3, anVar);
                break;
            case 2:
                anVar.getMessagesController().V2(0, j3, true);
                break;
            case 3:
                anVar.c6.put(j3, 0);
                m11 m11Var = anVar.f2;
                if (m11Var != null) {
                    m11Var.setAllTopicsHidden(false);
                }
                if (j3 == anVar.r4) {
                    anVar.C0.O(false);
                    break;
                }
                break;
            case 4:
                an anVar2 = this.b;
                cc v = hc.v(anVar2.getParentActivity(), anVar2, null, 1, this.c, 1, anVar2.getThemedColor(k6.tj), anVar2.getThemedColor(k6.vj), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 5:
                anVar.getClass();
                anVar.presentFragment(an.ra(j3));
                break;
            case 6:
                anVar.getClass();
                anVar.presentFragment(ProfileActivity.A4(j3));
                break;
            default:
                hc.a0(anVar).I(R.raw.stars_topup, id.M0(2131745095, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                break;
        }
    }

    public /* synthetic */ j0(an anVar, long j3, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = j3;
    }
}
