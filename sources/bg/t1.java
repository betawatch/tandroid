package bg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import ih.b5;
import ih.h4;
import ih.q5;
import ih.r5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jh.ca;
import jh.fa;
import jh.ia;
import jh.k7;
import jh.s7;
import jh.s9;
import jh.y9;
import jh.z9;
import nh.f5;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.w41;
import org.telegram.ui.f91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        float f9;
        Utilities.Callback callback;
        int i11 = this.a;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                f5 f5Var = (f5) obj3;
                f5Var.u0 = ((Integer) obj).intValue();
                f5Var.v0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new a4.g(f5Var, 13), 60L);
                break;
            case 1:
                eh.f fVar = (eh.f) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = fVar.W;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.h0;
                    arrayList.add(w41.D(0, dp2));
                    int i18 = dp - dp2;
                    int size = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj4 = arrayList2.get(i19);
                        i19++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.V.get((String) obj4)) {
                            if (TextUtils.isEmpty(fVar.Y) || eg.g2.U(tL_help_country, AndroidUtilities.translitSafe(fVar.Y).toLowerCase())) {
                                i18 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.f0.containsKey(tL_help_country.iso2);
                                int i20 = eh.e.a;
                                w41 J = w41.J(eh.e.class);
                                J.l = tL_help_country.iso2;
                                J.G = tL_help_country;
                                J.e = containsKey;
                                arrayList.add(J);
                            }
                        }
                    }
                    arrayList.add(w41.D(1, Math.max(0, i18)));
                    break;
                }
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj;
                f91 f91Var = ((eh.g) obj3).U;
                if (f91Var != null) {
                    arrayList3.add(w41.C(AndroidUtilities.dp(12.0f)));
                    arrayList3.add(w41.h(0, 0, f91Var));
                    break;
                }
                break;
            case 3:
                ((ih.b1) obj3).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 4:
                ih.d dVar = (ih.d) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.T;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.U;
                        ag.n nVar = new ag.n(11, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i21 = ih.b.a;
                        w41 J2 = w41.J(ih.b.class);
                        J2.G = tL_StarGiftAuctionAcquiredGift;
                        J2.H = auction;
                        J2.D = nVar;
                        arrayList4.add(J2);
                    }
                    arrayList4.add(w41.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 5:
                ((ArrayList) obj).add(((ih.f) obj3).T);
                break;
            case 6:
                ArrayList arrayList5 = (ArrayList) obj;
                arrayList5.add(((ih.t) obj3).U);
                arrayList5.add(w41.C(AndroidUtilities.dp(16.0f)));
                break;
            case 7:
                ((ArrayList) obj).add(w41.j(-1, ((ih.g0) obj3).V));
                break;
            case 8:
                ((ArrayList) obj).add(w41.j(-1, ((ih.n0) obj3).V));
                break;
            case 9:
                ((ih.h2) obj3).U((ArrayList) obj, (k51) obj2);
                break;
            case 10:
                ih.n3 n3Var = (ih.n3) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                gr0 gr0Var = n3Var.a;
                k7 k7Var = n3Var.e;
                if (k7Var != null) {
                    if ((!k7Var.e || k7Var.g != 783) && k7Var.l.size() <= 0) {
                        k7 k7Var2 = n3Var.e;
                        if (k7Var2.j && !k7Var2.i) {
                        }
                    }
                    k7 k7Var3 = n3Var.e;
                    int max = Math.max(1, (k7Var3 == null || (i10 = k7Var3.n) == 0) ? 3 : Math.min(3, i10));
                    k7 k7Var4 = n3Var.e;
                    if (k7Var4 != null) {
                        ArrayList arrayList7 = k7Var4.l;
                        int size2 = arrayList7.size();
                        int i22 = 0;
                        int i23 = 3;
                        while (i22 < size2) {
                            Object obj5 = arrayList7.get(i22);
                            i22++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                            boolean z11 = n3Var.d;
                            int i24 = ih.x1.a;
                            w41 J3 = w41.J(ih.x1.class);
                            J3.u = 1;
                            J3.z = 0;
                            J3.G = savedStarGift;
                            J3.q = true;
                            J3.f = false;
                            J3.r = z11;
                            J3.h = n3Var.n && (n3Var.e != gr0Var.d || savedStarGift.pinned_to_top);
                            arrayList6.add(J3);
                            i23--;
                            if (i23 == 0) {
                                i23 = 3;
                            }
                        }
                        k7 k7Var5 = n3Var.e;
                        if (k7Var5.i || !k7Var5.j) {
                            int i25 = 0;
                            while (true) {
                                if (i25 < (i23 <= 0 ? 3 : i23)) {
                                    i25++;
                                    w41 o10 = w41.o(i25, 34);
                                    o10.u = 1;
                                    arrayList6.add(o10);
                                }
                            }
                        }
                    }
                    if (gr0Var.d == n3Var.e) {
                        arrayList6.add(w41.C(AndroidUtilities.dp(20.0f)));
                        if (gr0Var.c == UserConfig.getInstance(n3Var.b).getClientUserId()) {
                            int v02 = g6.v0(g6.z6, n3Var.c);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i26 = ih.t3.a;
                            w41 J4 = w41.J(ih.t3.class);
                            J4.l = string;
                            J4.z = 17;
                            J4.B = v02;
                            J4.A = 14.0f;
                            J4.i = dp3;
                            J4.k = 0;
                            J4.q = false;
                            arrayList6.add(J4);
                        }
                        arrayList6.add(w41.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList6.isEmpty()) {
                        arrayList6.add(w41.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList6.add(0, w41.C(AndroidUtilities.dp(n3Var.E ? 42.0f : 12.0f)));
                    }
                    if (n3Var.f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new ih.n2(n3Var, max, i17));
                    }
                    gr0Var.o();
                    gr0Var.post(new cg.m2(gr0Var, 23));
                    break;
                }
                break;
            case 11:
                ih.s3 s3Var = (ih.s3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                k7 k7Var6 = s3Var.U;
                if (k7Var6 != null) {
                    ArrayList arrayList9 = k7Var6.l;
                    arrayList8.add(w41.C(AndroidUtilities.dp(16.0f)));
                    if (k7Var6.i && arrayList9.isEmpty()) {
                        w41 o11 = w41.o(1, 34);
                        o11.u = 1;
                        arrayList8.add(o11);
                        w41 o12 = w41.o(2, 34);
                        o12.u = 1;
                        arrayList8.add(o12);
                        w41 o13 = w41.o(3, 34);
                        o13.u = 1;
                        arrayList8.add(o13);
                        w41 o14 = w41.o(4, 34);
                        o14.u = 1;
                        arrayList8.add(o14);
                        w41 o15 = w41.o(5, 34);
                        o15.u = 1;
                        arrayList8.add(o15);
                        w41 o16 = w41.o(6, 34);
                        o16.u = 1;
                        arrayList8.add(o16);
                        w41 o17 = w41.o(7, 34);
                        o17.u = 1;
                        arrayList8.add(o17);
                        w41 o18 = w41.o(8, 34);
                        o18.u = 1;
                        arrayList8.add(o18);
                        w41 o19 = w41.o(9, 34);
                        o19.u = 1;
                        arrayList8.add(o19);
                        f9 = 68.0f;
                    } else {
                        int size3 = arrayList9.size();
                        int i27 = 3;
                        int i28 = 0;
                        while (i28 < size3) {
                            Object obj6 = arrayList9.get(i28);
                            i28++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(s3Var.T))) {
                                int i29 = ih.x1.a;
                                w41 J5 = w41.J(ih.x1.class);
                                J5.u = 1;
                                J5.z = z10 ? 1 : 0;
                                J5.G = savedStarGift2;
                                J5.q = true;
                                J5.f = true;
                                J5.r = z10;
                                HashSet hashSet = s3Var.V;
                                int i30 = savedStarGift2.msg_id;
                                int i31 = size3;
                                J5.K(hashSet.contains(Long.valueOf(i30 == 0 ? savedStarGift2.saved_id : i30)));
                                J5.u = 1;
                                arrayList8.add(J5);
                                i27--;
                                if (i27 == 0) {
                                    i27 = 3;
                                }
                                size3 = i31;
                                z10 = false;
                            }
                        }
                        f9 = 68.0f;
                        if (k7Var6.i || !k7Var6.j) {
                            int i32 = 0;
                            while (true) {
                                if (i32 < (i27 <= 0 ? 3 : i27)) {
                                    i32++;
                                    w41 o20 = w41.o(i32, 34);
                                    o20.u = 1;
                                    arrayList8.add(o20);
                                }
                            }
                        }
                    }
                    arrayList8.add(w41.C(AndroidUtilities.dp(f9)));
                    break;
                }
                break;
            case 12:
                r5 r5Var = (r5) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                b5 b5Var = r5Var.d;
                ArrayList arrayList11 = b5Var.d;
                int size4 = arrayList11.size();
                int i33 = 0;
                while (i33 < size4) {
                    Object obj7 = arrayList11.get(i33);
                    i33++;
                    arrayList10.add(ih.x1.a(0, (TL_stars.TL_starGiftUnique) obj7, false, false, false, true, false));
                }
                if (b5Var.t || !b5Var.u) {
                    w41 o21 = w41.o(-1, 34);
                    o21.u = 1;
                    arrayList10.add(o21);
                    w41 o22 = w41.o(-2, 34);
                    o22.u = 1;
                    arrayList10.add(o22);
                    w41 o23 = w41.o(-3, 34);
                    o23.u = 1;
                    arrayList10.add(o23);
                    if (b5Var.d.isEmpty()) {
                        w41 o24 = w41.o(-4, 34);
                        o24.u = 1;
                        arrayList10.add(o24);
                        w41 o25 = w41.o(-5, 34);
                        o25.u = 1;
                        arrayList10.add(o25);
                        w41 o26 = w41.o(-6, 34);
                        o26.u = 1;
                        arrayList10.add(o26);
                        w41 o27 = w41.o(-7, 34);
                        o27.u = 1;
                        arrayList10.add(o27);
                        w41 o28 = w41.o(-8, 34);
                        o28.u = 1;
                        arrayList10.add(o28);
                        w41 o29 = w41.o(-9, 34);
                        o29.u = 1;
                        arrayList10.add(o29);
                        w41 o30 = w41.o(-10, 34);
                        o30.u = 1;
                        arrayList10.add(o30);
                        w41 o31 = w41.o(-11, 34);
                        o31.u = 1;
                        arrayList10.add(o31);
                        w41 o32 = w41.o(-12, 34);
                        o32.u = 1;
                        arrayList10.add(o32);
                        w41 o33 = w41.o(-13, 34);
                        o33.u = 1;
                        arrayList10.add(o33);
                        w41 o34 = w41.o(-14, 34);
                        o34.u = 1;
                        arrayList10.add(o34);
                        w41 o35 = w41.o(-15, 34);
                        o35.u = 1;
                        arrayList10.add(o35);
                    }
                }
                boolean z12 = arrayList10.isEmpty() && !b5Var.t;
                if (r5Var.x != z12) {
                    r5Var.x = z12;
                    r5Var.w.setVisibility(0);
                    r5Var.w.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.95f).scaleY(z12 ? 1.0f : 0.95f).setInterpolator(jr.h).setDuration(320L).setListener(new h4(r5Var, z12, 1)).start();
                    break;
                }
                break;
            case 13:
                q5.T((q5) obj3, (ArrayList) obj);
                break;
            case 14:
                jh.q.Y((jh.q) obj3, (ArrayList) obj);
                break;
            case 15:
                jh.f0 f0Var = (jh.f0) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                arrayList12.add(w41.k(f0Var.U));
                arrayList12.add(jh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList12.add(jh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new jh.o(f0Var, i17)), true), R.drawable.msg_bot));
                arrayList12.add(jh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList12.add(jh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList12.add(w41.C(AndroidUtilities.dp(68.0f)));
                break;
            case 16:
                ArrayList arrayList13 = (ArrayList) obj;
                w41 w41Var = ((jh.n0) obj3).r0;
                if (w41Var != null) {
                    arrayList13.add(w41Var);
                    break;
                }
                break;
            case 17:
                jh.j1 j1Var = (jh.j1) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                ArrayList arrayList15 = j1Var.Z;
                boolean z13 = j1Var.s0;
                com.google.android.gms.common.api.internal.r rVar = j1Var.c0;
                ArrayList arrayList16 = j1Var.X;
                ArrayList arrayList17 = j1Var.W;
                com.google.android.gms.common.api.internal.r rVar2 = j1Var.b0;
                com.google.android.gms.common.api.internal.r rVar3 = j1Var.a0;
                ArrayList arrayList18 = j1Var.Y;
                if (arrayList18 != null && arrayList17 != null && arrayList16 != null) {
                    arrayList14.add(w41.C(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i34 = j1Var.f0.r;
                    if (i34 == 0) {
                        arrayList14.add(w41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList18.size()))));
                        int size5 = arrayList18.size();
                        int i35 = 0;
                        while (i35 < size5) {
                            Object obj8 = arrayList18.get(i35);
                            i35++;
                            arrayList14.add(jh.g1.a(i34, new jh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList15.isEmpty()) {
                            arrayList14.add(w41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList18.size()))));
                            int size6 = arrayList15.size();
                            while (i14 < size6) {
                                Object obj9 = arrayList15.get(i14);
                                i14++;
                                arrayList14.add(jh.g1.a(i34, new jh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                            break;
                        }
                    } else if (i34 == 1) {
                        arrayList14.add(w41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList17.size()))));
                        int size7 = arrayList17.size();
                        while (i15 < size7) {
                            Object obj10 = arrayList17.get(i15);
                            i15++;
                            arrayList14.add(jh.g1.a(i34, new jh.f1((TL_stars.starGiftAttributeBackdrop) obj10, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i34 == 2) {
                        arrayList14.add(w41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList16.size()))));
                        int size8 = arrayList16.size();
                        while (i16 < size8) {
                            Object obj11 = arrayList16.get(i16);
                            i16++;
                            arrayList14.add(jh.g1.a(i34, new jh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj11, (TL_stars.starGiftAttributeModel) rVar.c())));
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
                ((ia) obj3).H0((ArrayList) obj, (k51) obj2);
                break;
            case 20:
                ((s9) obj3).R((ArrayList) obj, (k51) obj2);
                break;
            case 21:
                ((y9) obj3).R((ArrayList) obj, (k51) obj2);
                break;
            case 22:
                ((z9) obj3).R((ArrayList) obj, (k51) obj2);
                break;
            case 23:
                fa faVar = (fa) obj3;
                ArrayList arrayList19 = (ArrayList) obj;
                int i36 = faVar.c;
                int i37 = faVar.d;
                long j10 = faVar.f;
                if (j10 != 0) {
                    jh.b0 g10 = jh.b0.g(i36);
                    ArrayList arrayList20 = g10.k(j10).a[i37];
                    int size9 = arrayList20.size();
                    while (i13 < size9) {
                        Object obj12 = arrayList20.get(i13);
                        i13++;
                        int i38 = ca.a;
                        w41 J6 = w41.J(ca.class);
                        J6.G = (TL_stars.StarsTransaction) obj12;
                        J6.q = true;
                        arrayList19.add(J6);
                    }
                    if (!g10.k(j10).e[i37]) {
                        arrayList19.add(w41.o(arrayList19.size(), 7));
                        arrayList19.add(w41.o(arrayList19.size(), 7));
                        arrayList19.add(w41.o(arrayList19.size(), 7));
                        break;
                    }
                } else {
                    s7 y8 = s7.y(i36, faVar.e);
                    ArrayList arrayList21 = y8.q[i37];
                    int size10 = arrayList21.size();
                    int i39 = 0;
                    while (i39 < size10) {
                        Object obj13 = arrayList21.get(i39);
                        i39++;
                        int i40 = ca.a;
                        w41 J7 = w41.J(ca.class);
                        J7.G = (TL_stars.StarsTransaction) obj13;
                        J7.q = false;
                        arrayList19.add(J7);
                    }
                    if (!y8.u[i37]) {
                        arrayList19.add(w41.o(arrayList19.size(), 7));
                        arrayList19.add(w41.o(arrayList19.size(), 7));
                        arrayList19.add(w41.o(arrayList19.size(), 7));
                        break;
                    }
                }
                break;
            case 24:
                ArrayList arrayList22 = (ArrayList) obj;
                ((mh.u) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size11 = languages.size();
                while (i12 < size11) {
                    TranslateController.Language language = languages.get(i12);
                    i12++;
                    int i41 = mh.s.a;
                    w41 J8 = w41.J(mh.s.class);
                    J8.G = language;
                    arrayList22.add(J8);
                }
                break;
            case 25:
                nh.m mVar = (nh.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.E;
                RectF rectF = mVar.v0;
                nh.g gVar = mVar.f;
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
                    Paint c3 = mVar.L.c(1.0f);
                    gVar.getEditText().setHintColor(c3 == null ? -2130706433 : -1);
                    if (c3 == null) {
                        runnable.run();
                        break;
                    } else {
                        st editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c3);
                        canvas.restore();
                        break;
                    }
                }
            case 26:
                nh.t1 t1Var = (nh.t1) obj3;
                String str = (String) obj;
                nh.k2 k2Var = t1Var.r;
                k2Var.b = str;
                k2Var.c = ((Integer) obj2).intValue();
                t1Var.c.H(str);
                break;
            case 27:
                nh.y1 y1Var = (nh.y1) obj3;
                String str2 = (String) obj;
                nh.k2 k2Var2 = y1Var.s;
                k2Var2.b = str2;
                k2Var2.c = ((Integer) obj2).intValue();
                y1Var.c.D(str2);
                break;
            default:
                nh.r3 r3Var = (nh.r3) obj3;
                if (obj != null) {
                    if (r3Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = r3Var.f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        break;
                    }
                } else {
                    r3Var.getClass();
                    break;
                }
                break;
        }
    }
}
