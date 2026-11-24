// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class di3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;

    public /* synthetic */ di3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.getNotificationCenter().k(24, new Object[0]);
                break;
            case 1:
                nk3Var.i3();
                break;
            case 2:
                nk3Var.q5();
                break;
            case 3:
                nk3Var.L3();
                break;
            case 4:
                nk3Var.getMessagesController().p4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 5:
                hg5 hg5Var = nk3Var.r0;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                nk3Var.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 6:
                nk3Var.f0[0].d.f();
                break;
            case 7:
                SharedPreferences d1 = oc7.d1();
                long j = d1.getLong("cache_hint_period", 604800000L);
                if (j <= 604800000) {
                    j = 2592000000L;
                }
                d1.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j).putLong("cache_hint_period", j).apply();
                nk3Var.q5();
                break;
            case 8:
                UndoView w3 = nk3Var.w3();
                if (w3 != null) {
                    w3.l(0L, 15, null, new kh3(nk3Var, (byte) 17));
                    break;
                }
                break;
            case 9:
                nk3Var.u4();
                break;
            case 10:
                nk3Var.getClass();
                nk3Var.presentFragment(new UserInfoActivity());
                break;
            case 11:
                nk3Var.Q3();
                break;
            case 12:
                nk3Var.W3();
                break;
            case 13:
                bh0 bh0Var = new bh0();
                bh0Var.a = true;
                nk3Var.showAsSheet(new PrivacyControlActivity(11, false), bh0Var);
                break;
            case 14:
                nk3Var.U4(false, true);
                if (nk3Var.f0 != null) {
                    int i = 0;
                    while (true) {
                        mk3[] mk3VarArr = nk3Var.f0;
                        if (i >= mk3VarArr.length) {
                            break;
                        } else {
                            if (mk3VarArr[i].getVisibility() == 0) {
                                mk3 mk3Var = nk3Var.f0[i];
                                if (!mk3Var.d.H) {
                                    mk3Var.b(false);
                                }
                            }
                            i++;
                        }
                    }
                }
                break;
            case 15:
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", nk3Var.a3);
                nk3Var.presentFragment(new po2(bundle));
                break;
            case 16:
                nk3Var.presentFragment(new goc());
                break;
            case 17:
                nk3Var.f0[0].a.requestLayout();
                dj3 dj3Var = nk3Var.H3;
                sxb sxbVar = (dj3Var == null || !(dj3Var.getFragment() instanceof sxb)) ? null : (sxb) nk3Var.H3.getFragment();
                if (sxbVar != null) {
                    sxbVar.C0();
                }
                nk3Var.c3(false);
                nk3Var.o5();
                sj3 sj3Var = nk3Var.D0;
                if (sj3Var != null) {
                    sj3Var.invalidate();
                    break;
                }
                break;
            case 18:
                nk3Var.y5();
                break;
            default:
                u31.e();
                nk3Var.presentFragment(new SessionsActivity(0));
                break;
        }
    }
}
