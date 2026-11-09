package bi;

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ b4(k7 k7Var, String str, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 1;
        String str = this.c;
        k7 k7Var = this.b;
        switch (i7) {
            case 0:
                long j3 = k7Var.P1;
                k7Var.c2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    k7Var.dismiss();
                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof cn) {
                            cn cnVar = (cn) Q;
                            if (cnVar.a() == j3) {
                                org.telegram.ui.Components.hc.a0(cnVar).I(R.raw.gift, org.telegram.messenger.id.M0(2131745096, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131745094, org.telegram.messenger.m5.t(j3)))).k(true);
                                break;
                            }
                        }
                        qs f10 = qs.f(k7Var.a);
                        Long valueOf = Long.valueOf(j3);
                        Boolean bool = Boolean.FALSE;
                        f10.k(6, valueOf, bool);
                        qs.f(k7Var.a).k(5, Long.valueOf(j3), bool);
                        cn ta2 = cn.ta(j3);
                        ta2.whenFullyVisible(new a4(i10, k7Var, ta2));
                        Q.presentFragment(ta2);
                        break;
                    }
                } else {
                    k7Var.s2(0, true, null);
                    break;
                }
                break;
            case 1:
                vf.c.v(k7Var.getContext(), qp.s1(k7Var.a).H6 + str, false);
                break;
            case 2:
                vf.c.v(k7Var.getContext(), qp.s1(k7Var.a).H6 + str, false);
                break;
            case 3:
                vf.c.v(k7Var.getContext(), qp.s1(k7Var.a).H6 + str, false);
                break;
            case 4:
                vf.c.v(k7Var.getContext(), qp.s1(k7Var.a).H6 + str, false);
                break;
            case 5:
                vf.c.v(k7Var.getContext(), qp.s1(k7Var.a).H6 + str, false);
                break;
            case 6:
                vf.c.v(k7Var.getContext(), qp.s1(k7Var.a).H6 + str, false);
                break;
            case 7:
                org.telegram.messenger.g0.g(str);
                org.telegram.ui.Components.cc k10 = k7Var.k().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                k7Var.dismiss();
                vf.c.t(k7Var.getContext(), "https://" + qp.s1(k7Var.a).U2 + "/" + str);
                break;
        }
    }
}
