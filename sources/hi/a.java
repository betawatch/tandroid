package hi;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import ci.b6;
import gg.x1;
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
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.voip.o;
import org.telegram.ui.Components.w61;
import org.telegram.ui.eb1;
import org.telegram.ui.fa1;
import org.telegram.ui.py0;
import org.telegram.ui.qc;
import org.telegram.ui.web.d;
import org.telegram.ui.web.g;
import org.telegram.ui.web.i;
import org.telegram.ui.web.j;
import org.telegram.ui.web.k;
import org.telegram.ui.web.u0;
import rg.s1;
import tg.z0;
import th.e;
import th.f;
import xh.c0;
import xh.c3;
import xh.h1;
import xh.h4;
import xh.i4;
import xh.m;
import xh.m4;
import xh.o2;
import xh.p2;
import xh.q1;
import xh.v;
import xh.v1;
import xh.v3;
import yh.b0;
import yh.h;
import yh.j7;
import yh.l5;
import yh.n7;
import yh.p0;
import yh.q0;
import yh.r;
import yh.s7;
import yh.t;
import yh.t0;
import yh.z7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:419:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0b8a  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10;
        i2 i2Var;
        int i11;
        float f7;
        int i12 = 4;
        int i13 = -1;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(h61.E(0, AndroidUtilities.dp(12.0f)));
                arrayList.add(h61.j(1, bVar.Z));
                arrayList.add(h61.E(2, AndroidUtilities.dp(12.0f)));
                arrayList.add(h61.t(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                bVar.c0 = arrayList.size();
                String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z13 = bVar.b0;
                h61 y3 = h61.y(151, string, LocaleController.getString(z13 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                y3.L(!bVar.Y);
                arrayList.add(y3);
                h61 y10 = h61.y(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z13 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                y10.L(bVar.Y);
                arrayList.add(y10);
                arrayList.add(h61.B(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 1:
                ((ArrayList) obj).add(h61.j(0, ((c) this.b).X));
                break;
            case 2:
                Utilities.themeQueue.postRunnable(new x1(11, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 3:
                x xVar = (x) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(h61.j(1, xVar.a0));
                arrayList2.add(h61.j(3, xVar.d0));
                if (xVar.i0 != null) {
                    arrayList2.add(h61.j(2, xVar.b0));
                    break;
                }
                break;
            case 4:
                x3.J1((x3[]) this.b, (ArrayList) obj, (w61) obj2);
                break;
            case 5:
                x3 x3Var = (x3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = x3Var.s3;
                ArrayList arrayList5 = new ArrayList(arrayList3.size());
                int size = arrayList3.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    Object obj4 = ((h61) obj3).G;
                    if (obj4 instanceof ii.a) {
                        arrayList5.add((ii.a) obj4);
                    }
                }
                if (arrayList5.size() >= 2) {
                    ArrayList arrayList6 = new ArrayList();
                    int size2 = arrayList5.size();
                    int i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i19 = 0;
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj5 = arrayList5.get(i20);
                        i20++;
                        ii.a aVar = (ii.a) obj5;
                        int indexOf = arrayList4.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i21 = indexOf + 1;
                            if (x3.y3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int Q3 = x3Var.Q3(indexOf);
                                i21 = Q3 >= arrayList4.size() ? arrayList4.size() : Q3 + 1;
                            }
                            arrayList6.add(new ArrayList(arrayList4.subList(indexOf, i21)));
                            i18 = Math.min(i18, indexOf);
                            i13 = Math.max(i13, i21);
                            i19 += i21 - indexOf;
                        }
                    }
                    if (i19 == i13 - i18) {
                        ArrayList arrayList7 = new ArrayList(i19);
                        int size3 = arrayList6.size();
                        int i22 = 0;
                        while (i22 < size3) {
                            Object obj6 = arrayList6.get(i22);
                            i22++;
                            arrayList7.addAll((ArrayList) obj6);
                        }
                        for (int i23 = 0; i23 < arrayList7.size(); i23++) {
                            if (arrayList4.get(i18 + i23) != arrayList7.get(i23)) {
                                i2 i2Var2 = x3Var.Q3;
                                if (i2Var2 != null) {
                                    i2Var2.d();
                                }
                                for (int i24 = 0; i24 < arrayList7.size(); i24++) {
                                    arrayList4.set(i18 + i24, (ii.a) arrayList7.get(i24));
                                }
                                ii.a aVar2 = x3Var.Z3;
                                ArrayList arrayList8 = x3.z4;
                                if (aVar2 != null) {
                                    ArrayList arrayList9 = aVar2.k;
                                    int indexOf2 = arrayList4.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList10 = indexOf2 > 0 ? ((ii.a) arrayList4.get(indexOf2 - 1)).k : arrayList8;
                                        int i25 = indexOf2 + 1;
                                        if (i25 < arrayList4.size()) {
                                            arrayList8 = ((ii.a) arrayList4.get(i25)).k;
                                        }
                                        if (arrayList10.size() < arrayList8.size()) {
                                            arrayList10 = arrayList8;
                                        }
                                        if (!arrayList9.equals(arrayList10)) {
                                            arrayList9.clear();
                                            arrayList9.addAll(arrayList10);
                                            z10 = true;
                                            boolean y22 = x3Var.y2();
                                            i10 = 0;
                                            while (i10 < arrayList4.size()) {
                                                ii.a aVar3 = (ii.a) arrayList4.get(i10);
                                                if (!aVar3.i && !x3.y3(aVar3)) {
                                                    ii.a aVar4 = i10 > 0 ? (ii.a) arrayList4.get(i10 - 1) : null;
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
                                                x3Var.f3.N(true);
                                                x3Var.y4();
                                            } else {
                                                x3Var.y4();
                                            }
                                            i2Var = x3Var.Q3;
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
                                while (i10 < arrayList4.size()) {
                                }
                                x3Var.t4();
                                x3Var.b2();
                                if (z10) {
                                }
                                x3Var.f3.N(true);
                                x3Var.y4();
                                i2Var = x3Var.Q3;
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
                ArrayList arrayList11 = (ArrayList) obj;
                i iVar = kVar.y;
                ArrayList arrayList12 = kVar.x;
                if (!kVar.b && arrayList12.isEmpty()) {
                    arrayList11.add(h61.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList13 = new ArrayList();
                String string2 = sharedPreferences.getString("queries_json", null);
                if (string2 != null) {
                    try {
                        ArrayList arrayList14 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string2);
                        for (int i27 = 0; i27 < jSONArray.length(); i27++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i27);
                            j jVar = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            jVar.c = jSONObject.optDouble("rank", 0.0d);
                            arrayList14.add(jVar);
                        }
                        Collections.sort(arrayList14, new eb1(3));
                        int size4 = arrayList14.size();
                        int i28 = 0;
                        while (i28 < size4) {
                            Object obj7 = arrayList14.get(i28);
                            i28++;
                            j jVar2 = (j) obj7;
                            if (arrayList13.size() < 20) {
                                arrayList13.add(jVar2.a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList12.size();
                arrayList13.size();
                if (!arrayList12.isEmpty()) {
                    arrayList11.add(h61.k(kVar.v));
                }
                int i29 = 0;
                while (i29 < arrayList12.size()) {
                    final String str = (String) arrayList12.get(i29);
                    boolean z14 = i29 == 0;
                    boolean z15 = i29 == arrayList12.size() - 1;
                    final int i30 = 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
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
                    int i31 = d.a;
                    h61 K = h61.K(d.class);
                    K.z = 1;
                    K.l = str;
                    K.D = onClickListener;
                    K.q = z14;
                    K.r = z15;
                    K.G = Boolean.TRUE;
                    K.H = kVar;
                    arrayList11.add(K);
                    i29++;
                }
                if (!arrayList13.isEmpty()) {
                    arrayList11.add(h61.s(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new o(kVar, i12)));
                    int i32 = 0;
                    while (i32 < arrayList13.size()) {
                        final String str2 = (String) arrayList13.get(i32);
                        boolean z16 = i32 == 0;
                        final int i33 = 1;
                        boolean z17 = i32 == arrayList13.size() - 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i33) {
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
                        int i34 = d.a;
                        h61 K2 = h61.K(d.class);
                        K2.z = 0;
                        K2.l = str2;
                        K2.D = onClickListener2;
                        K2.q = z16;
                        K2.r = z17;
                        K2.G = Boolean.TRUE;
                        K2.H = kVar;
                        arrayList11.add(K2);
                        i32++;
                    }
                }
                if (iVar != null) {
                    ArrayList arrayList15 = iVar.a;
                    if (!arrayList15.isEmpty()) {
                        arrayList11.add(h61.r(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i35 = 0; i35 < arrayList15.size(); i35++) {
                            MessageObject messageObject = (MessageObject) arrayList15.get(i35);
                            if (!TextUtils.isEmpty(k.a(messageObject))) {
                                int i36 = g.a;
                                h61 K3 = h61.K(g.class);
                                K3.z = 3;
                                K3.q = true;
                                K3.H = messageObject;
                                arrayList11.add(K3);
                            }
                        }
                        if (!iVar.f) {
                            arrayList11.add(h61.q(arrayList11.size(), 32));
                            arrayList11.add(h61.q(arrayList11.size(), 32));
                            arrayList11.add(h61.q(arrayList11.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 7:
                b6 b6Var = (b6) this.b;
                b6Var.y0 = ((Integer) obj).intValue();
                b6Var.z0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new u0(b6Var, 14), 60L);
                break;
            case 8:
                f fVar = (f) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                ArrayList arrayList17 = fVar.a0;
                if (arrayList17 != null && !arrayList17.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.l0;
                    arrayList16.add(h61.E(0, dp2));
                    int i37 = dp - dp2;
                    int size5 = arrayList17.size();
                    int i38 = 0;
                    while (i38 < size5) {
                        Object obj8 = arrayList17.get(i38);
                        i38++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.Z.get((String) obj8)) {
                            if (TextUtils.isEmpty(fVar.c0) || z0.S(tL_help_country, AndroidUtilities.translitSafe(fVar.c0).toLowerCase())) {
                                i37 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.j0.containsKey(tL_help_country.iso2);
                                int i39 = e.a;
                                h61 K4 = h61.K(e.class);
                                K4.l = tL_help_country.iso2;
                                K4.G = tL_help_country;
                                K4.e = containsKey;
                                arrayList16.add(K4);
                            }
                        }
                    }
                    arrayList16.add(h61.E(1, Math.max(0, i37)));
                    break;
                }
                break;
            case 9:
                ArrayList arrayList18 = (ArrayList) obj;
                fa1 fa1Var = ((th.g) this.b).Y;
                if (fa1Var != null) {
                    arrayList18.add(h61.D(AndroidUtilities.dp(12.0f)));
                    arrayList18.add(h61.h(0, 0, fa1Var));
                    break;
                }
                break;
            case 10:
                ((qc) this.b).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 11:
                xh.c cVar = (xh.c) this.b;
                ArrayList arrayList19 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = cVar.X;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = cVar.Y;
                        py0 py0Var = new py0(24, cVar, tL_StarGiftAuctionAcquiredGift);
                        int i40 = xh.a.a;
                        h61 K5 = h61.K(xh.a.class);
                        K5.G = tL_StarGiftAuctionAcquiredGift;
                        K5.H = auction;
                        K5.D = py0Var;
                        arrayList19.add(K5);
                    }
                    arrayList19.add(h61.D(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 12:
                ((ArrayList) obj).add(((xh.e) this.b).X);
                break;
            case 13:
                ArrayList arrayList20 = (ArrayList) obj;
                arrayList20.add(((m) this.b).Y);
                arrayList20.add(h61.D(AndroidUtilities.dp(16.0f)));
                break;
            case 14:
                ((ArrayList) obj).add(h61.j(-1, ((v) this.b).Z));
                break;
            case 15:
                ((ArrayList) obj).add(h61.j(-1, ((c0) this.b).Z));
                break;
            case 16:
                ((q1) this.b).S((ArrayList) obj, (w61) obj2);
                break;
            case 17:
                o2 o2Var = (o2) this.b;
                ArrayList arrayList21 = (ArrayList) obj;
                gs0 gs0Var = o2Var.a;
                l5 l5Var = o2Var.e;
                if (l5Var != null) {
                    if ((!l5Var.e || l5Var.g != 783) && l5Var.l.size() <= 0) {
                        l5 l5Var2 = o2Var.e;
                        if (l5Var2.j && !l5Var2.i) {
                        }
                    }
                    l5 l5Var3 = o2Var.e;
                    int max2 = Math.max(1, (l5Var3 == null || (i11 = l5Var3.n) == 0) ? 3 : Math.min(3, i11));
                    l5 l5Var4 = o2Var.e;
                    if (l5Var4 != null) {
                        ArrayList arrayList22 = l5Var4.l;
                        int size6 = arrayList22.size();
                        int i41 = 3;
                        int i42 = 0;
                        while (i42 < size6) {
                            Object obj9 = arrayList22.get(i42);
                            i42++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj9;
                            boolean z18 = o2Var.d;
                            int i43 = h1.a;
                            h61 K6 = h61.K(h1.class);
                            K6.u = 1;
                            K6.z = 0;
                            K6.G = savedStarGift;
                            K6.q = true;
                            K6.f = false;
                            K6.r = z18;
                            K6.h = o2Var.n && (o2Var.e != gs0Var.d || savedStarGift.pinned_to_top);
                            arrayList21.add(K6);
                            i41--;
                            if (i41 == 0) {
                                i41 = 3;
                            }
                        }
                        l5 l5Var5 = o2Var.e;
                        if (l5Var5.i || !l5Var5.j) {
                            int i44 = 0;
                            while (true) {
                                if (i44 < (i41 <= 0 ? 3 : i41)) {
                                    i44++;
                                    h61 q6 = h61.q(i44, 34);
                                    q6.u = 1;
                                    arrayList21.add(q6);
                                }
                            }
                        }
                    }
                    if (gs0Var.d == o2Var.e) {
                        arrayList21.add(h61.D(AndroidUtilities.dp(20.0f)));
                        if (gs0Var.c == UserConfig.getInstance(o2Var.b).getClientUserId()) {
                            int v02 = i6.v0(i6.z6, o2Var.c);
                            String string3 = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i45 = p2.a;
                            h61 K7 = h61.K(p2.class);
                            K7.l = string3;
                            K7.z = 17;
                            K7.B = v02;
                            K7.A = 14.0f;
                            K7.i = dp3;
                            K7.k = 0;
                            K7.q = false;
                            arrayList21.add(K7);
                        }
                        arrayList21.add(h61.D(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList21.isEmpty()) {
                        arrayList21.add(h61.D(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList21.isEmpty()) {
                        arrayList21.add(0, h61.D(AndroidUtilities.dp(o2Var.I ? 42.0f : 12.0f)));
                    }
                    if (o2Var.f.getSpanCount() != max2) {
                        AndroidUtilities.runOnUIThread(new v1(o2Var, max2, 1));
                    }
                    gs0Var.o();
                    gs0Var.post(new s1(gs0Var, 18));
                    break;
                }
                break;
            case 18:
                i4 i4Var = (i4) this.b;
                ArrayList arrayList23 = (ArrayList) obj;
                v3 v3Var = i4Var.d;
                ArrayList arrayList24 = v3Var.d;
                int size7 = arrayList24.size();
                int i46 = 0;
                while (i46 < size7) {
                    Object obj10 = arrayList24.get(i46);
                    i46++;
                    arrayList23.add(h1.a(0, (TL_stars.TL_starGiftUnique) obj10, false, false, false, true, false));
                }
                if (v3Var.t || !v3Var.u) {
                    h61 q10 = h61.q(-1, 34);
                    q10.u = 1;
                    arrayList23.add(q10);
                    h61 q11 = h61.q(-2, 34);
                    q11.u = 1;
                    arrayList23.add(q11);
                    h61 q12 = h61.q(-3, 34);
                    q12.u = 1;
                    arrayList23.add(q12);
                    if (v3Var.d.isEmpty()) {
                        h61 q13 = h61.q(-4, 34);
                        q13.u = 1;
                        arrayList23.add(q13);
                        h61 q14 = h61.q(-5, 34);
                        q14.u = 1;
                        arrayList23.add(q14);
                        h61 q15 = h61.q(-6, 34);
                        q15.u = 1;
                        arrayList23.add(q15);
                        h61 q16 = h61.q(-7, 34);
                        q16.u = 1;
                        arrayList23.add(q16);
                        h61 q17 = h61.q(-8, 34);
                        q17.u = 1;
                        arrayList23.add(q17);
                        h61 q18 = h61.q(-9, 34);
                        q18.u = 1;
                        arrayList23.add(q18);
                        h61 q19 = h61.q(-10, 34);
                        q19.u = 1;
                        arrayList23.add(q19);
                        h61 q20 = h61.q(-11, 34);
                        q20.u = 1;
                        arrayList23.add(q20);
                        h61 q21 = h61.q(-12, 34);
                        q21.u = 1;
                        arrayList23.add(q21);
                        h61 q22 = h61.q(-13, 34);
                        q22.u = 1;
                        arrayList23.add(q22);
                        h61 q23 = h61.q(-14, 34);
                        q23.u = 1;
                        arrayList23.add(q23);
                        h61 q24 = h61.q(-15, 34);
                        q24.u = 1;
                        arrayList23.add(q24);
                    }
                }
                boolean z19 = arrayList23.isEmpty() && !v3Var.t;
                if (i4Var.x != z19) {
                    i4Var.x = z19;
                    i4Var.w.setVisibility(0);
                    i4Var.w.animate().alpha(z19 ? 1.0f : 0.0f).scaleX(z19 ? 1.0f : 0.95f).scaleY(z19 ? 1.0f : 0.95f).setInterpolator(tr.h).setDuration(320L).setListener(new c3(i4Var, z19, 1)).start();
                    break;
                }
                break;
            case 19:
                h4.R((h4) this.b, (ArrayList) obj);
                break;
            case 20:
                m4 m4Var = (m4) this.b;
                ArrayList arrayList25 = (ArrayList) obj;
                l5 l5Var6 = m4Var.Y;
                if (l5Var6 != null) {
                    ArrayList arrayList26 = l5Var6.l;
                    arrayList25.add(h61.D(AndroidUtilities.dp(16.0f)));
                    if (l5Var6.i && arrayList26.isEmpty()) {
                        h61 q25 = h61.q(1, 34);
                        q25.u = 1;
                        arrayList25.add(q25);
                        h61 q26 = h61.q(2, 34);
                        q26.u = 1;
                        arrayList25.add(q26);
                        h61 q27 = h61.q(3, 34);
                        q27.u = 1;
                        arrayList25.add(q27);
                        h61 q28 = h61.q(4, 34);
                        q28.u = 1;
                        arrayList25.add(q28);
                        h61 q29 = h61.q(5, 34);
                        q29.u = 1;
                        arrayList25.add(q29);
                        h61 q30 = h61.q(6, 34);
                        q30.u = 1;
                        arrayList25.add(q30);
                        h61 q31 = h61.q(7, 34);
                        q31.u = 1;
                        arrayList25.add(q31);
                        h61 q32 = h61.q(8, 34);
                        q32.u = 1;
                        arrayList25.add(q32);
                        h61 q33 = h61.q(9, 34);
                        q33.u = 1;
                        arrayList25.add(q33);
                        f7 = 68.0f;
                    } else {
                        int size8 = arrayList26.size();
                        int i47 = 3;
                        int i48 = 0;
                        while (i48 < size8) {
                            Object obj11 = arrayList26.get(i48);
                            i48++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj11;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(m4Var.X))) {
                                int i49 = h1.a;
                                h61 K8 = h61.K(h1.class);
                                K8.u = z12 ? 1 : 0;
                                K8.z = z11 ? 1 : 0;
                                K8.G = savedStarGift2;
                                K8.q = z12;
                                K8.f = z12;
                                K8.r = z11;
                                HashSet hashSet = m4Var.Z;
                                int i50 = savedStarGift2.msg_id;
                                K8.L(hashSet.contains(Long.valueOf(i50 == 0 ? savedStarGift2.saved_id : i50)));
                                K8.u = 1;
                                arrayList25.add(K8);
                                i47--;
                                if (i47 == 0) {
                                    i47 = 3;
                                }
                                z11 = false;
                                z12 = true;
                            }
                        }
                        f7 = 68.0f;
                        if (l5Var6.i || !l5Var6.j) {
                            int i51 = 0;
                            while (true) {
                                if (i51 < (i47 <= 0 ? 3 : i47)) {
                                    i51++;
                                    h61 q34 = h61.q(i51, 34);
                                    q34.u = 1;
                                    arrayList25.add(q34);
                                }
                            }
                        }
                    }
                    arrayList25.add(h61.D(AndroidUtilities.dp(f7)));
                    break;
                }
                break;
            case 21:
                h.Y((h) this.b, (ArrayList) obj);
                break;
            case 22:
                yh.g gVar = (yh.g) this.b;
                ArrayList arrayList27 = (ArrayList) obj;
                ArrayList arrayList28 = gVar.b;
                int size9 = arrayList28.size();
                int i52 = 0;
                while (i52 < size9) {
                    Object obj12 = arrayList28.get(i52);
                    i52++;
                    int i53 = s7.a;
                    h61 K9 = h61.K(s7.class);
                    K9.G = (TL_stars.StarsTransaction) obj12;
                    K9.q = true;
                    arrayList27.add(K9);
                }
                if (gVar.h) {
                    arrayList27.add(h61.e(-1, LocaleController.getString(R.string.Retry)));
                    break;
                } else if (!gVar.f) {
                    for (int i54 = 0; i54 < 3; i54++) {
                        arrayList27.add(h61.q(i54, 7));
                    }
                    break;
                }
                break;
            case 23:
                t tVar = (t) this.b;
                ArrayList arrayList29 = (ArrayList) obj;
                arrayList29.add(h61.k(tVar.Y));
                arrayList29.add(r.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList29.add(r.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new s1(tVar, 23)), true), R.drawable.msg_bot));
                arrayList29.add(r.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList29.add(r.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList29.add(h61.D(AndroidUtilities.dp(68.0f)));
                break;
            case 24:
                ArrayList arrayList30 = (ArrayList) obj;
                h61 h61Var = ((b0) this.b).v0;
                if (h61Var != null) {
                    arrayList30.add(h61Var);
                    break;
                }
                break;
            case 25:
                t0 t0Var = (t0) this.b;
                ArrayList arrayList31 = (ArrayList) obj;
                ArrayList arrayList32 = t0Var.d0;
                boolean z20 = t0Var.u0;
                com.google.android.gms.common.api.internal.r rVar = t0Var.g0;
                ArrayList arrayList33 = t0Var.b0;
                ArrayList arrayList34 = t0Var.a0;
                com.google.android.gms.common.api.internal.r rVar2 = t0Var.f0;
                com.google.android.gms.common.api.internal.r rVar3 = t0Var.e0;
                ArrayList arrayList35 = t0Var.c0;
                if (arrayList35 != null && arrayList34 != null && arrayList33 != null) {
                    arrayList31.add(h61.D(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i55 = t0Var.j0.r;
                    if (i55 == 0) {
                        arrayList31.add(h61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z20 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList35.size()))));
                        int size10 = arrayList35.size();
                        int i56 = 0;
                        while (i56 < size10) {
                            Object obj13 = arrayList35.get(i56);
                            i56++;
                            arrayList31.add(q0.a(i55, new p0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj13)));
                        }
                        if (!arrayList32.isEmpty()) {
                            arrayList31.add(h61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z20 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList35.size()))));
                            int size11 = arrayList32.size();
                            while (i14 < size11) {
                                Object obj14 = arrayList32.get(i14);
                                i14++;
                                arrayList31.add(q0.a(i55, new p0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj14)));
                            }
                            break;
                        }
                    } else if (i55 == 1) {
                        arrayList31.add(h61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList34.size()))));
                        int size12 = arrayList34.size();
                        while (i15 < size12) {
                            Object obj15 = arrayList34.get(i15);
                            i15++;
                            arrayList31.add(q0.a(i55, new p0((TL_stars.starGiftAttributeBackdrop) obj15, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i55 == 2) {
                        arrayList31.add(h61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList33.size()))));
                        int size13 = arrayList33.size();
                        while (i16 < size13) {
                            Object obj16 = arrayList33.get(i16);
                            i16++;
                            arrayList31.add(q0.a(i55, new p0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj16, (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    }
                }
                break;
            case 26:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                Long l4 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (callback2 != null) {
                    callback2.run(l4, bool);
                    break;
                }
                break;
            case 27:
                ((z7) this.b).N0((ArrayList) obj, (w61) obj2);
                break;
            case 28:
                ((j7) this.b).P((ArrayList) obj, (w61) obj2);
                break;
            default:
                ((n7) this.b).P((ArrayList) obj, (w61) obj2);
                break;
        }
    }
}
