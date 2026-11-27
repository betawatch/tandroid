// default package

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o45 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ o45(c51 c51Var, c51 c51Var2, sk7 sk7Var, vnb vnbVar, re4 re4Var, w45 w45Var) {
        this.a = (byte) 1;
        this.b = c51Var;
        this.c = c51Var2;
        this.e = sk7Var;
        this.d = vnbVar;
        this.f = re4Var;
        this.g = w45Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        li3 li3Var;
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.g;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                jl7 jl7Var = (jl7) obj4;
                vnb vnbVar = (vnb) obj3;
                oq6 oq6Var = (oq6) obj2;
                String str = (String) obj;
                ((c51) obj7).setLoading(false);
                ((c51) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str != null) {
                    d31.d0(str, jl7Var.F, vnbVar);
                    oq6Var.run();
                    break;
                } else {
                    jl7Var.dismiss();
                    break;
                }
            case 1:
                c51 c51Var = (c51) obj6;
                sk7 sk7Var = (sk7) obj5;
                vnb vnbVar2 = (vnb) obj3;
                re4 re4Var = (re4) obj4;
                w45 w45Var = (w45) obj2;
                String str2 = (String) obj;
                ((c51) obj7).setLoading(false);
                c51Var.setLoading(false);
                if (str2 != null) {
                    d31.d0(str2, sk7Var.F, vnbVar2);
                    re4Var.run();
                    c51Var.setEnabled((w45Var.n || w45Var.o) ? false : true);
                    break;
                } else {
                    sk7Var.dismiss();
                    break;
                }
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                l01 l01Var = (l01) obj6;
                tg5 tg5Var = (tg5) obj5;
                xg1 xg1Var = (xg1) obj4;
                Long l = (Long) obj3;
                wb2 wb2Var = (wb2) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                String str3 = LaunchActivity.C1;
                if (tL_premium_boostsStatus != null) {
                    xg1Var.b(l.longValue(), tL_premium_boostsStatus, new o45(launchActivity, l01Var, l, tL_premium_boostsStatus, wb2Var, tg5Var, (byte) 3));
                    break;
                } else {
                    if (l01Var != null) {
                        l01Var.b();
                    }
                    if (tg5Var != null) {
                        tg5Var.run();
                        break;
                    }
                }
                break;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj7;
                l01 l01Var2 = (l01) obj6;
                Long l2 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj4;
                wb2 wb2Var2 = (wb2) obj3;
                tg5 tg5Var2 = (tg5) obj2;
                wg1 wg1Var = (wg1) obj;
                String str4 = LaunchActivity.C1;
                if (l01Var2 != null) {
                    l01Var2.b();
                }
                e Q = LaunchActivity.Q();
                if (Q instanceof fj6) {
                    Q = ((fj6) Q).b0();
                }
                e eVar = Q;
                if (eVar != null) {
                    vnb resourceProvider = eVar.getResourceProvider();
                    if (eVar.getLastStoryViewer() != null && eVar.getLastStoryViewer().K0) {
                        resourceProvider = eVar.getLastStoryViewer().E;
                    }
                    l46 l46Var = new l46(19, launchActivity2.P, resourceProvider, launchActivity2, eVar);
                    l46Var.s1(wg1Var);
                    if (!(eVar instanceof zu1) ? !(!(eVar instanceof uj3) || (li3Var = ((uj3) eVar).H3) == null || li3Var.getCurrentFragmetDialogId() != l2.longValue()) : ((zu1) eVar).a() == l2.longValue()) {
                        z = true;
                    }
                    l46Var.r1(tL_premium_boostsStatus2, z);
                    l46Var.t1(l2.longValue());
                    l46Var.b2 = wb2Var2;
                    eVar.showDialog(l46Var);
                    if (tg5Var2 != null) {
                        try {
                            tg5Var2.run();
                            break;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                }
                break;
            default:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                nx0 nx0Var = (nx0) obj3;
                te teVar = (te) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((nx0[]) obj7)[0] = null;
                uq7.a = null;
                if (!((boolean[]) obj6)[0]) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                    if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                        teVar.run();
                        break;
                    } else {
                        uq7.a = nx0Var;
                        nx0Var.show();
                        break;
                    }
                } else {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o45(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
    }
}
