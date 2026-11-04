package ci;

import android.text.TextUtils;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ m3(l6 l6Var, String str, int i3) {
        this.a = i3;
        this.b = l6Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        String str = this.c;
        l6 l6Var = this.b;
        switch (i3) {
            case 0:
                long j10 = l6Var.Q1;
                l6Var.d2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    l6Var.dismiss();
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof wm) {
                            wm wmVar = (wm) Q;
                            if (wmVar.a() == j10) {
                                org.telegram.ui.Components.fc.a0(wmVar).I(R.raw.gift, bd.M0(2131745106, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131745104, org.telegram.messenger.m5.t(j10)))).k(true);
                                break;
                            }
                        }
                        hs f10 = hs.f(l6Var.a);
                        Long valueOf = Long.valueOf(j10);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        hs.f(l6Var.a).k(5, Long.valueOf(j10), bool);
                        wm ra2 = wm.ra(j10);
                        ra2.whenFullyVisible(new e0(8, l6Var, ra2));
                        Q.presentFragment(ra2);
                        break;
                    }
                } else {
                    l6Var.s2(0, true, null);
                    break;
                }
                break;
            case 1:
                sf.c.v(l6Var.getContext(), hp.s1(l6Var.a).H6 + str, false);
                break;
            case 2:
                sf.c.v(l6Var.getContext(), hp.s1(l6Var.a).H6 + str, false);
                break;
            case 3:
                sf.c.v(l6Var.getContext(), hp.s1(l6Var.a).H6 + str, false);
                break;
            case 4:
                sf.c.v(l6Var.getContext(), hp.s1(l6Var.a).H6 + str, false);
                break;
            case 5:
                sf.c.v(l6Var.getContext(), hp.s1(l6Var.a).H6 + str, false);
                break;
            case 6:
                sf.c.v(l6Var.getContext(), hp.s1(l6Var.a).H6 + str, false);
                break;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.ac k10 = l6Var.k().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                l6Var.dismiss();
                sf.c.t(l6Var.getContext(), "https://" + hp.s1(l6Var.a).V2 + "/" + str);
                break;
        }
    }
}
