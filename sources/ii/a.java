package ii;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.api.internal.r;
import di.c6;
import fi.j4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import ji.g2;
import ji.m4;
import ji.v3;
import ji.x;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.f11;
import org.telegram.ui.na1;
import org.telegram.ui.nf;
import org.telegram.ui.web.e;
import org.telegram.ui.web.h;
import org.telegram.ui.web.j;
import org.telegram.ui.web.k;
import org.telegram.ui.web.l;
import org.telegram.ui.wy0;
import sg.p0;
import ug.a1;
import uh.f;
import uh.g;
import yh.a3;
import yh.c0;
import yh.f4;
import yh.g1;
import yh.g4;
import yh.k4;
import yh.m;
import yh.m2;
import yh.n2;
import yh.p1;
import yh.t1;
import yh.t3;
import yh.v;
import zh.a0;
import zh.g7;
import zh.j5;
import zh.k7;
import zh.l7;
import zh.o0;
import zh.q;
import zh.s;
import zh.s0;
import zh.v7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:277:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0b4d  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10;
        g2 g2Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        int i11;
        int i12;
        float f7;
        int i13 = 24;
        int i14 = -1;
        ?? r14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        final int i19 = 1;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(h51.D(0, AndroidUtilities.dp(12.0f)));
                arrayList3.add(h51.j(1, bVar.Z));
                arrayList3.add(h51.D(2, AndroidUtilities.dp(12.0f)));
                arrayList3.add(h51.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                bVar.c0 = arrayList3.size();
                String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z11 = bVar.b0;
                h51 x10 = h51.x(151, string, LocaleController.getString(z11 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                x10.K(!bVar.Y);
                arrayList3.add(x10);
                h51 x11 = h51.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z11 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                x11.K(bVar.Y);
                arrayList3.add(x11);
                arrayList3.add(h51.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 1:
                ((ArrayList) obj).add(h51.j(0, ((c) this.b).X));
                break;
            case 2:
                Utilities.themeQueue.postRunnable(new j4(i13, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 3:
                x xVar = (x) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(h51.j(1, xVar.a0));
                arrayList4.add(h51.j(3, xVar.d0));
                if (xVar.i0 != null) {
                    arrayList4.add(h51.j(2, xVar.b0));
                    break;
                }
                break;
            case 4:
                v3.H1((v3[]) this.b, (ArrayList) obj, (v51) obj2);
                break;
            case 5:
                v3 v3Var = (v3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = v3Var.l3;
                ArrayList arrayList7 = new ArrayList(arrayList5.size());
                int size = arrayList5.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj3 = arrayList5.get(i20);
                    i20++;
                    Object obj4 = ((h51) obj3).G;
                    if (obj4 instanceof ji.a) {
                        arrayList7.add((ji.a) obj4);
                    }
                }
                if (arrayList7.size() >= 2) {
                    ArrayList arrayList8 = new ArrayList();
                    int size2 = arrayList7.size();
                    int i21 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i22 = 0;
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj5 = arrayList7.get(i23);
                        i23++;
                        ji.a aVar = (ji.a) obj5;
                        int indexOf = arrayList6.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i24 = indexOf + 1;
                            if (v3.w3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int O3 = v3Var.O3(indexOf);
                                i24 = O3 >= arrayList6.size() ? arrayList6.size() : O3 + 1;
                            }
                            arrayList8.add(new ArrayList(arrayList6.subList(indexOf, i24)));
                            i21 = Math.min(i21, indexOf);
                            i14 = Math.max(i14, i24);
                            i22 += i24 - indexOf;
                        }
                    }
                    if (i22 == i14 - i21) {
                        ArrayList arrayList9 = new ArrayList(i22);
                        int size3 = arrayList8.size();
                        int i25 = 0;
                        while (i25 < size3) {
                            Object obj6 = arrayList8.get(i25);
                            i25++;
                            arrayList9.addAll((ArrayList) obj6);
                        }
                        for (int i26 = 0; i26 < arrayList9.size(); i26++) {
                            if (arrayList6.get(i21 + i26) != arrayList9.get(i26)) {
                                g2 g2Var2 = v3Var.J3;
                                if (g2Var2 != null) {
                                    g2Var2.d();
                                }
                                for (int i27 = 0; i27 < arrayList9.size(); i27++) {
                                    arrayList6.set(i21 + i27, (ji.a) arrayList9.get(i27));
                                }
                                ji.a aVar2 = v3Var.S3;
                                ArrayList arrayList10 = v3.s4;
                                if (aVar2 != null) {
                                    ArrayList arrayList11 = aVar2.k;
                                    int indexOf2 = arrayList6.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList12 = indexOf2 > 0 ? ((ji.a) arrayList6.get(indexOf2 - 1)).k : arrayList10;
                                        int i28 = indexOf2 + 1;
                                        if (i28 < arrayList6.size()) {
                                            arrayList10 = ((ji.a) arrayList6.get(i28)).k;
                                        }
                                        if (arrayList12.size() < arrayList10.size()) {
                                            arrayList12 = arrayList10;
                                        }
                                        if (!arrayList11.equals(arrayList12)) {
                                            arrayList11.clear();
                                            arrayList11.addAll(arrayList12);
                                            z10 = true;
                                            boolean w22 = v3Var.w2();
                                            i10 = 0;
                                            while (i10 < arrayList6.size()) {
                                                ji.a aVar3 = (ji.a) arrayList6.get(i10);
                                                if (!aVar3.i && !v3.w3(aVar3)) {
                                                    ji.a aVar4 = i10 > 0 ? (ji.a) arrayList6.get(i10 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (v3.D3(aVar3.b)) {
                                                        aVar3.c = max;
                                                        if (max > 0) {
                                                            aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                            aVar3.e = false;
                                                            aVar3.f = false;
                                                        }
                                                    } else {
                                                        int i29 = max + 1;
                                                        if (aVar3.c > i29) {
                                                            aVar3.c = i29;
                                                        }
                                                    }
                                                    if (aVar3.c <= 0) {
                                                        aVar3.c = 0;
                                                        aVar3.d = 0;
                                                        aVar3.e = false;
                                                        aVar3.f = false;
                                                    }
                                                }
                                                i10++;
                                            }
                                            v3Var.r4();
                                            v3Var.Z1();
                                            if (!z10 || w22) {
                                                v3Var.Y2.N(true);
                                                v3Var.w4();
                                            } else {
                                                v3Var.w4();
                                            }
                                            g2Var = v3Var.J3;
                                            if (g2Var == null) {
                                                g2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                boolean w222 = v3Var.w2();
                                i10 = 0;
                                while (i10 < arrayList6.size()) {
                                }
                                v3Var.r4();
                                v3Var.Z1();
                                if (z10) {
                                }
                                v3Var.Y2.N(true);
                                v3Var.w4();
                                g2Var = v3Var.J3;
                                if (g2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 6:
                final l lVar = (l) this.b;
                ArrayList arrayList13 = (ArrayList) obj;
                j jVar = lVar.y;
                ArrayList arrayList14 = lVar.x;
                if (!lVar.b && arrayList14.isEmpty()) {
                    arrayList13.add(h51.k(lVar.d));
                }
                SharedPreferences sharedPreferences = lVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList15 = new ArrayList();
                String string2 = sharedPreferences.getString("queries_json", null);
                if (string2 != null) {
                    try {
                        ArrayList arrayList16 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string2);
                        int i30 = 0;
                        while (i30 < jSONArray.length()) {
                            try {
                                jSONObject = jSONArray.getJSONObject(i30);
                                arrayList2 = arrayList15;
                            } catch (Exception unused) {
                                arrayList2 = arrayList15;
                            }
                            try {
                                k kVar = new k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                kVar.c = jSONObject.optDouble("rank", 0.0d);
                                arrayList16.add(kVar);
                                i30++;
                                arrayList15 = arrayList2;
                            } catch (Exception unused2) {
                                arrayList = arrayList2;
                                arrayList14.size();
                                arrayList.size();
                                if (!arrayList14.isEmpty()) {
                                }
                                i11 = 0;
                                while (i11 < arrayList14.size()) {
                                }
                                if (!arrayList.isEmpty()) {
                                }
                                if (jVar != null) {
                                }
                            }
                        }
                        arrayList2 = arrayList15;
                        try {
                            Collections.sort(arrayList16, new f11(5));
                            int size4 = arrayList16.size();
                            int i31 = 0;
                            while (i31 < size4) {
                                Object obj7 = arrayList16.get(i31);
                                i31++;
                                k kVar2 = (k) obj7;
                                if (arrayList2.size() >= 20) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    try {
                                        arrayList.add(kVar2.a);
                                        arrayList2 = arrayList;
                                    } catch (Exception unused3) {
                                        arrayList14.size();
                                        arrayList.size();
                                        if (!arrayList14.isEmpty()) {
                                        }
                                        i11 = 0;
                                        while (i11 < arrayList14.size()) {
                                        }
                                        if (!arrayList.isEmpty()) {
                                        }
                                        if (jVar != null) {
                                            return;
                                        }
                                    }
                                }
                            }
                            arrayList = arrayList2;
                        } catch (Exception unused4) {
                            arrayList = arrayList2;
                        }
                    } catch (Exception unused5) {
                        arrayList = arrayList15;
                    }
                } else {
                    arrayList = arrayList15;
                }
                arrayList14.size();
                arrayList.size();
                if (!arrayList14.isEmpty()) {
                    arrayList13.add(h51.k(lVar.v));
                }
                i11 = 0;
                while (i11 < arrayList14.size()) {
                    final String str = (String) arrayList14.get(i11);
                    boolean z12 = i11 == 0;
                    boolean z13 = i11 == arrayList14.size() - 1;
                    final int i32 = 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    org.telegram.ui.r rVar = lVar.M;
                                    if (rVar != null) {
                                        rVar.run(str);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.r rVar2 = lVar.M;
                                    if (rVar2 != null) {
                                        rVar2.run(str);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    int i33 = e.a;
                    h51 J = h51.J(e.class);
                    J.z = 1;
                    J.l = str;
                    J.D = onClickListener;
                    J.q = z12;
                    J.r = z13;
                    J.G = Boolean.TRUE;
                    J.H = lVar;
                    arrayList13.add(J);
                    i11++;
                }
                if (!arrayList.isEmpty()) {
                    arrayList13.add(h51.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new m4(lVar, 5)));
                    int i34 = 0;
                    while (i34 < arrayList.size()) {
                        final String str2 = (String) arrayList.get(i34);
                        boolean z14 = i34 == 0;
                        boolean z15 = i34 == arrayList.size() - 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i19) {
                                    case 0:
                                        org.telegram.ui.r rVar = lVar.M;
                                        if (rVar != null) {
                                            rVar.run(str2);
                                            break;
                                        }
                                        break;
                                    default:
                                        org.telegram.ui.r rVar2 = lVar.M;
                                        if (rVar2 != null) {
                                            rVar2.run(str2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        int i35 = e.a;
                        h51 J2 = h51.J(e.class);
                        J2.z = 0;
                        J2.l = str2;
                        J2.D = onClickListener2;
                        J2.q = z14;
                        J2.r = z15;
                        J2.G = Boolean.TRUE;
                        J2.H = lVar;
                        arrayList13.add(J2);
                        i34++;
                    }
                }
                if (jVar != null) {
                    ArrayList arrayList17 = jVar.a;
                    if (!arrayList17.isEmpty()) {
                        arrayList13.add(h51.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i36 = 0; i36 < arrayList17.size(); i36++) {
                            MessageObject messageObject = (MessageObject) arrayList17.get(i36);
                            if (!TextUtils.isEmpty(l.a(messageObject))) {
                                int i37 = h.a;
                                h51 J3 = h51.J(h.class);
                                J3.z = 3;
                                J3.q = true;
                                J3.H = messageObject;
                                arrayList13.add(J3);
                            }
                        }
                        if (!jVar.f) {
                            arrayList13.add(h51.o(arrayList13.size(), 32));
                            arrayList13.add(h51.o(arrayList13.size(), 32));
                            arrayList13.add(h51.o(arrayList13.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 7:
                c6 c6Var = (c6) this.b;
                c6Var.y0 = ((Integer) obj).intValue();
                c6Var.z0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(c6Var, 19), 60L);
                break;
            case 8:
                f fVar = (f) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                ArrayList arrayList19 = fVar.a0;
                if (arrayList19 != null && !arrayList19.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.l0;
                    arrayList18.add(h51.D(0, dp2));
                    int i38 = dp - dp2;
                    int size5 = arrayList19.size();
                    int i39 = 0;
                    while (i39 < size5) {
                        Object obj8 = arrayList19.get(i39);
                        i39++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.Z.get((String) obj8)) {
                            if (TextUtils.isEmpty(fVar.c0) || a1.U(tL_help_country, AndroidUtilities.translitSafe(fVar.c0).toLowerCase())) {
                                i38 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.j0.containsKey(tL_help_country.iso2);
                                int i40 = uh.e.a;
                                h51 J4 = h51.J(uh.e.class);
                                J4.l = tL_help_country.iso2;
                                J4.G = tL_help_country;
                                J4.e = containsKey;
                                arrayList18.add(J4);
                            }
                        }
                    }
                    arrayList18.add(h51.D(1, Math.max(0, i38)));
                    break;
                }
                break;
            case 9:
                ArrayList arrayList20 = (ArrayList) obj;
                na1 na1Var = ((g) this.b).Y;
                if (na1Var != null) {
                    arrayList20.add(h51.C(AndroidUtilities.dp(12.0f)));
                    arrayList20.add(h51.h(0, 0, na1Var));
                    break;
                }
                break;
            case 10:
                ((nf) this.b).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 11:
                yh.c cVar = (yh.c) this.b;
                ArrayList arrayList21 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = cVar.X;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = cVar.Y;
                        wy0 wy0Var = new wy0(i13, cVar, tL_StarGiftAuctionAcquiredGift);
                        int i41 = yh.a.a;
                        h51 J5 = h51.J(yh.a.class);
                        J5.G = tL_StarGiftAuctionAcquiredGift;
                        J5.H = auction;
                        J5.D = wy0Var;
                        arrayList21.add(J5);
                    }
                    arrayList21.add(h51.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 12:
                ((ArrayList) obj).add(((yh.e) this.b).X);
                break;
            case 13:
                ArrayList arrayList22 = (ArrayList) obj;
                arrayList22.add(((m) this.b).Y);
                arrayList22.add(h51.C(AndroidUtilities.dp(16.0f)));
                break;
            case 14:
                ((ArrayList) obj).add(h51.j(-1, ((v) this.b).Z));
                break;
            case 15:
                ((ArrayList) obj).add(h51.j(-1, ((c0) this.b).Z));
                break;
            case 16:
                ((p1) this.b).U((ArrayList) obj, (v51) obj2);
                break;
            case 17:
                m2 m2Var = (m2) this.b;
                ArrayList arrayList23 = (ArrayList) obj;
                nr0 nr0Var = m2Var.a;
                j5 j5Var = m2Var.e;
                if (j5Var != null) {
                    if ((!j5Var.e || j5Var.g != 783) && j5Var.l.size() <= 0) {
                        j5 j5Var2 = m2Var.e;
                        if (j5Var2.j && !j5Var2.i) {
                        }
                    }
                    j5 j5Var3 = m2Var.e;
                    int max2 = Math.max(1, (j5Var3 == null || (i12 = j5Var3.n) == 0) ? 3 : Math.min(3, i12));
                    j5 j5Var4 = m2Var.e;
                    if (j5Var4 != null) {
                        ArrayList arrayList24 = j5Var4.l;
                        int size6 = arrayList24.size();
                        int i42 = 3;
                        int i43 = 0;
                        while (i43 < size6) {
                            Object obj9 = arrayList24.get(i43);
                            i43++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj9;
                            boolean z16 = m2Var.d;
                            int i44 = g1.a;
                            h51 J6 = h51.J(g1.class);
                            J6.u = 1;
                            J6.z = r14;
                            J6.G = savedStarGift;
                            J6.q = true;
                            J6.f = r14;
                            J6.r = z16;
                            J6.h = m2Var.n && (m2Var.e != nr0Var.d || savedStarGift.pinned_to_top);
                            arrayList23.add(J6);
                            i42--;
                            if (i42 == 0) {
                                i42 = 3;
                            }
                            r14 = 0;
                        }
                        j5 j5Var5 = m2Var.e;
                        if (j5Var5.i || !j5Var5.j) {
                            int i45 = 0;
                            while (true) {
                                if (i45 < (i42 <= 0 ? 3 : i42)) {
                                    i45++;
                                    h51 o9 = h51.o(i45, 34);
                                    o9.u = 1;
                                    arrayList23.add(o9);
                                }
                            }
                        }
                    }
                    if (nr0Var.d == m2Var.e) {
                        arrayList23.add(h51.C(AndroidUtilities.dp(20.0f)));
                        if (nr0Var.c == UserConfig.getInstance(m2Var.b).getClientUserId()) {
                            int v02 = j6.v0(j6.z6, m2Var.c);
                            String string3 = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i46 = n2.a;
                            h51 J7 = h51.J(n2.class);
                            J7.l = string3;
                            J7.z = 17;
                            J7.B = v02;
                            J7.A = 14.0f;
                            J7.i = dp3;
                            J7.k = 0;
                            J7.q = false;
                            arrayList23.add(J7);
                        }
                        arrayList23.add(h51.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList23.isEmpty()) {
                        arrayList23.add(h51.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList23.isEmpty()) {
                        arrayList23.add(0, h51.C(AndroidUtilities.dp(m2Var.I ? 42.0f : 12.0f)));
                    }
                    if (m2Var.f.getSpanCount() != max2) {
                        AndroidUtilities.runOnUIThread(new t1(m2Var, max2, i19));
                    }
                    nr0Var.o();
                    nr0Var.post(new p0(nr0Var, 22));
                    break;
                }
                break;
            case 18:
                g4 g4Var = (g4) this.b;
                ArrayList arrayList25 = (ArrayList) obj;
                t3 t3Var = g4Var.d;
                ArrayList arrayList26 = t3Var.d;
                int size7 = arrayList26.size();
                int i47 = 0;
                while (i47 < size7) {
                    Object obj10 = arrayList26.get(i47);
                    i47++;
                    arrayList25.add(g1.a(0, (TL_stars.TL_starGiftUnique) obj10, false, false, false, true, false));
                }
                if (t3Var.t || !t3Var.u) {
                    h51 o10 = h51.o(-1, 34);
                    o10.u = 1;
                    arrayList25.add(o10);
                    h51 o11 = h51.o(-2, 34);
                    o11.u = 1;
                    arrayList25.add(o11);
                    h51 o12 = h51.o(-3, 34);
                    o12.u = 1;
                    arrayList25.add(o12);
                    if (t3Var.d.isEmpty()) {
                        h51 o13 = h51.o(-4, 34);
                        o13.u = 1;
                        arrayList25.add(o13);
                        h51 o14 = h51.o(-5, 34);
                        o14.u = 1;
                        arrayList25.add(o14);
                        h51 o15 = h51.o(-6, 34);
                        o15.u = 1;
                        arrayList25.add(o15);
                        h51 o16 = h51.o(-7, 34);
                        o16.u = 1;
                        arrayList25.add(o16);
                        h51 o17 = h51.o(-8, 34);
                        o17.u = 1;
                        arrayList25.add(o17);
                        h51 o18 = h51.o(-9, 34);
                        o18.u = 1;
                        arrayList25.add(o18);
                        h51 o19 = h51.o(-10, 34);
                        o19.u = 1;
                        arrayList25.add(o19);
                        h51 o20 = h51.o(-11, 34);
                        o20.u = 1;
                        arrayList25.add(o20);
                        h51 o21 = h51.o(-12, 34);
                        o21.u = 1;
                        arrayList25.add(o21);
                        h51 o22 = h51.o(-13, 34);
                        o22.u = 1;
                        arrayList25.add(o22);
                        h51 o23 = h51.o(-14, 34);
                        o23.u = 1;
                        arrayList25.add(o23);
                        h51 o24 = h51.o(-15, 34);
                        o24.u = 1;
                        arrayList25.add(o24);
                    }
                }
                boolean z17 = arrayList25.isEmpty() && !t3Var.t;
                if (g4Var.x != z17) {
                    g4Var.x = z17;
                    g4Var.w.setVisibility(0);
                    g4Var.w.animate().alpha(z17 ? 1.0f : 0.0f).scaleX(z17 ? 1.0f : 0.95f).scaleY(z17 ? 1.0f : 0.95f).setInterpolator(pr.h).setDuration(320L).setListener(new a3(g4Var, z17, 1)).start();
                    break;
                }
                break;
            case 19:
                f4.T((f4) this.b, (ArrayList) obj);
                break;
            case 20:
                k4 k4Var = (k4) this.b;
                ArrayList arrayList27 = (ArrayList) obj;
                j5 j5Var6 = k4Var.Y;
                if (j5Var6 != null) {
                    ArrayList arrayList28 = j5Var6.l;
                    arrayList27.add(h51.C(AndroidUtilities.dp(16.0f)));
                    if (j5Var6.i && arrayList28.isEmpty()) {
                        h51 o25 = h51.o(1, 34);
                        o25.u = 1;
                        arrayList27.add(o25);
                        h51 o26 = h51.o(2, 34);
                        o26.u = 1;
                        arrayList27.add(o26);
                        h51 o27 = h51.o(3, 34);
                        o27.u = 1;
                        arrayList27.add(o27);
                        h51 o28 = h51.o(4, 34);
                        o28.u = 1;
                        arrayList27.add(o28);
                        h51 o29 = h51.o(5, 34);
                        o29.u = 1;
                        arrayList27.add(o29);
                        h51 o30 = h51.o(6, 34);
                        o30.u = 1;
                        arrayList27.add(o30);
                        h51 o31 = h51.o(7, 34);
                        o31.u = 1;
                        arrayList27.add(o31);
                        h51 o32 = h51.o(8, 34);
                        o32.u = 1;
                        arrayList27.add(o32);
                        h51 o33 = h51.o(9, 34);
                        o33.u = 1;
                        arrayList27.add(o33);
                        f7 = 68.0f;
                    } else {
                        int size8 = arrayList28.size();
                        int i48 = 3;
                        int i49 = 0;
                        while (i49 < size8) {
                            Object obj11 = arrayList28.get(i49);
                            i49++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj11;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(k4Var.X))) {
                                int i50 = g1.a;
                                h51 J8 = h51.J(g1.class);
                                J8.u = 1;
                                J8.z = 0;
                                J8.G = savedStarGift2;
                                J8.q = true;
                                J8.f = true;
                                J8.r = false;
                                HashSet hashSet = k4Var.Z;
                                int i51 = savedStarGift2.msg_id;
                                J8.K(hashSet.contains(Long.valueOf(i51 == 0 ? savedStarGift2.saved_id : i51)));
                                J8.u = 1;
                                arrayList27.add(J8);
                                i48--;
                                if (i48 == 0) {
                                    i48 = 3;
                                }
                            }
                        }
                        f7 = 68.0f;
                        if (j5Var6.i || !j5Var6.j) {
                            while (true) {
                                if (i18 < (i48 <= 0 ? 3 : i48)) {
                                    i18++;
                                    h51 o34 = h51.o(i18, 34);
                                    o34.u = 1;
                                    arrayList27.add(o34);
                                }
                            }
                        }
                    }
                    arrayList27.add(h51.C(AndroidUtilities.dp(f7)));
                    break;
                }
                break;
            case 21:
                zh.g.Y((zh.g) this.b, (ArrayList) obj);
                break;
            case 22:
                s sVar = (s) this.b;
                ArrayList arrayList29 = (ArrayList) obj;
                arrayList29.add(h51.k(sVar.Y));
                arrayList29.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList29.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new p0(sVar, 25)), true), R.drawable.msg_bot));
                arrayList29.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList29.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList29.add(h51.C(AndroidUtilities.dp(68.0f)));
                break;
            case 23:
                ArrayList arrayList30 = (ArrayList) obj;
                h51 h51Var = ((a0) this.b).v0;
                if (h51Var != null) {
                    arrayList30.add(h51Var);
                    break;
                }
                break;
            case 24:
                s0 s0Var = (s0) this.b;
                ArrayList arrayList31 = (ArrayList) obj;
                ArrayList arrayList32 = s0Var.d0;
                boolean z18 = s0Var.w0;
                r rVar = s0Var.g0;
                ArrayList arrayList33 = s0Var.b0;
                ArrayList arrayList34 = s0Var.a0;
                r rVar2 = s0Var.f0;
                r rVar3 = s0Var.e0;
                ArrayList arrayList35 = s0Var.c0;
                if (arrayList35 != null && arrayList34 != null && arrayList33 != null) {
                    arrayList31.add(h51.C(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i52 = s0Var.j0.r;
                    if (i52 == 0) {
                        arrayList31.add(h51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z18 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList35.size()))));
                        int size9 = arrayList35.size();
                        int i53 = 0;
                        while (i53 < size9) {
                            Object obj12 = arrayList35.get(i53);
                            i53++;
                            arrayList31.add(zh.p0.a(i52, new o0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj12)));
                        }
                        if (!arrayList32.isEmpty()) {
                            arrayList31.add(h51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z18 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList35.size()))));
                            int size10 = arrayList32.size();
                            while (i15 < size10) {
                                Object obj13 = arrayList32.get(i15);
                                i15++;
                                arrayList31.add(zh.p0.a(i52, new o0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj13)));
                            }
                            break;
                        }
                    } else if (i52 == 1) {
                        arrayList31.add(h51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList34.size()))));
                        int size11 = arrayList34.size();
                        while (i16 < size11) {
                            Object obj14 = arrayList34.get(i16);
                            i16++;
                            arrayList31.add(zh.p0.a(i52, new o0((TL_stars.starGiftAttributeBackdrop) obj14, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i52 == 2) {
                        arrayList31.add(h51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList33.size()))));
                        int size12 = arrayList33.size();
                        while (i17 < size12) {
                            Object obj15 = arrayList33.get(i17);
                            i17++;
                            arrayList31.add(zh.p0.a(i52, new o0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj15, (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    }
                }
                break;
            case 25:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                Long l4 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (callback2 != null) {
                    callback2.run(l4, bool);
                    break;
                }
                break;
            case 26:
                ((v7) this.b).H0((ArrayList) obj, (v51) obj2);
                break;
            case 27:
                ((g7) this.b).R((ArrayList) obj, (v51) obj2);
                break;
            case 28:
                ((k7) this.b).R((ArrayList) obj, (v51) obj2);
                break;
            default:
                ((l7) this.b).R((ArrayList) obj, (v51) obj2);
                break;
        }
    }
}
