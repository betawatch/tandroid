package bi;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.y21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bi0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        AlertDialog$Builder alertDialog$Builder;
        ij ijVar;
        int i7 = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj6;
                v10 v10Var = (v10) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList y02 = qp.y0(updates, TL_update.TL_updateNewMessage.class);
                    int size = y02.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj7 = y02.get(i10);
                            i10++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                ijVar = new ij(k7Var.a, message, false, false);
                            }
                        } else {
                            ijVar = null;
                        }
                    }
                    qp.s1(k7Var.a).O3(updates, false);
                    if (ijVar == null) {
                        v10Var.a(null, null);
                        ea.y(k7Var.a, false).O();
                        v9 G = ea.y(k7Var.a, false).G(p10.i(k7Var.a).e(), false);
                        if (G != null) {
                            G.k(arrayList, null);
                            break;
                        }
                    } else {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) ijVar.k.action).gift;
                        v10Var.a(starGift, new ai.d0(k7Var, ijVar, arrayList, starGift, 6));
                        break;
                    }
                } else if (tL_error != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), new di.b());
                        String M0 = org.telegram.messenger.hd.M0(2131749754, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749756, null));
                    } else {
                        String str = tL_error.text;
                        if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            k7Var.k().f0(tL_error, false);
                            runnable.run();
                            break;
                        } else {
                            long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(k7Var.a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), new di.b());
                            String M02 = org.telegram.messenger.hd.M0(2131749754, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                            u1Var2.R = M02;
                            u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749755, org.telegram.messenger.hd.x(parseLong, true)));
                        }
                    }
                    jg.g.C(null, 2131747830, alertDialog$Builder, null);
                    runnable.run();
                }
                break;
            case 1:
                k7 k7Var2 = (k7) obj6;
                vf.b bVar = (vf.b) obj5;
                wg.f1 f1Var = (wg.f1) obj4;
                q3 q3Var = (q3) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    q3Var.a(stargiftdepositpayload);
                    break;
                } else {
                    bVar.b();
                    (f1Var != null ? new org.telegram.ui.Components.hc(f1Var.c, k7Var2.I0) : k7Var2.k()).f0(tL_error2, false);
                    break;
                }
            case 2:
                y21 y21Var = (y21) obj5;
                String str2 = (String) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj3;
                ((org.telegram.ui.ActionBar.u1) obj6).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.v2 v2Var = bi0.a;
                    if (v2Var != null) {
                        v2Var.dismiss();
                        bi0.a = null;
                    }
                    bi0.a().I(R.raw.error, org.telegram.messenger.hd.M0(2131753128, null), TextUtils.isEmpty(str2) ? org.telegram.messenger.hd.M0(2131753129, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, f6Var), org.telegram.messenger.hd.a0(null, null, 2131753130, str2))).j();
                    break;
                } else {
                    y21Var.run();
                    break;
                }
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj6;
                di.o7 o7Var = (di.o7) obj5;
                String str3 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = x0Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new org.telegram.ui.Components.hc(x0Var, f6Var2).e0("UNKNOWN_BUTTON", false);
                        x0Var.x(o7Var, "requested_chat_failed", org.telegram.ui.web.x0.A(str3, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.hc(x0Var, f6Var2).f0(tL_error3, false);
                        x0Var.x(o7Var, "requested_chat_failed", org.telegram.ui.web.x0.A(str3, "req_id"));
                        break;
                    }
                } else {
                    qp.s1(x0Var.M).O3(updates2, false);
                    x0Var.x(o7Var, "requested_chat_sent", org.telegram.ui.web.x0.A(str3, "req_id"));
                    long j3 = x0Var.U.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.b0 b0Var = new org.telegram.ui.web.b0(x0Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(b0Var);
                    }
                    org.telegram.ui.web.d0 d0Var = x0Var.c;
                    if (d0Var != null) {
                        d0Var.b();
                        break;
                    }
                }
                break;
        }
    }
}
