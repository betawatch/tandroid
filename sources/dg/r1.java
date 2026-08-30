package dg;

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
import kh.b5;
import kh.h4;
import kh.q5;
import kh.r5;
import lh.aa;
import lh.da;
import lh.ga;
import lh.ja;
import lh.l7;
import lh.t7;
import lh.t9;
import lh.z9;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.w51;
import org.telegram.ui.cu;
import org.telegram.ui.s91;
import ph.o4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        float f10;
        int i11 = this.a;
        int i12 = 2;
        ?? r14 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        final int i19 = 1;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                o4 o4Var = (o4) obj3;
                o4Var.v0 = ((Integer) obj).intValue();
                o4Var.w0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new ag.d(o4Var, 21), 60L);
                break;
            case 1:
                gh.f fVar = (gh.f) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = fVar.X;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.i0;
                    arrayList.add(i51.D(0, dp2));
                    int i20 = dp - dp2;
                    int size = arrayList2.size();
                    int i21 = i20;
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj4 = arrayList2.get(i22);
                        i22++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.W.get((String) obj4)) {
                            if (TextUtils.isEmpty(fVar.Z) || gg.f2.U(tL_help_country, AndroidUtilities.translitSafe(fVar.Z).toLowerCase())) {
                                i21 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.g0.containsKey(tL_help_country.iso2);
                                int i23 = gh.e.a;
                                i51 J = i51.J(gh.e.class);
                                J.l = tL_help_country.iso2;
                                J.G = tL_help_country;
                                J.e = containsKey;
                                arrayList.add(J);
                            }
                        }
                    }
                    arrayList.add(i51.D(1, Math.max(0, i21)));
                    break;
                }
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj;
                s91 s91Var = ((gh.g) obj3).V;
                if (s91Var != null) {
                    arrayList3.add(i51.C(AndroidUtilities.dp(12.0f)));
                    arrayList3.add(i51.h(0, 0, s91Var));
                    break;
                }
                break;
            case 3:
                ((kh.a1) obj3).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 4:
                kh.d dVar = (kh.d) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.U;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.V;
                        cg.n nVar = new cg.n(11, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i24 = kh.b.a;
                        i51 J2 = i51.J(kh.b.class);
                        J2.G = tL_StarGiftAuctionAcquiredGift;
                        J2.H = auction;
                        J2.D = nVar;
                        arrayList4.add(J2);
                    }
                    arrayList4.add(i51.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 5:
                ((ArrayList) obj).add(((kh.f) obj3).U);
                break;
            case 6:
                ArrayList arrayList5 = (ArrayList) obj;
                arrayList5.add(((kh.s) obj3).V);
                arrayList5.add(i51.C(AndroidUtilities.dp(16.0f)));
                break;
            case 7:
                ((ArrayList) obj).add(i51.j(-1, ((kh.f0) obj3).W));
                break;
            case 8:
                ((ArrayList) obj).add(i51.j(-1, ((kh.m0) obj3).W));
                break;
            case 9:
                ((kh.h2) obj3).U((ArrayList) obj, (w51) obj2);
                break;
            case 10:
                kh.n3 n3Var = (kh.n3) obj3;
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
                        int i25 = 3;
                        int i26 = 0;
                        while (i26 < size2) {
                            Object obj5 = arrayList7.get(i26);
                            i26++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                            boolean z4 = n3Var.d;
                            int i27 = kh.w1.a;
                            i51 J3 = i51.J(kh.w1.class);
                            J3.u = 1;
                            J3.z = r14;
                            J3.G = savedStarGift;
                            J3.q = true;
                            J3.f = r14;
                            J3.r = z4;
                            J3.h = n3Var.n && (n3Var.e != or0Var.d || savedStarGift.pinned_to_top);
                            arrayList6.add(J3);
                            i25--;
                            if (i25 == 0) {
                                i25 = 3;
                            }
                            r14 = 0;
                        }
                        l7 l7Var5 = n3Var.e;
                        if (l7Var5.i || !l7Var5.j) {
                            int i28 = 0;
                            while (true) {
                                if (i28 < (i25 <= 0 ? 3 : i25)) {
                                    i28++;
                                    i51 o10 = i51.o(i28, 34);
                                    o10.u = 1;
                                    arrayList6.add(o10);
                                }
                            }
                        }
                    }
                    if (or0Var.d == n3Var.e) {
                        arrayList6.add(i51.C(AndroidUtilities.dp(20.0f)));
                        if (or0Var.c == UserConfig.getInstance(n3Var.b).getClientUserId()) {
                            int v02 = j6.v0(j6.z6, n3Var.c);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i29 = kh.t3.a;
                            i51 J4 = i51.J(kh.t3.class);
                            J4.l = string;
                            J4.z = 17;
                            J4.B = v02;
                            J4.A = 14.0f;
                            J4.i = dp3;
                            J4.k = 0;
                            J4.q = false;
                            arrayList6.add(J4);
                        }
                        arrayList6.add(i51.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList6.isEmpty()) {
                        arrayList6.add(i51.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList6.add(0, i51.C(AndroidUtilities.dp(n3Var.F ? 42.0f : 12.0f)));
                    }
                    if (n3Var.f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new kh.n2(n3Var, max, i19));
                    }
                    or0Var.o();
                    or0Var.post(new ef.e(or0Var, 27));
                    break;
                }
                break;
            case 11:
                kh.s3 s3Var = (kh.s3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                l7 l7Var6 = s3Var.V;
                if (l7Var6 != null) {
                    ArrayList arrayList9 = l7Var6.l;
                    arrayList8.add(i51.C(AndroidUtilities.dp(16.0f)));
                    if (l7Var6.i && arrayList9.isEmpty()) {
                        i51 o11 = i51.o(1, 34);
                        o11.u = 1;
                        arrayList8.add(o11);
                        i51 o12 = i51.o(2, 34);
                        o12.u = 1;
                        arrayList8.add(o12);
                        i51 o13 = i51.o(3, 34);
                        o13.u = 1;
                        arrayList8.add(o13);
                        i51 o14 = i51.o(4, 34);
                        o14.u = 1;
                        arrayList8.add(o14);
                        i51 o15 = i51.o(5, 34);
                        o15.u = 1;
                        arrayList8.add(o15);
                        i51 o16 = i51.o(6, 34);
                        o16.u = 1;
                        arrayList8.add(o16);
                        i51 o17 = i51.o(7, 34);
                        o17.u = 1;
                        arrayList8.add(o17);
                        i51 o18 = i51.o(8, 34);
                        o18.u = 1;
                        arrayList8.add(o18);
                        i51 o19 = i51.o(9, 34);
                        o19.u = 1;
                        arrayList8.add(o19);
                        f10 = 68.0f;
                    } else {
                        int size3 = arrayList9.size();
                        int i30 = 3;
                        int i31 = 0;
                        while (i31 < size3) {
                            Object obj6 = arrayList9.get(i31);
                            i31++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(s3Var.U))) {
                                int i32 = kh.w1.a;
                                i51 J5 = i51.J(kh.w1.class);
                                J5.u = 1;
                                J5.z = 0;
                                J5.G = savedStarGift2;
                                J5.q = true;
                                J5.f = true;
                                J5.r = false;
                                HashSet hashSet = s3Var.W;
                                int i33 = savedStarGift2.msg_id;
                                J5.K(hashSet.contains(Long.valueOf(i33 == 0 ? savedStarGift2.saved_id : i33)));
                                J5.u = 1;
                                arrayList8.add(J5);
                                i30--;
                                if (i30 == 0) {
                                    i30 = 3;
                                }
                            }
                        }
                        f10 = 68.0f;
                        if (l7Var6.i || !l7Var6.j) {
                            while (true) {
                                if (i18 < (i30 <= 0 ? 3 : i30)) {
                                    i18++;
                                    i51 o20 = i51.o(i18, 34);
                                    o20.u = 1;
                                    arrayList8.add(o20);
                                }
                            }
                        }
                    }
                    arrayList8.add(i51.C(AndroidUtilities.dp(f10)));
                    break;
                }
                break;
            case 12:
                r5 r5Var = (r5) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                b5 b5Var = r5Var.d;
                ArrayList arrayList11 = b5Var.d;
                int size4 = arrayList11.size();
                int i34 = 0;
                while (i34 < size4) {
                    Object obj7 = arrayList11.get(i34);
                    i34++;
                    arrayList10.add(kh.w1.a(0, (TL_stars.TL_starGiftUnique) obj7, false, false, false, true, false));
                }
                if (b5Var.t || !b5Var.u) {
                    i51 o21 = i51.o(-1, 34);
                    o21.u = 1;
                    arrayList10.add(o21);
                    i51 o22 = i51.o(-2, 34);
                    o22.u = 1;
                    arrayList10.add(o22);
                    i51 o23 = i51.o(-3, 34);
                    o23.u = 1;
                    arrayList10.add(o23);
                    if (b5Var.d.isEmpty()) {
                        i51 o24 = i51.o(-4, 34);
                        o24.u = 1;
                        arrayList10.add(o24);
                        i51 o25 = i51.o(-5, 34);
                        o25.u = 1;
                        arrayList10.add(o25);
                        i51 o26 = i51.o(-6, 34);
                        o26.u = 1;
                        arrayList10.add(o26);
                        i51 o27 = i51.o(-7, 34);
                        o27.u = 1;
                        arrayList10.add(o27);
                        i51 o28 = i51.o(-8, 34);
                        o28.u = 1;
                        arrayList10.add(o28);
                        i51 o29 = i51.o(-9, 34);
                        o29.u = 1;
                        arrayList10.add(o29);
                        i51 o30 = i51.o(-10, 34);
                        o30.u = 1;
                        arrayList10.add(o30);
                        i51 o31 = i51.o(-11, 34);
                        o31.u = 1;
                        arrayList10.add(o31);
                        i51 o32 = i51.o(-12, 34);
                        o32.u = 1;
                        arrayList10.add(o32);
                        i51 o33 = i51.o(-13, 34);
                        o33.u = 1;
                        arrayList10.add(o33);
                        i51 o34 = i51.o(-14, 34);
                        o34.u = 1;
                        arrayList10.add(o34);
                        i51 o35 = i51.o(-15, 34);
                        o35.u = 1;
                        arrayList10.add(o35);
                    }
                }
                boolean z10 = arrayList10.isEmpty() && !b5Var.t;
                if (r5Var.x != z10) {
                    r5Var.x = z10;
                    r5Var.w.setVisibility(0);
                    r5Var.w.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.95f).scaleY(z10 ? 1.0f : 0.95f).setInterpolator(nr.h).setDuration(320L).setListener(new h4(r5Var, z10, 1)).start();
                    break;
                }
                break;
            case 13:
                q5.T((q5) obj3, (ArrayList) obj);
                break;
            case 14:
                lh.q.Y((lh.q) obj3, (ArrayList) obj);
                break;
            case 15:
                lh.f0 f0Var = (lh.f0) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                arrayList12.add(i51.k(f0Var.V));
                arrayList12.add(lh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList12.add(lh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new lh.b(f0Var, i12)), true), R.drawable.msg_bot));
                arrayList12.add(lh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList12.add(lh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList12.add(i51.C(AndroidUtilities.dp(68.0f)));
                break;
            case 16:
                ArrayList arrayList13 = (ArrayList) obj;
                i51 i51Var = ((lh.n0) obj3).s0;
                if (i51Var != null) {
                    arrayList13.add(i51Var);
                    break;
                }
                break;
            case 17:
                lh.j1 j1Var = (lh.j1) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                ArrayList arrayList15 = j1Var.a0;
                boolean z11 = j1Var.t0;
                com.google.android.gms.common.api.internal.r rVar = j1Var.d0;
                ArrayList arrayList16 = j1Var.Y;
                ArrayList arrayList17 = j1Var.X;
                com.google.android.gms.common.api.internal.r rVar2 = j1Var.c0;
                com.google.android.gms.common.api.internal.r rVar3 = j1Var.b0;
                ArrayList arrayList18 = j1Var.Z;
                if (arrayList18 != null && arrayList17 != null && arrayList16 != null) {
                    arrayList14.add(i51.C(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i35 = j1Var.g0.r;
                    if (i35 == 0) {
                        arrayList14.add(i51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z11 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList18.size()))));
                        int size5 = arrayList18.size();
                        int i36 = 0;
                        while (i36 < size5) {
                            Object obj8 = arrayList18.get(i36);
                            i36++;
                            arrayList14.add(lh.g1.a(i35, new lh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList15.isEmpty()) {
                            arrayList14.add(i51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z11 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList18.size()))));
                            int size6 = arrayList15.size();
                            while (i15 < size6) {
                                Object obj9 = arrayList15.get(i15);
                                i15++;
                                arrayList14.add(lh.g1.a(i35, new lh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                            break;
                        }
                    } else if (i35 == 1) {
                        arrayList14.add(i51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList17.size()))));
                        int size7 = arrayList17.size();
                        while (i16 < size7) {
                            Object obj10 = arrayList17.get(i16);
                            i16++;
                            arrayList14.add(lh.g1.a(i35, new lh.f1((TL_stars.starGiftAttributeBackdrop) obj10, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i35 == 2) {
                        arrayList14.add(i51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList16.size()))));
                        int size8 = arrayList16.size();
                        while (i17 < size8) {
                            Object obj11 = arrayList16.get(i17);
                            i17++;
                            arrayList14.add(lh.g1.a(i35, new lh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj11, (TL_stars.starGiftAttributeModel) rVar.c())));
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
                int i37 = gaVar.c;
                int i38 = gaVar.d;
                long j10 = gaVar.f;
                if (j10 != 0) {
                    lh.b0 g10 = lh.b0.g(i37);
                    ArrayList arrayList20 = g10.k(j10).a[i38];
                    int size9 = arrayList20.size();
                    while (i14 < size9) {
                        Object obj12 = arrayList20.get(i14);
                        i14++;
                        int i39 = da.a;
                        i51 J6 = i51.J(da.class);
                        J6.G = (TL_stars.StarsTransaction) obj12;
                        J6.q = true;
                        arrayList19.add(J6);
                    }
                    if (!g10.k(j10).e[i38]) {
                        arrayList19.add(i51.o(arrayList19.size(), 7));
                        arrayList19.add(i51.o(arrayList19.size(), 7));
                        arrayList19.add(i51.o(arrayList19.size(), 7));
                        break;
                    }
                } else {
                    t7 y10 = t7.y(i37, gaVar.e);
                    ArrayList arrayList21 = y10.q[i38];
                    int size10 = arrayList21.size();
                    int i40 = 0;
                    while (i40 < size10) {
                        Object obj13 = arrayList21.get(i40);
                        i40++;
                        int i41 = da.a;
                        i51 J7 = i51.J(da.class);
                        J7.G = (TL_stars.StarsTransaction) obj13;
                        J7.q = false;
                        arrayList19.add(J7);
                    }
                    if (!y10.u[i38]) {
                        arrayList19.add(i51.o(arrayList19.size(), 7));
                        arrayList19.add(i51.o(arrayList19.size(), 7));
                        arrayList19.add(i51.o(arrayList19.size(), 7));
                        break;
                    }
                }
                break;
            case 24:
                ArrayList arrayList22 = (ArrayList) obj;
                ((oh.u) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size11 = languages.size();
                while (i13 < size11) {
                    TranslateController.Language language = languages.get(i13);
                    i13++;
                    int i42 = oh.s.a;
                    i51 J8 = i51.J(oh.s.class);
                    J8.G = language;
                    arrayList22.add(J8);
                }
                break;
            case 25:
                final org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) obj3;
                ArrayList arrayList23 = (ArrayList) obj;
                org.telegram.ui.web.i iVar = kVar.y;
                ArrayList arrayList24 = kVar.x;
                if (!kVar.b && arrayList24.isEmpty()) {
                    arrayList23.add(i51.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList25 = new ArrayList();
                String string2 = sharedPreferences.getString("queries_json", null);
                if (string2 != null) {
                    try {
                        ArrayList arrayList26 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string2);
                        for (int i43 = 0; i43 < jSONArray.length(); i43++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i43);
                            org.telegram.ui.web.j jVar = new org.telegram.ui.web.j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            jVar.c = jSONObject.optDouble("rank", 0.0d);
                            arrayList26.add(jVar);
                        }
                        Collections.sort(arrayList26, new cu(14));
                        int size12 = arrayList26.size();
                        int i44 = 0;
                        while (i44 < size12) {
                            Object obj14 = arrayList26.get(i44);
                            i44++;
                            org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj14;
                            if (arrayList25.size() < 20) {
                                arrayList25.add(jVar2.a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList24.size();
                arrayList25.size();
                if (!arrayList24.isEmpty()) {
                    arrayList23.add(i51.k(kVar.v));
                }
                int i45 = 0;
                while (i45 < arrayList24.size()) {
                    final String str = (String) arrayList24.get(i45);
                    boolean z12 = i45 == 0;
                    boolean z13 = i45 == arrayList24.size() - 1;
                    final int i46 = r14 == true ? 1 : 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i46) {
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
                    int i47 = org.telegram.ui.web.d.a;
                    i51 J9 = i51.J(org.telegram.ui.web.d.class);
                    J9.z = 1;
                    J9.l = str;
                    J9.D = onClickListener;
                    J9.q = z12;
                    J9.r = z13;
                    J9.G = Boolean.TRUE;
                    J9.H = kVar;
                    arrayList23.add(J9);
                    i45++;
                }
                if (!arrayList25.isEmpty()) {
                    arrayList23.add(i51.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new oh.n(kVar, 5)));
                    int i48 = 0;
                    while (i48 < arrayList25.size()) {
                        final String str2 = (String) arrayList25.get(i48);
                        boolean z14 = i48 == 0;
                        boolean z15 = i48 == arrayList25.size() - 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i19) {
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
                        int i49 = org.telegram.ui.web.d.a;
                        i51 J10 = i51.J(org.telegram.ui.web.d.class);
                        J10.z = 0;
                        J10.l = str2;
                        J10.D = onClickListener2;
                        J10.q = z14;
                        J10.r = z15;
                        J10.G = Boolean.TRUE;
                        J10.H = kVar;
                        arrayList23.add(J10);
                        i48++;
                    }
                }
                if (iVar != null) {
                    ArrayList arrayList27 = iVar.a;
                    if (!arrayList27.isEmpty()) {
                        arrayList23.add(i51.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i50 = 0; i50 < arrayList27.size(); i50++) {
                            MessageObject messageObject = (MessageObject) arrayList27.get(i50);
                            if (!TextUtils.isEmpty(org.telegram.ui.web.k.a(messageObject))) {
                                int i51 = org.telegram.ui.web.g.a;
                                i51 J11 = i51.J(org.telegram.ui.web.g.class);
                                J11.z = 3;
                                J11.q = true;
                                J11.H = messageObject;
                                arrayList23.add(J11);
                            }
                        }
                        if (!iVar.f) {
                            arrayList23.add(i51.o(arrayList23.size(), 32));
                            arrayList23.add(i51.o(arrayList23.size(), 32));
                            arrayList23.add(i51.o(arrayList23.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 26:
                ph.k kVar2 = (ph.k) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = kVar2.F;
                RectF rectF = kVar2.w0;
                ph.f fVar2 = kVar2.f;
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
                        vt editText = fVar2.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c3);
                        canvas.restore();
                        break;
                    }
                }
            case 27:
                ph.i1 i1Var = (ph.i1) obj3;
                String str3 = (String) obj;
                ph.y1 y1Var = i1Var.r;
                y1Var.b = str3;
                y1Var.c = ((Integer) obj2).intValue();
                i1Var.c.H(str3);
                break;
            default:
                ph.o1 o1Var = (ph.o1) obj3;
                String str4 = (String) obj;
                ph.y1 y1Var2 = o1Var.s;
                y1Var2.b = str4;
                y1Var2.c = ((Integer) obj2).intValue();
                o1Var.c.D(str4);
                break;
        }
    }
}
