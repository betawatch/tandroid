package bh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import bg.q2;
import bg.u1;
import fh.d4;
import fh.e2;
import fh.f4;
import fh.g6;
import fh.k0;
import fh.o1;
import fh.p2;
import fh.p5;
import fh.r0;
import fh.u4;
import fh.w2;
import fh.x;
import fh.y3;
import gh.c0;
import gh.e0;
import gh.ea;
import gh.fa;
import gh.g0;
import gh.g1;
import gh.i1;
import gh.ia;
import gh.l1;
import gh.la;
import gh.n7;
import gh.o0;
import gh.oa;
import gh.r;
import gh.v7;
import gh.y9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jh.t;
import kh.b2;
import kh.m;
import kh.n2;
import kh.u3;
import kh.w1;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.df;
import org.telegram.ui.e91;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i9;
        float f10;
        Utilities.Callback callback;
        int i10 = this.a;
        int i11 = 6;
        int i12 = 7;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                j jVar = (j) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = jVar.W;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + jVar.h0;
                    arrayList.add(l41.D(0, dp2));
                    int i19 = dp - dp2;
                    int size = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj4 = arrayList2.get(i20);
                        i20++;
                        for (TLRPC.TL_help_country tL_help_country : (List) jVar.V.get((String) obj4)) {
                            if (TextUtils.isEmpty(jVar.Y) || q2.T(tL_help_country, AndroidUtilities.translitSafe(jVar.Y).toLowerCase())) {
                                i19 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = jVar.f0.containsKey(tL_help_country.iso2);
                                int i21 = i.a;
                                l41 J = l41.J(i.class);
                                J.l = tL_help_country.iso2;
                                J.G = tL_help_country;
                                J.e = containsKey;
                                arrayList.add(J);
                            }
                        }
                    }
                    arrayList.add(l41.D(1, Math.max(0, i19)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                e91 e91Var = ((k) obj3).U;
                if (e91Var != null) {
                    arrayList3.add(l41.C(AndroidUtilities.dp(12.0f)));
                    arrayList3.add(l41.h(0, 0, e91Var));
                    break;
                }
                break;
            case 2:
                ((df) obj3).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 3:
                fh.d dVar = (fh.d) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.T;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.U;
                        u1 u1Var = new u1(i12, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i22 = fh.b.a;
                        l41 J2 = l41.J(fh.b.class);
                        J2.G = tL_StarGiftAuctionAcquiredGift;
                        J2.H = auction;
                        J2.D = u1Var;
                        arrayList4.add(J2);
                    }
                    arrayList4.add(l41.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 4:
                ((ArrayList) obj).add(((fh.f) obj3).T);
                break;
            case 5:
                ArrayList arrayList5 = (ArrayList) obj;
                arrayList5.add(((x) obj3).U);
                arrayList5.add(l41.C(AndroidUtilities.dp(16.0f)));
                break;
            case 6:
                ((ArrayList) obj).add(l41.j(-1, ((k0) obj3).V));
                break;
            case 7:
                ((ArrayList) obj).add(l41.j(-1, ((r0) obj3).V));
                break;
            case 8:
                ((p2) obj3).T((ArrayList) obj, (z41) obj2);
                break;
            case 9:
                y3 y3Var = (y3) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                vq0 vq0Var = y3Var.a;
                n7 n7Var = y3Var.e;
                if (n7Var != null) {
                    if ((!n7Var.e || n7Var.g != 783) && n7Var.l.size() <= 0) {
                        n7 n7Var2 = y3Var.e;
                        if (n7Var2.j && !n7Var2.i) {
                        }
                    }
                    n7 n7Var3 = y3Var.e;
                    int max = Math.max(1, (n7Var3 == null || (i9 = n7Var3.n) == 0) ? 3 : Math.min(3, i9));
                    n7 n7Var4 = y3Var.e;
                    if (n7Var4 != null) {
                        ArrayList arrayList7 = n7Var4.l;
                        int size2 = arrayList7.size();
                        int i23 = 3;
                        int i24 = 0;
                        while (i24 < size2) {
                            Object obj5 = arrayList7.get(i24);
                            i24++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                            boolean z11 = y3Var.d;
                            int i25 = e2.a;
                            l41 J3 = l41.J(e2.class);
                            J3.u = 1;
                            J3.z = 0;
                            J3.G = savedStarGift;
                            J3.q = true;
                            J3.f = false;
                            J3.r = z11;
                            J3.h = y3Var.n && (y3Var.e != vq0Var.d || savedStarGift.pinned_to_top);
                            arrayList6.add(J3);
                            i23--;
                            if (i23 == 0) {
                                i23 = 3;
                            }
                        }
                        n7 n7Var5 = y3Var.e;
                        if (n7Var5.i || !n7Var5.j) {
                            int i26 = 0;
                            while (true) {
                                if (i26 < (i23 <= 0 ? 3 : i23)) {
                                    i26++;
                                    l41 o6 = l41.o(i26, 34);
                                    o6.u = 1;
                                    arrayList6.add(o6);
                                }
                            }
                        }
                    }
                    if (vq0Var.d == y3Var.e) {
                        arrayList6.add(l41.C(AndroidUtilities.dp(20.0f)));
                        if (vq0Var.c == UserConfig.getInstance(y3Var.b).getClientUserId()) {
                            int v02 = f6.v0(f6.z6, y3Var.c);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i27 = f4.a;
                            l41 J4 = l41.J(f4.class);
                            J4.l = string;
                            J4.z = 17;
                            J4.B = v02;
                            J4.A = 14.0f;
                            J4.i = dp3;
                            J4.k = 0;
                            J4.q = false;
                            arrayList6.add(J4);
                        }
                        arrayList6.add(l41.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList6.isEmpty()) {
                        arrayList6.add(l41.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList6.add(0, l41.C(AndroidUtilities.dp(y3Var.E ? 42.0f : 12.0f)));
                    }
                    if (y3Var.f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new w2(y3Var, max, i18));
                    }
                    vq0Var.o();
                    vq0Var.post(new o1(vq0Var, 3));
                    break;
                }
                break;
            case 10:
                d4 d4Var = (d4) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                n7 n7Var6 = d4Var.U;
                if (n7Var6 != null) {
                    ArrayList arrayList9 = n7Var6.l;
                    arrayList8.add(l41.C(AndroidUtilities.dp(16.0f)));
                    if (n7Var6.i && arrayList9.isEmpty()) {
                        l41 o9 = l41.o(1, 34);
                        o9.u = 1;
                        arrayList8.add(o9);
                        l41 o10 = l41.o(2, 34);
                        o10.u = 1;
                        arrayList8.add(o10);
                        l41 o11 = l41.o(3, 34);
                        o11.u = 1;
                        arrayList8.add(o11);
                        l41 o12 = l41.o(4, 34);
                        o12.u = 1;
                        arrayList8.add(o12);
                        l41 o13 = l41.o(5, 34);
                        o13.u = 1;
                        arrayList8.add(o13);
                        l41 o14 = l41.o(6, 34);
                        o14.u = 1;
                        arrayList8.add(o14);
                        l41 o15 = l41.o(7, 34);
                        o15.u = 1;
                        arrayList8.add(o15);
                        l41 o16 = l41.o(8, 34);
                        o16.u = 1;
                        arrayList8.add(o16);
                        l41 o17 = l41.o(9, 34);
                        o17.u = 1;
                        arrayList8.add(o17);
                        f10 = 68.0f;
                    } else {
                        int size3 = arrayList9.size();
                        int i28 = 3;
                        int i29 = 0;
                        while (i29 < size3) {
                            Object obj6 = arrayList9.get(i29);
                            i29++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(d4Var.T))) {
                                int i30 = e2.a;
                                l41 J5 = l41.J(e2.class);
                                J5.u = 1;
                                J5.z = z10 ? 1 : 0;
                                J5.G = savedStarGift2;
                                J5.q = true;
                                J5.f = true;
                                J5.r = z10;
                                HashSet hashSet = d4Var.V;
                                int i31 = savedStarGift2.msg_id;
                                J5.K(hashSet.contains(Long.valueOf(i31 == 0 ? savedStarGift2.saved_id : i31)));
                                J5.u = 1;
                                arrayList8.add(J5);
                                i28--;
                                if (i28 == 0) {
                                    i28 = 3;
                                }
                                z10 = false;
                            }
                        }
                        f10 = 68.0f;
                        if (n7Var6.i || !n7Var6.j) {
                            int i32 = 0;
                            while (true) {
                                if (i32 < (i28 <= 0 ? 3 : i28)) {
                                    i32++;
                                    l41 o18 = l41.o(i32, 34);
                                    o18.u = 1;
                                    arrayList8.add(o18);
                                }
                            }
                        }
                    }
                    arrayList8.add(l41.C(AndroidUtilities.dp(f10)));
                    break;
                }
                break;
            case 11:
                g6 g6Var = (g6) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                p5 p5Var = g6Var.d;
                ArrayList arrayList11 = p5Var.d;
                int size4 = arrayList11.size();
                int i33 = 0;
                while (i33 < size4) {
                    Object obj7 = arrayList11.get(i33);
                    i33++;
                    arrayList10.add(e2.a(0, (TL_stars.TL_starGiftUnique) obj7, false, false, false, true, false));
                }
                if (p5Var.t || !p5Var.u) {
                    l41 o19 = l41.o(-1, 34);
                    o19.u = 1;
                    arrayList10.add(o19);
                    l41 o20 = l41.o(-2, 34);
                    o20.u = 1;
                    arrayList10.add(o20);
                    l41 o21 = l41.o(-3, 34);
                    o21.u = 1;
                    arrayList10.add(o21);
                    if (p5Var.d.isEmpty()) {
                        l41 o22 = l41.o(-4, 34);
                        o22.u = 1;
                        arrayList10.add(o22);
                        l41 o23 = l41.o(-5, 34);
                        o23.u = 1;
                        arrayList10.add(o23);
                        l41 o24 = l41.o(-6, 34);
                        o24.u = 1;
                        arrayList10.add(o24);
                        l41 o25 = l41.o(-7, 34);
                        o25.u = 1;
                        arrayList10.add(o25);
                        l41 o26 = l41.o(-8, 34);
                        o26.u = 1;
                        arrayList10.add(o26);
                        l41 o27 = l41.o(-9, 34);
                        o27.u = 1;
                        arrayList10.add(o27);
                        l41 o28 = l41.o(-10, 34);
                        o28.u = 1;
                        arrayList10.add(o28);
                        l41 o29 = l41.o(-11, 34);
                        o29.u = 1;
                        arrayList10.add(o29);
                        l41 o30 = l41.o(-12, 34);
                        o30.u = 1;
                        arrayList10.add(o30);
                        l41 o31 = l41.o(-13, 34);
                        o31.u = 1;
                        arrayList10.add(o31);
                        l41 o32 = l41.o(-14, 34);
                        o32.u = 1;
                        arrayList10.add(o32);
                        l41 o33 = l41.o(-15, 34);
                        o33.u = 1;
                        arrayList10.add(o33);
                    }
                }
                boolean z12 = arrayList10.isEmpty() && !p5Var.t;
                if (g6Var.x != z12) {
                    g6Var.x = z12;
                    g6Var.w.setVisibility(0);
                    g6Var.w.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.95f).scaleY(z12 ? 1.0f : 0.95f).setInterpolator(gr.h).setDuration(320L).setListener(new u4(g6Var, z12, 1)).start();
                    break;
                }
                break;
            case 12:
                fh.f6.S((fh.f6) obj3, (ArrayList) obj);
                break;
            case 13:
                r.X((r) obj3, (ArrayList) obj);
                break;
            case 14:
                g0 g0Var = (g0) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                arrayList12.add(l41.k(g0Var.U));
                arrayList12.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList12.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new o1(g0Var, i11)), true), R.drawable.msg_bot));
                arrayList12.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList12.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList12.add(l41.C(AndroidUtilities.dp(68.0f)));
                break;
            case 15:
                ArrayList arrayList13 = (ArrayList) obj;
                l41 l41Var = ((o0) obj3).r0;
                if (l41Var != null) {
                    arrayList13.add(l41Var);
                    break;
                }
                break;
            case 16:
                l1 l1Var = (l1) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                ArrayList arrayList15 = l1Var.Z;
                boolean z13 = l1Var.s0;
                com.google.android.gms.common.api.internal.r rVar = l1Var.c0;
                ArrayList arrayList16 = l1Var.X;
                ArrayList arrayList17 = l1Var.W;
                com.google.android.gms.common.api.internal.r rVar2 = l1Var.b0;
                com.google.android.gms.common.api.internal.r rVar3 = l1Var.a0;
                ArrayList arrayList18 = l1Var.Y;
                if (arrayList18 != null && arrayList17 != null && arrayList16 != null) {
                    arrayList14.add(l41.C(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i34 = l1Var.f0.r;
                    if (i34 == 0) {
                        arrayList14.add(l41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList18.size()))));
                        int size5 = arrayList18.size();
                        int i35 = 0;
                        while (i35 < size5) {
                            Object obj8 = arrayList18.get(i35);
                            i35++;
                            arrayList14.add(i1.a(i34, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList15.isEmpty()) {
                            arrayList14.add(l41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList18.size()))));
                            int size6 = arrayList15.size();
                            while (i15 < size6) {
                                Object obj9 = arrayList15.get(i15);
                                i15++;
                                arrayList14.add(i1.a(i34, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                            break;
                        }
                    } else if (i34 == 1) {
                        arrayList14.add(l41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList17.size()))));
                        int size7 = arrayList17.size();
                        while (i16 < size7) {
                            Object obj10 = arrayList17.get(i16);
                            i16++;
                            arrayList14.add(i1.a(i34, new g1((TL_stars.starGiftAttributeBackdrop) obj10, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i34 == 2) {
                        arrayList14.add(l41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList16.size()))));
                        int size8 = arrayList16.size();
                        while (i17 < size8) {
                            Object obj11 = arrayList16.get(i17);
                            i17++;
                            arrayList14.add(i1.a(i34, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj11, (TL_stars.starGiftAttributeModel) rVar.c())));
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
                ((oa) obj3).G0((ArrayList) obj, (z41) obj2);
                break;
            case 19:
                ((y9) obj3).Q((ArrayList) obj, (z41) obj2);
                break;
            case 20:
                ((ea) obj3).Q((ArrayList) obj, (z41) obj2);
                break;
            case 21:
                ((fa) obj3).Q((ArrayList) obj, (z41) obj2);
                break;
            case 22:
                la laVar = (la) obj3;
                ArrayList arrayList19 = (ArrayList) obj;
                int i36 = laVar.c;
                int i37 = laVar.d;
                long j10 = laVar.f;
                if (j10 != 0) {
                    c0 g10 = c0.g(i36);
                    ArrayList arrayList20 = g10.k(j10).a[i37];
                    int size9 = arrayList20.size();
                    while (i14 < size9) {
                        Object obj12 = arrayList20.get(i14);
                        i14++;
                        int i38 = ia.a;
                        l41 J6 = l41.J(ia.class);
                        J6.G = (TL_stars.StarsTransaction) obj12;
                        J6.q = true;
                        arrayList19.add(J6);
                    }
                    if (!g10.k(j10).e[i37]) {
                        arrayList19.add(l41.o(arrayList19.size(), 7));
                        arrayList19.add(l41.o(arrayList19.size(), 7));
                        arrayList19.add(l41.o(arrayList19.size(), 7));
                        break;
                    }
                } else {
                    v7 y10 = v7.y(i36, laVar.e);
                    ArrayList arrayList21 = y10.q[i37];
                    int size10 = arrayList21.size();
                    int i39 = 0;
                    while (i39 < size10) {
                        Object obj13 = arrayList21.get(i39);
                        i39++;
                        int i40 = ia.a;
                        l41 J7 = l41.J(ia.class);
                        J7.G = (TL_stars.StarsTransaction) obj13;
                        J7.q = false;
                        arrayList19.add(J7);
                    }
                    if (!y10.u[i37]) {
                        arrayList19.add(l41.o(arrayList19.size(), 7));
                        arrayList19.add(l41.o(arrayList19.size(), 7));
                        arrayList19.add(l41.o(arrayList19.size(), 7));
                        break;
                    }
                }
                break;
            case 23:
                ArrayList arrayList22 = (ArrayList) obj;
                ((t) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size11 = languages.size();
                while (i13 < size11) {
                    TranslateController.Language language = languages.get(i13);
                    i13++;
                    int i41 = jh.r.a;
                    l41 J8 = l41.J(jh.r.class);
                    J8.G = language;
                    arrayList22.add(J8);
                }
                break;
            case 24:
                m mVar = (m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.E;
                RectF rectF = mVar.v0;
                kh.g gVar = mVar.f;
                if (mVar.g()) {
                    if (mVar.C == null) {
                        runnable.run();
                        break;
                    } else {
                        canvas.translate(-gVar.getEditText().hintLayoutX, 0.0f);
                        canvas.saveLayerAlpha(0.0f, 0.0f, mVar.C.getWidth(), mVar.C.getHeight(), 255, 31);
                        rectF.set(0.0f, 1.0f, mVar.C.getWidth(), mVar.C.getHeight() - 1);
                        mVar.h(mVar.L, canvas, rectF, 0.0f, true, (-gVar.getX()) - r1.getPaddingLeft(), ((-gVar.getY()) - r1.getPaddingTop()) - r1.getExtendedPaddingTop(), true);
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
                        mt editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c10);
                        canvas.restore();
                        break;
                    }
                }
            case 25:
                w1 w1Var = (w1) obj3;
                String str = (String) obj;
                n2 n2Var = w1Var.r;
                n2Var.b = str;
                n2Var.c = ((Integer) obj2).intValue();
                w1Var.c.H(str);
                break;
            case 26:
                b2 b2Var = (b2) obj3;
                String str2 = (String) obj;
                n2 n2Var2 = b2Var.s;
                n2Var2.b = str2;
                n2Var2.c = ((Integer) obj2).intValue();
                b2Var.c.D(str2);
                break;
            case 27:
                u3 u3Var = (u3) obj3;
                if (obj != null) {
                    if (u3Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = u3Var.f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        break;
                    }
                } else {
                    u3Var.getClass();
                    break;
                }
                break;
            default:
                kh.g6 g6Var2 = (kh.g6) obj3;
                g6Var2.d0(g6Var2.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
        }
    }
}
