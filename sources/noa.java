// default package

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class noa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ String c;

    public /* synthetic */ noa(vqa vqaVar, String str, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vqa vqaVar = this.b;
                String str = this.c;
                d01.v(vqaVar.getContext(), na7.q1(vqaVar.a).k4.G1.f + str, false);
                break;
            case 1:
                vqa vqaVar2 = this.b;
                String str2 = this.c;
                long j = vqaVar2.S1;
                vqaVar2.f2.setLoading(false);
                if (!TextUtils.isEmpty(str2)) {
                    vqaVar2.dismiss();
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof mu1) {
                            mu1 mu1Var = (mu1) Q;
                            if (mu1Var.a() == j) {
                                u21.b0(mu1Var).I(R.raw.gift, k96.M0(2131744859, null), gl.S2(k96.a0(null, null, 2131744857, cf3.s(j)))).k(true);
                                break;
                            }
                        }
                        kk7 f = kk7.f(vqaVar2.a);
                        Long valueOf = Long.valueOf(j);
                        Boolean bool = Boolean.FALSE;
                        f.k(6, valueOf, bool);
                        kk7.f(vqaVar2.a).k(5, Long.valueOf(j), bool);
                        mu1 W9 = mu1.W9(j);
                        W9.whenFullyVisible(new t7a(vqaVar2, W9, (byte) 18));
                        Q.presentFragment(W9);
                        break;
                    }
                } else {
                    vqaVar2.z2(0, true, null);
                    break;
                }
                break;
            case 2:
                vqa vqaVar3 = this.b;
                String str3 = this.c;
                d01.v(vqaVar3.getContext(), na7.q1(vqaVar3.a).k4.G1.f + str3, false);
                break;
            case 3:
                vqa vqaVar4 = this.b;
                String str4 = this.c;
                d01.v(vqaVar4.getContext(), na7.q1(vqaVar4.a).k4.G1.f + str4, false);
                break;
            case 4:
                vqa vqaVar5 = this.b;
                String str5 = this.c;
                d01.v(vqaVar5.getContext(), na7.q1(vqaVar5.a).k4.G1.f + str5, false);
                break;
            case 5:
                vqa vqaVar6 = this.b;
                String str6 = this.c;
                d01.v(vqaVar6.getContext(), na7.q1(vqaVar6.a).k4.G1.f + str6, false);
                break;
            case 6:
                vqa vqaVar7 = this.b;
                String str7 = this.c;
                d01.v(vqaVar7.getContext(), na7.q1(vqaVar7.a).k4.G1.f + str7, false);
                break;
            case 7:
                vqa vqaVar8 = this.b;
                gl.g(this.c);
                m21 k = vqaVar8.j().k(false);
                k.t = true;
                k.j();
                break;
            default:
                vqa vqaVar9 = this.b;
                String str8 = this.c;
                vqaVar9.dismiss();
                d01.t(vqaVar9.getContext(), "https://" + na7.q1(vqaVar9.a).N2 + "/" + str8);
                break;
        }
    }
}
