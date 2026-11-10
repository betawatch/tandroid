package bg;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.m11;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                m11 m11Var = cnVar.f2;
                if (m11Var != null) {
                    m11Var.setAllTopicsHidden(false);
                }
                if (j3 == cnVar.r4) {
                    cnVar.C0.O(false);
                    break;
                }
                break;
            case 4:
                cn cnVar2 = this.b;
                bc v = gc.v(cnVar2.getParentActivity(), cnVar2, null, 1, this.c, 1, cnVar2.getThemedColor(m6.tj), cnVar2.getThemedColor(m6.vj), 5000, true, null);
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
                gc.a0(cnVar).I(R.raw.stars_topup, id.M0(2131745092, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) j3))).k(true);
                break;
        }
    }

    public /* synthetic */ j0(cn cnVar, long j3, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = j3;
    }
}
