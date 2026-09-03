package eg;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import lh.b5;
import lh.h4;
import lh.q5;
import lh.r5;
import mh.aa;
import mh.da;
import mh.ga;
import mh.ja;
import mh.l7;
import mh.t7;
import mh.t9;
import mh.z9;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xt;
import org.telegram.ui.du;
import org.telegram.ui.z91;
import qh.n4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c6  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 0;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                n4 n4Var = (n4) obj3;
                n4Var.v0 = ((Integer) obj).intValue();
                n4Var.w0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new ag.e(n4Var, 24), 60L);
                break;
            case 1:
                hh.f fVar = (hh.f) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = fVar.X;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.i0;
                    arrayList.add(h51.D(0, dp2));
                    int i15 = dp - dp2;
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj4 = arrayList2.get(i16);
                        i16++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.W.get((String) obj4)) {
                            if (TextUtils.isEmpty(fVar.Z) || hg.f2.U(tL_help_country, AndroidUtilities.translitSafe(fVar.Z).toLowerCase())) {
                                i15 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.g0.containsKey(tL_help_country.iso2);
                                int i17 = hh.e.a;
                                h51 J = h51.J(hh.e.class);
                                J.l = tL_help_country.iso2;
                                J.G = tL_help_country;
                                J.e = containsKey;
                                arrayList.add(J);
                            }
                        }
                    }
                    arrayList.add(h51.D(1, Math.max(0, i15)));
                    break;
                }
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj;
                z91 z91Var = ((hh.g) obj3).V;
                if (z91Var != null) {
                    arrayList3.add(h51.C(AndroidUtilities.dp(12.0f)));
                    arrayList3.add(h51.h(0, 0, z91Var));
                    break;
                }
                break;
            case 3:
                ((lh.a1) obj3).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 4:
                lh.d dVar = (lh.d) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.U;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.V;
                        dg.n nVar = new dg.n(11, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i18 = lh.b.a;
                        h51 J2 = h51.J(lh.b.class);
                        J2.G = tL_StarGiftAuctionAcquiredGift;
                        J2.H = auction;
                        J2.D = nVar;
                        arrayList4.add(J2);
                    }
                    arrayList4.add(h51.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 5:
                ((ArrayList) obj).add(((lh.f) obj3).U);
                break;
            case 6:
                ArrayList arrayList5 = (ArrayList) obj;
                arrayList5.add(((lh.s) obj3).V);
                arrayList5.add(h51.C(AndroidUtilities.dp(16.0f)));
                break;
            case 7:
                ((ArrayList) obj).add(h51.j(-1, ((lh.f0) obj3).W));
                break;
            case 8:
                ((ArrayList) obj).add(h51.j(-1, ((lh.m0) obj3).W));
                break;
            case 9:
                ((lh.g2) obj3).U((ArrayList) obj, (w51) obj2);
                break;
            case 10:
                lh.n3 n3Var = (lh.n3) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                or0 or0Var = n3Var.a;
                l7 l7Var = n3Var.e;
                if (l7Var != null) {
                    if ((!l7Var.e || l7Var.g != 783) && l7Var.l.size() <= 0) {
                        l7 l7Var2 = n3Var.e;
                        if (l7Var2.j && !l7Var2.i) {
                        }
                    }
                    l7 l7Var3 = n3Var.e;
                    int max = Math.max(1, (l7Var3 == null || (i10 = l7Var3.n) == 0) ? 3 : Math.min(3, i10));
                    l7 l7Var4 = n3Var.e;
                    if (l7Var4 != null) {
                        ArrayList arrayList7 = l7Var4.l;
                        int size2 = arrayList7.size();
                        int i19 = 3;
                        int i20 = 0;
                        while (i20 < size2) {
                            Object obj5 = arrayList7.get(i20);
                            i20++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                            boolean z4 = n3Var.d;
                            int i21 = lh.w1.a;
                            h51 J3 = h51.J(lh.w1.class);
                            J3.u = 1;
                            J3.z = 0;
                            J3.G = savedStarGift;
                            J3.q = true;
                            J3.f = false;
                            J3.r = z4;
                            J3.h = n3Var.n && (n3Var.e != or0Var.d || savedStarGift.pinned_to_top);
                            arrayList6.add(J3);
                            i19--;
                            if (i19 == 0) {
                                i19 = 3;
                            }
                        }
                        l7 l7Var5 = n3Var.e;
                        if (l7Var5.i || !l7Var5.j) {
                            int i22 = 0;
                            while (true) {
                                if (i22 < (i19 <= 0 ? 3 : i19)) {
                                    i22++;
                                    h51 o10 = h51.o(i22, 34);
                                    o10.u = 1;
                                    arrayList6.add(o10);
                                }
                            }
                        }
                    }
                    if (or0Var.d == n3Var.e) {
                        arrayList6.add(h51.C(AndroidUtilities.dp(20.0f)));
                        if (or0Var.c == UserConfig.getInstance(n3Var.b).getClientUserId()) {
                            int v02 = k6.v0(k6.z6, n3Var.c);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i23 = lh.t3.a;
                            h51 J4 = h51.J(lh.t3.class);
                            J4.l = string;
                            J4.z = 17;
                            J4.B = v02;
                            J4.A = 14.0f;
                            J4.i = dp3;
                            J4.k = 0;
                            J4.q = false;
                            arrayList6.add(J4);
                        }
                        arrayList6.add(h51.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList6.isEmpty()) {
                        arrayList6.add(h51.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList6.add(0, h51.C(AndroidUtilities.dp(n3Var.F ? 42.0f : 12.0f)));
                    }
                    if (n3Var.f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new lh.m2(n3Var, max, 1));
                    }
                    or0Var.o();
                    or0Var.post(new lh.c3(or0Var, 0));
                    break;
                }
                break;
            case 11:
                lh.s3 s3Var = (lh.s3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                l7 l7Var6 = s3Var.V;
                if (l7Var6 != null) {
                    ArrayList arrayList9 = l7Var6.l;
                    arrayList8.add(h51.C(AndroidUtilities.dp(16.0f)));
                    if (l7Var6.i && arrayList9.isEmpty()) {
                        h51 o11 = h51.o(1, 34);
                        o11.u = 1;
                        arrayList8.add(o11);
                        h51 o12 = h51.o(2, 34);
                        o12.u = 1;
                        arrayList8.add(o12);
                        h51 o13 = h51.o(3, 34);
                        o13.u = 1;
                        arrayList8.add(o13);
                        h51 o14 = h51.o(4, 34);
                        o14.u = 1;
                        arrayList8.add(o14);
                        h51 o15 = h51.o(5, 34);
                        o15.u = 1;
                        arrayList8.add(o15);
                        h51 o16 = h51.o(6, 34);
                        o16.u = 1;
                        arrayList8.add(o16);
                        h51 o17 = h51.o(7, 34);
                        o17.u = 1;
                        arrayList8.add(o17);
                        h51 o18 = h51.o(8, 34);
                        o18.u = 1;
                        arrayList8.add(o18);
                        h51 o19 = h51.o(9, 34);
                        o19.u = 1;
                        arrayList8.add(o19);
                    } else {
                        int size3 = arrayList9.size();
                        int i24 = 0;
                        while (true) {
                            int i25 = 3;
                            while (i24 < size3) {
                                Object obj6 = arrayList9.get(i24);
                                i24++;
                                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                                if (!savedStarGift2.collection_id.contains(Integer.valueOf(s3Var.U))) {
                                    int i26 = lh.w1.a;
                                    h51 J5 = h51.J(lh.w1.class);
                                    J5.u = 1;
                                    J5.z = 0;
                                    J5.G = savedStarGift2;
                                    J5.q = true;
                                    J5.f = true;
                                    J5.r = false;
                                    HashSet hashSet = s3Var.W;
                                    int i27 = savedStarGift2.msg_id;
                                    J5.K(hashSet.contains(Long.valueOf(i27 == 0 ? savedStarGift2.saved_id : i27)));
                                    J5.u = 1;
                                    arrayList8.add(J5);
                                    i25--;
                                    if (i25 == 0) {
                                        break;
                                    }
                                }
                            }
                            if (l7Var6.i || !l7Var6.j) {
                                int i28 = 0;
                                while (true) {
                                    if (i28 < (i25 <= 0 ? 3 : i25)) {
                                        i28++;
                                        h51 o20 = h51.o(i28, 34);
                                        o20.u = 1;
                                        arrayList8.add(o20);
                                    }
                                }
                            }
                        }
                    }
                    arrayList8.add(h51.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 12:
                r5 r5Var = (r5) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                b5 b5Var = r5Var.d;
                ArrayList arrayList11 = b5Var.d;
                int size4 = arrayList11.size();
                int i29 = 0;
                while (i29 < size4) {
                    Object obj7 = arrayList11.get(i29);
                    i29++;
                    arrayList10.add(lh.w1.a(0, (TL_stars.TL_starGiftUnique) obj7, false, false, false, true, false));
                }
                if (b5Var.t || !b5Var.u) {
                    h51 o21 = h51.o(-1, 34);
                    o21.u = 1;
                    arrayList10.add(o21);
                    h51 o22 = h51.o(-2, 34);
                    o22.u = 1;
                    arrayList10.add(o22);
                    h51 o23 = h51.o(-3, 34);
                    o23.u = 1;
                    arrayList10.add(o23);
                    if (b5Var.d.isEmpty()) {
                        h51 o24 = h51.o(-4, 34);
                        o24.u = 1;
                        arrayList10.add(o24);
                        h51 o25 = h51.o(-5, 34);
                        o25.u = 1;
                        arrayList10.add(o25);
                        h51 o26 = h51.o(-6, 34);
                        o26.u = 1;
                        arrayList10.add(o26);
                        h51 o27 = h51.o(-7, 34);
                        o27.u = 1;
                        arrayList10.add(o27);
                        h51 o28 = h51.o(-8, 34);
                        o28.u = 1;
                        arrayList10.add(o28);
                        h51 o29 = h51.o(-9, 34);
                        o29.u = 1;
                        arrayList10.add(o29);
                        h51 o30 = h51.o(-10, 34);
                        o30.u = 1;
                        arrayList10.add(o30);
                        h51 o31 = h51.o(-11, 34);
                        o31.u = 1;
                        arrayList10.add(o31);
                        h51 o32 = h51.o(-12, 34);
                        o32.u = 1;
                        arrayList10.add(o32);
                        h51 o33 = h51.o(-13, 34);
                        o33.u = 1;
                        arrayList10.add(o33);
                        h51 o34 = h51.o(-14, 34);
                        o34.u = 1;
                        arrayList10.add(o34);
                        h51 o35 = h51.o(-15, 34);
                        o35.u = 1;
                        arrayList10.add(o35);
                    }
                }
                boolean z10 = arrayList10.isEmpty() && !b5Var.t;
                if (r5Var.x != z10) {
                    r5Var.x = z10;
                    r5Var.w.setVisibility(0);
                    r5Var.w.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.95f).scaleY(z10 ? 1.0f : 0.95f).setInterpolator(pr.h).setDuration(320L).setListener(new h4(r5Var, z10, 1)).start();
                    break;
                }
                break;
            case 13:
                q5.T((q5) obj3, (ArrayList) obj);
                break;
            case 14:
                mh.p.Y((mh.p) obj3, (ArrayList) obj);
                break;
            case 15:
                mh.e0 e0Var = (mh.e0) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                arrayList12.add(h51.k(e0Var.V));
                arrayList12.add(mh.c0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList12.add(mh.c0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new lh.c3(e0Var, 3)), true), R.drawable.msg_bot));
                arrayList12.add(mh.c0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList12.add(mh.c0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList12.add(h51.C(AndroidUtilities.dp(68.0f)));
                break;
            case 16:
                ArrayList arrayList13 = (ArrayList) obj;
                h51 h51Var = ((mh.m0) obj3).s0;
                if (h51Var != null) {
                    arrayList13.add(h51Var);
                    break;
                }
                break;
            case 17:
                mh.i1 i1Var = (mh.i1) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                ArrayList arrayList15 = i1Var.a0;
                boolean z11 = i1Var.t0;
                com.google.android.gms.common.api.internal.r rVar = i1Var.d0;
                ArrayList arrayList16 = i1Var.Y;
                ArrayList arrayList17 = i1Var.X;
                com.google.android.gms.common.api.internal.r rVar2 = i1Var.c0;
                com.google.android.gms.common.api.internal.r rVar3 = i1Var.b0;
                ArrayList arrayList18 = i1Var.Z;
                if (arrayList18 != null && arrayList17 != null && arrayList16 != null) {
                    arrayList14.add(h51.C(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i30 = i1Var.g0.r;
                    if (i30 == 0) {
                        arrayList14.add(h51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z11 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList18.size()))));
                        int size5 = arrayList18.size();
                        int i31 = 0;
                        while (i31 < size5) {
                            Object obj8 = arrayList18.get(i31);
                            i31++;
                            arrayList14.add(mh.f1.a(i30, new mh.e1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList15.isEmpty()) {
                            arrayList14.add(h51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z11 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList18.size()))));
                            int size6 = arrayList15.size();
                            int i32 = 0;
                            while (i32 < size6) {
                                Object obj9 = arrayList15.get(i32);
                                i32++;
                                arrayList14.add(mh.f1.a(i30, new mh.e1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                            break;
                        }
                    } else if (i30 == 1) {
                        arrayList14.add(h51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList17.size()))));
                        int size7 = arrayList17.size();
                        int i33 = 0;
                        while (i33 < size7) {
                            Object obj10 = arrayList17.get(i33);
                            i33++;
                            arrayList14.add(mh.f1.a(i30, new mh.e1((TL_stars.starGiftAttributeBackdrop) obj10, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i30 == 2) {
                        arrayList14.add(h51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList16.size()))));
                        int size8 = arrayList16.size();
                        int i34 = 0;
                        while (i34 < size8) {
                            Object obj11 = arrayList16.get(i34);
                            i34++;
                            arrayList14.add(mh.f1.a(i30, new mh.e1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj11, (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    }
                }
                break;
            case 18:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (callback2 != null) {
                    callback2.run(l10, bool);
                    break;
                }
                break;
            case 19:
                ((ja) obj3).H0((ArrayList) obj, (w51) obj2);
                break;
            case 20:
                ((t9) obj3).R((ArrayList) obj, (w51) obj2);
                break;
            case 21:
                ((z9) obj3).R((ArrayList) obj, (w51) obj2);
                break;
            case 22:
                ((aa) obj3).R((ArrayList) obj, (w51) obj2);
                break;
            case 23:
                ga gaVar = (ga) obj3;
                ArrayList arrayList19 = (ArrayList) obj;
                int i35 = gaVar.c;
                int i36 = gaVar.d;
                long j10 = gaVar.f;
                if (j10 != 0) {
                    mh.a0 g10 = mh.a0.g(i35);
                    ArrayList arrayList20 = g10.k(j10).a[i36];
                    int size9 = arrayList20.size();
                    int i37 = 0;
                    while (i37 < size9) {
                        Object obj12 = arrayList20.get(i37);
                        i37++;
                        int i38 = da.a;
                        h51 J6 = h51.J(da.class);
                        J6.G = (TL_stars.StarsTransaction) obj12;
                        J6.q = true;
                        arrayList19.add(J6);
                    }
                    if (!g10.k(j10).e[i36]) {
                        arrayList19.add(h51.o(arrayList19.size(), 7));
                        arrayList19.add(h51.o(arrayList19.size(), 7));
                        arrayList19.add(h51.o(arrayList19.size(), 7));
                        break;
                    }
                } else {
                    t7 y10 = t7.y(i35, gaVar.e);
                    ArrayList arrayList21 = y10.q[i36];
                    int size10 = arrayList21.size();
                    int i39 = 0;
                    while (i39 < size10) {
                        Object obj13 = arrayList21.get(i39);
                        i39++;
                        int i40 = da.a;
                        h51 J7 = h51.J(da.class);
                        J7.G = (TL_stars.StarsTransaction) obj13;
                        J7.q = false;
                        arrayList19.add(J7);
                    }
                    if (!y10.u[i36]) {
                        arrayList19.add(h51.o(arrayList19.size(), 7));
                        arrayList19.add(h51.o(arrayList19.size(), 7));
                        arrayList19.add(h51.o(arrayList19.size(), 7));
                        break;
                    }
                }
                break;
            case 24:
                final org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) obj3;
                ArrayList arrayList22 = (ArrayList) obj;
                org.telegram.ui.web.i iVar = kVar.y;
                ArrayList arrayList23 = kVar.x;
                if (!kVar.b && arrayList23.isEmpty()) {
                    arrayList22.add(h51.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList24 = new ArrayList();
                String string2 = sharedPreferences.getString("queries_json", null);
                if (string2 != null) {
                    try {
                        ArrayList arrayList25 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string2);
                        for (int i41 = 0; i41 < jSONArray.length(); i41++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i41);
                            try {
                                org.telegram.ui.web.j jVar = new org.telegram.ui.web.j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                jVar.c = jSONObject.optDouble("rank", 0.0d);
                                arrayList25.add(jVar);
                            } catch (Exception unused) {
                                arrayList23.size();
                                arrayList24.size();
                                if (!arrayList23.isEmpty()) {
                                }
                                i11 = 0;
                                while (i11 < arrayList23.size()) {
                                }
                                if (!arrayList24.isEmpty()) {
                                }
                                if (iVar == null) {
                                    return;
                                }
                            }
                        }
                        Collections.sort(arrayList25, new du(14));
                        int size11 = arrayList25.size();
                        int i42 = 0;
                        while (i42 < size11) {
                            Object obj14 = arrayList25.get(i42);
                            i42++;
                            org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj14;
                            if (arrayList24.size() < 20) {
                                arrayList24.add(jVar2.a);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                arrayList23.size();
                arrayList24.size();
                if (!arrayList23.isEmpty()) {
                    arrayList22.add(h51.k(kVar.v));
                }
                i11 = 0;
                while (i11 < arrayList23.size()) {
                    final String str = (String) arrayList23.get(i11);
                    boolean z12 = i11 == 0;
                    boolean z13 = i11 == arrayList23.size() + (-1);
                    final int i43 = 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i43) {
                                case 0:
                                    org.telegram.ui.t tVar = kVar.J;
                                    if (tVar != null) {
                                        tVar.run(str);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.t tVar2 = kVar.J;
                                    if (tVar2 != null) {
                                        tVar2.run(str);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    int i44 = org.telegram.ui.web.d.a;
                    h51 J8 = h51.J(org.telegram.ui.web.d.class);
                    J8.z = 1;
                    J8.l = str;
                    J8.D = onClickListener;
                    J8.q = z12;
                    J8.r = z13;
                    J8.G = Boolean.TRUE;
                    J8.H = kVar;
                    arrayList22.add(J8);
                    i11++;
                }
                if (!arrayList24.isEmpty()) {
                    arrayList22.add(h51.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new org.telegram.ui.Components.voip.o(kVar, i13)));
                    int i45 = 0;
                    while (i45 < arrayList24.size()) {
                        final String str2 = (String) arrayList24.get(i45);
                        boolean z14 = i45 == 0;
                        final int i46 = 1;
                        boolean z15 = i45 == arrayList24.size() - 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i46) {
                                    case 0:
                                        org.telegram.ui.t tVar = kVar.J;
                                        if (tVar != null) {
                                            tVar.run(str2);
                                            break;
                                        }
                                        break;
                                    default:
                                        org.telegram.ui.t tVar2 = kVar.J;
                                        if (tVar2 != null) {
                                            tVar2.run(str2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        int i47 = org.telegram.ui.web.d.a;
                        h51 J9 = h51.J(org.telegram.ui.web.d.class);
                        J9.z = 0;
                        J9.l = str2;
                        J9.D = onClickListener2;
                        J9.q = z14;
                        J9.r = z15;
                        J9.G = Boolean.TRUE;
                        J9.H = kVar;
                        arrayList22.add(J9);
                        i45++;
                    }
                }
                if (iVar == null) {
                    ArrayList arrayList26 = iVar.a;
                    if (!arrayList26.isEmpty()) {
                        arrayList22.add(h51.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i48 = 0; i48 < arrayList26.size(); i48++) {
                            MessageObject messageObject = (MessageObject) arrayList26.get(i48);
                            if (!TextUtils.isEmpty(org.telegram.ui.web.k.a(messageObject))) {
                                int i49 = org.telegram.ui.web.g.a;
                                h51 J10 = h51.J(org.telegram.ui.web.g.class);
                                J10.z = 3;
                                J10.q = true;
                                J10.H = messageObject;
                                arrayList22.add(J10);
                            }
                        }
                        if (!iVar.f) {
                            arrayList22.add(h51.o(arrayList22.size(), 32));
                            arrayList22.add(h51.o(arrayList22.size(), 32));
                            arrayList22.add(h51.o(arrayList22.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 25:
                ArrayList arrayList27 = (ArrayList) obj;
                ((ph.o) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size12 = languages.size();
                while (i14 < size12) {
                    TranslateController.Language language = languages.get(i14);
                    i14++;
                    int i50 = ph.m.a;
                    h51 J11 = h51.J(ph.m.class);
                    J11.G = language;
                    arrayList27.add(J11);
                }
                break;
            case 26:
                qh.k kVar2 = (qh.k) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = kVar2.F;
                RectF rectF = kVar2.w0;
                qh.f fVar2 = kVar2.f;
                if (kVar2.g()) {
                    if (kVar2.D == null) {
                        runnable.run();
                        break;
                    } else {
                        canvas.translate(-fVar2.getEditText().hintLayoutX, 0.0f);
                        canvas.saveLayerAlpha(0.0f, 0.0f, kVar2.D.getWidth(), kVar2.D.getHeight(), 255, 31);
                        rectF.set(0.0f, 1.0f, kVar2.D.getWidth(), kVar2.D.getHeight() - 1);
                        kVar2.h(kVar2.M, canvas, rectF, 0.0f, true, (-fVar2.getX()) - r1.getPaddingLeft(), ((-fVar2.getY()) - r1.getPaddingTop()) - r1.getExtendedPaddingTop(), true);
                        canvas.save();
                        paint.setAlpha(165);
                        canvas.drawBitmap(kVar2.D, 0.0f, 0.0f, paint);
                        canvas.restore();
                        canvas.restore();
                        break;
                    }
                } else {
                    Paint c3 = kVar2.M.c(1.0f);
                    fVar2.getEditText().setHintColor(c3 == null ? -2130706433 : -1);
                    if (c3 == null) {
                        runnable.run();
                        break;
                    } else {
                        xt editText = fVar2.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c3);
                        canvas.restore();
                        break;
                    }
                }
            case 27:
                qh.h1 h1Var = (qh.h1) obj3;
                String str3 = (String) obj;
                qh.x1 x1Var = h1Var.r;
                x1Var.b = str3;
                x1Var.c = ((Integer) obj2).intValue();
                h1Var.c.H(str3);
                break;
            default:
                qh.n1 n1Var = (qh.n1) obj3;
                String str4 = (String) obj;
                qh.x1 x1Var2 = n1Var.s;
                x1Var2.b = str4;
                x1Var2.c = ((Integer) obj2).intValue();
                n1Var.c.D(str4);
                break;
        }
    }
}
