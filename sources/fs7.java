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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class fs7 {
    public static final int[] a = {3000, 3000, 4000, 5000, 10000, 15000, 30000, 60000};
    public static final int[] b = {5000, 10000, 15000, 30000, 60000, 120000, 180000, 300000};

    public static void a(pr7 pr7Var, String str, TL_stars.StarGiftAttribute starGiftAttribute) {
        if (starGiftAttribute == null) {
            return;
        }
        Integer[] numArr = new Integer[1];
        String z1 = wsa.z1(starGiftAttribute.rarity, numArr);
        mhb mhbVar = pr7Var.Y1;
        String str2 = starGiftAttribute.name;
        if (TextUtils.isEmpty(z1)) {
            z1 = null;
        }
        mhbVar.e(str, str2, z1, null, numArr[0]);
    }

    public static void b(pr7 pr7Var, TL_stars.StarGift starGift) {
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) jva.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) jva.i(starGift.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        a(pr7Var, jb6.M0(2131750320, null), stargiftattributemodel);
        a(pr7Var, jb6.M0(2131750313, null), stargiftattributepattern);
        a(pr7Var, jb6.M0(2131750321, null), stargiftattributebackdrop);
    }

    public static void c(pr7 pr7Var, long j, int i, ylb ylbVar) {
        mhb mhbVar = pr7Var.Y1;
        if (i < 0) {
            return;
        }
        if (i > 0) {
            mhbVar.f(jb6.M0(2131749524, null), TextUtils.concat(i(n(i, j)), " ", y51.b(g(i), null, ylbVar, null)), null, null);
        }
        mhbVar.f(jb6.M0(2131749481, null), i(j - n(i, j)), null, null);
    }

    public static void d(final Context context, final int i, final TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, final TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, final ylb ylbVar, ts9 ts9Var, c41 c41Var, final e6a e6aVar, final e6a e6aVar2) {
        if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            return;
        }
        final long e = z8c.h(i).e();
        final long j2 = (j == 0 || j == e) ? 0L : j;
        TLRPC.InputPeer i1 = j2 != 0 ? oc7.r1(i).i1(j2) : null;
        if (j2 == 0 || i1 != null) {
            final long j3 = tL_starGiftUnique.getResellAmount(ok.b).b;
            long z2 = c.C(i).z();
            if (z2 < j3 && u15.c(i)) {
                ts9Var.a(Boolean.TRUE);
                ds7 ds7Var = new ds7(ts9Var, z2, j3, context, i, ylbVar, tL_starGiftUnique, j, tL_textWithEntities, z, c41Var, e6aVar, e6aVar2);
                boolean z3 = e21.a;
                vt4 vt4Var = new vt4((Object) ds7Var, (byte) 4);
                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                tL_payments_getStarsRevenueStats.ton = true;
                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new tg(vt4Var, (byte) 29));
                return;
            }
            if (pr7.Y0(context, i, ylbVar, j3, 2131749563)) {
                TL_stars.buyStarGiftOnchain buystargiftonchain = new TL_stars.buyStarGiftOnchain();
                buystargiftonchain.slug = tL_starGiftUnique.slug;
                buystargiftonchain.expected_amount = j3;
                buystargiftonchain.peer = i1;
                buystargiftonchain.message = tL_textWithEntities;
                buystargiftonchain.show_name = z;
                final String h = h(tL_starGiftUnique);
                o(context, i, buystargiftonchain, Boolean.valueOf(tL_starGiftUnique.fixed_sale), ylbVar, ts9Var, c41Var, new jac() { // from class: es7
                    @Override // jac
                    public final void a(Object obj, Object obj2) {
                        String str;
                        w25 w25Var = (w25) obj;
                        Boolean bool = (Boolean) obj2;
                        boolean booleanValue = bool.booleanValue();
                        long j4 = j3;
                        Context context2 = context;
                        ylb ylbVar2 = ylbVar;
                        if (!booleanValue && w25Var.b != j4) {
                            fs7.p(context2, ylbVar2, jb6.M0(fs7.e(bool, 2131749589, 2131749588, 2131749588), null), bool);
                            return;
                        }
                        w25Var.h = new TL_wallet.walletOnchainGiftActionBuy();
                        long j5 = w25Var.b;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        w25Var.i = tL_starGiftUnique2;
                        int i2 = i;
                        pr7 pr7Var = new pr7(context2, i2, tL_starGiftUnique2, ylbVar2);
                        String M0 = jb6.M0(2131749607, null);
                        int i3 = bool.booleanValue() ? 2131749608 : 2131749609;
                        String a0 = jb6.a0(null, null, 2131749568, nk.j(j4, ok.b).d());
                        String str2 = h;
                        pr7Var.e1(gm.S2(jb6.a0(null, null, i3, str2, a0)), M0);
                        String M02 = jb6.M0(2131749484, null);
                        SpannableStringBuilder l = fs7.l(j4);
                        mhb mhbVar = pr7Var.Y1;
                        mhbVar.f(M02, l, null, null);
                        if (j5 > j4) {
                            mhbVar.f(jb6.M0(2131749489, null), fs7.i(j5 - j4), null, null);
                        }
                        long j6 = j2;
                        if (j6 != 0) {
                            mhbVar.f(jb6.M0(2131742703, null), pg3.k(i2, j6), null, null);
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                            if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                str = null;
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
                                k47.b(spannableStringBuilder, tL_textWithEntities2.entities, false, false, false, false, 0);
                                str = null;
                                mhbVar.f(jb6.M0(2131748360, null), gw3.m(spannableStringBuilder, null, false, null, 0), null, null);
                            }
                        } else {
                            str = null;
                            mhbVar.f(jb6.M0(2131749481, null), str2, null, null);
                        }
                        fs7.b(pr7Var, tL_starGiftUnique2);
                        pr7Var.c2.i(jb6.M0(2131749610, str), false, true);
                        pr7Var.p2 = 2131749563;
                        pr7Var.d1(w25Var);
                        pr7Var.c1(new wz(e6aVar, tL_starGiftUnique2, j6, str2, i2), new cd2(tL_starGiftUnique2, str2, e6aVar2, i2, j6, e), new as7(context2, i2, ylbVar2, pr7Var, bool, (byte) 1));
                        pr7Var.show();
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
        return kt6.m(starGift.num, ',', sb);
    }

    public static SpannableStringBuilder i(long j) {
        return nxa.b1(true, "⭐️ ".concat(nk.j(j, ok.b).d()), 0.8f, null);
    }

    public static SpannableStringBuilder j(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j));
        spannableStringBuilder.setSpan(new StrikethroughSpan(), TextUtils.indexOf((CharSequence) spannableStringBuilder, ' ') + 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j) {
        return jb6.a0(null, null, 2131749568, c.s(j, false));
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

    public static void o(Context context, int i, TLMethod tLMethod, Boolean bool, ylb ylbVar, qac qacVar, c41 c41Var, jac jacVar) {
        qacVar.a(Boolean.TRUE);
        ConnectionsManager.getInstance(i).sendRequestTyped(tLMethod, new kc((byte) 0), new cj4(qacVar, context, i, ylbVar, c41Var, bool, jacVar));
    }

    public static void p(Context context, ylb ylbVar, String str, Boolean bool) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(bool == null ? R.string.AppName : bool.booleanValue() ? 2131749575 : 2131749576, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = str;
        b10.t(null, 2131747564, alertDialog$Builder, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0281 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(Context context, int i, ylb ylbVar, c41 c41Var, String str, Boolean bool) {
        byte b2;
        boolean z;
        String M0;
        str.getClass();
        b2 = 7;
        z = true;
        switch (str) {
            case "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT":
                M0 = jb6.M0(2131749547, null);
                if (!z && c41Var != null) {
                    c41Var.t(M0, ylbVar).j();
                    break;
                } else {
                    p(context, ylbVar, M0, bool);
                    break;
                }
            case "STARGIFT_ONCHAIN_OFFER_ALREADY_ACTIVE":
                M0 = jb6.M0(2131749549, null);
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_ITEM_NOT_FOUND":
            case "STARGIFT_ONCHAIN_NOT_FOR_SALE":
                M0 = jb6.M0(e(bool, 2131749596, 2131749595, 2131749595), null);
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_SALE_ACTIVE":
                M0 = jb6.M0(e(bool, 2131749585, 2131749584, 2131749584), null);
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_PRICE_INVALID":
                gs gsVar = oc7.r1(i).l4;
                long f = gsVar.q.f();
                long f2 = gsVar.r.f();
                M0 = (f <= 0 || f2 <= f) ? jb6.M0(2131749587, null) : jb6.a0(null, null, 2131749586, k(f), k(f2));
                z = false;
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_SALE_INACTIVE":
                M0 = jb6.M0(e(bool, 2131749581, 2131749580, 2131749580), null);
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "WALLET_UNLOCK_FAILED":
            case "LOCAL_STORAGE_ERROR":
                M0 = jb6.M0(2131742806, null);
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_SALE_DISABLED":
                M0 = jb6.M0(e(bool, 2131749583, 2131749582, 2131749582), null);
                z = false;
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "WALLET_CREATING":
                M0 = jb6.M0(2131749572, null);
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "WALLET_SEND_FAILED":
            case "WALLET_TRANSFER_SEND_FAILED":
                M0 = jb6.M0(2131749577, null);
                z = false;
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "TRANSACTION_CREATION_FAILED":
                M0 = jb6.M0(2131749574, null);
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "PEER_INVALID":
                M0 = jb6.M0(e(bool, 2131749598, 2131749597, 2131749597), null);
                z = false;
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "WALLET_UNSUPPORTED_SEND_MODE":
                M0 = jb6.M0(2131749573, null);
                z = false;
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_NOT_OWNER":
                M0 = jb6.M0(e(bool, 2131749592, 2131749591, 2131749592), null);
                z = false;
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "PASSCODE_FAILED":
            case "WALLET_SEND_CANCELLED":
                break;
            case "STARGIFT_ONCHAIN_NOT_MINTED":
                M0 = jb6.M0(e(bool, 2131749594, 2131749593, 2131749593), null);
                z = false;
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_OFFER_NOT_ACTIVE":
                M0 = jb6.M0(2131749590, null);
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "STARGIFT_ONCHAIN_SELF_PURCHASE":
                M0 = jb6.M0(e(bool, 2131749579, 2131749578, 2131749578), null);
                z = false;
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            case "WALLET_UNAVAILABLE":
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                String M02 = jb6.M0(2131749458, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M02;
                heVar.U = jb6.M0(e(bool, 2131749571, 2131749570, 2131749570), null);
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131749493, null), new bh7(b2));
                alertDialog$Builder.o();
                break;
            case "STARGIFT_ONCHAIN_PRICE_CHANGED":
                M0 = jb6.M0(e(bool, 2131749589, 2131749588, 2131749588), null);
                z = false;
                if (!z) {
                }
                p(context, ylbVar, M0, bool);
                break;
            default:
                if (c41Var == null) {
                    c41.c0(str);
                    break;
                } else {
                    c41Var.f0(str, false);
                    break;
                }
        }
    }

    public static void r(Context context, int i, ylb ylbVar, c41 c41Var, TLRPC.TL_error tL_error, Boolean bool) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null) {
            str = "NULL_ERROR";
        }
        q(context, i, ylbVar, c41Var, str, bool);
    }

    public static void s(TL_stars.StarGift starGift, String str) {
        gm.c3(new bl7(starGift, str, (byte) 13));
    }

    public static String t(long j) {
        double f = nk.j(j, ok.b).f();
        if (f <= 0.0d) {
            return null;
        }
        cj0.h();
        return cj0.f("USD", 2, (long) (f * 100.0d), false);
    }

    public static boolean u(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return false;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
        return tL_starGiftUnique.onchain_sale || tL_starGiftUnique.fixed_sale;
    }
}
