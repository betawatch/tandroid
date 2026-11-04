package ci;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.t21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h2(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        AlertDialog$Builder alertDialog$Builder;
        zi ziVar;
        int i3 = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i3) {
            case 0:
                l6 l6Var = (l6) obj6;
                n10 n10Var = (n10) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList y02 = hp.y0(updates, TL_update.TL_updateNewMessage.class);
                    int size = y02.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj7 = y02.get(i10);
                            i10++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                ziVar = new zi(l6Var.a, message, false, false);
                            }
                        } else {
                            ziVar = null;
                        }
                    }
                    hp.s1(l6Var.a).O3(updates, false);
                    if (ziVar == null) {
                        n10Var.a(null, null);
                        e9.y(l6Var.a, false).O();
                        v8 G = e9.y(l6Var.a, false).G(h10.i(l6Var.a).e(), false);
                        if (G != null) {
                            G.k(arrayList, null);
                            break;
                        }
                    } else {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) ziVar.k.action).gift;
                        n10Var.a(starGift, new ai.z3(l6Var, ziVar, arrayList, starGift, 8));
                        break;
                    }
                } else if (tL_error != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, l6Var.getContext(), new ei.b());
                        String M0 = bd.M0(2131749763, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.g0.X2(bd.M0(2131749765, null));
                    } else {
                        String str = tL_error.text;
                        if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            l6Var.k().f0(tL_error, false);
                            runnable.run();
                            break;
                        } else {
                            long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(l6Var.a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, l6Var.getContext(), new ei.b());
                            String M02 = bd.M0(2131749763, null);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                            s1Var2.S = M02;
                            s1Var2.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749764, bd.x(parseLong, true)));
                        }
                    }
                    k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                    runnable.run();
                }
                break;
            case 1:
                l6 l6Var2 = (l6) obj6;
                sf.b bVar = (sf.b) obj5;
                xg.e1 e1Var = (xg.e1) obj4;
                d3 d3Var = (d3) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    d3Var.a(stargiftdepositpayload);
                    break;
                } else {
                    bVar.b();
                    (e1Var != null ? new org.telegram.ui.Components.fc(e1Var.c, l6Var2.J0) : l6Var2.k()).f0(tL_error2, false);
                    break;
                }
            case 2:
                t21 t21Var = (t21) obj5;
                String str2 = (String) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                ((org.telegram.ui.ActionBar.s1) obj6).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.t2 t2Var = yh0.a;
                    if (t2Var != null) {
                        t2Var.dismiss();
                        yh0.a = null;
                    }
                    yh0.a().I(R.raw.error, bd.M0(2131753128, null), TextUtils.isEmpty(str2) ? bd.M0(2131753129, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var), bd.a0(null, null, 2131753130, str2))).j();
                    break;
                } else {
                    t21Var.run();
                    break;
                }
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj6;
                ei.p7 p7Var = (ei.p7) obj5;
                String str3 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = w0Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new org.telegram.ui.Components.fc(w0Var, e6Var2).e0("UNKNOWN_BUTTON", false);
                        w0Var.x(p7Var, "requested_chat_failed", org.telegram.ui.web.w0.A(str3, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.fc(w0Var, e6Var2).f0(tL_error3, false);
                        w0Var.x(p7Var, "requested_chat_failed", org.telegram.ui.web.w0.A(str3, "req_id"));
                        break;
                    }
                } else {
                    hp.s1(w0Var.N).O3(updates2, false);
                    w0Var.x(p7Var, "requested_chat_sent", org.telegram.ui.web.w0.A(str3, "req_id"));
                    long j10 = w0Var.V.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.b0 b0Var = new org.telegram.ui.web.b0(w0Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(b0Var);
                    }
                    org.telegram.ui.web.d0 d0Var = w0Var.c;
                    if (d0Var != null) {
                        d0Var.b();
                        break;
                    }
                }
                break;
        }
    }
}
