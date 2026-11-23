package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import di.pb;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class x4 {
    public static final int[] a = {3000, 3000, 4000, 5000, 10000, 15000, 30000, 60000};
    public static final int[] b = {5000, 10000, 15000, 30000, 60000, 120000, 180000, 300000};

    public static void a(s3 s3Var, String str, TL_stars.StarGiftAttribute starGiftAttribute) {
        if (starGiftAttribute == null) {
            return;
        }
        Integer[] numArr = new Integer[1];
        String L1 = di.f6.L1(starGiftAttribute.rarity, numArr);
        ey0 ey0Var = s3Var.Z1;
        String str2 = starGiftAttribute.name;
        if (TextUtils.isEmpty(L1)) {
            L1 = null;
        }
        ey0Var.d(str, str2, L1, null, numArr[0]);
    }

    public static void b(s3 s3Var, TL_stars.StarGift starGift) {
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) di.y8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) di.y8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) di.y8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        a(s3Var, hd.N0(2131750370, null), stargiftattributemodel);
        a(s3Var, hd.N0(2131750363, null), stargiftattributepattern);
        a(s3Var, hd.N0(2131750371, null), stargiftattributebackdrop);
    }

    public static void c(s3 s3Var, long j3, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ey0 ey0Var = s3Var.Z1;
        if (i7 < 0) {
            return;
        }
        if (i7 > 0) {
            ey0Var.e(hd.N0(2131749574, null), TextUtils.concat(i(n(i7, j3)), " ", oc.b(g(i7), null, h6Var, null)), null, null);
        }
        ey0Var.e(hd.N0(2131749531, null), i(j3 - n(i7, j3)), null, null);
    }

    public static void d(final Context context, final int i7, final TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, final org.telegram.ui.ActionBar.h6 h6Var, ai.y1 y1Var, lc lcVar, final c1.a aVar, final di.f2 f2Var) {
        if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            return;
        }
        final long e10 = k10.i(i7).e();
        final long j10 = (j3 == 0 || j3 == e10) ? 0L : j3;
        TLRPC.InputPeer l1 = j10 != 0 ? np.u1(i7).l1(j10) : null;
        if (j10 == 0 || l1 != null) {
            final long j11 = tL_starGiftUnique.getResellAmount(cg.b.b).b;
            long A = org.telegram.ui.Wallet.u0.D(i7).A();
            if (A < j11 && ii.n.c(i7)) {
                y1Var.a(Boolean.TRUE);
                u4 u4Var = new u4(y1Var, A, j11, context, i7, h6Var, tL_starGiftUnique, j3, tL_textWithEntities, z10, lcVar, aVar, f2Var);
                boolean z11 = org.telegram.messenger.s2.a;
                hi.d7 d7Var = new hi.d7(u4Var, 3);
                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                tL_payments_getStarsRevenueStats.ton = true;
                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new ai.g1(d7Var, 13));
                return;
            }
            if (s3.e1(context, i7, h6Var, j11, 2131749613)) {
                TL_stars.buyStarGiftOnchain buystargiftonchain = new TL_stars.buyStarGiftOnchain();
                buystargiftonchain.slug = tL_starGiftUnique.slug;
                buystargiftonchain.expected_amount = j11;
                buystargiftonchain.peer = l1;
                buystargiftonchain.message = tL_textWithEntities;
                buystargiftonchain.show_name = z10;
                final String h = h(tL_starGiftUnique);
                o(context, i7, buystargiftonchain, Boolean.valueOf(tL_starGiftUnique.fixed_sale), h6Var, y1Var, lcVar, new r10() { // from class: bi.v4
                    @Override // org.telegram.messenger.r10
                    public final void a(Object obj, Object obj2) {
                        String str;
                        org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                        Boolean bool = (Boolean) obj2;
                        boolean booleanValue = bool.booleanValue();
                        long j12 = j11;
                        Context context2 = context;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        if (!booleanValue && p0Var.b != j12) {
                            x4.p(context2, h6Var2, hd.N0(x4.e(bool, 2131749639, 2131749638, 2131749638), null), bool);
                            return;
                        }
                        p0Var.h = new TL_wallet.walletOnchainGiftActionBuy();
                        long j13 = p0Var.b;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        p0Var.i = tL_starGiftUnique2;
                        int i10 = i7;
                        s3 s3Var = new s3(i10, context2, tL_starGiftUnique2, h6Var2);
                        String N0 = hd.N0(2131749657, null);
                        int i11 = bool.booleanValue() ? 2131749658 : 2131749659;
                        String a02 = hd.a0(null, null, 2131749618, cg.a.j(j12, cg.b.b).d());
                        String str2 = h;
                        s3Var.k1(org.telegram.messenger.g0.W2(hd.a0(null, null, i11, str2, a02)), N0);
                        String N02 = hd.N0(2131749534, null);
                        SpannableStringBuilder l10 = x4.l(j12);
                        ey0 ey0Var = s3Var.Z1;
                        ey0Var.e(N02, l10, null, null);
                        if (j13 > j12) {
                            ey0Var.e(hd.N0(2131749539, null), x4.i(j13 - j12), null, null);
                        }
                        long j14 = j10;
                        if (j14 != 0) {
                            ey0Var.e(hd.N0(2131742774, null), org.telegram.messenger.n5.l(i10, j14), null, null);
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                            if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                str = null;
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
                                gj.b(spannableStringBuilder, tL_textWithEntities2.entities, false, false, false, false, 0);
                                str = null;
                                ey0Var.e(hd.N0(2131748410, null), org.telegram.messenger.j6.m(spannableStringBuilder, null, false, null, 0), null, null);
                            }
                        } else {
                            str = null;
                            ey0Var.e(hd.N0(2131749531, null), str2, null, null);
                        }
                        x4.b(s3Var, tL_starGiftUnique2);
                        s3Var.d2.i(hd.N0(2131749660, str), false, true);
                        s3Var.q2 = 2131749613;
                        s3Var.j1(p0Var);
                        s3Var.i1(new e0(aVar, tL_starGiftUnique2, j14, str2, i10), new l4(tL_starGiftUnique2, str2, f2Var, i10, j14, e10), new k4(context2, i10, h6Var2, s3Var, bool, 1));
                        s3Var.show();
                    }
                });
            }
        }
    }

    public static int e(Boolean bool, int i7, int i10, int i11) {
        return bool == null ? i11 : bool.booleanValue() ? i10 : i7;
    }

    public static int f(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique == null || (tL_starGiftUnique.flags & TLObject.FLAG_20) == 0 || (i7 = tL_starGiftUnique.fee_bps) < 0) {
            return -1;
        }
        return i7;
    }

    public static String g(int i7) {
        StringBuilder sb2 = new StringBuilder();
        BigDecimal movePointLeft = new BigDecimal(i7).movePointLeft(2);
        sb2.append((movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        sb2.append("%");
        return sb2.toString();
    }

    public static String h(TL_stars.StarGift starGift) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(starGift.title);
        sb2.append(" #");
        return i5.c.l(starGift.num, ',', sb2);
    }

    public static SpannableStringBuilder i(long j3) {
        return pb.b1(true, "⭐️ " + cg.a.j(j3, cg.b.b).d(), 0.8f, null);
    }

    public static SpannableStringBuilder j(long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j3));
        spannableStringBuilder.setSpan(new StrikethroughSpan(), TextUtils.indexOf((CharSequence) spannableStringBuilder, ' ') + 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j3) {
        return hd.a0(null, null, 2131749618, org.telegram.ui.Wallet.u0.t(j3, false));
    }

    public static SpannableStringBuilder l(long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j3));
        String t6 = t(j3);
        if (t6 != null) {
            spannableStringBuilder.append((CharSequence) " (~").append((CharSequence) t6).append((CharSequence) ")");
        }
        return spannableStringBuilder;
    }

    public static boolean m(TL_stars.StarGift starGift) {
        ArrayList<TL_stars.StarsAmount> arrayList;
        return (!u(starGift) || (arrayList = starGift.resell_amount) == null || arrayList.isEmpty()) ? false : true;
    }

    public static long n(int i7, long j3) {
        if (j3 <= 0 || i7 <= 0) {
            return 0L;
        }
        long j10 = i7;
        return (((j3 % 10000) * j10) / 10000) + ((j3 / 10000) * j10);
    }

    public static void o(Context context, int i7, TLMethod tLMethod, Boolean bool, org.telegram.ui.ActionBar.h6 h6Var, y10 y10Var, lc lcVar, r10 r10Var) {
        y10Var.a(Boolean.TRUE);
        ConnectionsManager.getInstance(i7).sendRequestTyped(tLMethod, new d3.b(1), new m4(y10Var, context, i7, h6Var, lcVar, bool, r10Var));
    }

    public static void p(Context context, org.telegram.ui.ActionBar.h6 h6Var, String str, Boolean bool) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = hd.N0(bool == null ? R.string.AppName : bool.booleanValue() ? 2131749625 : 2131749626, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = str;
        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02af A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar, String str, Boolean bool) {
        int i10;
        boolean z10;
        String N0;
        str.getClass();
        i10 = 20;
        z10 = true;
        switch (str) {
            case "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT":
                N0 = hd.N0(2131749597, null);
                if (!z10 && lcVar != null) {
                    lcVar.t(N0, h6Var).j();
                    break;
                } else {
                    p(context, h6Var, N0, bool);
                    break;
                }
            case "STARGIFT_ONCHAIN_OFFER_ALREADY_ACTIVE":
                N0 = hd.N0(2131749599, null);
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "STARGIFT_ONCHAIN_ITEM_NOT_FOUND":
            case "STARGIFT_ONCHAIN_NOT_FOR_SALE":
                N0 = hd.N0(e(bool, 2131749646, 2131749645, 2131749645), null);
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "STARGIFT_ONCHAIN_SALE_ACTIVE":
                N0 = hd.N0(e(bool, 2131749635, 2131749634, 2131749634), null);
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "STARGIFT_ONCHAIN_PRICE_INVALID":
                org.telegram.messenger.p0 p0Var = np.u1(i7).A7;
                long j3 = ((org.telegram.messenger.l0) p0Var.r.b).c;
                long j10 = ((org.telegram.messenger.l0) p0Var.s.b).c;
                N0 = (j3 <= 0 || j10 <= j3) ? hd.N0(2131749637, null) : hd.a0(null, null, 2131749636, k(j3), k(j10));
                z10 = false;
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "STARGIFT_ONCHAIN_SALE_INACTIVE":
                N0 = hd.N0(e(bool, 2131749631, 2131749630, 2131749630), null);
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "WALLET_UNLOCK_FAILED":
            case "LOCAL_STORAGE_ERROR":
                N0 = hd.N0(2131742877, null);
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "STARGIFT_ONCHAIN_SALE_DISABLED":
                N0 = hd.N0(e(bool, 2131749633, 2131749632, 2131749632), null);
                z10 = false;
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "WALLET_CREATING":
                N0 = hd.N0(2131749622, null);
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "WALLET_SEND_FAILED":
            case "WALLET_TRANSFER_SEND_FAILED":
                N0 = hd.N0(2131749627, null);
                z10 = false;
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "TRANSACTION_CREATION_FAILED":
                N0 = hd.N0(2131749624, null);
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "PEER_INVALID":
                N0 = hd.N0(e(bool, 2131749648, 2131749647, 2131749647), null);
                z10 = false;
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "WALLET_UNSUPPORTED_SEND_MODE":
                N0 = hd.N0(2131749623, null);
                z10 = false;
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "STARGIFT_ONCHAIN_NOT_OWNER":
                N0 = hd.N0(e(bool, 2131749642, 2131749641, 2131749642), null);
                z10 = false;
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "PASSCODE_FAILED":
            case "WALLET_SEND_CANCELLED":
                break;
            case "STARGIFT_ONCHAIN_NOT_MINTED":
                N0 = hd.N0(e(bool, 2131749644, 2131749643, 2131749643), null);
                z10 = false;
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "STARGIFT_ONCHAIN_OFFER_NOT_ACTIVE":
                N0 = hd.N0(2131749640, null);
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "STARGIFT_ONCHAIN_SELF_PURCHASE":
                N0 = hd.N0(e(bool, 2131749629, 2131749628, 2131749628), null);
                z10 = false;
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            case "WALLET_UNAVAILABLE":
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                String N02 = hd.N0(2131749508, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N02;
                t1Var.U = hd.N0(e(bool, 2131749621, 2131749620, 2131749620), null);
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                alertDialog$Builder.k(hd.N0(2131749543, null), new a3.l(i10));
                alertDialog$Builder.p();
                break;
            case "STARGIFT_ONCHAIN_PRICE_CHANGED":
                N0 = hd.N0(e(bool, 2131749639, 2131749638, 2131749638), null);
                z10 = false;
                if (!z10) {
                }
                p(context, h6Var, N0, bool);
                break;
            default:
                if (lcVar == null) {
                    lc.c0(str);
                    break;
                } else {
                    lcVar.f0(str, false);
                    break;
                }
        }
    }

    public static void r(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar, TLRPC.TL_error tL_error, Boolean bool) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null) {
            str = "NULL_ERROR";
        }
        q(context, i7, h6Var, lcVar, str, bool);
    }

    public static void s(TL_stars.StarGift starGift, String str) {
        org.telegram.messenger.g0.g3(new a1.e(27, starGift, str));
    }

    public static String t(long j3) {
        double f10 = cg.a.j(j3, cg.b.b).f();
        if (f10 <= 0.0d) {
            return null;
        }
        org.telegram.messenger.r1.i().getClass();
        return org.telegram.messenger.r1.g("USD", 2, (long) (f10 * 100.0d), false);
    }

    public static boolean u(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return false;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
        return tL_starGiftUnique.onchain_sale || tL_starGiftUnique.fixed_sale;
    }
}
