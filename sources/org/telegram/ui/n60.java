package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n60 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
        this.f = obj5;
        this.d = obj6;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        pv pvVar;
        int i3 = this.a;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i3) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                sf.b bVar = (sf.b) obj6;
                Long l10 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                String str = LaunchActivity.E1;
                if (bVar != null) {
                    bVar.b();
                }
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q instanceof ee0) {
                    Q = ((ee0) Q).c0();
                }
                org.telegram.ui.ActionBar.d2 d2Var = Q;
                if (d2Var != null) {
                    org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
                    if (d2Var.getLastStoryViewer() != null && d2Var.getLastStoryViewer().L0) {
                        resourceProvider = d2Var.getLastStoryViewer().E;
                    }
                    vg.i0 i0Var = new vg.i0(19, launchActivity.P, launchActivity, d2Var, resourceProvider);
                    i0Var.A1(e3Var);
                    if (!(d2Var instanceof wm) ? !(!(d2Var instanceof uw) || (pvVar = ((uw) d2Var).G3) == null || pvVar.getCurrentFragmetDialogId() != l10.longValue()) : ((wm) d2Var).a() == l10.longValue()) {
                        z10 = true;
                    }
                    i0Var.z1(tL_premium_boostsStatus, z10);
                    i0Var.B1(l10.longValue());
                    i0Var.Z1 = q1Var;
                    d2Var.showDialog(i0Var);
                    if (runnable != null) {
                        try {
                            runnable.run();
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                }
                break;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj7;
                sf.b bVar2 = (sf.b) obj6;
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.messenger.f3 f3Var = (org.telegram.messenger.f3) obj4;
                Long l11 = (Long) obj5;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                String str2 = LaunchActivity.E1;
                if (tL_premium_boostsStatus2 != null) {
                    f3Var.b(l11.longValue(), tL_premium_boostsStatus2, new n60(launchActivity2, bVar2, l11, tL_premium_boostsStatus2, q1Var2, runnable2, 0));
                    break;
                } else {
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj3;
                cg.k0 k0Var = (cg.k0) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.t2[]) obj7)[0] = null;
                yh0.a = null;
                if (!((boolean[]) obj6)[0]) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                    if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                        k0Var.run();
                        break;
                    } else {
                        yh0.a = t2Var;
                        t2Var.show();
                        break;
                    }
                } else {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    break;
                }
                break;
            case 3:
                gi.d dVar = (gi.d) obj6;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                org.telegram.ui.Wallet.g gVar = (org.telegram.ui.Wallet.g) obj3;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj2;
                String str3 = (String) obj;
                ((gi.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str3 != null) {
                    org.telegram.ui.Components.fc.c0(str3, x2Var.F, e6Var);
                    gVar.run();
                    dVar.setEnabled((y1Var.n || y1Var.o) ? false : true);
                    break;
                } else {
                    x2Var.dismiss();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj4;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj3;
                kg.t0 t0Var = (kg.t0) obj2;
                String str4 = (String) obj;
                ((gi.d) obj7).setLoading(false);
                ((gi.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str4 != null) {
                    org.telegram.ui.Components.fc.c0(str4, y2Var.F, e6Var2);
                    t0Var.run();
                    break;
                } else {
                    y2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ n60(LaunchActivity launchActivity, sf.b bVar, Runnable runnable, org.telegram.messenger.f3 f3Var, Long l10, org.telegram.ui.Cells.q1 q1Var) {
        this.a = 1;
        this.b = launchActivity;
        this.c = bVar;
        this.d = runnable;
        this.g = f3Var;
        this.e = l10;
        this.f = q1Var;
    }
}
