package di;

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ d3(c6 c6Var, String str, int i7) {
        this.a = i7;
        this.b = c6Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.c;
        c6 c6Var = this.b;
        switch (i7) {
            case 0:
                long j3 = c6Var.T1;
                c6Var.g2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    c6Var.dismiss();
                    org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof an) {
                            an anVar = (an) Q;
                            if (anVar.a() == j3) {
                                org.telegram.ui.Components.cc.a0(anVar).I(R.raw.gift, hd.M0(2131745096, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131745094, org.telegram.messenger.m5.t(j3)))).k(true);
                                break;
                            }
                        }
                        ns f10 = ns.f(c6Var.a);
                        Long valueOf = Long.valueOf(j3);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        ns.f(c6Var.a).k(5, Long.valueOf(j3), bool);
                        an ua2 = an.ua(j3);
                        ua2.whenFullyVisible(new s2(3, c6Var, ua2));
                        Q.presentFragment(ua2);
                        break;
                    }
                } else {
                    c6Var.t2(0, true, null);
                    break;
                }
                break;
            case 1:
                vf.c.v(c6Var.getContext(), np.s1(c6Var.a).I6 + str, false);
                break;
            case 2:
                vf.c.v(c6Var.getContext(), np.s1(c6Var.a).I6 + str, false);
                break;
            case 3:
                vf.c.v(c6Var.getContext(), np.s1(c6Var.a).I6 + str, false);
                break;
            case 4:
                vf.c.v(c6Var.getContext(), np.s1(c6Var.a).I6 + str, false);
                break;
            case 5:
                vf.c.v(c6Var.getContext(), np.s1(c6Var.a).I6 + str, false);
                break;
            case 6:
                vf.c.v(c6Var.getContext(), np.s1(c6Var.a).I6 + str, false);
                break;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.xb k10 = c6Var.k().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                c6Var.dismiss();
                vf.c.t(c6Var.getContext(), "https://" + np.s1(c6Var.a).V2 + "/" + str);
                break;
        }
    }
}
