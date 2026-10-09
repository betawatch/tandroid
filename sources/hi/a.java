package hi;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import ci.b6;
import com.google.android.gms.common.api.internal.r;
import gg.w1;
import ii.i2;
import ii.x;
import ii.x3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.voip.o;
import org.telegram.ui.mb1;
import org.telegram.ui.na1;
import org.telegram.ui.pc;
import org.telegram.ui.web.d;
import org.telegram.ui.web.g;
import org.telegram.ui.web.i;
import org.telegram.ui.web.j;
import org.telegram.ui.web.k;
import org.telegram.ui.web.q0;
import rg.x1;
import tg.z0;
import th.e;
import th.f;
import xh.c3;
import xh.e0;
import xh.h4;
import xh.i1;
import xh.i4;
import xh.m4;
import xh.o2;
import xh.p2;
import xh.r1;
import xh.v1;
import xh.v3;
import yh.a7;
import yh.e5;
import yh.e7;
import yh.f7;
import yh.n0;
import yh.o0;
import yh.p7;
import yh.q;
import yh.r0;
import yh.s;
import yh.y;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:279:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0b4f  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10;
        i2 i2Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i11;
        int i12;
        float f7;
        int i13;
        float f10;
        float f11 = 68.0f;
        int i14 = -1;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(p61.D(0, AndroidUtilities.dp(12.0f)));
                arrayList3.add(p61.j(1, bVar.Z));
                arrayList3.add(p61.D(2, AndroidUtilities.dp(12.0f)));
                arrayList3.add(p61.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                bVar.c0 = arrayList3.size();
                String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z13 = bVar.b0;
                p61 x10 = p61.x(151, string, LocaleController.getString(z13 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                x10.K(!bVar.Y);
                arrayList3.add(x10);
                p61 x11 = p61.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z13 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                x11.K(bVar.Y);
                arrayList3.add(x11);
                arrayList3.add(p61.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 1:
                ((ArrayList) obj).add(p61.j(0, ((c) this.b).X));
                break;
            case 2:
                Utilities.themeQueue.postRunnable(new w1(11, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 3:
                x xVar = (x) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(p61.j(1, xVar.a0));
                arrayList4.add(p61.j(3, xVar.d0));
                if (xVar.i0 != null) {
                    arrayList4.add(p61.j(2, xVar.b0));
                    break;
                }
                break;
            case 4:
                x3.J1((x3[]) this.b, (ArrayList) obj, (c71) obj2);
                break;
            case 5:
                x3 x3Var = (x3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = x3Var.j3;
                ArrayList arrayList7 = new ArrayList(arrayList5.size());
                int size2 = arrayList5.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj3 = arrayList5.get(i18);
                    i18++;
                    Object obj4 = ((p61) obj3).G;
                    if (obj4 instanceof ii.a) {
                        arrayList7.add((ii.a) obj4);
                    }
                }
                if (arrayList7.size() >= 2) {
                    ArrayList arrayList8 = new ArrayList();
                    int size3 = arrayList7.size();
                    int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i20 = 0;
                    int i21 = 0;
                    while (i21 < size3) {
                        Object obj5 = arrayList7.get(i21);
                        i21++;
                        ii.a aVar = (ii.a) obj5;
                        int indexOf = arrayList6.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i22 = indexOf + 1;
                            if (x3.y3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int Q3 = x3Var.Q3(indexOf);
                                i22 = Q3 >= arrayList6.size() ? arrayList6.size() : Q3 + 1;
                            }
                            arrayList8.add(new ArrayList(arrayList6.subList(indexOf, i22)));
                            i19 = Math.min(i19, indexOf);
                            i14 = Math.max(i14, i22);
                            i20 += i22 - indexOf;
                        }
                    }
                    if (i20 == i14 - i19) {
                        ArrayList arrayList9 = new ArrayList(i20);
                        int size4 = arrayList8.size();
                        int i23 = 0;
                        while (i23 < size4) {
                            Object obj6 = arrayList8.get(i23);
                            i23++;
                            arrayList9.addAll((ArrayList) obj6);
                        }
                        for (int i24 = 0; i24 < arrayList9.size(); i24++) {
                            if (arrayList6.get(i19 + i24) != arrayList9.get(i24)) {
                                i2 i2Var2 = x3Var.H3;
                                if (i2Var2 != null) {
                                    i2Var2.d();
                                }
                                for (int i25 = 0; i25 < arrayList9.size(); i25++) {
                                    arrayList6.set(i19 + i25, (ii.a) arrayList9.get(i25));
                                }
                                ii.a aVar2 = x3Var.Q3;
                                ArrayList arrayList10 = x3.q4;
                                if (aVar2 != null) {
                                    ArrayList arrayList11 = aVar2.k;
                                    int indexOf2 = arrayList6.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList12 = indexOf2 > 0 ? ((ii.a) arrayList6.get(indexOf2 - 1)).k : arrayList10;
                                        int i26 = indexOf2 + 1;
                                        if (i26 < arrayList6.size()) {
                                            arrayList10 = ((ii.a) arrayList6.get(i26)).k;
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
                                                ii.a aVar3 = (ii.a) arrayList6.get(i10);
                                                if (!aVar3.i && !x3.y3(aVar3)) {
                                                    ii.a aVar4 = i10 > 0 ? (ii.a) arrayList6.get(i10 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (x3.F3(aVar3.b)) {
                                                        aVar3.c = max;
                                                        if (max > 0) {
                                                            aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                            aVar3.e = false;
                                                            aVar3.f = false;
                                                        }
                                                    } else {
                                                        int i27 = max + 1;
                                                        if (aVar3.c > i27) {
                                                            aVar3.c = i27;
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
                                            i2Var = x3Var.H3;
                                            if (i2Var == null) {
                                                i2Var.h();
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
                                i2Var = x3Var.H3;
                                if (i2Var == null) {
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
                    arrayList13.add(p61.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList15 = new ArrayList();
                String string2 = sharedPreferences.getString("queries_json", null);
                if (string2 != null) {
                    try {
                        arrayList = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string2);
                        int i28 = 0;
                        while (i28 < jSONArray.length()) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i28);
                            arrayList2 = arrayList14;
                            try {
                                j jVar = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                jVar.c = jSONObject.optDouble("rank", 0.0d);
                                arrayList.add(jVar);
                                i28++;
                                arrayList14 = arrayList2;
                            } catch (Exception unused) {
                            }
                        }
                        arrayList2 = arrayList14;
                        Collections.sort(arrayList, new mb1(5));
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
                                arrayList13.add(p61.k(kVar.v));
                            }
                            i12 = 0;
                            while (i12 < arrayList2.size()) {
                                ArrayList arrayList16 = arrayList2;
                                final String str = (String) arrayList16.get(i12);
                                boolean z14 = i12 == 0;
                                boolean z15 = i12 == arrayList16.size() - 1;
                                final int i29 = 0;
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i29) {
                                            case 0:
                                                org.telegram.ui.s sVar = kVar.M;
                                                if (sVar != null) {
                                                    sVar.run(str);
                                                    break;
                                                }
                                                break;
                                            default:
                                                org.telegram.ui.s sVar2 = kVar.M;
                                                if (sVar2 != null) {
                                                    sVar2.run(str);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                int i30 = d.a;
                                p61 J = p61.J(d.class);
                                J.z = 1;
                                J.l = str;
                                J.D = onClickListener;
                                J.q = z14;
                                J.r = z15;
                                J.G = Boolean.TRUE;
                                J.H = kVar;
                                arrayList13.add(J);
                                i12++;
                                arrayList2 = arrayList16;
                            }
                            if (!arrayList15.isEmpty()) {
                                arrayList13.add(p61.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new o(kVar, 4)));
                                int i31 = 0;
                                while (i31 < arrayList15.size()) {
                                    final String str2 = (String) arrayList15.get(i31);
                                    boolean z16 = i31 == 0;
                                    final int i32 = 1;
                                    boolean z17 = i31 == arrayList15.size() - 1;
                                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i32) {
                                                case 0:
                                                    org.telegram.ui.s sVar = kVar.M;
                                                    if (sVar != null) {
                                                        sVar.run(str2);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.s sVar2 = kVar.M;
                                                    if (sVar2 != null) {
                                                        sVar2.run(str2);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i33 = d.a;
                                    p61 J2 = p61.J(d.class);
                                    J2.z = 0;
                                    J2.l = str2;
                                    J2.D = onClickListener2;
                                    J2.q = z16;
                                    J2.r = z17;
                                    J2.G = Boolean.TRUE;
                                    J2.H = kVar;
                                    arrayList13.add(J2);
                                    i31++;
                                }
                            }
                            if (iVar != null) {
                                ArrayList arrayList17 = iVar.a;
                                if (!arrayList17.isEmpty()) {
                                    arrayList13.add(p61.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                                    for (int i34 = 0; i34 < arrayList17.size(); i34++) {
                                        MessageObject messageObject = (MessageObject) arrayList17.get(i34);
                                        if (!TextUtils.isEmpty(k.a(messageObject))) {
                                            int i35 = g.a;
                                            p61 J3 = p61.J(g.class);
                                            J3.z = 3;
                                            J3.q = true;
                                            J3.H = messageObject;
                                            arrayList13.add(J3);
                                        }
                                    }
                                    if (!iVar.f) {
                                        arrayList13.add(p61.o(arrayList13.size(), 32));
                                        arrayList13.add(p61.o(arrayList13.size(), 32));
                                        arrayList13.add(p61.o(arrayList13.size(), 32));
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
                b6 b6Var = (b6) this.b;
                b6Var.y0 = ((Integer) obj).intValue();
                b6Var.z0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new q0(b6Var, 15), 60L);
                break;
            case 8:
                f fVar = (f) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                ArrayList arrayList19 = fVar.a0;
                if (arrayList19 != null && !arrayList19.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.l0;
                    arrayList18.add(p61.D(0, dp2));
                    int i36 = dp - dp2;
                    int size5 = arrayList19.size();
                    int i37 = 0;
                    while (i37 < size5) {
                        Object obj8 = arrayList19.get(i37);
                        i37++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.Z.get((String) obj8)) {
                            if (TextUtils.isEmpty(fVar.c0) || z0.V(tL_help_country, AndroidUtilities.translitSafe(fVar.c0).toLowerCase())) {
                                i36 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.j0.containsKey(tL_help_country.iso2);
                                int i38 = e.a;
                                p61 J4 = p61.J(e.class);
                                J4.l = tL_help_country.iso2;
                                J4.G = tL_help_country;
                                J4.e = containsKey;
                                arrayList18.add(J4);
                            }
                        }
                    }
                    arrayList18.add(p61.D(1, Math.max(0, i36)));
                    break;
                }
                break;
            case 9:
                ArrayList arrayList20 = (ArrayList) obj;
                na1 na1Var = ((th.g) this.b).Y;
                if (na1Var != null) {
                    arrayList20.add(p61.C(AndroidUtilities.dp(12.0f)));
                    arrayList20.add(p61.h(0, 0, na1Var));
                    break;
                }
                break;
            case 10:
                ((pc) this.b).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 11:
                xh.d dVar = (xh.d) this.b;
                ArrayList arrayList21 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.X;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.Y;
                        xh.a aVar5 = new xh.a(0, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i39 = xh.b.a;
                        p61 J5 = p61.J(xh.b.class);
                        J5.G = tL_StarGiftAuctionAcquiredGift;
                        J5.H = auction;
                        J5.D = aVar5;
                        arrayList21.add(J5);
                    }
                    arrayList21.add(p61.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 12:
                ((ArrayList) obj).add(((xh.f) this.b).X);
                break;
            case 13:
                ArrayList arrayList22 = (ArrayList) obj;
                arrayList22.add(((xh.o) this.b).Y);
                arrayList22.add(p61.C(AndroidUtilities.dp(16.0f)));
                break;
            case 14:
                ((ArrayList) obj).add(p61.j(-1, ((xh.x) this.b).Z));
                break;
            case 15:
                ((ArrayList) obj).add(p61.j(-1, ((e0) this.b).Z));
                break;
            case 16:
                ((r1) this.b).V((ArrayList) obj, (c71) obj2);
                break;
            case 17:
                o2 o2Var = (o2) this.b;
                ArrayList arrayList23 = (ArrayList) obj;
                rs0 rs0Var = o2Var.a;
                e5 e5Var = o2Var.e;
                if (e5Var != null) {
                    if ((!e5Var.e || e5Var.g != 783) && e5Var.l.size() <= 0) {
                        e5 e5Var2 = o2Var.e;
                        if (e5Var2.j && !e5Var2.i) {
                        }
                    }
                    e5 e5Var3 = o2Var.e;
                    int max2 = Math.max(1, (e5Var3 == null || (i13 = e5Var3.n) == 0) ? 3 : Math.min(3, i13));
                    e5 e5Var4 = o2Var.e;
                    if (e5Var4 != null) {
                        ArrayList arrayList24 = e5Var4.l;
                        int size6 = arrayList24.size();
                        int i40 = 3;
                        int i41 = 0;
                        while (i41 < size6) {
                            Object obj9 = arrayList24.get(i41);
                            i41++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj9;
                            boolean z18 = o2Var.d;
                            int i42 = i1.a;
                            p61 J6 = p61.J(i1.class);
                            J6.u = 1;
                            J6.z = 0;
                            J6.G = savedStarGift;
                            J6.q = true;
                            J6.f = false;
                            J6.r = z18;
                            J6.h = o2Var.n && (o2Var.e != rs0Var.d || savedStarGift.pinned_to_top);
                            arrayList23.add(J6);
                            i40--;
                            if (i40 == 0) {
                                i40 = 3;
                            }
                        }
                        f7 = 12.0f;
                        e5 e5Var5 = o2Var.e;
                        if (e5Var5.i || !e5Var5.j) {
                            int i43 = 0;
                            while (true) {
                                if (i43 < (i40 <= 0 ? 3 : i40)) {
                                    i43++;
                                    p61 o9 = p61.o(i43, 34);
                                    o9.u = 1;
                                    arrayList23.add(o9);
                                }
                            }
                        }
                    } else {
                        f7 = 12.0f;
                    }
                    if (rs0Var.d == o2Var.e) {
                        arrayList23.add(p61.C(AndroidUtilities.dp(20.0f)));
                        if (rs0Var.c == UserConfig.getInstance(o2Var.b).getClientUserId()) {
                            int w02 = i6.w0(i6.z6, o2Var.c);
                            String string3 = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i44 = p2.a;
                            p61 J7 = p61.J(p2.class);
                            J7.l = string3;
                            J7.z = 17;
                            J7.B = w02;
                            J7.A = 14.0f;
                            J7.i = dp3;
                            J7.k = 0;
                            J7.q = false;
                            arrayList23.add(J7);
                        }
                        arrayList23.add(p61.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList23.isEmpty()) {
                        arrayList23.add(p61.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList23.isEmpty()) {
                        arrayList23.add(0, p61.C(AndroidUtilities.dp(o2Var.I ? 42.0f : f7)));
                    }
                    if (o2Var.f.getSpanCount() != max2) {
                        AndroidUtilities.runOnUIThread(new v1(o2Var, max2, 1));
                    }
                    rs0Var.o();
                    rs0Var.post(new x1(rs0Var, 22));
                    break;
                }
                break;
            case 18:
                i4 i4Var = (i4) this.b;
                ArrayList arrayList25 = (ArrayList) obj;
                v3 v3Var = i4Var.d;
                ArrayList arrayList26 = v3Var.d;
                int size7 = arrayList26.size();
                int i45 = 0;
                while (i45 < size7) {
                    Object obj10 = arrayList26.get(i45);
                    i45++;
                    arrayList25.add(i1.a(0, (TL_stars.TL_starGiftUnique) obj10, false, false, false, true, false));
                }
                if (v3Var.t || !v3Var.u) {
                    p61 o10 = p61.o(-1, 34);
                    o10.u = 1;
                    arrayList25.add(o10);
                    p61 o11 = p61.o(-2, 34);
                    o11.u = 1;
                    arrayList25.add(o11);
                    p61 o12 = p61.o(-3, 34);
                    o12.u = 1;
                    arrayList25.add(o12);
                    if (v3Var.d.isEmpty()) {
                        p61 o13 = p61.o(-4, 34);
                        o13.u = 1;
                        arrayList25.add(o13);
                        p61 o14 = p61.o(-5, 34);
                        o14.u = 1;
                        arrayList25.add(o14);
                        p61 o15 = p61.o(-6, 34);
                        o15.u = 1;
                        arrayList25.add(o15);
                        p61 o16 = p61.o(-7, 34);
                        o16.u = 1;
                        arrayList25.add(o16);
                        p61 o17 = p61.o(-8, 34);
                        o17.u = 1;
                        arrayList25.add(o17);
                        p61 o18 = p61.o(-9, 34);
                        o18.u = 1;
                        arrayList25.add(o18);
                        p61 o19 = p61.o(-10, 34);
                        o19.u = 1;
                        arrayList25.add(o19);
                        p61 o20 = p61.o(-11, 34);
                        o20.u = 1;
                        arrayList25.add(o20);
                        p61 o21 = p61.o(-12, 34);
                        o21.u = 1;
                        arrayList25.add(o21);
                        p61 o22 = p61.o(-13, 34);
                        o22.u = 1;
                        arrayList25.add(o22);
                        p61 o23 = p61.o(-14, 34);
                        o23.u = 1;
                        arrayList25.add(o23);
                        p61 o24 = p61.o(-15, 34);
                        o24.u = 1;
                        arrayList25.add(o24);
                    }
                }
                boolean z19 = arrayList25.isEmpty() && !v3Var.t;
                if (i4Var.x != z19) {
                    i4Var.x = z19;
                    i4Var.w.setVisibility(0);
                    i4Var.w.animate().alpha(z19 ? 1.0f : 0.0f).scaleX(z19 ? 1.0f : 0.95f).scaleY(z19 ? 1.0f : 0.95f).setInterpolator(hs.h).setDuration(320L).setListener(new c3(i4Var, z19, 1)).start();
                    break;
                }
                break;
            case 19:
                h4.U((h4) this.b, (ArrayList) obj);
                break;
            case 20:
                m4 m4Var = (m4) this.b;
                ArrayList arrayList27 = (ArrayList) obj;
                e5 e5Var6 = m4Var.Y;
                if (e5Var6 != null) {
                    ArrayList arrayList28 = e5Var6.l;
                    arrayList27.add(p61.C(AndroidUtilities.dp(16.0f)));
                    if (e5Var6.i && arrayList28.isEmpty()) {
                        p61 o25 = p61.o(1, 34);
                        o25.u = 1;
                        arrayList27.add(o25);
                        p61 o26 = p61.o(2, 34);
                        o26.u = 1;
                        arrayList27.add(o26);
                        p61 o27 = p61.o(3, 34);
                        o27.u = 1;
                        arrayList27.add(o27);
                        p61 o28 = p61.o(4, 34);
                        o28.u = 1;
                        arrayList27.add(o28);
                        p61 o29 = p61.o(5, 34);
                        o29.u = 1;
                        arrayList27.add(o29);
                        p61 o30 = p61.o(6, 34);
                        o30.u = 1;
                        arrayList27.add(o30);
                        p61 o31 = p61.o(7, 34);
                        o31.u = 1;
                        arrayList27.add(o31);
                        p61 o32 = p61.o(8, 34);
                        o32.u = 1;
                        arrayList27.add(o32);
                        p61 o33 = p61.o(9, 34);
                        o33.u = 1;
                        arrayList27.add(o33);
                        f10 = 68.0f;
                    } else {
                        int size8 = arrayList28.size();
                        int i46 = 3;
                        int i47 = 0;
                        while (i47 < size8) {
                            Object obj11 = arrayList28.get(i47);
                            i47++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj11;
                            float f12 = f11;
                            if (savedStarGift2.collection_id.contains(Integer.valueOf(m4Var.X))) {
                                f11 = f12;
                            } else {
                                int i48 = i1.a;
                                p61 J8 = p61.J(i1.class);
                                J8.u = z12 ? 1 : 0;
                                J8.z = z11 ? 1 : 0;
                                J8.G = savedStarGift2;
                                J8.q = z12;
                                J8.f = z12;
                                J8.r = z11;
                                HashSet hashSet = m4Var.Z;
                                int i49 = savedStarGift2.msg_id;
                                J8.K(hashSet.contains(Long.valueOf(i49 == 0 ? savedStarGift2.saved_id : i49)));
                                J8.u = 1;
                                arrayList27.add(J8);
                                i46--;
                                if (i46 == 0) {
                                    i46 = 3;
                                }
                                f11 = f12;
                                z11 = false;
                                z12 = true;
                            }
                        }
                        f10 = f11;
                        if (e5Var6.i || !e5Var6.j) {
                            int i50 = 0;
                            while (true) {
                                if (i50 < (i46 <= 0 ? 3 : i46)) {
                                    i50++;
                                    p61 o34 = p61.o(i50, 34);
                                    o34.u = 1;
                                    arrayList27.add(o34);
                                }
                            }
                        }
                    }
                    arrayList27.add(p61.C(AndroidUtilities.dp(f10)));
                    break;
                }
                break;
            case 21:
                yh.g.Y((yh.g) this.b, (ArrayList) obj);
                break;
            case 22:
                s sVar = (s) this.b;
                ArrayList arrayList29 = (ArrayList) obj;
                arrayList29.add(p61.k(sVar.Y));
                arrayList29.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList29.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new x1(sVar, 27)), true), R.drawable.msg_bot));
                arrayList29.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList29.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList29.add(p61.C(AndroidUtilities.dp(68.0f)));
                break;
            case 23:
                ArrayList arrayList30 = (ArrayList) obj;
                p61 p61Var = ((y) this.b).v0;
                if (p61Var != null) {
                    arrayList30.add(p61Var);
                    break;
                }
                break;
            case 24:
                r0 r0Var = (r0) this.b;
                ArrayList arrayList31 = (ArrayList) obj;
                ArrayList arrayList32 = r0Var.d0;
                boolean z20 = r0Var.w0;
                r rVar = r0Var.g0;
                ArrayList arrayList33 = r0Var.b0;
                ArrayList arrayList34 = r0Var.a0;
                r rVar2 = r0Var.f0;
                r rVar3 = r0Var.e0;
                ArrayList arrayList35 = r0Var.c0;
                if (arrayList35 != null && arrayList34 != null && arrayList33 != null) {
                    arrayList31.add(p61.C(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i51 = r0Var.j0.r;
                    if (i51 == 0) {
                        arrayList31.add(p61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z20 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList35.size()))));
                        int size9 = arrayList35.size();
                        int i52 = 0;
                        while (i52 < size9) {
                            Object obj12 = arrayList35.get(i52);
                            i52++;
                            arrayList31.add(o0.a(i51, new n0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj12)));
                        }
                        if (!arrayList32.isEmpty()) {
                            arrayList31.add(p61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z20 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList35.size()))));
                            int size10 = arrayList32.size();
                            while (i15 < size10) {
                                Object obj13 = arrayList32.get(i15);
                                i15++;
                                arrayList31.add(o0.a(i51, new n0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj13)));
                            }
                            break;
                        }
                    } else if (i51 == 1) {
                        arrayList31.add(p61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList34.size()))));
                        int size11 = arrayList34.size();
                        while (i16 < size11) {
                            Object obj14 = arrayList34.get(i16);
                            i16++;
                            arrayList31.add(o0.a(i51, new n0((TL_stars.starGiftAttributeBackdrop) obj14, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i51 == 2) {
                        arrayList31.add(p61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList33.size()))));
                        int size12 = arrayList33.size();
                        while (i17 < size12) {
                            Object obj15 = arrayList33.get(i17);
                            i17++;
                            arrayList31.add(o0.a(i51, new n0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj15, (TL_stars.starGiftAttributeModel) rVar.c())));
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
                ((p7) this.b).I0((ArrayList) obj, (c71) obj2);
                break;
            case 27:
                ((a7) this.b).S((ArrayList) obj, (c71) obj2);
                break;
            case 28:
                ((e7) this.b).S((ArrayList) obj, (c71) obj2);
                break;
            default:
                ((f7) this.b).S((ArrayList) obj, (c71) obj2);
                break;
        }
    }
}
