package ii;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import di.a6;
import fi.q3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import ji.h2;
import ji.o4;
import ji.x;
import ji.x3;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.voip.m2;
import org.telegram.ui.Components.z61;
import org.telegram.ui.es0;
import org.telegram.ui.ta1;
import org.telegram.ui.vc;
import org.telegram.ui.web.d;
import org.telegram.ui.web.g;
import org.telegram.ui.web.i;
import org.telegram.ui.web.j;
import org.telegram.ui.web.k;
import ug.z0;
import uh.e;
import uh.f;
import yh.a3;
import yh.d0;
import yh.f4;
import yh.g1;
import yh.g4;
import yh.k4;
import yh.n;
import yh.n2;
import yh.p1;
import yh.t1;
import yh.t3;
import yh.w;
import zh.a7;
import zh.e7;
import zh.f5;
import zh.f7;
import zh.n0;
import zh.o0;
import zh.p7;
import zh.r;
import zh.r0;
import zh.t;
import zh.z;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:274:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0b35  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10;
        h2 h2Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i11;
        int i12;
        int i13;
        int i14 = 4;
        int i15 = -1;
        final int i16 = 0;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(l61.D(0, AndroidUtilities.dp(12.0f)));
                arrayList3.add(l61.j(1, bVar.Z));
                arrayList3.add(l61.D(2, AndroidUtilities.dp(12.0f)));
                arrayList3.add(l61.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                bVar.c0 = arrayList3.size();
                String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z12 = bVar.b0;
                l61 x10 = l61.x(151, string, LocaleController.getString(z12 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                x10.K(!bVar.Y);
                arrayList3.add(x10);
                l61 x11 = l61.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z12 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                x11.K(bVar.Y);
                arrayList3.add(x11);
                arrayList3.add(l61.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 1:
                ((ArrayList) obj).add(l61.j(0, ((c) this.b).X));
                break;
            case 2:
                Utilities.themeQueue.postRunnable(new q3(26, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 3:
                x xVar = (x) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(l61.j(1, xVar.a0));
                arrayList4.add(l61.j(3, xVar.d0));
                if (xVar.i0 != null) {
                    arrayList4.add(l61.j(2, xVar.b0));
                    break;
                }
                break;
            case 4:
                x3.J1((x3[]) this.b, (ArrayList) obj, (z61) obj2);
                break;
            case 5:
                x3 x3Var = (x3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = x3Var.j3;
                ArrayList arrayList7 = new ArrayList(arrayList5.size());
                int size2 = arrayList5.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj3 = arrayList5.get(i17);
                    i17++;
                    Object obj4 = ((l61) obj3).G;
                    if (obj4 instanceof ji.a) {
                        arrayList7.add((ji.a) obj4);
                    }
                }
                if (arrayList7.size() >= 2) {
                    ArrayList arrayList8 = new ArrayList();
                    int size3 = arrayList7.size();
                    int i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i19 = 0;
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj5 = arrayList7.get(i20);
                        i20++;
                        ji.a aVar = (ji.a) obj5;
                        int indexOf = arrayList6.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i21 = indexOf + 1;
                            if (x3.y3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int Q3 = x3Var.Q3(indexOf);
                                i21 = Q3 >= arrayList6.size() ? arrayList6.size() : Q3 + 1;
                            }
                            arrayList8.add(new ArrayList(arrayList6.subList(indexOf, i21)));
                            i18 = Math.min(i18, indexOf);
                            i15 = Math.max(i15, i21);
                            i19 += i21 - indexOf;
                        }
                    }
                    if (i19 == i15 - i18) {
                        ArrayList arrayList9 = new ArrayList(i19);
                        int size4 = arrayList8.size();
                        int i22 = 0;
                        while (i22 < size4) {
                            Object obj6 = arrayList8.get(i22);
                            i22++;
                            arrayList9.addAll((ArrayList) obj6);
                        }
                        for (int i23 = 0; i23 < arrayList9.size(); i23++) {
                            if (arrayList6.get(i18 + i23) != arrayList9.get(i23)) {
                                h2 h2Var2 = x3Var.H3;
                                if (h2Var2 != null) {
                                    h2Var2.d();
                                }
                                for (int i24 = 0; i24 < arrayList9.size(); i24++) {
                                    arrayList6.set(i18 + i24, (ji.a) arrayList9.get(i24));
                                }
                                ji.a aVar2 = x3Var.Q3;
                                ArrayList arrayList10 = x3.q4;
                                if (aVar2 != null) {
                                    ArrayList arrayList11 = aVar2.k;
                                    int indexOf2 = arrayList6.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList12 = indexOf2 > 0 ? ((ji.a) arrayList6.get(indexOf2 - 1)).k : arrayList10;
                                        int i25 = indexOf2 + 1;
                                        if (i25 < arrayList6.size()) {
                                            arrayList10 = ((ji.a) arrayList6.get(i25)).k;
                                        }
                                        if (arrayList12.size() < arrayList10.size()) {
                                            arrayList12 = arrayList10;
                                        }
                                        if (!arrayList11.equals(arrayList12)) {
                                            arrayList11.clear();
                                            arrayList11.addAll(arrayList12);
                                            z10 = true;
                                            boolean y22 = x3Var.y2();
                                            i10 = 0;
                                            while (i10 < arrayList6.size()) {
                                                ji.a aVar3 = (ji.a) arrayList6.get(i10);
                                                if (!aVar3.i && !x3.y3(aVar3)) {
                                                    ji.a aVar4 = i10 > 0 ? (ji.a) arrayList6.get(i10 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (x3.F3(aVar3.b)) {
                                                        aVar3.c = max;
                                                        if (max > 0) {
                                                            aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                            aVar3.e = false;
                                                            aVar3.f = false;
                                                        }
                                                    } else {
                                                        int i26 = max + 1;
                                                        if (aVar3.c > i26) {
                                                            aVar3.c = i26;
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
                                            x3Var.t4();
                                            x3Var.b2();
                                            if (!z10 || y22) {
                                                x3Var.W2.N(true);
                                                x3Var.y4();
                                            } else {
                                                x3Var.y4();
                                            }
                                            h2Var = x3Var.H3;
                                            if (h2Var == null) {
                                                h2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                boolean y222 = x3Var.y2();
                                i10 = 0;
                                while (i10 < arrayList6.size()) {
                                }
                                x3Var.t4();
                                x3Var.b2();
                                if (z10) {
                                }
                                x3Var.W2.N(true);
                                x3Var.y4();
                                h2Var = x3Var.H3;
                                if (h2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 6:
                final k kVar = (k) this.b;
                ArrayList arrayList13 = (ArrayList) obj;
                i iVar = kVar.y;
                ArrayList arrayList14 = kVar.x;
                if (!kVar.b && arrayList14.isEmpty()) {
                    arrayList13.add(l61.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList15 = new ArrayList();
                String string2 = sharedPreferences.getString("queries_json", null);
                if (string2 != null) {
                    try {
                        arrayList = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string2);
                        int i27 = 0;
                        while (i27 < jSONArray.length()) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i27);
                            arrayList2 = arrayList14;
                            try {
                                j jVar = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                jVar.c = jSONObject.optDouble("rank", 0.0d);
                                arrayList.add(jVar);
                                i27++;
                                arrayList14 = arrayList2;
                            } catch (Exception unused) {
                            }
                        }
                        arrayList2 = arrayList14;
                        Collections.sort(arrayList, new es0(9));
                        size = arrayList.size();
                        i11 = 0;
                    } catch (Exception unused2) {
                    }
                    while (i11 < size) {
                        Object obj7 = arrayList.get(i11);
                        i11++;
                        j jVar2 = (j) obj7;
                        if (arrayList15.size() >= 20) {
                            arrayList2.size();
                            arrayList15.size();
                            if (!arrayList2.isEmpty()) {
                                arrayList13.add(l61.k(kVar.v));
                            }
                            i12 = 0;
                            while (i12 < arrayList2.size()) {
                                ArrayList arrayList16 = arrayList2;
                                final String str = (String) arrayList16.get(i12);
                                boolean z13 = i12 == 0;
                                boolean z14 = i12 == arrayList16.size() - 1;
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i16) {
                                            case 0:
                                                org.telegram.ui.r rVar = kVar.M;
                                                if (rVar != null) {
                                                    rVar.run(str);
                                                    break;
                                                }
                                                break;
                                            default:
                                                org.telegram.ui.r rVar2 = kVar.M;
                                                if (rVar2 != null) {
                                                    rVar2.run(str);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                int i28 = d.a;
                                l61 J = l61.J(d.class);
                                J.z = 1;
                                J.l = str;
                                J.D = onClickListener;
                                J.q = z13;
                                J.r = z14;
                                J.G = Boolean.TRUE;
                                J.H = kVar;
                                arrayList13.add(J);
                                i12++;
                                arrayList2 = arrayList16;
                            }
                            if (!arrayList15.isEmpty()) {
                                arrayList13.add(l61.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new o4(kVar, 5)));
                                int i29 = 0;
                                while (i29 < arrayList15.size()) {
                                    final String str2 = (String) arrayList15.get(i29);
                                    boolean z15 = i29 == 0;
                                    final int i30 = 1;
                                    boolean z16 = i29 == arrayList15.size() - 1;
                                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i30) {
                                                case 0:
                                                    org.telegram.ui.r rVar = kVar.M;
                                                    if (rVar != null) {
                                                        rVar.run(str2);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.r rVar2 = kVar.M;
                                                    if (rVar2 != null) {
                                                        rVar2.run(str2);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i31 = d.a;
                                    l61 J2 = l61.J(d.class);
                                    J2.z = 0;
                                    J2.l = str2;
                                    J2.D = onClickListener2;
                                    J2.q = z15;
                                    J2.r = z16;
                                    J2.G = Boolean.TRUE;
                                    J2.H = kVar;
                                    arrayList13.add(J2);
                                    i29++;
                                }
                            }
                            if (iVar != null) {
                                ArrayList arrayList17 = iVar.a;
                                if (!arrayList17.isEmpty()) {
                                    arrayList13.add(l61.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                                    while (i16 < arrayList17.size()) {
                                        MessageObject messageObject = (MessageObject) arrayList17.get(i16);
                                        if (!TextUtils.isEmpty(k.a(messageObject))) {
                                            int i32 = g.a;
                                            l61 J3 = l61.J(g.class);
                                            J3.z = 3;
                                            J3.q = true;
                                            J3.H = messageObject;
                                            arrayList13.add(J3);
                                        }
                                        i16++;
                                    }
                                    if (!iVar.f) {
                                        arrayList13.add(l61.o(arrayList13.size(), 32));
                                        arrayList13.add(l61.o(arrayList13.size(), 32));
                                        arrayList13.add(l61.o(arrayList13.size(), 32));
                                        break;
                                    }
                                }
                            }
                        } else {
                            arrayList15.add(jVar2.a);
                        }
                    }
                    arrayList2.size();
                    arrayList15.size();
                    if (!arrayList2.isEmpty()) {
                    }
                    i12 = 0;
                    while (i12 < arrayList2.size()) {
                    }
                    if (!arrayList15.isEmpty()) {
                    }
                    if (iVar != null) {
                    }
                }
                arrayList2 = arrayList14;
                arrayList2.size();
                arrayList15.size();
                if (!arrayList2.isEmpty()) {
                }
                i12 = 0;
                while (i12 < arrayList2.size()) {
                }
                if (!arrayList15.isEmpty()) {
                }
                if (iVar != null) {
                }
                break;
            case 7:
                a6 a6Var = (a6) this.b;
                a6Var.y0 = ((Integer) obj).intValue();
                a6Var.z0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new m2(a6Var, 23), 60L);
                break;
            case 8:
                f fVar = (f) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                ArrayList arrayList19 = fVar.a0;
                if (arrayList19 != null && !arrayList19.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.l0;
                    arrayList18.add(l61.D(0, dp2));
                    int i33 = dp - dp2;
                    int size5 = arrayList19.size();
                    int i34 = 0;
                    while (i34 < size5) {
                        Object obj8 = arrayList19.get(i34);
                        i34++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.Z.get((String) obj8)) {
                            if (TextUtils.isEmpty(fVar.c0) || z0.V(tL_help_country, AndroidUtilities.translitSafe(fVar.c0).toLowerCase())) {
                                i33 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.j0.containsKey(tL_help_country.iso2);
                                int i35 = e.a;
                                l61 J4 = l61.J(e.class);
                                J4.l = tL_help_country.iso2;
                                J4.G = tL_help_country;
                                J4.e = containsKey;
                                arrayList18.add(J4);
                            }
                        }
                    }
                    arrayList18.add(l61.D(1, Math.max(0, i33)));
                    break;
                }
                break;
            case 9:
                ArrayList arrayList20 = (ArrayList) obj;
                ta1 ta1Var = ((uh.g) this.b).Y;
                if (ta1Var != null) {
                    arrayList20.add(l61.C(AndroidUtilities.dp(12.0f)));
                    arrayList20.add(l61.h(0, 0, ta1Var));
                    break;
                }
                break;
            case 10:
                ((vc) this.b).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 11:
                yh.d dVar = (yh.d) this.b;
                ArrayList arrayList21 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.X;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.Y;
                        yh.a aVar5 = new yh.a(i16, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i36 = yh.b.a;
                        l61 J5 = l61.J(yh.b.class);
                        J5.G = tL_StarGiftAuctionAcquiredGift;
                        J5.H = auction;
                        J5.D = aVar5;
                        arrayList21.add(J5);
                    }
                    arrayList21.add(l61.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 12:
                ((ArrayList) obj).add(((yh.f) this.b).X);
                break;
            case 13:
                ArrayList arrayList22 = (ArrayList) obj;
                arrayList22.add(((n) this.b).Y);
                arrayList22.add(l61.C(AndroidUtilities.dp(16.0f)));
                break;
            case 14:
                ((ArrayList) obj).add(l61.j(-1, ((w) this.b).Z));
                break;
            case 15:
                ((ArrayList) obj).add(l61.j(-1, ((d0) this.b).Z));
                break;
            case 16:
                ((p1) this.b).V((ArrayList) obj, (z61) obj2);
                break;
            case 17:
                yh.m2 m2Var = (yh.m2) this.b;
                ArrayList arrayList23 = (ArrayList) obj;
                ns0 ns0Var = m2Var.a;
                f5 f5Var = m2Var.e;
                if (f5Var != null) {
                    if ((!f5Var.e || f5Var.g != 783) && f5Var.l.size() <= 0) {
                        f5 f5Var2 = m2Var.e;
                        if (f5Var2.j && !f5Var2.i) {
                        }
                    }
                    f5 f5Var3 = m2Var.e;
                    int max2 = Math.max(1, (f5Var3 == null || (i13 = f5Var3.n) == 0) ? 3 : Math.min(3, i13));
                    f5 f5Var4 = m2Var.e;
                    if (f5Var4 != null) {
                        ArrayList arrayList24 = f5Var4.l;
                        int size6 = arrayList24.size();
                        int i37 = 0;
                        while (true) {
                            int i38 = 3;
                            while (i37 < size6) {
                                Object obj9 = arrayList24.get(i37);
                                i37++;
                                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj9;
                                boolean z17 = m2Var.d;
                                int i39 = g1.a;
                                l61 J6 = l61.J(g1.class);
                                J6.u = 1;
                                J6.z = 0;
                                J6.G = savedStarGift;
                                J6.q = true;
                                J6.f = false;
                                J6.r = z17;
                                J6.h = m2Var.n && (m2Var.e != ns0Var.d || savedStarGift.pinned_to_top);
                                arrayList23.add(J6);
                                i38--;
                                if (i38 == 0) {
                                    break;
                                }
                            }
                            f5 f5Var5 = m2Var.e;
                            if (f5Var5.i || !f5Var5.j) {
                                int i40 = 0;
                                while (true) {
                                    if (i40 < (i38 <= 0 ? 3 : i38)) {
                                        i40++;
                                        l61 o10 = l61.o(i40, 34);
                                        o10.u = 1;
                                        arrayList23.add(o10);
                                    }
                                }
                            }
                        }
                    }
                    if (ns0Var.d == m2Var.e) {
                        arrayList23.add(l61.C(AndroidUtilities.dp(20.0f)));
                        if (ns0Var.c == UserConfig.getInstance(m2Var.b).getClientUserId()) {
                            int w02 = g6.w0(g6.z6, m2Var.c);
                            String string3 = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i41 = n2.a;
                            l61 J7 = l61.J(n2.class);
                            J7.l = string3;
                            J7.z = 17;
                            J7.B = w02;
                            J7.A = 14.0f;
                            J7.i = dp3;
                            J7.k = 0;
                            J7.q = false;
                            arrayList23.add(J7);
                        }
                        arrayList23.add(l61.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList23.isEmpty()) {
                        arrayList23.add(l61.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList23.isEmpty()) {
                        arrayList23.add(0, l61.C(AndroidUtilities.dp(m2Var.I ? 42.0f : 12.0f)));
                    }
                    if (m2Var.f.getSpanCount() != max2) {
                        AndroidUtilities.runOnUIThread(new t1(m2Var, max2, 1));
                    }
                    ns0Var.o();
                    ns0Var.post(new rh.j(ns0Var, 29));
                    break;
                }
                break;
            case 18:
                g4 g4Var = (g4) this.b;
                ArrayList arrayList25 = (ArrayList) obj;
                t3 t3Var = g4Var.d;
                ArrayList arrayList26 = t3Var.d;
                int size7 = arrayList26.size();
                int i42 = 0;
                while (i42 < size7) {
                    Object obj10 = arrayList26.get(i42);
                    i42++;
                    arrayList25.add(g1.a(0, (TL_stars.TL_starGiftUnique) obj10, false, false, false, true, false));
                }
                if (t3Var.t || !t3Var.u) {
                    l61 o11 = l61.o(-1, 34);
                    o11.u = 1;
                    arrayList25.add(o11);
                    l61 o12 = l61.o(-2, 34);
                    o12.u = 1;
                    arrayList25.add(o12);
                    l61 o13 = l61.o(-3, 34);
                    o13.u = 1;
                    arrayList25.add(o13);
                    if (t3Var.d.isEmpty()) {
                        l61 o14 = l61.o(-4, 34);
                        o14.u = 1;
                        arrayList25.add(o14);
                        l61 o15 = l61.o(-5, 34);
                        o15.u = 1;
                        arrayList25.add(o15);
                        l61 o16 = l61.o(-6, 34);
                        o16.u = 1;
                        arrayList25.add(o16);
                        l61 o17 = l61.o(-7, 34);
                        o17.u = 1;
                        arrayList25.add(o17);
                        l61 o18 = l61.o(-8, 34);
                        o18.u = 1;
                        arrayList25.add(o18);
                        l61 o19 = l61.o(-9, 34);
                        o19.u = 1;
                        arrayList25.add(o19);
                        l61 o20 = l61.o(-10, 34);
                        o20.u = 1;
                        arrayList25.add(o20);
                        l61 o21 = l61.o(-11, 34);
                        o21.u = 1;
                        arrayList25.add(o21);
                        l61 o22 = l61.o(-12, 34);
                        o22.u = 1;
                        arrayList25.add(o22);
                        l61 o23 = l61.o(-13, 34);
                        o23.u = 1;
                        arrayList25.add(o23);
                        l61 o24 = l61.o(-14, 34);
                        o24.u = 1;
                        arrayList25.add(o24);
                        l61 o25 = l61.o(-15, 34);
                        o25.u = 1;
                        arrayList25.add(o25);
                    }
                }
                boolean z18 = arrayList25.isEmpty() && !t3Var.t;
                if (g4Var.x != z18) {
                    g4Var.x = z18;
                    g4Var.w.setVisibility(0);
                    g4Var.w.animate().alpha(z18 ? 1.0f : 0.0f).scaleX(z18 ? 1.0f : 0.95f).scaleY(z18 ? 1.0f : 0.95f).setInterpolator(es.h).setDuration(320L).setListener(new a3(g4Var, z18, 1)).start();
                    break;
                }
                break;
            case 19:
                f4.U((f4) this.b, (ArrayList) obj);
                break;
            case 20:
                k4 k4Var = (k4) this.b;
                ArrayList arrayList27 = (ArrayList) obj;
                f5 f5Var6 = k4Var.Y;
                if (f5Var6 != null) {
                    ArrayList arrayList28 = f5Var6.l;
                    arrayList27.add(l61.C(AndroidUtilities.dp(16.0f)));
                    if (f5Var6.i && arrayList28.isEmpty()) {
                        l61 o26 = l61.o(1, 34);
                        o26.u = 1;
                        arrayList27.add(o26);
                        l61 o27 = l61.o(2, 34);
                        o27.u = 1;
                        arrayList27.add(o27);
                        l61 o28 = l61.o(3, 34);
                        o28.u = 1;
                        arrayList27.add(o28);
                        l61 o29 = l61.o(4, 34);
                        o29.u = 1;
                        arrayList27.add(o29);
                        l61 o30 = l61.o(5, 34);
                        o30.u = 1;
                        arrayList27.add(o30);
                        l61 o31 = l61.o(6, 34);
                        o31.u = 1;
                        arrayList27.add(o31);
                        l61 o32 = l61.o(7, 34);
                        o32.u = 1;
                        arrayList27.add(o32);
                        l61 o33 = l61.o(8, 34);
                        o33.u = 1;
                        arrayList27.add(o33);
                        l61 o34 = l61.o(9, 34);
                        o34.u = 1;
                        arrayList27.add(o34);
                    } else {
                        int size8 = arrayList28.size();
                        int i43 = 3;
                        int i44 = 0;
                        while (i44 < size8) {
                            Object obj11 = arrayList28.get(i44);
                            i44++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj11;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(k4Var.X))) {
                                int i45 = g1.a;
                                l61 J8 = l61.J(g1.class);
                                J8.u = z11 ? 1 : 0;
                                J8.z = 0;
                                J8.G = savedStarGift2;
                                J8.q = z11;
                                J8.f = z11;
                                J8.r = false;
                                HashSet hashSet = k4Var.Z;
                                int i46 = savedStarGift2.msg_id;
                                ArrayList arrayList29 = arrayList28;
                                J8.K(hashSet.contains(Long.valueOf(i46 == 0 ? savedStarGift2.saved_id : i46)));
                                J8.u = 1;
                                arrayList27.add(J8);
                                i43--;
                                if (i43 == 0) {
                                    i43 = 3;
                                }
                                arrayList28 = arrayList29;
                                z11 = true;
                            }
                        }
                        if (f5Var6.i || !f5Var6.j) {
                            while (true) {
                                if (i16 < (i43 <= 0 ? 3 : i43)) {
                                    i16++;
                                    l61 o35 = l61.o(i16, 34);
                                    o35.u = 1;
                                    arrayList27.add(o35);
                                }
                            }
                        }
                    }
                    arrayList27.add(l61.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 21:
                zh.g.Y((zh.g) this.b, (ArrayList) obj);
                break;
            case 22:
                t tVar = (t) this.b;
                ArrayList arrayList30 = (ArrayList) obj;
                arrayList30.add(l61.k(tVar.Y));
                arrayList30.add(r.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList30.add(r.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new zf.c(tVar, i14)), true), R.drawable.msg_bot));
                arrayList30.add(r.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList30.add(r.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList30.add(l61.C(AndroidUtilities.dp(68.0f)));
                break;
            case 23:
                ArrayList arrayList31 = (ArrayList) obj;
                l61 l61Var = ((z) this.b).v0;
                if (l61Var != null) {
                    arrayList31.add(l61Var);
                    break;
                }
                break;
            case 24:
                r0 r0Var = (r0) this.b;
                ArrayList arrayList32 = (ArrayList) obj;
                ArrayList arrayList33 = r0Var.d0;
                boolean z19 = r0Var.w0;
                com.google.android.gms.common.api.internal.r rVar = r0Var.g0;
                ArrayList arrayList34 = r0Var.b0;
                ArrayList arrayList35 = r0Var.a0;
                com.google.android.gms.common.api.internal.r rVar2 = r0Var.f0;
                com.google.android.gms.common.api.internal.r rVar3 = r0Var.e0;
                ArrayList arrayList36 = r0Var.c0;
                if (arrayList36 != null && arrayList35 != null && arrayList34 != null) {
                    arrayList32.add(l61.C(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i47 = r0Var.j0.r;
                    if (i47 == 0) {
                        arrayList32.add(l61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z19 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList36.size()))));
                        int size9 = arrayList36.size();
                        int i48 = 0;
                        while (i48 < size9) {
                            Object obj12 = arrayList36.get(i48);
                            i48++;
                            arrayList32.add(o0.a(i47, new n0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj12)));
                        }
                        if (!arrayList33.isEmpty()) {
                            arrayList32.add(l61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z19 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList36.size()))));
                            int size10 = arrayList33.size();
                            while (i16 < size10) {
                                Object obj13 = arrayList33.get(i16);
                                i16++;
                                arrayList32.add(o0.a(i47, new n0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj13)));
                            }
                            break;
                        }
                    } else if (i47 == 1) {
                        arrayList32.add(l61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList35.size()))));
                        int size11 = arrayList35.size();
                        while (i16 < size11) {
                            Object obj14 = arrayList35.get(i16);
                            i16++;
                            arrayList32.add(o0.a(i47, new n0((TL_stars.starGiftAttributeBackdrop) obj14, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i47 == 2) {
                        arrayList32.add(l61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList34.size()))));
                        int size12 = arrayList34.size();
                        while (i16 < size12) {
                            Object obj15 = arrayList34.get(i16);
                            i16++;
                            arrayList32.add(o0.a(i47, new n0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj15, (TL_stars.starGiftAttributeModel) rVar.c())));
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
                ((p7) this.b).I0((ArrayList) obj, (z61) obj2);
                break;
            case 27:
                ((a7) this.b).S((ArrayList) obj, (z61) obj2);
                break;
            case 28:
                ((e7) this.b).S((ArrayList) obj, (z61) obj2);
                break;
            default:
                ((f7) this.b).S((ArrayList) obj, (z61) obj2);
                break;
        }
    }
}
