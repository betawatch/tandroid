package bi;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class i4 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();

    public static String a(int i7, long j3) {
        return i7 + ":" + j3;
    }

    public static boolean b(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = a;
        Long l10 = (Long) hashMap.get(valueOf);
        if (l10 != null && l10.longValue() > elapsedRealtime) {
            return false;
        }
        hashMap.put(Long.valueOf(j3), Long.valueOf(elapsedRealtime + 30000));
        c();
        return true;
    }

    public static void c() {
        ls.e().k(ls.L3, new Object[0]);
    }

    public static SpannableStringBuilder d(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String p10 = p(starGift != null ? x4.h(starGift) : "");
        String p11 = p(x4.k(tL_messageActionStarGiftOnchainOffer.amount));
        if (tL_messageActionStarGiftOnchainOffer.buyer) {
            return org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749579, p11, p10));
        }
        String p12 = p(x4.t(tL_messageActionStarGiftOnchainOffer.amount));
        return org.telegram.messenger.g0.W2(p12 != null ? hd.a0(null, null, 2131749590, p11, p12, p10) : hd.a0(null, null, 2131749589, p11, p10));
    }

    public static void e(Activity activity, int i7, int i10, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar) {
        f(activity, i7, i10, tL_messageActionStarGiftOnchainOffer, h6Var, lcVar, null);
    }

    public static void f(final Context context, final int i7, final int i10, final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, final org.telegram.ui.ActionBar.h6 h6Var, final lc lcVar, final o3 o3Var) {
        if (k(i7, tL_messageActionStarGiftOnchainOffer.offer_id)) {
            s(lcVar);
            return;
        }
        if (m(i7, tL_messageActionStarGiftOnchainOffer.offer_id)) {
            return;
        }
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String h = starGift != null ? x4.h(starGift) : "";
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = hd.N0(2131749602, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749603, x4.k(tL_messageActionStarGiftOnchainOffer.amount), h));
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        alertDialog$Builder.k(hd.N0(2131749604, null), new org.telegram.ui.ActionBar.q1() { // from class: bi.h4
            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = tL_messageActionStarGiftOnchainOffer;
                long j3 = tL_messageActionStarGiftOnchainOffer2.offer_id;
                int i12 = i7;
                boolean k10 = i4.k(i12, j3);
                lc lcVar2 = lcVar;
                if (k10) {
                    i4.s(lcVar2);
                    return;
                }
                if (i4.m(i12, tL_messageActionStarGiftOnchainOffer2.offer_id)) {
                    return;
                }
                String a10 = i4.a(i12, tL_messageActionStarGiftOnchainOffer2.offer_id);
                i4.c.put(a10, Long.valueOf(SystemClock.elapsedRealtime() + 30000));
                i4.c();
                TL_stars.declineStarGiftOnchainOffer declinestargiftonchainoffer = new TL_stars.declineStarGiftOnchainOffer();
                declinestargiftonchainoffer.offer_msg_id = i10;
                ConnectionsManager.getInstance(i12).sendRequestTyped(declinestargiftonchainoffer, new d3.b(1), new x3(a10, i12, o3Var, context, h6Var, lcVar2));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void g(long j3) {
        a.remove(Long.valueOf(j3));
        b.remove(Long.valueOf(j3));
        c();
    }

    public static lc h() {
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        return T != null ? lc.b0(T) : lc.Y();
    }

    public static boolean i(int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        boolean z10 = tL_messageActionStarGiftOnchainOffer.buyer;
        return z10 ? (!z10 || tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.declined || tL_messageActionStarGiftOnchainOffer.cancelled || tL_messageActionStarGiftOnchainOffer.expired || tL_messageActionStarGiftOnchainOffer.settled || tL_messageActionStarGiftOnchainOffer.cancelling) ? false : true : n(i7, tL_messageActionStarGiftOnchainOffer);
    }

    public static void j(long j3, long j10) {
        a.put(Long.valueOf(j3), Long.valueOf(j10 != Long.MAX_VALUE ? SystemClock.elapsedRealtime() + j10 : Long.MAX_VALUE));
        c();
    }

    public static boolean k(int i7, long j3) {
        String a10 = a(i7, j3);
        HashMap hashMap = d;
        Long l10 = (Long) hashMap.get(a10);
        if (l10 == null) {
            return false;
        }
        if (l10.longValue() > SystemClock.elapsedRealtime()) {
            return true;
        }
        hashMap.remove(a(i7, j3));
        return false;
    }

    public static boolean l(int i7, long j3) {
        Long l10 = (Long) a.get(Long.valueOf(j3));
        return (l10 != null && l10.longValue() > SystemClock.elapsedRealtime()) || k(i7, j3) || m(i7, j3);
    }

    public static boolean m(int i7, long j3) {
        String a10 = a(i7, j3);
        HashMap hashMap = c;
        Long l10 = (Long) hashMap.get(a10);
        if (l10 == null) {
            return false;
        }
        if (l10.longValue() > SystemClock.elapsedRealtime()) {
            return true;
        }
        hashMap.remove(a(i7, j3));
        return false;
    }

    public static boolean n(int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        return (tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.declined || tL_messageActionStarGiftOnchainOffer.cancelled || tL_messageActionStarGiftOnchainOffer.expired || tL_messageActionStarGiftOnchainOffer.settled || tL_messageActionStarGiftOnchainOffer.cancelling || tL_messageActionStarGiftOnchainOffer.expires_at <= ConnectionsManager.getInstance(i7).getCurrentTime()) ? false : true;
    }

    public static boolean o(TLRPC.Message message) {
        TLRPC.MessageReplyHeader messageReplyHeader;
        return (message == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) || (messageReplyHeader = message.reply_to) == null || messageReplyHeader.reply_to_msg_id == 0) ? false : true;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(' ', (char) 160);
    }

    public static org.telegram.ui.Wallet.p0 q(Context context, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar, int i7, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx) {
        try {
            return org.telegram.ui.Wallet.p0.b(tL_payments_starGiftOnchainOfferTx.message);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            x4.q(context, i7, h6Var, lcVar, "WALLET_UNSUPPORTED_SEND_MODE", null);
            return null;
        }
    }

    public static SpannableStringBuilder r(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        ArrayList arrayList = new ArrayList();
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String p10 = p(starGift != null ? x4.h(starGift) : "");
        String p11 = p(x4.k(tL_messageActionStarGiftOnchainOffer.amount));
        boolean z10 = tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled;
        if (tL_messageActionStarGiftOnchainOffer.buyer) {
            if (z10) {
                arrayList.add(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749587, p11, p10)));
            } else if (tL_messageActionStarGiftOnchainOffer.declined) {
                arrayList.add(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749586, p11, p10)));
            } else if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                arrayList.add(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749583, p11, p10)));
            }
            if (!z10 && (tL_messageActionStarGiftOnchainOffer.flags & 16) != 0) {
                arrayList.add(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749584, p(x4.k(tL_messageActionStarGiftOnchainOffer.buyer_refund)))));
            }
            if (tL_messageActionStarGiftOnchainOffer.cancelled && (tL_messageActionStarGiftOnchainOffer.flags & 32) != 0) {
                long j3 = tL_messageActionStarGiftOnchainOffer.fine;
                if (j3 > 0) {
                    arrayList.add(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749585, p(x4.k(j3)))));
                }
            }
        } else if (z10) {
            arrayList.add(hd.N0(2131749582, null));
            arrayList.add(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749580, p10, p11)));
        } else if (tL_messageActionStarGiftOnchainOffer.declined) {
            arrayList.add(hd.N0(2131749581, null));
        }
        if (arrayList.isEmpty()) {
            return u(tL_messageActionStarGiftOnchainOffer);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (i7 > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i7));
        }
        return spannableStringBuilder;
    }

    public static void s(lc lcVar) {
        if (lcVar == null) {
            lcVar = h();
        }
        org.telegram.messenger.f3.n(null, 2131749611, lcVar, R.raw.error, 36);
    }

    public static void t(int i7, TL_stars.StarGift starGift) {
        org.telegram.messenger.g0.g3(new ai.c1(i7, starGift != null ? x4.h(starGift) : "", 2));
    }

    public static SpannableStringBuilder u(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String p10 = p(starGift != null ? x4.h(starGift) : "");
        String p11 = p(x4.k(tL_messageActionStarGiftOnchainOffer.amount));
        boolean z10 = tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled;
        boolean z11 = tL_messageActionStarGiftOnchainOffer.buyer;
        if (z11) {
            if (z10) {
                return org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749587, p11, p10));
            }
            if (tL_messageActionStarGiftOnchainOffer.declined) {
                return org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749586, p11, p10));
            }
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                return org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749583, p11, p10));
            }
        } else if (z10) {
            return org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749580, p10, p11));
        }
        int i7 = tL_messageActionStarGiftOnchainOffer.declined ? 2131749554 : tL_messageActionStarGiftOnchainOffer.cancelled ? 2131749555 : tL_messageActionStarGiftOnchainOffer.expired ? z11 ? 2131749553 : 2131749556 : 0;
        return i7 == 0 ? d(tL_messageActionStarGiftOnchainOffer) : org.telegram.messenger.g0.W2(hd.a0(null, null, i7, p11, p10));
    }
}
