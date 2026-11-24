// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class cq7 {
    public static final int[] a = {3000, 3000, 4000, 5000, 10000, 15000, 30000, 60000};
    public static final int[] b = {5000, 10000, 15000, 30000, 60000, 120000, 180000, 300000};

    public static void a(mp7 mp7Var, String str, TL_stars.StarGiftAttribute starGiftAttribute) {
        if (starGiftAttribute == null) {
            return;
        }
        Integer[] numArr = new Integer[1];
        String z1 = vqa.z1(starGiftAttribute.rarity, numArr);
        mfb mfbVar = mp7Var.Y1;
        String str2 = starGiftAttribute.name;
        if (TextUtils.isEmpty(z1)) {
            z1 = null;
        }
        mfbVar.e(str, str2, z1, null, numArr[0]);
    }

    public static void b(mp7 mp7Var, TL_stars.StarGift starGift) {
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) gta.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        a(mp7Var, k96.M0(2131750371, null), stargiftattributemodel);
        a(mp7Var, k96.M0(2131750364, null), stargiftattributepattern);
        a(mp7Var, k96.M0(2131750372, null), stargiftattributebackdrop);
    }

    public static void c(mp7 mp7Var, long j, int i, wjb wjbVar) {
        mfb mfbVar = mp7Var.Y1;
        if (i < 0) {
            return;
        }
        if (i > 0) {
            mfbVar.f(k96.M0(2131749575, null), TextUtils.concat(i(n(i, j)), " ", r41.b(g(i), null, wjbVar, null)), null, null);
        }
        mfbVar.f(k96.M0(2131749532, null), i(j - n(i, j)), null, null);
    }

    public static void d(final Context context, final int i, final TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, final TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, final wjb wjbVar, nu9 nu9Var, u21 u21Var, final t7a t7aVar, final t7a t7aVar2) {
        if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            return;
        }
        final long e = y6c.h(i).e();
        final long j2 = (j == 0 || j == e) ? 0L : j;
        TLRPC.InputPeer h1 = j2 != 0 ? na7.q1(i).h1(j2) : null;
        if (j2 == 0 || h1 != null) {
            final long j3 = tL_starGiftUnique.getResellAmount(oj.b).b;
            long z2 = c.C(i).z();
            if (z2 < j3 && uz4.c(i)) {
                nu9Var.a(Boolean.TRUE);
                aq7 aq7Var = new aq7(nu9Var, z2, j3, context, i, wjbVar, tL_starGiftUnique, j, tL_textWithEntities, z, u21Var, t7aVar, t7aVar2);
                boolean z3 = w01.a;
                ur4 ur4Var = new ur4((Object) aq7Var, (byte) 4);
                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                tL_payments_getStarsRevenueStats.ton = true;
                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new tf(ur4Var, (byte) 28));
                return;
            }
            if (mp7.Y0(context, i, wjbVar, j3, 2131749614)) {
                TL_stars.buyStarGiftOnchain buystargiftonchain = new TL_stars.buyStarGiftOnchain();
                buystargiftonchain.slug = tL_starGiftUnique.slug;
                buystargiftonchain.expected_amount = j3;
                buystargiftonchain.peer = h1;
                buystargiftonchain.message = tL_textWithEntities;
                buystargiftonchain.show_name = z;
                final String h = h(tL_starGiftUnique);
                o(context, i, buystargiftonchain, Boolean.valueOf(tL_starGiftUnique.fixed_sale), wjbVar, nu9Var, u21Var, new i8c() { // from class: bq7
                    @Override // i8c
                    public final void a(Object obj, Object obj2) {
                        String str;
                        w05 w05Var = (w05) obj;
                        Boolean bool = (Boolean) obj2;
                        boolean booleanValue = bool.booleanValue();
                        long j4 = j3;
                        Context context2 = context;
                        wjb wjbVar2 = wjbVar;
                        if (!booleanValue && w05Var.b != j4) {
                            cq7.p(context2, wjbVar2, k96.M0(cq7.e(bool, 2131749640, 2131749639, 2131749639), null), bool);
                            return;
                        }
                        w05Var.h = new TL_wallet.walletOnchainGiftActionBuy();
                        long j5 = w05Var.b;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        w05Var.i = tL_starGiftUnique2;
                        int i2 = i;
                        mp7 mp7Var = new mp7(context2, i2, tL_starGiftUnique2, wjbVar2);
                        String M0 = k96.M0(2131749658, null);
                        int i3 = bool.booleanValue() ? 2131749659 : 2131749660;
                        String a0 = k96.a0(null, null, 2131749619, nj.j(j4, oj.b).d());
                        String str2 = h;
                        mp7Var.e1(gl.S2(k96.a0(null, null, i3, str2, a0)), M0);
                        String M02 = k96.M0(2131749535, null);
                        SpannableStringBuilder l = cq7.l(j4);
                        mfb mfbVar = mp7Var.Y1;
                        mfbVar.f(M02, l, null, null);
                        if (j5 > j4) {
                            mfbVar.f(k96.M0(2131749540, null), cq7.i(j5 - j4), null, null);
                        }
                        long j6 = j2;
                        if (j6 != 0) {
                            mfbVar.f(k96.M0(2131742777, null), cf3.k(i2, j6), null, null);
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                            if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                str = null;
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
                                k27.b(spannableStringBuilder, tL_textWithEntities2.entities, false, false, false, false, 0);
                                str = null;
                                mfbVar.f(k96.M0(2131748411, null), vu3.m(spannableStringBuilder, null, false, null, 0), null, null);
                            }
                        } else {
                            str = null;
                            mfbVar.f(k96.M0(2131749532, null), str2, null, null);
                        }
                        cq7.b(mp7Var, tL_starGiftUnique2);
                        mp7Var.c2.i(k96.M0(2131749661, str), false, true);
                        mp7Var.p2 = 2131749614;
                        mp7Var.d1(w05Var);
                        mp7Var.c1(new wy(t7aVar, tL_starGiftUnique2, j6, str2, i2), new rb2(tL_starGiftUnique2, str2, t7aVar2, i2, j6, e), new xp7(context2, i2, wjbVar2, mp7Var, bool, (byte) 1));
                        mp7Var.show();
                    }
                });
            }
        }
    }

    public static int e(Boolean bool, int i, int i2, int i3) {
        return bool == null ? i3 : bool.booleanValue() ? i2 : i;
    }

    public static int f(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i;
        if (tL_starGiftUnique == null || (tL_starGiftUnique.flags & TLObject.FLAG_20) == 0 || (i = tL_starGiftUnique.fee_bps) < 0) {
            return -1;
        }
        return i;
    }

    public static String g(int i) {
        StringBuilder sb = new StringBuilder();
        BigDecimal movePointLeft = new BigDecimal(i).movePointLeft(2);
        sb.append((movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
        sb.append("%");
        return sb.toString();
    }

    public static String h(TL_stars.StarGift starGift) {
        StringBuilder sb = new StringBuilder();
        sb.append(starGift.title);
        sb.append(" #");
        return ls6.m(starGift.num, ',', sb);
    }

    public static SpannableStringBuilder i(long j) {
        return jva.a1(true, "⭐️ ".concat(nj.j(j, oj.b).d()), 0.8f, null);
    }

    public static SpannableStringBuilder j(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j));
        spannableStringBuilder.setSpan(new StrikethroughSpan(), TextUtils.indexOf((CharSequence) spannableStringBuilder, ' ') + 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j) {
        return k96.a0(null, null, 2131749619, c.s(j, false));
    }

    public static SpannableStringBuilder l(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j));
        String t = t(j);
        if (t != null) {
            spannableStringBuilder.append((CharSequence) " (~").append((CharSequence) t).append((CharSequence) ")");
        }
        return spannableStringBuilder;
    }

    public static boolean m(TL_stars.StarGift starGift) {
        ArrayList<TL_stars.StarsAmount> arrayList;
        return (!u(starGift) || (arrayList = starGift.resell_amount) == null || arrayList.isEmpty()) ? false : true;
    }

    public static long n(int i, long j) {
        if (j <= 0 || i <= 0) {
            return 0L;
        }
        long j2 = i;
        return (((j % 10000) * j2) / 10000) + ((j / 10000) * j2);
    }

    public static void o(Context context, int i, TLMethod tLMethod, Boolean bool, wjb wjbVar, p8c p8cVar, u21 u21Var, i8c i8cVar) {
        p8cVar.a(Boolean.TRUE);
        ConnectionsManager.getInstance(i).sendRequestTyped(tLMethod, new hc((byte) 0), new ah4(p8cVar, context, i, wjbVar, u21Var, bool, i8cVar));
    }

    public static void p(Context context, wjb wjbVar, String str, Boolean bool) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(bool == null ? R.string.AppName : bool.booleanValue() ? 2131749626 : 2131749627, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = str;
        b00.t(null, 2131747638, alertDialog$Builder, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0281 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(Context context, int i, wjb wjbVar, u21 u21Var, String str, Boolean bool) {
        byte b2;
        boolean z;
        String M0;
        str.getClass();
        b2 = 5;
        z = true;
        switch (str) {
            case "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT":
                M0 = k96.M0(2131749598, null);
                if (!z && u21Var != null) {
                    u21Var.t(M0, wjbVar).j();
                    break;
                } else {
                    p(context, wjbVar, M0, bool);
                    break;
                }
            case "STARGIFT_ONCHAIN_OFFER_ALREADY_ACTIVE":
                M0 = k96.M0(2131749600, null);
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_ITEM_NOT_FOUND":
            case "STARGIFT_ONCHAIN_NOT_FOR_SALE":
                M0 = k96.M0(e(bool, 2131749647, 2131749646, 2131749646), null);
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_SALE_ACTIVE":
                M0 = k96.M0(e(bool, 2131749636, 2131749635, 2131749635), null);
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_PRICE_INVALID":
                gr grVar = na7.q1(i).k4;
                long f = grVar.q.f();
                long f2 = grVar.r.f();
                M0 = (f <= 0 || f2 <= f) ? k96.M0(2131749638, null) : k96.a0(null, null, 2131749637, k(f), k(f2));
                z = false;
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_SALE_INACTIVE":
                M0 = k96.M0(e(bool, 2131749632, 2131749631, 2131749631), null);
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "WALLET_UNLOCK_FAILED":
            case "LOCAL_STORAGE_ERROR":
                M0 = k96.M0(2131742880, null);
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_SALE_DISABLED":
                M0 = k96.M0(e(bool, 2131749634, 2131749633, 2131749633), null);
                z = false;
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "WALLET_CREATING":
                M0 = k96.M0(2131749623, null);
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "WALLET_SEND_FAILED":
            case "WALLET_TRANSFER_SEND_FAILED":
                M0 = k96.M0(2131749628, null);
                z = false;
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "TRANSACTION_CREATION_FAILED":
                M0 = k96.M0(2131749625, null);
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "PEER_INVALID":
                M0 = k96.M0(e(bool, 2131749649, 2131749648, 2131749648), null);
                z = false;
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "WALLET_UNSUPPORTED_SEND_MODE":
                M0 = k96.M0(2131749624, null);
                z = false;
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_NOT_OWNER":
                M0 = k96.M0(e(bool, 2131749643, 2131749642, 2131749643), null);
                z = false;
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "PASSCODE_FAILED":
            case "WALLET_SEND_CANCELLED":
                break;
            case "STARGIFT_ONCHAIN_NOT_MINTED":
                M0 = k96.M0(e(bool, 2131749645, 2131749644, 2131749644), null);
                z = false;
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_OFFER_NOT_ACTIVE":
                M0 = k96.M0(2131749641, null);
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_SELF_PURCHASE":
                M0 = k96.M0(e(bool, 2131749630, 2131749629, 2131749629), null);
                z = false;
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            case "WALLET_UNAVAILABLE":
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                String M02 = k96.M0(2131749509, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M02;
                hdVar.U = k96.M0(e(bool, 2131749622, 2131749621, 2131749621), null);
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.j(k96.M0(2131749544, null), new fi7(b2));
                alertDialog$Builder.o();
                break;
            case "STARGIFT_ONCHAIN_PRICE_CHANGED":
                M0 = k96.M0(e(bool, 2131749640, 2131749639, 2131749639), null);
                z = false;
                if (!z) {
                }
                p(context, wjbVar, M0, bool);
                break;
            default:
                if (u21Var == null) {
                    u21.c0(str);
                    break;
                } else {
                    u21Var.f0(str, false);
                    break;
                }
        }
    }

    public static void r(Context context, int i, wjb wjbVar, u21 u21Var, TLRPC.TL_error tL_error, Boolean bool) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null) {
            str = "NULL_ERROR";
        }
        q(context, i, wjbVar, u21Var, str, bool);
    }

    public static void s(TL_stars.StarGift starGift, String str) {
        gl.c3(new bj7(starGift, str, (byte) 12));
    }

    public static String t(long j) {
        double f = nj.j(j, oj.b).f();
        if (f <= 0.0d) {
            return null;
        }
        ci0.h();
        return ci0.f("USD", 2, (long) (f * 100.0d), false);
    }

    public static boolean u(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return false;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
        return tL_starGiftUnique.onchain_sale || tL_starGiftUnique.fixed_sale;
    }
}
