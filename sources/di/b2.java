package di;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.d31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.di0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        AlertDialog$Builder alertDialog$Builder;
        gj gjVar;
        int i7 = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i7) {
            case 0:
                c6 c6Var = (c6) obj6;
                s10 s10Var = (s10) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList y02 = np.y0(updates, TL_update.TL_updateNewMessage.class);
                    int size = y02.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj7 = y02.get(i10);
                            i10++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                gjVar = new gj(c6Var.a, message, false, false);
                            }
                        } else {
                            gjVar = null;
                        }
                    }
                    np.s1(c6Var.a).O3(updates, false);
                    if (gjVar == null) {
                        s10Var.a(null, null);
                        u8.y(c6Var.a, false).O();
                        l8 G = u8.y(c6Var.a, false).G(m10.i(c6Var.a).e(), false);
                        if (G != null) {
                            G.k(arrayList, null);
                            break;
                        }
                    } else {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) gjVar.k.action).gift;
                        s10Var.a(starGift, new ai.r(c6Var, gjVar, arrayList, starGift, 9));
                        break;
                    }
                } else if (tL_error != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, c6Var.getContext(), new fi.b());
                        String M0 = hd.M0(2131749755, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.g0.X2(hd.M0(2131749757, null));
                    } else {
                        String str = tL_error.text;
                        if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            c6Var.k().f0(tL_error, false);
                            runnable.run();
                            break;
                        } else {
                            long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(c6Var.a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, c6Var.getContext(), new fi.b());
                            String M02 = hd.M0(2131749755, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                            t1Var2.S = M02;
                            t1Var2.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749756, hd.x(parseLong, true)));
                        }
                    }
                    i5.c.C(null, 2131747831, alertDialog$Builder, null);
                    runnable.run();
                }
                break;
            case 1:
                c6 c6Var2 = (c6) obj6;
                vf.b bVar = (vf.b) obj5;
                wg.c1 c1Var = (wg.c1) obj4;
                w2 w2Var = (w2) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    w2Var.a(stargiftdepositpayload);
                    break;
                } else {
                    bVar.b();
                    (c1Var != null ? new org.telegram.ui.Components.cc(c1Var.c, c6Var2.J0) : c6Var2.k()).f0(tL_error2, false);
                    break;
                }
            case 2:
                d31 d31Var = (d31) obj5;
                String str2 = (String) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                ((org.telegram.ui.ActionBar.t1) obj6).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.u2 u2Var = di0.a;
                    if (u2Var != null) {
                        u2Var.dismiss();
                        di0.a = null;
                    }
                    di0.a().I(R.raw.error, hd.M0(2131753128, null), TextUtils.isEmpty(str2) ? hd.M0(2131753129, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var), hd.a0(null, null, 2131753130, str2))).j();
                    break;
                } else {
                    d31Var.run();
                    break;
                }
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj6;
                fi.i7 i7Var = (fi.i7) obj5;
                String str3 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = v0Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new org.telegram.ui.Components.cc(v0Var, e6Var2).e0("UNKNOWN_BUTTON", false);
                        v0Var.x(i7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.cc(v0Var, e6Var2).f0(tL_error3, false);
                        v0Var.x(i7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                        break;
                    }
                } else {
                    np.s1(v0Var.N).O3(updates2, false);
                    v0Var.x(i7Var, "requested_chat_sent", org.telegram.ui.web.v0.A(str3, "req_id"));
                    long j3 = v0Var.V.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.a0 a0Var = new org.telegram.ui.web.a0(v0Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(a0Var);
                    }
                    org.telegram.ui.web.c0 c0Var = v0Var.c;
                    if (c0Var != null) {
                        c0Var.b();
                        break;
                    }
                }
                break;
        }
    }
}
