package di;

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ h3(f6 f6Var, String str, int i7) {
        this.a = i7;
        this.b = f6Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.c;
        f6 f6Var = this.b;
        switch (i7) {
            case 0:
                vf.c.v(f6Var.getContext(), np.u1(f6Var.a).K6 + str, false);
                break;
            case 1:
                long j3 = f6Var.T1;
                f6Var.g2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    f6Var.dismiss();
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof bn) {
                            bn bnVar = (bn) Q;
                            if (bnVar.a() == j3) {
                                org.telegram.ui.Components.lc.b0(bnVar).I(R.raw.gift, hd.N0(2131744853, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744851, org.telegram.messenger.n5.t(j3)))).k(true);
                                break;
                            }
                        }
                        ls f10 = ls.f(f6Var.a);
                        Long valueOf = Long.valueOf(j3);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        ls.f(f6Var.a).k(5, Long.valueOf(j3), bool);
                        bn ua2 = bn.ua(j3);
                        ua2.whenFullyVisible(new f2(5, f6Var, ua2));
                        Q.presentFragment(ua2);
                        break;
                    }
                } else {
                    f6Var.H2(0, true, null);
                    break;
                }
                break;
            case 2:
                vf.c.v(f6Var.getContext(), np.u1(f6Var.a).K6 + str, false);
                break;
            case 3:
                vf.c.v(f6Var.getContext(), np.u1(f6Var.a).K6 + str, false);
                break;
            case 4:
                vf.c.v(f6Var.getContext(), np.u1(f6Var.a).K6 + str, false);
                break;
            case 5:
                vf.c.v(f6Var.getContext(), np.u1(f6Var.a).K6 + str, false);
                break;
            case 6:
                vf.c.v(f6Var.getContext(), np.u1(f6Var.a).K6 + str, false);
                break;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.gc k10 = f6Var.k().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                f6Var.dismiss();
                vf.c.t(f6Var.getContext(), "https://" + np.u1(f6Var.a).X2 + "/" + str);
                break;
        }
    }
}
