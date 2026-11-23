package di;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.p31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gi0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.messenger.r10
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
                f6 f6Var = (f6) obj6;
                r10 r10Var = (r10) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList A0 = np.A0(updates, TL_update.TL_updateNewMessage.class);
                    int size = A0.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj7 = A0.get(i10);
                            i10++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                gjVar = new gj(f6Var.a, message, false, false);
                            }
                        } else {
                            gjVar = null;
                        }
                    }
                    np.u1(f6Var.a).V3(updates, false);
                    if (gjVar == null) {
                        r10Var.a(null, null);
                        y8.y(f6Var.a, false).N();
                        p8 G = y8.y(f6Var.a, false).G(k10.i(f6Var.a).e(), false);
                        if (G != null) {
                            G.l(arrayList, null);
                            break;
                        }
                    } else {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) gjVar.k.action).gift;
                        r10Var.a(starGift, new ai.r(f6Var, gjVar, arrayList, starGift, 12));
                        break;
                    }
                } else if (tL_error != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), new fi.b());
                        String N0 = hd.N0(2131749738, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.g0.W2(hd.N0(2131749740, null));
                    } else {
                        String str = tL_error.text;
                        if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            f6Var.k().g0(tL_error, false);
                            runnable.run();
                            break;
                        } else {
                            long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(f6Var.a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), new fi.b());
                            String N02 = hd.N0(2131749738, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                            t1Var2.S = N02;
                            t1Var2.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749739, hd.x(parseLong, true)));
                        }
                    }
                    org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                    runnable.run();
                }
                break;
            case 1:
                f6 f6Var2 = (f6) obj6;
                vf.b bVar = (vf.b) obj5;
                bi.e2 e2Var = (bi.e2) obj4;
                w2 w2Var = (w2) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    w2Var.a(stargiftdepositpayload);
                    break;
                } else {
                    bVar.b();
                    (e2Var != null ? new org.telegram.ui.Components.lc(e2Var.c, f6Var2.J0) : f6Var2.k()).g0(tL_error2, false);
                    break;
                }
            case 2:
                p31 p31Var = (p31) obj5;
                String str2 = (String) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                ((org.telegram.ui.ActionBar.t1) obj6).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.w2 w2Var2 = gi0.a;
                    if (w2Var2 != null) {
                        w2Var2.dismiss();
                        gi0.a = null;
                    }
                    gi0.a().I(R.raw.error, hd.N0(2131753125, null), TextUtils.isEmpty(str2) ? hd.N0(2131753126, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var), hd.a0(null, null, 2131753127, str2))).j();
                    break;
                } else {
                    p31Var.run();
                    break;
                }
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj6;
                fi.f7 f7Var = (fi.f7) obj5;
                String str3 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.h6 h6Var2 = v0Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new org.telegram.ui.Components.lc(v0Var, h6Var2).f0("UNKNOWN_BUTTON", false);
                        v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.lc(v0Var, h6Var2).g0(tL_error3, false);
                        v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                        break;
                    }
                } else {
                    np.u1(v0Var.N).V3(updates2, false);
                    v0Var.x(f7Var, "requested_chat_sent", org.telegram.ui.web.v0.A(str3, "req_id"));
                    long j3 = v0Var.V.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.a0 a0Var = new org.telegram.ui.web.a0(v0Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
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
