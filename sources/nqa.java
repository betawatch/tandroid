// default package

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nqa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ String c;

    public /* synthetic */ nqa(wsa wsaVar, String str, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wsa wsaVar = this.b;
                String str = this.c;
                l11.w(wsaVar.getContext(), oc7.r1(wsaVar.a).l4.G1.f + str, false);
                break;
            case 1:
                wsa wsaVar2 = this.b;
                String str2 = this.c;
                long j = wsaVar2.S1;
                wsaVar2.f2.setLoading(false);
                if (!TextUtils.isEmpty(str2)) {
                    wsaVar2.dismiss();
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof yv1) {
                            yv1 yv1Var = (yv1) Q;
                            if (yv1Var.a() == j) {
                                c41.b0(yv1Var).I(R.raw.gift, jb6.M0(2131744785, null), gm.S2(jb6.a0(null, null, 2131744783, pg3.s(j)))).k(true);
                                break;
                            }
                        }
                        nm7 f = nm7.f(wsaVar2.a);
                        Long valueOf = Long.valueOf(j);
                        Boolean bool = Boolean.FALSE;
                        f.k(6, valueOf, bool);
                        nm7.f(wsaVar2.a).k(5, Long.valueOf(j), bool);
                        yv1 ga = yv1.ga(j);
                        ga.whenFullyVisible(new e6a(wsaVar2, ga, (byte) 20));
                        Q.presentFragment(ga);
                        break;
                    }
                } else {
                    wsaVar2.z2(0, true, null);
                    break;
                }
                break;
            case 2:
                wsa wsaVar3 = this.b;
                String str3 = this.c;
                l11.w(wsaVar3.getContext(), oc7.r1(wsaVar3.a).l4.G1.f + str3, false);
                break;
            case 3:
                wsa wsaVar4 = this.b;
                String str4 = this.c;
                l11.w(wsaVar4.getContext(), oc7.r1(wsaVar4.a).l4.G1.f + str4, false);
                break;
            case 4:
                wsa wsaVar5 = this.b;
                String str5 = this.c;
                l11.w(wsaVar5.getContext(), oc7.r1(wsaVar5.a).l4.G1.f + str5, false);
                break;
            case 5:
                wsa wsaVar6 = this.b;
                String str6 = this.c;
                l11.w(wsaVar6.getContext(), oc7.r1(wsaVar6.a).l4.G1.f + str6, false);
                break;
            case 6:
                wsa wsaVar7 = this.b;
                String str7 = this.c;
                l11.w(wsaVar7.getContext(), oc7.r1(wsaVar7.a).l4.G1.f + str7, false);
                break;
            case 7:
                wsa wsaVar8 = this.b;
                gm.g(this.c);
                u31 k = wsaVar8.j().k(false);
                k.u = true;
                k.j();
                break;
            default:
                wsa wsaVar9 = this.b;
                String str8 = this.c;
                wsaVar9.dismiss();
                l11.u(wsaVar9.getContext(), "https://" + oc7.r1(wsaVar9.a).N2 + "/" + str8);
                break;
        }
    }
}
