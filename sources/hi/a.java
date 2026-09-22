package hi;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import ci.c6;
import com.google.android.gms.common.api.internal.r;
import gg.x1;
import ii.h2;
import ii.w3;
import ii.x;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.voip.o;
import org.telegram.ui.Components.y51;
import org.telegram.ui.mb1;
import org.telegram.ui.na1;
import org.telegram.ui.of;
import org.telegram.ui.vy0;
import org.telegram.ui.web.d;
import org.telegram.ui.web.g;
import org.telegram.ui.web.i;
import org.telegram.ui.web.j;
import org.telegram.ui.web.k;
import org.telegram.ui.web.r0;
import rg.q1;
import tg.z0;
import th.e;
import th.f;
import xh.c0;
import xh.c3;
import xh.h4;
import xh.i1;
import xh.i4;
import xh.m;
import xh.m4;
import xh.o2;
import xh.p2;
import xh.r1;
import xh.v;
import xh.v1;
import xh.v3;
import yh.a0;
import yh.h7;
import yh.l5;
import yh.l7;
import yh.m7;
import yh.o0;
import yh.p0;
import yh.q;
import yh.s;
import yh.s0;
import yh.w7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:406:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0b4a  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10;
        h2 h2Var;
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
                arrayList.add(y51.D(0, AndroidUtilities.dp(12.0f)));
                arrayList.add(y51.j(1, bVar.Z));
                arrayList.add(y51.D(2, AndroidUtilities.dp(12.0f)));
                arrayList.add(y51.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                bVar.c0 = arrayList.size();
                String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z13 = bVar.b0;
                y51 x10 = y51.x(151, string, LocaleController.getString(z13 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                x10.K(!bVar.Y);
                arrayList.add(x10);
                y51 x11 = y51.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z13 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                x11.K(bVar.Y);
                arrayList.add(x11);
                arrayList.add(y51.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 1:
                ((ArrayList) obj).add(y51.j(0, ((c) this.b).X));
                break;
            case 2:
                Utilities.themeQueue.postRunnable(new x1(11, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 3:
                x xVar = (x) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(y51.j(1, xVar.a0));
                arrayList2.add(y51.j(3, xVar.d0));
                if (xVar.i0 != null) {
                    arrayList2.add(y51.j(2, xVar.b0));
                    break;
                }
                break;
            case 4:
                w3.J1((w3[]) this.b, (ArrayList) obj, (m61) obj2);
                break;
            case 5:
                w3 w3Var = (w3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = w3Var.l3;
                ArrayList arrayList5 = new ArrayList(arrayList3.size());
                int size = arrayList3.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    Object obj4 = ((y51) obj3).G;
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
                            if (w3.y3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int Q3 = w3Var.Q3(indexOf);
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
                                h2 h2Var2 = w3Var.J3;
                                if (h2Var2 != null) {
                                    h2Var2.d();
                                }
                                for (int i24 = 0; i24 < arrayList7.size(); i24++) {
                                    arrayList4.set(i18 + i24, (ii.a) arrayList7.get(i24));
                                }
                                ii.a aVar2 = w3Var.S3;
                                ArrayList arrayList8 = w3.s4;
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
                                            boolean y22 = w3Var.y2();
                                            i10 = 0;
                                            while (i10 < arrayList4.size()) {
                                                ii.a aVar3 = (ii.a) arrayList4.get(i10);
                                                if (!aVar3.i && !w3.y3(aVar3)) {
                                                    ii.a aVar4 = i10 > 0 ? (ii.a) arrayList4.get(i10 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (w3.F3(aVar3.b)) {
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
                                            w3Var.t4();
                                            w3Var.b2();
                                            if (!z10 || y22) {
                                                w3Var.Y2.N(true);
                                                w3Var.y4();
                                            } else {
                                                w3Var.y4();
                                            }
                                            h2Var = w3Var.J3;
                                            if (h2Var == null) {
                                                h2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                boolean y222 = w3Var.y2();
                                i10 = 0;
                                while (i10 < arrayList4.size()) {
                                }
                                w3Var.t4();
                                w3Var.b2();
                                if (z10) {
                                }
                                w3Var.Y2.N(true);
                                w3Var.y4();
                                h2Var = w3Var.J3;
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
                ArrayList arrayList11 = (ArrayList) obj;
                i iVar = kVar.y;
                ArrayList arrayList12 = kVar.x;
                if (!kVar.b && arrayList12.isEmpty()) {
                    arrayList11.add(y51.k(kVar.d));
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
                        Collections.sort(arrayList14, new mb1(3));
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
                    arrayList11.add(y51.k(kVar.v));
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
                    int i31 = d.a;
                    y51 J = y51.J(d.class);
                    J.z = 1;
                    J.l = str;
                    J.D = onClickListener;
                    J.q = z14;
                    J.r = z15;
                    J.G = Boolean.TRUE;
                    J.H = kVar;
                    arrayList11.add(J);
                    i29++;
                }
                if (!arrayList13.isEmpty()) {
                    arrayList11.add(y51.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new o(kVar, i12)));
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
                        int i34 = d.a;
                        y51 J2 = y51.J(d.class);
                        J2.z = 0;
                        J2.l = str2;
                        J2.D = onClickListener2;
                        J2.q = z16;
                        J2.r = z17;
                        J2.G = Boolean.TRUE;
                        J2.H = kVar;
                        arrayList11.add(J2);
                        i32++;
                    }
                }
                if (iVar != null) {
                    ArrayList arrayList15 = iVar.a;
                    if (!arrayList15.isEmpty()) {
                        arrayList11.add(y51.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i35 = 0; i35 < arrayList15.size(); i35++) {
                            MessageObject messageObject = (MessageObject) arrayList15.get(i35);
                            if (!TextUtils.isEmpty(k.a(messageObject))) {
                                int i36 = g.a;
                                y51 J3 = y51.J(g.class);
                                J3.z = 3;
                                J3.q = true;
                                J3.H = messageObject;
                                arrayList11.add(J3);
                            }
                        }
                        if (!iVar.f) {
                            arrayList11.add(y51.o(arrayList11.size(), 32));
                            arrayList11.add(y51.o(arrayList11.size(), 32));
                            arrayList11.add(y51.o(arrayList11.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 7:
                c6 c6Var = (c6) this.b;
                c6Var.y0 = ((Integer) obj).intValue();
                c6Var.z0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new r0(c6Var, 15), 60L);
                break;
            case 8:
                f fVar = (f) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                ArrayList arrayList17 = fVar.a0;
                if (arrayList17 != null && !arrayList17.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.l0;
                    arrayList16.add(y51.D(0, dp2));
                    int i37 = dp - dp2;
                    int size5 = arrayList17.size();
                    int i38 = 0;
                    while (i38 < size5) {
                        Object obj8 = arrayList17.get(i38);
                        i38++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.Z.get((String) obj8)) {
                            if (TextUtils.isEmpty(fVar.c0) || z0.U(tL_help_country, AndroidUtilities.translitSafe(fVar.c0).toLowerCase())) {
                                i37 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.j0.containsKey(tL_help_country.iso2);
                                int i39 = e.a;
                                y51 J4 = y51.J(e.class);
                                J4.l = tL_help_country.iso2;
                                J4.G = tL_help_country;
                                J4.e = containsKey;
                                arrayList16.add(J4);
                            }
                        }
                    }
                    arrayList16.add(y51.D(1, Math.max(0, i37)));
                    break;
                }
                break;
            case 9:
                ArrayList arrayList18 = (ArrayList) obj;
                na1 na1Var = ((th.g) this.b).Y;
                if (na1Var != null) {
                    arrayList18.add(y51.C(AndroidUtilities.dp(12.0f)));
                    arrayList18.add(y51.h(0, 0, na1Var));
                    break;
                }
                break;
            case 10:
                ((of) this.b).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 11:
                xh.c cVar = (xh.c) this.b;
                ArrayList arrayList19 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = cVar.X;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = cVar.Y;
                        vy0 vy0Var = new vy0(24, cVar, tL_StarGiftAuctionAcquiredGift);
                        int i40 = xh.a.a;
                        y51 J5 = y51.J(xh.a.class);
                        J5.G = tL_StarGiftAuctionAcquiredGift;
                        J5.H = auction;
                        J5.D = vy0Var;
                        arrayList19.add(J5);
                    }
                    arrayList19.add(y51.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 12:
                ((ArrayList) obj).add(((xh.e) this.b).X);
                break;
            case 13:
                ArrayList arrayList20 = (ArrayList) obj;
                arrayList20.add(((m) this.b).Y);
                arrayList20.add(y51.C(AndroidUtilities.dp(16.0f)));
                break;
            case 14:
                ((ArrayList) obj).add(y51.j(-1, ((v) this.b).Z));
                break;
            case 15:
                ((ArrayList) obj).add(y51.j(-1, ((c0) this.b).Z));
                break;
            case 16:
                ((r1) this.b).U((ArrayList) obj, (m61) obj2);
                break;
            case 17:
                o2 o2Var = (o2) this.b;
                ArrayList arrayList21 = (ArrayList) obj;
                bs0 bs0Var = o2Var.a;
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
                            int i43 = i1.a;
                            y51 J6 = y51.J(i1.class);
                            J6.u = 1;
                            J6.z = 0;
                            J6.G = savedStarGift;
                            J6.q = true;
                            J6.f = false;
                            J6.r = z18;
                            J6.h = o2Var.n && (o2Var.e != bs0Var.d || savedStarGift.pinned_to_top);
                            arrayList21.add(J6);
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
                                    y51 o9 = y51.o(i44, 34);
                                    o9.u = 1;
                                    arrayList21.add(o9);
                                }
                            }
                        }
                    }
                    if (bs0Var.d == o2Var.e) {
                        arrayList21.add(y51.C(AndroidUtilities.dp(20.0f)));
                        if (bs0Var.c == UserConfig.getInstance(o2Var.b).getClientUserId()) {
                            int v02 = j6.v0(j6.z6, o2Var.c);
                            String string3 = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i45 = p2.a;
                            y51 J7 = y51.J(p2.class);
                            J7.l = string3;
                            J7.z = 17;
                            J7.B = v02;
                            J7.A = 14.0f;
                            J7.i = dp3;
                            J7.k = 0;
                            J7.q = false;
                            arrayList21.add(J7);
                        }
                        arrayList21.add(y51.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList21.isEmpty()) {
                        arrayList21.add(y51.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList21.isEmpty()) {
                        arrayList21.add(0, y51.C(AndroidUtilities.dp(o2Var.I ? 42.0f : 12.0f)));
                    }
                    if (o2Var.f.getSpanCount() != max2) {
                        AndroidUtilities.runOnUIThread(new v1(o2Var, max2, 1));
                    }
                    bs0Var.o();
                    bs0Var.post(new q1(bs0Var, 18));
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
                    arrayList23.add(i1.a(0, (TL_stars.TL_starGiftUnique) obj10, false, false, false, true, false));
                }
                if (v3Var.t || !v3Var.u) {
                    y51 o10 = y51.o(-1, 34);
                    o10.u = 1;
                    arrayList23.add(o10);
                    y51 o11 = y51.o(-2, 34);
                    o11.u = 1;
                    arrayList23.add(o11);
                    y51 o12 = y51.o(-3, 34);
                    o12.u = 1;
                    arrayList23.add(o12);
                    if (v3Var.d.isEmpty()) {
                        y51 o13 = y51.o(-4, 34);
                        o13.u = 1;
                        arrayList23.add(o13);
                        y51 o14 = y51.o(-5, 34);
                        o14.u = 1;
                        arrayList23.add(o14);
                        y51 o15 = y51.o(-6, 34);
                        o15.u = 1;
                        arrayList23.add(o15);
                        y51 o16 = y51.o(-7, 34);
                        o16.u = 1;
                        arrayList23.add(o16);
                        y51 o17 = y51.o(-8, 34);
                        o17.u = 1;
                        arrayList23.add(o17);
                        y51 o18 = y51.o(-9, 34);
                        o18.u = 1;
                        arrayList23.add(o18);
                        y51 o19 = y51.o(-10, 34);
                        o19.u = 1;
                        arrayList23.add(o19);
                        y51 o20 = y51.o(-11, 34);
                        o20.u = 1;
                        arrayList23.add(o20);
                        y51 o21 = y51.o(-12, 34);
                        o21.u = 1;
                        arrayList23.add(o21);
                        y51 o22 = y51.o(-13, 34);
                        o22.u = 1;
                        arrayList23.add(o22);
                        y51 o23 = y51.o(-14, 34);
                        o23.u = 1;
                        arrayList23.add(o23);
                        y51 o24 = y51.o(-15, 34);
                        o24.u = 1;
                        arrayList23.add(o24);
                    }
                }
                boolean z19 = arrayList23.isEmpty() && !v3Var.t;
                if (i4Var.x != z19) {
                    i4Var.x = z19;
                    i4Var.w.setVisibility(0);
                    i4Var.w.animate().alpha(z19 ? 1.0f : 0.0f).scaleX(z19 ? 1.0f : 0.95f).scaleY(z19 ? 1.0f : 0.95f).setInterpolator(qr.h).setDuration(320L).setListener(new c3(i4Var, z19, 1)).start();
                    break;
                }
                break;
            case 19:
                h4.T((h4) this.b, (ArrayList) obj);
                break;
            case 20:
                m4 m4Var = (m4) this.b;
                ArrayList arrayList25 = (ArrayList) obj;
                l5 l5Var6 = m4Var.Y;
                if (l5Var6 != null) {
                    ArrayList arrayList26 = l5Var6.l;
                    arrayList25.add(y51.C(AndroidUtilities.dp(16.0f)));
                    if (l5Var6.i && arrayList26.isEmpty()) {
                        y51 o25 = y51.o(1, 34);
                        o25.u = 1;
                        arrayList25.add(o25);
                        y51 o26 = y51.o(2, 34);
                        o26.u = 1;
                        arrayList25.add(o26);
                        y51 o27 = y51.o(3, 34);
                        o27.u = 1;
                        arrayList25.add(o27);
                        y51 o28 = y51.o(4, 34);
                        o28.u = 1;
                        arrayList25.add(o28);
                        y51 o29 = y51.o(5, 34);
                        o29.u = 1;
                        arrayList25.add(o29);
                        y51 o30 = y51.o(6, 34);
                        o30.u = 1;
                        arrayList25.add(o30);
                        y51 o31 = y51.o(7, 34);
                        o31.u = 1;
                        arrayList25.add(o31);
                        y51 o32 = y51.o(8, 34);
                        o32.u = 1;
                        arrayList25.add(o32);
                        y51 o33 = y51.o(9, 34);
                        o33.u = 1;
                        arrayList25.add(o33);
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
                                int i49 = i1.a;
                                y51 J8 = y51.J(i1.class);
                                J8.u = z12 ? 1 : 0;
                                J8.z = z11 ? 1 : 0;
                                J8.G = savedStarGift2;
                                J8.q = z12;
                                J8.f = z12;
                                J8.r = z11;
                                HashSet hashSet = m4Var.Z;
                                int i50 = savedStarGift2.msg_id;
                                J8.K(hashSet.contains(Long.valueOf(i50 == 0 ? savedStarGift2.saved_id : i50)));
                                J8.u = 1;
                                arrayList25.add(J8);
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
                                    y51 o34 = y51.o(i51, 34);
                                    o34.u = 1;
                                    arrayList25.add(o34);
                                }
                            }
                        }
                    }
                    arrayList25.add(y51.C(AndroidUtilities.dp(f7)));
                    break;
                }
                break;
            case 21:
                yh.g.Y((yh.g) this.b, (ArrayList) obj);
                break;
            case 22:
                s sVar = (s) this.b;
                ArrayList arrayList27 = (ArrayList) obj;
                arrayList27.add(y51.k(sVar.Y));
                arrayList27.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList27.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new q1(sVar, 23)), true), R.drawable.msg_bot));
                arrayList27.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList27.add(q.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList27.add(y51.C(AndroidUtilities.dp(68.0f)));
                break;
            case 23:
                ArrayList arrayList28 = (ArrayList) obj;
                y51 y51Var = ((a0) this.b).v0;
                if (y51Var != null) {
                    arrayList28.add(y51Var);
                    break;
                }
                break;
            case 24:
                s0 s0Var = (s0) this.b;
                ArrayList arrayList29 = (ArrayList) obj;
                ArrayList arrayList30 = s0Var.d0;
                boolean z20 = s0Var.w0;
                r rVar = s0Var.g0;
                ArrayList arrayList31 = s0Var.b0;
                ArrayList arrayList32 = s0Var.a0;
                r rVar2 = s0Var.f0;
                r rVar3 = s0Var.e0;
                ArrayList arrayList33 = s0Var.c0;
                if (arrayList33 != null && arrayList32 != null && arrayList31 != null) {
                    arrayList29.add(y51.C(AndroidUtilities.dp(315.0f)));
                    rVar3.a = 0;
                    rVar3.c();
                    rVar2.a = 0;
                    rVar2.c();
                    rVar.a = 0;
                    rVar.c();
                    int i52 = s0Var.j0.r;
                    if (i52 == 0) {
                        arrayList29.add(y51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z20 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList33.size()))));
                        int size9 = arrayList33.size();
                        int i53 = 0;
                        while (i53 < size9) {
                            Object obj12 = arrayList33.get(i53);
                            i53++;
                            arrayList29.add(p0.a(i52, new o0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj12)));
                        }
                        if (!arrayList30.isEmpty()) {
                            arrayList29.add(y51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z20 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList33.size()))));
                            int size10 = arrayList30.size();
                            while (i14 < size10) {
                                Object obj13 = arrayList30.get(i14);
                                i14++;
                                arrayList29.add(p0.a(i52, new o0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj13)));
                            }
                            break;
                        }
                    } else if (i52 == 1) {
                        arrayList29.add(y51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList32.size()))));
                        int size11 = arrayList32.size();
                        while (i15 < size11) {
                            Object obj14 = arrayList32.get(i15);
                            i15++;
                            arrayList29.add(p0.a(i52, new o0((TL_stars.starGiftAttributeBackdrop) obj14, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        break;
                    } else if (i52 == 2) {
                        arrayList29.add(y51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList31.size()))));
                        int size12 = arrayList31.size();
                        while (i16 < size12) {
                            Object obj15 = arrayList31.get(i16);
                            i16++;
                            arrayList29.add(p0.a(i52, new o0((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj15, (TL_stars.starGiftAttributeModel) rVar.c())));
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
                ((w7) this.b).H0((ArrayList) obj, (m61) obj2);
                break;
            case 27:
                ((h7) this.b).R((ArrayList) obj, (m61) obj2);
                break;
            case 28:
                ((l7) this.b).R((ArrayList) obj, (m61) obj2);
                break;
            default:
                ((m7) this.b).R((ArrayList) obj, (m61) obj2);
                break;
        }
    }
}
