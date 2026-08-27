package ch;

import ag.q0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import cg.i2;
import f2.r;
import gh.a2;
import gh.i0;
import gh.i5;
import gh.k2;
import gh.o4;
import gh.p0;
import gh.r2;
import gh.t3;
import gh.v;
import gh.x5;
import gh.y3;
import gh.y5;
import gh.z3;
import hh.c0;
import hh.e0;
import hh.ea;
import hh.fa;
import hh.g0;
import hh.g1;
import hh.i1;
import hh.ia;
import hh.l1;
import hh.la;
import hh.m7;
import hh.o0;
import hh.oa;
import hh.u7;
import hh.x9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kh.s;
import kh.u;
import lh.f6;
import lh.l2;
import lh.m;
import lh.u1;
import lh.z1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.c91;
import org.telegram.ui.df;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        Utilities.Callback callback;
        int i11 = this.a;
        int i12 = 8;
        int i13 = 17;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                h hVar = (h) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = hVar.W;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + hVar.h0;
                    arrayList.add(n41.D(0, dp2));
                    int i20 = dp - dp2;
                    int size = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj4 = arrayList2.get(i21);
                        i21++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hVar.V.get((String) obj4)) {
                            if (TextUtils.isEmpty(hVar.Y) || i2.U(tL_help_country, AndroidUtilities.translitSafe(hVar.Y).toLowerCase())) {
                                i20 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = hVar.f0.containsKey(tL_help_country.iso2);
                                int i22 = g.a;
                                n41 J = n41.J(g.class);
                                J.l = tL_help_country.iso2;
                                J.G = tL_help_country;
                                J.e = containsKey;
                                arrayList.add(J);
                            }
                        }
                    }
                    arrayList.add(n41.D(1, Math.max(0, i20)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                c91 c91Var = ((i) obj3).U;
                if (c91Var != null) {
                    arrayList3.add(n41.C(AndroidUtilities.dp(12.0f)));
                    arrayList3.add(n41.h(0, 0, c91Var));
                    break;
                }
                break;
            case 2:
                ((df) obj3).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 3:
                gh.d dVar = (gh.d) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.T;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.U;
                        q0 q0Var = new q0(i12, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i23 = gh.b.a;
                        n41 J2 = n41.J(gh.b.class);
                        J2.G = tL_StarGiftAuctionAcquiredGift;
                        J2.H = auction;
                        J2.D = q0Var;
                        arrayList4.add(J2);
                    }
                    arrayList4.add(n41.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 4:
                ((ArrayList) obj).add(((gh.f) obj3).T);
                break;
            case 5:
                ArrayList arrayList5 = (ArrayList) obj;
                arrayList5.add(((v) obj3).U);
                arrayList5.add(n41.C(AndroidUtilities.dp(16.0f)));
                break;
            case 6:
                ((ArrayList) obj).add(n41.j(-1, ((i0) obj3).V));
                break;
            case 7:
                ((ArrayList) obj).add(n41.j(-1, ((p0) obj3).V));
                break;
            case 8:
                ((k2) obj3).U((ArrayList) obj, (b51) obj2);
                break;
            case 9:
                t3 t3Var = (t3) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                wq0 wq0Var = t3Var.a;
                m7 m7Var = t3Var.e;
                if (m7Var != null) {
                    if ((!m7Var.e || m7Var.g != 783) && m7Var.l.size() <= 0) {
                        m7 m7Var2 = t3Var.e;
                        if (m7Var2.j && !m7Var2.i) {
                        }
                    }
                    m7 m7Var3 = t3Var.e;
                    int max = Math.max(1, (m7Var3 == null || (i10 = m7Var3.n) == 0) ? 3 : Math.min(3, i10));
                    m7 m7Var4 = t3Var.e;
                    if (m7Var4 != null) {
                        ArrayList arrayList7 = m7Var4.l;
                        int size2 = arrayList7.size();
                        int i24 = 0;
                        int i25 = 3;
                        while (i24 < size2) {
                            Object obj5 = arrayList7.get(i24);
                            i24++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                            boolean z11 = t3Var.d;
                            int i26 = a2.a;
                            n41 J3 = n41.J(a2.class);
                            J3.u = 1;
                            J3.z = 0;
                            J3.G = savedStarGift;
                            J3.q = true;
                            J3.f = false;
                            J3.r = z11;
                            J3.h = t3Var.n && (t3Var.e != wq0Var.d || savedStarGift.pinned_to_top);
                            arrayList6.add(J3);
                            i25--;
                            if (i25 == 0) {
                                i25 = 3;
                            }
                        }
                        m7 m7Var5 = t3Var.e;
                        if (m7Var5.i || !m7Var5.j) {
                            int i27 = 0;
                            while (true) {
                                if (i27 < (i25 <= 0 ? 3 : i25)) {
                                    i27++;
                                    n41 o10 = n41.o(i27, 34);
                                    o10.u = 1;
                                    arrayList6.add(o10);
                                }
                            }
                        }
                    }
                    if (wq0Var.d == t3Var.e) {
                        arrayList6.add(n41.C(AndroidUtilities.dp(20.0f)));
                        if (wq0Var.c == UserConfig.getInstance(t3Var.b).getClientUserId()) {
                            int v02 = g6.v0(g6.z6, t3Var.c);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i28 = z3.a;
                            n41 J4 = n41.J(z3.class);
                            J4.l = string;
                            J4.z = 17;
                            J4.B = v02;
                            J4.A = 14.0f;
                            J4.i = dp3;
                            J4.k = 0;
                            J4.q = false;
                            arrayList6.add(J4);
                        }
                        arrayList6.add(n41.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList6.isEmpty()) {
                        arrayList6.add(n41.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList6.add(0, n41.C(AndroidUtilities.dp(t3Var.E ? 42.0f : 12.0f)));
                    }
                    if (t3Var.f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new r2(t3Var, max, i19));
                    }
                    wq0Var.o();
                    wq0Var.post(new r(wq0Var, 10));
                    break;
                }
                break;
            case 10:
                y3 y3Var = (y3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                m7 m7Var6 = y3Var.U;
                if (m7Var6 != null) {
                    ArrayList arrayList9 = m7Var6.l;
                    arrayList8.add(n41.C(AndroidUtilities.dp(16.0f)));
                    if (m7Var6.i && arrayList9.isEmpty()) {
                        n41 o11 = n41.o(1, 34);
                        o11.u = 1;
                        arrayList8.add(o11);
                        n41 o12 = n41.o(2, 34);
                        o12.u = 1;
                        arrayList8.add(o12);
                        n41 o13 = n41.o(3, 34);
                        o13.u = 1;
                        arrayList8.add(o13);
                        n41 o14 = n41.o(4, 34);
                        o14.u = 1;
                        arrayList8.add(o14);
                        n41 o15 = n41.o(5, 34);
                        o15.u = 1;
                        arrayList8.add(o15);
                        n41 o16 = n41.o(6, 34);
                        o16.u = 1;
                        arrayList8.add(o16);
                        n41 o17 = n41.o(7, 34);
                        o17.u = 1;
                        arrayList8.add(o17);
                        n41 o18 = n41.o(8, 34);
                        o18.u = 1;
                        arrayList8.add(o18);
                        n41 o19 = n41.o(9, 34);
                        o19.u = 1;
                        arrayList8.add(o19);
                    } else {
                        int size3 = arrayList9.size();
                        int i29 = 3;
                        int i30 = 0;
                        while (i30 < size3) {
                            Object obj6 = arrayList9.get(i30);
                            i30++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(y3Var.T))) {
                                int i31 = a2.a;
                                n41 J5 = n41.J(a2.class);
                                J5.u = 1;
                                J5.z = z10 ? 1 : 0;
                                J5.G = savedStarGift2;
                                J5.q = true;
                                J5.f = true;
                                J5.r = z10;
                                HashSet hashSet = y3Var.V;
                                int i32 = savedStarGift2.msg_id;
                                ArrayList arrayList10 = arrayList9;
                                J5.K(hashSet.contains(Long.valueOf(i32 == 0 ? savedStarGift2.saved_id : i32)));
                                J5.u = 1;
                                arrayList8.add(J5);
                                i29--;
                                if (i29 == 0) {
                                    i29 = 3;
                                }
                                arrayList9 = arrayList10;
                                z10 = false;
                            }
                        }
                        if (m7Var6.i || !m7Var6.j) {
                            int i33 = 0;
                            while (true) {
                                if (i33 < (i29 <= 0 ? 3 : i29)) {
                                    i33++;
                                    n41 o20 = n41.o(i33, 34);
                                    o20.u = 1;
                                    arrayList8.add(o20);
                                }
                            }
                        }
                    }
                    arrayList8.add(n41.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 11:
                y5 y5Var = (y5) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                i5 i5Var = y5Var.d;
                ArrayList arrayList12 = i5Var.d;
                int size4 = arrayList12.size();
                int i34 = 0;
                while (i34 < size4) {
                    Object obj7 = arrayList12.get(i34);
                    i34++;
                    arrayList11.add(a2.a(0, (TL_stars.TL_starGiftUnique) obj7, false, false, false, true, false));
                }
                if (i5Var.t || !i5Var.u) {
                    n41 o21 = n41.o(-1, 34);
                    o21.u = 1;
                    arrayList11.add(o21);
                    n41 o22 = n41.o(-2, 34);
                    o22.u = 1;
                    arrayList11.add(o22);
                    n41 o23 = n41.o(-3, 34);
                    o23.u = 1;
                    arrayList11.add(o23);
                    if (i5Var.d.isEmpty()) {
                        n41 o24 = n41.o(-4, 34);
                        o24.u = 1;
                        arrayList11.add(o24);
                        n41 o25 = n41.o(-5, 34);
                        o25.u = 1;
                        arrayList11.add(o25);
                        n41 o26 = n41.o(-6, 34);
                        o26.u = 1;
                        arrayList11.add(o26);
                        n41 o27 = n41.o(-7, 34);
                        o27.u = 1;
                        arrayList11.add(o27);
                        n41 o28 = n41.o(-8, 34);
                        o28.u = 1;
                        arrayList11.add(o28);
                        n41 o29 = n41.o(-9, 34);
                        o29.u = 1;
                        arrayList11.add(o29);
                        n41 o30 = n41.o(-10, 34);
                        o30.u = 1;
                        arrayList11.add(o30);
                        n41 o31 = n41.o(-11, 34);
                        o31.u = 1;
                        arrayList11.add(o31);
                        n41 o32 = n41.o(-12, 34);
                        o32.u = 1;
                        arrayList11.add(o32);
                        n41 o33 = n41.o(-13, 34);
                        o33.u = 1;
                        arrayList11.add(o33);
                        n41 o34 = n41.o(-14, 34);
                        o34.u = 1;
                        arrayList11.add(o34);
                        n41 o35 = n41.o(-15, 34);
                        o35.u = 1;
                        arrayList11.add(o35);
                    }
                }
                boolean z12 = arrayList11.isEmpty() && !i5Var.t;
                if (y5Var.x != z12) {
                    y5Var.x = z12;
                    y5Var.w.setVisibility(0);
                    y5Var.w.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.95f).scaleY(z12 ? 1.0f : 0.95f).setInterpolator(er.h).setDuration(320L).setListener(new o4(y5Var, z12, 1)).start();
                    break;
                }
                break;
            case 12:
                x5.T((x5) obj3, (ArrayList) obj);
                break;
            case 13:
                hh.r.Y((hh.r) obj3, (ArrayList) obj);
                break;
            case 14:
                g0 g0Var = (g0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                arrayList13.add(n41.k(g0Var.U));
                arrayList13.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList13.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new r(g0Var, i13)), true), R.drawable.msg_bot));
                arrayList13.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList13.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList13.add(n41.C(AndroidUtilities.dp(68.0f)));
                break;
            case 15:
                ArrayList arrayList14 = (ArrayList) obj;
                n41 n41Var = ((o0) obj3).r0;
                if (n41Var != null) {
                    arrayList14.add(n41Var);
                    break;
                }
                break;
            case 16:
                l1 l1Var = (l1) obj3;
                ArrayList arrayList15 = (ArrayList) obj;
                ArrayList arrayList16 = l1Var.Z;
                boolean z13 = l1Var.s0;
                com.google.android.gms.common.api.internal.r rVar = l1Var.c0;
                ArrayList arrayList17 = l1Var.X;
                ArrayList arrayList18 = l1Var.W;
                com.google.android.gms.common.api.internal.r rVar2 = l1Var.b0;
                com.google.android.gms.common.api.internal.r rVar3 = l1Var.a0;
                ArrayList arrayList19 = l1Var.Y;
                if (arrayList19 != null && arrayList18 != null && arrayList17 != null) {
                    arrayList15.add(n41.C(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i35 = l1Var.f0.r;
                    if (i35 == 0) {
                        arrayList15.add(n41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList19.size()))));
                        int size5 = arrayList19.size();
                        int i36 = 0;
                        while (i36 < size5) {
                            Object obj8 = arrayList19.get(i36);
                            i36++;
                            arrayList15.add(i1.a(i35, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList16.isEmpty()) {
                            arrayList15.add(n41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList19.size()))));
                            int size6 = arrayList16.size();
                            while (i16 < size6) {
                                Object obj9 = arrayList16.get(i16);
                                i16++;
                                arrayList15.add(i1.a(i35, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                            break;
                        }
                    } else if (i35 == 1) {
                        arrayList15.add(n41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList18.size()))));
                        int size7 = arrayList18.size();
                        while (i17 < size7) {
                            Object obj10 = arrayList18.get(i17);
                            i17++;
                            arrayList15.add(i1.a(i35, new g1((TL_stars.starGiftAttributeBackdrop) obj10, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i35 == 2) {
                        arrayList15.add(n41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList17.size()))));
                        int size8 = arrayList17.size();
                        while (i18 < size8) {
                            Object obj11 = arrayList17.get(i18);
                            i18++;
                            arrayList15.add(i1.a(i35, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj11, (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    }
                }
                break;
            case 17:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (callback2 != null) {
                    callback2.run(l10, bool);
                    break;
                }
                break;
            case 18:
                ((oa) obj3).H0((ArrayList) obj, (b51) obj2);
                break;
            case 19:
                ((x9) obj3).R((ArrayList) obj, (b51) obj2);
                break;
            case 20:
                ((ea) obj3).R((ArrayList) obj, (b51) obj2);
                break;
            case 21:
                ((fa) obj3).R((ArrayList) obj, (b51) obj2);
                break;
            case 22:
                la laVar = (la) obj3;
                ArrayList arrayList20 = (ArrayList) obj;
                int i37 = laVar.c;
                int i38 = laVar.d;
                long j10 = laVar.f;
                if (j10 != 0) {
                    c0 g10 = c0.g(i37);
                    ArrayList arrayList21 = g10.k(j10).a[i38];
                    int size9 = arrayList21.size();
                    while (i15 < size9) {
                        Object obj12 = arrayList21.get(i15);
                        i15++;
                        int i39 = ia.a;
                        n41 J6 = n41.J(ia.class);
                        J6.G = (TL_stars.StarsTransaction) obj12;
                        J6.q = true;
                        arrayList20.add(J6);
                    }
                    if (!g10.k(j10).e[i38]) {
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        break;
                    }
                } else {
                    u7 y10 = u7.y(i37, laVar.e);
                    ArrayList arrayList22 = y10.q[i38];
                    int size10 = arrayList22.size();
                    int i40 = 0;
                    while (i40 < size10) {
                        Object obj13 = arrayList22.get(i40);
                        i40++;
                        int i41 = ia.a;
                        n41 J7 = n41.J(ia.class);
                        J7.G = (TL_stars.StarsTransaction) obj13;
                        J7.q = false;
                        arrayList20.add(J7);
                    }
                    if (!y10.u[i38]) {
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        break;
                    }
                }
                break;
            case 23:
                ArrayList arrayList23 = (ArrayList) obj;
                ((u) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size11 = languages.size();
                while (i14 < size11) {
                    TranslateController.Language language = languages.get(i14);
                    i14++;
                    int i42 = s.a;
                    n41 J8 = n41.J(s.class);
                    J8.G = language;
                    arrayList23.add(J8);
                }
                break;
            case 24:
                m mVar = (m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.E;
                RectF rectF = mVar.v0;
                lh.g gVar = mVar.f;
                if (mVar.g()) {
                    if (mVar.C == null) {
                        runnable.run();
                        break;
                    } else {
                        canvas.translate(-gVar.getEditText().hintLayoutX, 0.0f);
                        canvas.saveLayerAlpha(0.0f, 0.0f, mVar.C.getWidth(), mVar.C.getHeight(), 255, 31);
                        rectF.set(0.0f, 1.0f, mVar.C.getWidth(), mVar.C.getHeight() - 1);
                        mVar.h(mVar.L, canvas, rectF, 0.0f, true, (-gVar.getX()) - r8.getPaddingLeft(), ((-gVar.getY()) - r8.getPaddingTop()) - r8.getExtendedPaddingTop(), true);
                        canvas.save();
                        paint.setAlpha(165);
                        canvas.drawBitmap(mVar.C, 0.0f, 0.0f, paint);
                        canvas.restore();
                        canvas.restore();
                        break;
                    }
                } else {
                    Paint c10 = mVar.L.c(1.0f);
                    gVar.getEditText().setHintColor(c10 == null ? -2130706433 : -1);
                    if (c10 == null) {
                        runnable.run();
                        break;
                    } else {
                        lt editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c10);
                        canvas.restore();
                        break;
                    }
                }
            case 25:
                u1 u1Var = (u1) obj3;
                String str = (String) obj;
                l2 l2Var = u1Var.r;
                l2Var.b = str;
                l2Var.c = ((Integer) obj2).intValue();
                u1Var.c.H(str);
                break;
            case 26:
                z1 z1Var = (z1) obj3;
                String str2 = (String) obj;
                l2 l2Var2 = z1Var.s;
                l2Var2.b = str2;
                l2Var2.c = ((Integer) obj2).intValue();
                z1Var.c.D(str2);
                break;
            case 27:
                lh.t3 t3Var2 = (lh.t3) obj3;
                if (obj != null) {
                    if (t3Var2.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = t3Var2.f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        break;
                    }
                } else {
                    t3Var2.getClass();
                    break;
                }
                break;
            default:
                f6 f6Var = (f6) obj3;
                f6Var.d0(f6Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
        }
    }
}
