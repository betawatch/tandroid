package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aj0 implements org.telegram.messenger.k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aj0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        AlertDialog$Builder alertDialog$Builder;
        org.telegram.messenger.kj kjVar;
        int i10 = this.a;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.c41 c41Var = (org.telegram.ui.Components.c41) obj5;
                String str = (String) obj4;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                ((org.telegram.ui.ActionBar.x1) obj6).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.z2 z2Var = hj0.a;
                    if (z2Var != null) {
                        z2Var.dismiss();
                        hj0.a = null;
                    }
                    hj0.a().I(R.raw.error, org.telegram.messenger.dd.L0(2131753128, null), TextUtils.isEmpty(str) ? org.telegram.messenger.dd.L0(2131753129, null) : org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var), org.telegram.messenger.dd.a0(null, null, 2131753130, str))).j();
                    break;
                } else {
                    c41Var.run();
                    break;
                }
            case 1:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj6;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj5;
                String str2 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.p6 p6Var2 = z0Var.e;
                if (updates == null) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.cc(z0Var, p6Var2).e0("UNKNOWN_BUTTON", false);
                        z0Var.y(x0Var, "requested_chat_failed", org.telegram.ui.web.z0.A(str2, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.cc(z0Var, p6Var2).f0(tL_error, false);
                        z0Var.y(x0Var, "requested_chat_failed", org.telegram.ui.web.z0.A(str2, "req_id"));
                        break;
                    }
                } else {
                    org.telegram.messenger.wp.r1(z0Var.M).L3(updates, false);
                    z0Var.y(x0Var, "requested_chat_sent", org.telegram.ui.web.z0.A(str2, "req_id"));
                    long j10 = z0Var.U.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.b0 b0Var = new org.telegram.ui.web.b0(z0Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(b0Var);
                    }
                    org.telegram.ui.web.d0 d0Var = z0Var.c;
                    if (d0Var != null) {
                        d0Var.b();
                        break;
                    }
                }
                break;
            case 2:
                rh.e4 e4Var = (rh.e4) obj6;
                org.telegram.messenger.k20 k20Var = (org.telegram.messenger.k20) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates2 != null) {
                    ArrayList y02 = org.telegram.messenger.wp.y0(updates2, TL_update.TL_updateNewMessage.class);
                    int size = y02.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj7 = y02.get(i11);
                            i11++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                kjVar = new org.telegram.messenger.kj(e4Var.a, message, false, false);
                            }
                        } else {
                            kjVar = null;
                        }
                    }
                    org.telegram.messenger.wp.r1(e4Var.a).L3(updates2, false);
                    if (kjVar == null) {
                        k20Var.a(null, null);
                        rh.e6.y(e4Var.a, false).O();
                        rh.v5 G = rh.e6.y(e4Var.a, false).G(org.telegram.messenger.e20.i(e4Var.a).e(), false);
                        if (G != null) {
                            G.k(arrayList, null);
                            break;
                        }
                    } else {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) kjVar.k.action).gift;
                        k20Var.a(starGift, new ox0(e4Var, kjVar, arrayList, starGift, 18));
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error2.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, e4Var.getContext(), new th.b());
                        String L0 = org.telegram.messenger.dd.L0(2131749764, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131749766, null));
                    } else {
                        String str3 = tL_error2.text;
                        if (str3 == null || !str3.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            e4Var.k().f0(tL_error2, false);
                            runnable.run();
                            break;
                        } else {
                            long parseLong = Long.parseLong(tL_error2.text.substring(25)) + ConnectionsManager.getInstance(e4Var.a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, e4Var.getContext(), new th.b());
                            String L02 = org.telegram.messenger.dd.L0(2131749764, null);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                            x1Var2.R = L02;
                            x1Var2.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131749765, org.telegram.messenger.dd.x(parseLong, true)));
                        }
                    }
                    i0.a.w(null, 2131747847, alertDialog$Builder, null);
                    runnable.run();
                }
                break;
            default:
                rh.e4 e4Var2 = (rh.e4) obj6;
                gf.e eVar = (gf.e) obj5;
                mg.i2 i2Var = (mg.i2) obj4;
                org.telegram.messenger.sl slVar = (org.telegram.messenger.sl) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    slVar.a(stargiftdepositpayload);
                    break;
                } else {
                    eVar.b();
                    (i2Var != null ? new org.telegram.ui.Components.cc(i2Var.c, e4Var2.I0) : e4Var2.k()).f0(tL_error3, false);
                    break;
                }
        }
    }
}
