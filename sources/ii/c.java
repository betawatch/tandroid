package ii;

import android.content.Context;
import di.m3;
import di.v6;
import fi.h0;
import ki.y0;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.lc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.iy0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c(Context context, h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, lc lcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.e = context;
        this.f = h0Var;
        this.b = j3;
        this.c = bArr;
        this.g = aVar;
        this.h = lcVar;
        this.i = dVar;
        this.d = i7;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.e;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                final g2 g2Var = (g2) this.c;
                final q10 q10Var = (q10) this.g;
                final Runnable runnable = (Runnable) this.h;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.i;
                final long j3 = this.b;
                final int i7 = this.d;
                g0.g3(new Runnable() { // from class: ii.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLRPC.TL_error tL_error2 = TLRPC.TL_error.this;
                        ConnectionsManager connectionsManager2 = connectionsManager;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        g2 g2Var2 = g2Var;
                        long j10 = j3;
                        q10 q10Var2 = q10Var;
                        Runnable runnable2 = runnable;
                        int i10 = i7;
                        if (tL_error2 == null) {
                            TLRPC.TL_payments_withdrawStarsRevenueToWallet tL_payments_withdrawStarsRevenueToWallet = new TLRPC.TL_payments_withdrawStarsRevenueToWallet();
                            tL_payments_withdrawStarsRevenueToWallet.ton = true;
                            tL_payments_withdrawStarsRevenueToWallet.peer = mp.u1(i10).l1(j10.i(i10).e());
                            tL_payments_withdrawStarsRevenueToWallet.tmp_password = ((TL_account.tmpPassword) tLObject).tmp_password;
                            connectionsManager2.sendRequest(tL_payments_withdrawStarsRevenueToWallet, new f(i10, q10Var2, inputCheckPasswordSRP, twoStepVerificationActivity2, runnable2, g2Var2, j10));
                            return;
                        }
                        if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                            connectionsManager2.sendRequest(new TL_account.getPassword(), new e(twoStepVerificationActivity2, g2Var2, j10, q10Var2, runnable2, i10), 8);
                            return;
                        }
                        n.a[i10] = false;
                        twoStepVerificationActivity2.t0();
                        if (n.h(tL_error2, twoStepVerificationActivity2)) {
                            return;
                        }
                        if (!"PASSWORD_MISSING".equals(tL_error2.text)) {
                            if (!"PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                twoStepVerificationActivity2.finishFragment();
                            }
                            lc.e0(tL_error2);
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity2.getParentActivity(), twoStepVerificationActivity2.getResourceProvider());
                        String N0 = gd.N0(2131751285, null);
                        t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = gd.N0(2131749327, null);
                        alertDialog$Builder.h(gd.N0(2131752577, null), null);
                        alertDialog$Builder.k(gd.N0(2131751279, null), new v6(twoStepVerificationActivity2, 24));
                        twoStepVerificationActivity2.showDialog(t1Var);
                    }
                });
                break;
            case 1:
                g0.g3(new y0((t1) this.e, tLObject, (org.telegram.messenger.c) this.f, (g70) this.g, this.b, (Context) this.h, (g2) this.c, this.d, (TLRPC.Peer) this.i));
                break;
            default:
                Context context = (Context) this.e;
                h0 h0Var = (h0) this.f;
                byte[] bArr = (byte[]) this.c;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.g;
                lc lcVar = (lc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.i;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        g0.h3(new iy0(aVar, lcVar, context, h0Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            g0.h3(new j01(aVar, lcVar, this.d, 15), 200L);
                            break;
                        }
                    } else {
                        g0.h3(new iy0(aVar, lcVar, context, h0Var, 0), 200L);
                        break;
                    }
                } else {
                    g0.g3(new m3(tLObject, context, h0Var, this.b, bArr, aVar, lcVar, dVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(ConnectionsManager connectionsManager, TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, q10 q10Var, Runnable runnable, int i7, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        this.e = connectionsManager;
        this.f = twoStepVerificationActivity;
        this.c = g2Var;
        this.b = j3;
        this.g = q10Var;
        this.h = runnable;
        this.d = i7;
        this.i = inputCheckPasswordSRP;
    }

    public /* synthetic */ c(t1 t1Var, org.telegram.messenger.c cVar, g70 g70Var, long j3, Context context, g2 g2Var, int i7, TLRPC.Peer peer) {
        this.e = t1Var;
        this.f = cVar;
        this.g = g70Var;
        this.b = j3;
        this.h = context;
        this.c = g2Var;
        this.d = i7;
        this.i = peer;
    }
}
