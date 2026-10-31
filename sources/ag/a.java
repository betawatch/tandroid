package ag;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import bi.d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.t9;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.ex0;
import org.telegram.ui.g61;
import org.telegram.ui.rv0;
import ph.p3;
import ph.q3;
import ph.r3;
import ph.t3;
import rh.v5;
import vh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        final int i10;
        final org.telegram.ui.web.j jVar = (org.telegram.ui.web.j) this.b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.web.h hVar = jVar.D;
        ArrayList arrayList2 = jVar.y;
        if (!jVar.b && arrayList2.isEmpty()) {
            arrayList.add(a51.k(jVar.d));
        }
        final int i11 = 0;
        SharedPreferences sharedPreferences = jVar.getContext().getSharedPreferences("webhistory", 0);
        ArrayList arrayList3 = new ArrayList();
        String string = sharedPreferences.getString("queries_json", null);
        if (string != null) {
            try {
                ArrayList arrayList4 = new ArrayList();
                int i12 = 0;
                for (JSONArray jSONArray = new JSONArray(string); i12 < jSONArray.length(); jSONArray = jSONArray) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i12);
                    org.telegram.ui.web.i iVar = new org.telegram.ui.web.i(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    iVar.c = jSONObject.optDouble("rank", 0.0d);
                    arrayList4.add(iVar);
                    i12++;
                }
                Collections.sort(arrayList4, new ex0(8));
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    org.telegram.ui.web.i iVar2 = (org.telegram.ui.web.i) obj3;
                    if (arrayList3.size() >= 20) {
                        break;
                    } else {
                        arrayList3.add(iVar2.a);
                    }
                }
            } catch (Exception unused) {
            }
        }
        arrayList2.size();
        arrayList3.size();
        if (!arrayList2.isEmpty()) {
            arrayList.add(a51.k(jVar.w));
        }
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= arrayList2.size()) {
                break;
            }
            final String str = (String) arrayList2.get(i14);
            boolean z10 = i14 == 0;
            boolean z11 = i14 == arrayList2.size() - 1;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.p pVar = jVar.M;
                            if (pVar != null) {
                                pVar.a(str);
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.p pVar2 = jVar.M;
                            if (pVar2 != null) {
                                pVar2.a(str);
                                break;
                            }
                            break;
                    }
                }
            };
            int i15 = org.telegram.ui.web.c.b;
            a51 K = a51.K(org.telegram.ui.web.c.class);
            K.z = 1;
            K.l = str;
            K.D = onClickListener;
            K.q = z10;
            K.r = z11;
            K.G = Boolean.TRUE;
            K.H = jVar;
            arrayList.add(K);
            i14++;
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(a51.s(cd.L0(2131742938, null), cd.L0(2131742942, null), new g(jVar, 24)));
            int i16 = 0;
            while (i16 < arrayList3.size()) {
                final String str2 = (String) arrayList3.get(i16);
                boolean z12 = i16 == 0;
                boolean z13 = i16 == arrayList3.size() - 1;
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                org.telegram.ui.p pVar = jVar.M;
                                if (pVar != null) {
                                    pVar.a(str2);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.p pVar2 = jVar.M;
                                if (pVar2 != null) {
                                    pVar2.a(str2);
                                    break;
                                }
                                break;
                        }
                    }
                };
                int i17 = org.telegram.ui.web.c.b;
                a51 K2 = a51.K(org.telegram.ui.web.c.class);
                K2.z = 0;
                K2.l = str2;
                K2.D = onClickListener2;
                K2.q = z12;
                K2.r = z13;
                K2.G = Boolean.TRUE;
                K2.H = jVar;
                arrayList.add(K2);
                i16++;
            }
        }
        if (hVar != null) {
            ArrayList arrayList5 = hVar.a;
            if (arrayList5.isEmpty()) {
                return;
            }
            arrayList.add(a51.r(cd.L0(2131742939, null)));
            while (i11 < arrayList5.size()) {
                jj jjVar = (jj) arrayList5.get(i11);
                if (!TextUtils.isEmpty(org.telegram.ui.web.j.a(jjVar))) {
                    int i18 = org.telegram.ui.web.f.b;
                    a51 K3 = a51.K(org.telegram.ui.web.f.class);
                    K3.z = 3;
                    K3.q = true;
                    K3.H = jjVar;
                    arrayList.add(K3);
                }
                i11++;
            }
            if (hVar.f) {
                return;
            }
            arrayList.add(a51.q(arrayList.size(), 32));
            arrayList.add(a51.q(arrayList.size(), 32));
            arrayList.add(a51.q(arrayList.size(), 32));
        }
    }

    private final void c(Object obj, Object obj2) {
        int i10;
        ph.f2 f2Var = (ph.f2) this.b;
        ArrayList arrayList = (ArrayList) obj;
        p6 p6Var = f2Var.c;
        vq0 vq0Var = f2Var.a;
        v5 v5Var = f2Var.e;
        if (v5Var == null) {
            return;
        }
        if ((!v5Var.e || v5Var.g != 783) && v5Var.l.size() <= 0) {
            v5 v5Var2 = f2Var.e;
            if (v5Var2.j && !v5Var2.i) {
                return;
            }
        }
        v5 v5Var3 = f2Var.e;
        int i11 = 1;
        int max = Math.max(1, (v5Var3 == null || (i10 = v5Var3.n) == 0) ? 3 : Math.min(3, i10));
        v5 v5Var4 = f2Var.e;
        int i12 = 0;
        if (v5Var4 != null) {
            ArrayList arrayList2 = v5Var4.l;
            int size = arrayList2.size();
            int i13 = 3;
            int i14 = 0;
            while (i14 < size) {
                Object obj3 = arrayList2.get(i14);
                i14++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                boolean z10 = f2Var.d;
                int i15 = ph.b1.b;
                a51 K = a51.K(ph.b1.class);
                K.u = 1;
                K.z = 0;
                K.G = savedStarGift;
                K.q = true;
                K.f = false;
                K.r = z10;
                K.h = f2Var.h && (f2Var.e != vq0Var.d || savedStarGift.pinned_to_top);
                arrayList.add(K);
                i13--;
                if (i13 == 0) {
                    i13 = 3;
                }
            }
            v5 v5Var5 = f2Var.e;
            if (v5Var5.i || !v5Var5.j) {
                int i16 = 0;
                while (true) {
                    if (i16 >= (i13 <= 0 ? 3 : i13)) {
                        break;
                    }
                    i16++;
                    a51 q6 = a51.q(i16, 34);
                    q6.u = 1;
                    arrayList.add(q6);
                }
            }
        }
        if (vq0Var.d == f2Var.e) {
            arrayList.add(a51.D(org.telegram.messenger.i0.L(20.0f)));
            if (vq0Var.c == d20.i(f2Var.b).e()) {
                int i17 = t6.z6;
                int w02 = t6.w0(i17, p6Var);
                String L0 = cd.L0(2131746686, null);
                int L = org.telegram.messenger.i0.L(24.0f);
                int i18 = ph.g2.b;
                a51 K2 = a51.K(ph.g2.class);
                K2.l = L0;
                K2.z = 17;
                K2.B = w02;
                K2.A = 14.0f;
                K2.i = L;
                K2.k = 0;
                K2.q = false;
                K2.G = p6Var;
                K2.H = Integer.valueOf(i17);
                arrayList.add(K2);
            }
            arrayList.add(a51.D(org.telegram.messenger.i0.L(82.0f)));
        } else if (!arrayList.isEmpty()) {
            arrayList.add(a51.D(org.telegram.messenger.i0.L(82.0f)));
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(0, a51.D(org.telegram.messenger.i0.L(f2Var.H ? 42.0f : 12.0f)));
        }
        if (f2Var.f.getSpanCount() != max) {
            org.telegram.messenger.i0.g3(new ph.p1(f2Var, max, i11));
        }
        vq0Var.p();
        vq0Var.post(new ph.x1(vq0Var, i12));
    }

    private final void d(Object obj, Object obj2) {
        r3 r3Var = (r3) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ph.h3 h3Var = r3Var.d;
        ArrayList arrayList2 = h3Var.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            arrayList.add(ph.b1.i(0, (TL_stars.TL_starGiftUnique) obj3, false, false, false, true, false));
        }
        if (h3Var.t || !h3Var.u) {
            a51 q6 = a51.q(-1, 34);
            q6.u = 1;
            arrayList.add(q6);
            a51 q10 = a51.q(-2, 34);
            q10.u = 1;
            arrayList.add(q10);
            a51 q11 = a51.q(-3, 34);
            q11.u = 1;
            arrayList.add(q11);
            if (h3Var.d.isEmpty()) {
                a51 q12 = a51.q(-4, 34);
                q12.u = 1;
                arrayList.add(q12);
                a51 q13 = a51.q(-5, 34);
                q13.u = 1;
                arrayList.add(q13);
                a51 q14 = a51.q(-6, 34);
                q14.u = 1;
                arrayList.add(q14);
                a51 q15 = a51.q(-7, 34);
                q15.u = 1;
                arrayList.add(q15);
                a51 q16 = a51.q(-8, 34);
                q16.u = 1;
                arrayList.add(q16);
                a51 q17 = a51.q(-9, 34);
                q17.u = 1;
                arrayList.add(q17);
                a51 q18 = a51.q(-10, 34);
                q18.u = 1;
                arrayList.add(q18);
                a51 q19 = a51.q(-11, 34);
                q19.u = 1;
                arrayList.add(q19);
                a51 q20 = a51.q(-12, 34);
                q20.u = 1;
                arrayList.add(q20);
                a51 q21 = a51.q(-13, 34);
                q21.u = 1;
                arrayList.add(q21);
                a51 q22 = a51.q(-14, 34);
                q22.u = 1;
                arrayList.add(q22);
                a51 q23 = a51.q(-15, 34);
                q23.u = 1;
                arrayList.add(q23);
            }
        }
        boolean z10 = arrayList.isEmpty() && !h3Var.t;
        if (r3Var.y == z10) {
            return;
        }
        r3Var.y = z10;
        r3Var.x.setVisibility(0);
        r3Var.x.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.95f).scaleY(z10 ? 1.0f : 0.95f).setInterpolator(gr.h).setDuration(320L).setListener(new ph.t2(r3Var, z10, 1)).start();
    }

    private final void e(Object obj, Object obj2) {
        q3 q3Var = (q3) this.b;
        ArrayList arrayList = (ArrayList) obj;
        p3 p3Var = q3Var.Q1;
        if (p3Var != null) {
            v5 v5Var = p3Var.b;
            ph.h3 h3Var = p3Var.c;
            if (v5Var == null || h3Var == null) {
                return;
            }
            int currentTime = ConnectionsManager.getInstance(q3Var.a).getCurrentTime();
            arrayList.add(a51.t(-1, cd.L0(2131749779, null)));
            ArrayList arrayList2 = v5Var.l;
            int size = arrayList2.size();
            boolean z10 = true;
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                boolean z11 = z10;
                if (q3Var.Y1.contains(Long.valueOf(savedStarGift.gift.id))) {
                    z10 = z11;
                } else {
                    boolean z12 = savedStarGift.can_craft_at <= currentTime;
                    a51 i12 = ph.b1.i(0, savedStarGift.gift, false, true, false, false, true);
                    i12.g = z12;
                    arrayList.add(i12);
                    i10++;
                    z10 = false;
                }
            }
            boolean z13 = z10;
            int i13 = 1;
            if (v5Var.i || !v5Var.j) {
                int i14 = i10 % 3;
                int i15 = 6 - i14;
                int i16 = 0;
                while (i16 < i15) {
                    a51 q6 = a51.q((i16 - i14) + 1, 35);
                    q6.u = i13;
                    arrayList.add(q6);
                    i16++;
                    i13 = 1;
                }
            } else if (z13) {
                arrayList.add(a51.g(cd.L0(2131749778, null)));
            }
            if (h3Var.e > 0 || q3Var.b2) {
                q3Var.b2 = true;
                String L0 = cd.L0(2131749781, null);
                a51 a51Var = new a51(42);
                a51Var.d = -2;
                a51Var.o = L0;
                arrayList.add(a51Var);
                HorizontalScrollView horizontalScrollView = q3Var.R1;
                if (horizontalScrollView != null) {
                    arrayList.add(a51.j(-3, horizontalScrollView));
                }
                ArrayList arrayList3 = h3Var.d;
                int size2 = arrayList3.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj4 = arrayList3.get(i17);
                    i17++;
                    arrayList.add(ph.b1.i(0, (TL_stars.TL_starGiftUnique) obj4, false, true, false, true, true));
                }
                if (h3Var.t || !h3Var.u) {
                    a51 q10 = a51.q(10, 35);
                    q10.u = 1;
                    arrayList.add(q10);
                    a51 q11 = a51.q(11, 35);
                    q11.u = 1;
                    arrayList.add(q11);
                    a51 q12 = a51.q(12, 35);
                    q12.u = 1;
                    arrayList.add(q12);
                    a51 q13 = a51.q(13, 35);
                    q13.u = 1;
                    arrayList.add(q13);
                    a51 q14 = a51.q(14, 35);
                    q14.u = 1;
                    arrayList.add(q14);
                    a51 q15 = a51.q(15, 35);
                    q15.u = 1;
                    arrayList.add(q15);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0492  */
    @Override // org.telegram.messenger.j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        p51 p51Var;
        String str;
        int i10;
        boolean z10;
        boolean z11;
        String str2;
        String str3;
        String str4;
        String str5;
        Object[] objArr;
        int i11;
        bi.o2 o2Var;
        int i12 = -1;
        boolean z12 = true;
        boolean z13 = false;
        int i13 = 0;
        int i14 = 0;
        z13 = false;
        switch (this.a) {
            case 0:
                f.Y((f) this.b, (ArrayList) obj, (p51) obj2);
                break;
            case 1:
                w wVar = (w) this.b;
                wVar.L.dismiss();
                wVar.D = (String) obj;
                wVar.E = (TLRPC.InputDocument) obj2;
                wVar.x = false;
                org.telegram.messenger.i0.r(wVar.e);
                wVar.n.setSticker(wVar.D);
                wVar.i0(true);
                ii iiVar = wVar.a;
                if (iiVar != null && (p51Var = iiVar.f3) != null) {
                    p51Var.O(true);
                    break;
                }
                break;
            case 2:
                j1 j1Var = (j1) this.b;
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var2 = (p51) obj2;
                p51Var2.F = 1;
                arrayList.add(a51.l(-5, j1Var.S1));
                TL_account.TL_connectedBot tL_connectedBot = j1Var.P1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        str = null;
                        arrayList.add(a51.u(cd.L0(2131745576, null)));
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList.add(a51.f(cd.L0(2131745573, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList.add(a51.f(cd.L0(2131745572, null), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList.add(a51.f(cd.L0(2131745574, null), cd.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList.add(a51.C(null));
                    } else {
                        str = null;
                    }
                    p51Var2.V();
                    arrayList.add(a51.u(cd.L0(2131752819, str)));
                    int i15 = j1.c2;
                    a51 x10 = a51.x(-1, cd.L0(2131752781, str));
                    x10.L(j1Var.X1);
                    arrayList.add(x10);
                    int i16 = j1.d2;
                    a51 x11 = a51.x(-2, cd.L0(2131752776, str));
                    x11.L(!j1Var.X1);
                    arrayList.add(x11);
                    p51Var2.U();
                    arrayList.add(a51.C(str));
                    x0 x0Var = j1Var.R1;
                    if (x0Var != null) {
                        x0Var.a(arrayList, p51Var2, true);
                    }
                    arrayList.add(a51.C(cd.L0(2131752818, str)));
                    break;
                }
                break;
            case 3:
                final t1 t1Var = (t1) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                p51 p51Var3 = (p51) obj2;
                LongSparseArray longSparseArray = t1Var.N;
                String L0 = cd.L0(2131752783, null);
                String L02 = cd.L0(2131752782, null);
                a51 a51Var = new a51(2);
                a51Var.l = L0;
                a51Var.o = L02;
                a51Var.m = "tg_superplaceholders_android_2";
                a51Var.n = "🤖🏝️";
                a51Var.z = 120;
                arrayList2.add(a51Var);
                if (t1Var.M != null) {
                    p51Var3.V();
                    long j10 = t1Var.M.id;
                    a51 a51Var2 = new a51(13);
                    a51Var2.x = j10;
                    a51Var2.L(true);
                    final int i17 = z13 ? 1 : 0;
                    a51Var2.D = new View.OnClickListener() { // from class: ag.n1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i17) {
                                case 0:
                                    t1 t1Var2 = t1Var;
                                    t1Var2.M = null;
                                    t1Var2.c.f3.O(true);
                                    t1Var2.c0(true);
                                    break;
                                case 1:
                                    t1 t1Var3 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = t1Var3.J;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    t1Var3.c.f3.O(true);
                                    t1Var3.c0(true);
                                    break;
                                case 2:
                                    t1 t1Var4 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = t1Var4.J;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        t1Var4.b0(-14, true, new l1(t1Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        t1Var4.c.f3.O(true);
                                        t1Var4.c0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t1 t1Var5 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = t1Var5.J;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        t1Var5.b0(-17, true, new l1(t1Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        t1Var5.c.f3.O(true);
                                        t1Var5.c0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t1 t1Var6 = t1Var;
                                    t1Var6.J.manage_stories = !r0.manage_stories;
                                    t1Var6.c.f3.O(true);
                                    t1Var6.c0(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(a51Var2);
                    p51Var3.U();
                    z10 = true;
                } else {
                    p51Var3.V();
                    arrayList2.add(a51.k(t1Var.e));
                    longSparseArray.clear();
                    int i18 = 0;
                    boolean z14 = false;
                    while (i18 < t1Var.d.d.size()) {
                        TLObject tLObject = (TLObject) t1Var.d.d.get(i18);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                z11 = z12;
                                long j11 = user.id;
                                String str6 = t1Var.D;
                                a51 a51Var3 = new a51(13);
                                a51Var3.x = j11;
                                a51Var3.n = str6;
                                arrayList2.add(a51Var3);
                                longSparseArray.put(user.id, user);
                                z14 = z11;
                                i18++;
                                z12 = z11;
                            }
                        }
                        z11 = z12;
                        i18++;
                        z12 = z11;
                    }
                    z10 = z12;
                    for (int i19 = 0; i19 < t1Var.d.e.size(); i19++) {
                        TLObject tLObject2 = (TLObject) t1Var.d.e.get(i19);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j12 = user2.id;
                                String str7 = t1Var.D;
                                a51 a51Var4 = new a51(13);
                                a51Var4.x = j12;
                                a51Var4.n = str7;
                                arrayList2.add(a51Var4);
                                longSparseArray.put(user2.id, user2);
                                z14 = z10;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(t1Var.f.getText().toString()) || t1Var.d.e() || t1Var.y)) {
                        arrayList2.add(a51.k(t1Var.n));
                        z14 = z10;
                    }
                    t1Var.h.setVisibility(z14 ? 0 : 8);
                    p51Var3.U();
                }
                arrayList2.add(a51.C(cd.L0(2131752815, null)));
                p51Var3.V();
                a51 u10 = a51.u(cd.L0(2131752819, null));
                u10.g = t1Var.M != null ? z10 : false;
                arrayList2.add(u10);
                a51 x12 = a51.x(-1, cd.L0(2131752781, null));
                x12.L(t1Var.I);
                x12.g = t1Var.M != null ? z10 : false;
                arrayList2.add(x12);
                a51 x13 = a51.x(-2, cd.L0(2131752776, null));
                x13.L(!t1Var.I);
                x13.g = t1Var.M != null ? z10 : false;
                arrayList2.add(x13);
                p51Var3.U();
                arrayList2.add(a51.C(null));
                t1Var.w.a(arrayList2, p51Var3, t1Var.M != null ? z10 : false);
                arrayList2.add(a51.C(cd.L0(2131752818, null)));
                if (t1Var.M != null) {
                    p51Var3.V();
                    arrayList2.add(a51.u(cd.L0(2131752808, null)));
                    String L03 = cd.L0(2131752795, null);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = t1Var.J;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    a51 o10 = a51.o(-4, L03, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = t1Var.J;
                    o10.L((tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) ? z10 : false);
                    o10.f = !t1Var.P;
                    boolean z15 = z10;
                    final int i20 = z15 ? 1 : 0;
                    o10.D = new View.OnClickListener() { // from class: ag.n1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
                                case 0:
                                    t1 t1Var2 = t1Var;
                                    t1Var2.M = null;
                                    t1Var2.c.f3.O(true);
                                    t1Var2.c0(true);
                                    break;
                                case 1:
                                    t1 t1Var3 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = t1Var3.J;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    t1Var3.c.f3.O(true);
                                    t1Var3.c0(true);
                                    break;
                                case 2:
                                    t1 t1Var4 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t1Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t1Var4.b0(-14, true, new l1(t1Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t1Var4.c.f3.O(true);
                                        t1Var4.c0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t1 t1Var5 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t1Var5.J;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        t1Var5.b0(-17, true, new l1(t1Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        t1Var5.c.f3.O(true);
                                        t1Var5.c0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t1 t1Var6 = t1Var;
                                    t1Var6.J.manage_stories = !r0.manage_stories;
                                    t1Var6.c.f3.O(true);
                                    t1Var6.c0(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(o10);
                    if (t1Var.P) {
                        str2 = null;
                        a51 z16 = a51.z(-5, cd.L0(2131752797, null));
                        z16.L(z15);
                        z16.g = false;
                        z16.i = z15 ? 1 : 0;
                        arrayList2.add(z16);
                        a51 z17 = a51.z(-6, cd.L0(2131752796, null));
                        z17.L(t1Var.J.reply);
                        z17.i = z15 ? 1 : 0;
                        arrayList2.add(z17);
                        a51 z18 = a51.z(-7, cd.L0(2131752798, null));
                        z18.L(t1Var.J.read_messages);
                        z18.i = z15 ? 1 : 0;
                        arrayList2.add(z18);
                        a51 z19 = a51.z(-8, cd.L0(2131752799, null));
                        z19.L(t1Var.J.delete_sent_messages);
                        z19.i = z15 ? 1 : 0;
                        arrayList2.add(z19);
                        a51 z20 = a51.z(-9, cd.L0(2131752800, null));
                        z20.L(t1Var.J.delete_received_messages);
                        z20.i = z15 ? 1 : 0;
                        arrayList2.add(z20);
                    } else {
                        str2 = null;
                    }
                    String L04 = cd.L0(2131752791, str2);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = t1Var.J;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    a51 o11 = a51.o(-10, L04, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = t1Var.J;
                    o11.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o11.f = !t1Var.Q;
                    final int i21 = 2;
                    o11.D = new View.OnClickListener() { // from class: ag.n1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    t1 t1Var2 = t1Var;
                                    t1Var2.M = null;
                                    t1Var2.c.f3.O(true);
                                    t1Var2.c0(true);
                                    break;
                                case 1:
                                    t1 t1Var3 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t1Var3.J;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    t1Var3.c.f3.O(true);
                                    t1Var3.c0(true);
                                    break;
                                case 2:
                                    t1 t1Var4 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t1Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t1Var4.b0(-14, true, new l1(t1Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t1Var4.c.f3.O(true);
                                        t1Var4.c0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t1 t1Var5 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t1Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t1Var5.b0(-17, true, new l1(t1Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t1Var5.c.f3.O(true);
                                        t1Var5.c0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t1 t1Var6 = t1Var;
                                    t1Var6.J.manage_stories = !r0.manage_stories;
                                    t1Var6.c.f3.O(true);
                                    t1Var6.c0(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(o11);
                    if (t1Var.Q) {
                        str3 = null;
                        a51 z21 = a51.z(-11, cd.L0(2131752793, null));
                        z21.L(t1Var.J.edit_name);
                        z21.i = 1;
                        arrayList2.add(z21);
                        a51 z22 = a51.z(-12, cd.L0(2131752794, null));
                        z22.L(t1Var.J.edit_bio);
                        z22.i = 1;
                        arrayList2.add(z22);
                        a51 z23 = a51.z(-13, cd.L0(2131752792, null));
                        z23.L(t1Var.J.edit_profile_photo);
                        z23.i = 1;
                        arrayList2.add(z23);
                        a51 z24 = a51.z(-14, cd.L0(2131752790, null));
                        z24.L(t1Var.J.edit_username);
                        z24.i = 1;
                        arrayList2.add(z24);
                    } else {
                        str3 = null;
                    }
                    String L05 = cd.L0(2131752807, str3);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = t1Var.J;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    a51 o12 = a51.o(-15, L05, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = t1Var.J;
                    o12.L(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    o12.f = !t1Var.R;
                    final int i22 = 3;
                    o12.D = new View.OnClickListener() { // from class: ag.n1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    t1 t1Var2 = t1Var;
                                    t1Var2.M = null;
                                    t1Var2.c.f3.O(true);
                                    t1Var2.c0(true);
                                    break;
                                case 1:
                                    t1 t1Var3 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t1Var3.J;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    t1Var3.c.f3.O(true);
                                    t1Var3.c0(true);
                                    break;
                                case 2:
                                    t1 t1Var4 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t1Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t1Var4.b0(-14, true, new l1(t1Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t1Var4.c.f3.O(true);
                                        t1Var4.c0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t1 t1Var5 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t1Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t1Var5.b0(-17, true, new l1(t1Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t1Var5.c.f3.O(true);
                                        t1Var5.c0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t1 t1Var6 = t1Var;
                                    t1Var6.J.manage_stories = !r0.manage_stories;
                                    t1Var6.c.f3.O(true);
                                    t1Var6.c0(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(o12);
                    if (t1Var.R) {
                        str4 = null;
                        a51 z25 = a51.z(-16, cd.L0(2131752802, null));
                        z25.L(t1Var.J.view_gifts);
                        z25.i = 1;
                        arrayList2.add(z25);
                        a51 z26 = a51.z(-17, cd.L0(2131752806, null));
                        z26.L(t1Var.J.sell_gifts);
                        z26.i = 1;
                        arrayList2.add(z26);
                        a51 z27 = a51.z(-18, cd.L0(2131752805, null));
                        z27.L(t1Var.J.change_gift_settings);
                        z27.i = 1;
                        arrayList2.add(z27);
                        a51 z28 = a51.z(-19, cd.L0(2131752804, null));
                        z28.L(t1Var.J.transfer_and_upgrade_gifts);
                        z28.i = 1;
                        arrayList2.add(z28);
                        a51 z29 = a51.z(-20, cd.L0(2131752803, null));
                        z29.L(t1Var.J.transfer_stars);
                        z29.i = 1;
                        arrayList2.add(z29);
                    } else {
                        str4 = null;
                    }
                    a51 o13 = a51.o(-21, cd.L0(2131752789, str4), "");
                    o13.L(t1Var.J.manage_stories);
                    final int i23 = 4;
                    o13.D = new View.OnClickListener() { // from class: ag.n1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    t1 t1Var2 = t1Var;
                                    t1Var2.M = null;
                                    t1Var2.c.f3.O(true);
                                    t1Var2.c0(true);
                                    break;
                                case 1:
                                    t1 t1Var3 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t1Var3.J;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    t1Var3.c.f3.O(true);
                                    t1Var3.c0(true);
                                    break;
                                case 2:
                                    t1 t1Var4 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t1Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t1Var4.b0(-14, true, new l1(t1Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t1Var4.c.f3.O(true);
                                        t1Var4.c0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t1 t1Var5 = t1Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t1Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t1Var5.b0(-17, true, new l1(t1Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t1Var5.c.f3.O(true);
                                        t1Var5.c0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t1 t1Var6 = t1Var;
                                    t1Var6.J.manage_stories = !r0.manage_stories;
                                    t1Var6.c.f3.O(true);
                                    t1Var6.c0(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(o13);
                    p51Var3.U();
                    arrayList2.add(a51.B(-4, null));
                    arrayList2.add(a51.B(-5, null));
                    arrayList2.add(a51.B(-6, null));
                    arrayList2.add(a51.B(-7, null));
                    break;
                }
                break;
            case 4:
                v1.Y((v1) this.b, (ArrayList) obj, (p51) obj2);
                break;
            case 5:
                f2 f2Var = (f2) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                String L06 = cd.L0(2131752698, null);
                String L07 = cd.L0(2131752692, null);
                a51 a51Var5 = new a51(2);
                a51Var5.l = L06;
                a51Var5.o = L07;
                a51Var5.k = R.raw.biz_map;
                arrayList3.add(a51Var5);
                arrayList3.add(a51.k(f2Var.d));
                arrayList3.add(a51.C(null));
                a51 i24 = a51.i(1, cd.L0(2131752691, null));
                i24.L(f2Var.x != null);
                arrayList3.add(i24);
                if (f2Var.x != null) {
                    arrayList3.add(a51.k(f2Var.f));
                }
                arrayList3.add(a51.C(null));
                if (f2Var.w != null && (f2Var.x != null || !TextUtils.isEmpty(f2Var.y))) {
                    z13 = true;
                }
                f2Var.F = z13;
                if (z13) {
                    a51 e = a51.e(2, cd.L0(2131752696, null));
                    e.r = true;
                    arrayList3.add(e);
                    arrayList3.add(a51.C(null));
                }
                f2Var.Y(true);
                break;
            case 6:
                h2.Z((h2) this.b, (ArrayList) obj);
                break;
            case 7:
                j2 j2Var = (j2) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = j2Var.b;
                String str8 = null;
                String L08 = cd.L0(2131752752, null);
                a51 a51Var6 = new a51(9);
                a51Var6.d = -1;
                a51Var6.l = L08;
                a51Var6.L(j2Var.r);
                arrayList4.add(a51Var6);
                arrayList4.add(a51.C(null));
                if (j2Var.r) {
                    while (i14 < arrayList5.size()) {
                        if (i14 > 0) {
                            arrayList4.add(a51.C(str8));
                        }
                        g2 g2Var = (g2) arrayList5.get(i14);
                        if (j2Var.Y()) {
                            str5 = null;
                        } else {
                            int i25 = i14 * 3;
                            str5 = null;
                            arrayList4.add(a51.f(cd.L0(2131752751, null), g2.a(g2Var.a), i25));
                            arrayList4.add(a51.f(cd.L0(2131752757, null), g2.a(g2Var.b), i25 + 1));
                            a51 e7 = a51.e(i25 + 2, cd.L0(2131746336, null));
                            e7.r = true;
                            arrayList4.add(e7);
                        }
                        i14++;
                        str8 = str5;
                    }
                    String str9 = str8;
                    if (j2Var.Z()) {
                        arrayList4.add(a51.C(str9));
                        a51 c10 = a51.c(-2, R.drawable.menu_premium_clock_add, cd.L0(2131752758, str9));
                        c10.q = true;
                        arrayList4.add(c10);
                    }
                    arrayList4.add(a51.C(cd.L0(2131752753, str9)));
                    break;
                }
                break;
            case 8:
                m3.Z((m3) this.b, (ArrayList) obj, (p51) obj2);
                break;
            case 9:
                ai.a aVar = (ai.a) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                arrayList6.add(a51.E(0, org.telegram.messenger.i0.L(12.0f)));
                arrayList6.add(a51.j(1, aVar.R1));
                arrayList6.add(a51.E(2, org.telegram.messenger.i0.L(12.0f)));
                arrayList6.add(a51.t(3, cd.L0(2131751947, null)));
                aVar.U1 = arrayList6.size();
                String L09 = cd.L0(2131751946, null);
                boolean z30 = aVar.T1;
                a51 y3 = a51.y(zs.h2, L09, cd.L0(z30 ? 2131751945 : 2131751944, null));
                y3.L(!aVar.Q1);
                arrayList6.add(y3);
                a51 y10 = a51.y(zs.g2, cd.L0(2131751950, null), cd.L0(z30 ? 2131751949 : 2131751948, null));
                y10.L(aVar.Q1);
                arrayList6.add(y10);
                arrayList6.add(a51.B(6, cd.L0(2131751951, null)));
                break;
            case 10:
                ((ArrayList) obj).add(a51.j(0, ((ai.c) this.b).P1));
                break;
            case 11:
                Utilities.i.c(new a1.f(17, (String[]) this.b, (j20) obj2));
                break;
            case 12:
                bi.z zVar = (bi.z) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                arrayList7.add(a51.j(1, zVar.S1));
                arrayList7.add(a51.j(3, zVar.V1));
                if (zVar.a2 != null) {
                    arrayList7.add(a51.j(2, zVar.T1));
                    break;
                }
                break;
            case 13:
                d4.L1((d4[]) this.b, (ArrayList) obj, (p51) obj2);
                break;
            case 14:
                d4 d4Var = (d4) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList8 = (ArrayList) obj2;
                ArrayList arrayList9 = d4Var.s3;
                ArrayList arrayList10 = new ArrayList(arrayList8.size());
                int size = arrayList8.size();
                int i26 = 0;
                while (i26 < size) {
                    Object obj3 = arrayList8.get(i26);
                    i26++;
                    Object obj4 = ((a51) obj3).G;
                    if (obj4 instanceof bi.a) {
                        arrayList10.add((bi.a) obj4);
                    }
                }
                if (arrayList10.size() >= 2) {
                    ArrayList arrayList11 = new ArrayList();
                    int size2 = arrayList10.size();
                    int i27 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i28 = 0;
                    int i29 = 0;
                    while (i29 < size2) {
                        Object obj5 = arrayList10.get(i29);
                        i29++;
                        bi.a aVar2 = (bi.a) obj5;
                        int indexOf = arrayList9.indexOf(aVar2);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i30 = indexOf + 1;
                            if (d4.A3(aVar2) && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                                int S3 = d4Var.S3(indexOf);
                                i30 = S3 >= arrayList9.size() ? arrayList9.size() : S3 + 1;
                            }
                            arrayList11.add(new ArrayList(arrayList9.subList(indexOf, i30)));
                            i27 = Math.min(i27, indexOf);
                            i12 = Math.max(i12, i30);
                            i28 += i30 - indexOf;
                        }
                    }
                    if (i28 == i12 - i27) {
                        ArrayList arrayList12 = new ArrayList(i28);
                        int size3 = arrayList11.size();
                        int i31 = 0;
                        while (i31 < size3) {
                            Object obj6 = arrayList11.get(i31);
                            i31++;
                            arrayList12.addAll((ArrayList) obj6);
                        }
                        for (int i32 = 0; i32 < arrayList12.size(); i32++) {
                            if (arrayList9.get(i27 + i32) != arrayList12.get(i32)) {
                                bi.o2 o2Var2 = d4Var.Q3;
                                if (o2Var2 != null) {
                                    o2Var2.d();
                                }
                                for (int i33 = 0; i33 < arrayList12.size(); i33++) {
                                    arrayList9.set(i27 + i33, (bi.a) arrayList12.get(i33));
                                }
                                bi.a aVar3 = d4Var.Z3;
                                ArrayList arrayList13 = d4.z4;
                                if (aVar3 != null) {
                                    ArrayList arrayList14 = aVar3.k;
                                    int indexOf2 = arrayList9.indexOf(aVar3);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList15 = indexOf2 > 0 ? ((bi.a) arrayList9.get(indexOf2 - 1)).k : arrayList13;
                                        int i34 = indexOf2 + 1;
                                        if (i34 < arrayList9.size()) {
                                            arrayList13 = ((bi.a) arrayList9.get(i34)).k;
                                        }
                                        if (arrayList15.size() < arrayList13.size()) {
                                            arrayList15 = arrayList13;
                                        }
                                        if (!arrayList14.equals(arrayList15)) {
                                            arrayList14.clear();
                                            arrayList14.addAll(arrayList15);
                                            objArr = true;
                                            boolean A2 = d4Var.A2();
                                            i11 = 0;
                                            while (i11 < arrayList9.size()) {
                                                bi.a aVar4 = (bi.a) arrayList9.get(i11);
                                                if (!aVar4.i && !d4.A3(aVar4)) {
                                                    bi.a aVar5 = i11 > 0 ? (bi.a) arrayList9.get(i11 - 1) : null;
                                                    int max = aVar5 != null ? Math.max(0, aVar5.c) : 0;
                                                    if (d4.H3(aVar4.b)) {
                                                        aVar4.c = max;
                                                        if (max > 0) {
                                                            aVar4.d = aVar5.d > 0 ? 1 : 0;
                                                            aVar4.e = false;
                                                            aVar4.f = false;
                                                        }
                                                    } else {
                                                        int i35 = max + 1;
                                                        if (aVar4.c > i35) {
                                                            aVar4.c = i35;
                                                        }
                                                    }
                                                    if (aVar4.c <= 0) {
                                                        aVar4.c = 0;
                                                        aVar4.d = 0;
                                                        aVar4.e = false;
                                                        aVar4.f = false;
                                                    }
                                                }
                                                i11++;
                                            }
                                            d4Var.v4();
                                            d4Var.d2();
                                            if (!objArr == true || A2) {
                                                d4Var.f3.O(true);
                                                d4Var.A4();
                                            } else {
                                                d4Var.A4();
                                            }
                                            o2Var = d4Var.Q3;
                                            if (o2Var == null) {
                                                o2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                objArr = false;
                                boolean A22 = d4Var.A2();
                                i11 = 0;
                                while (i11 < arrayList9.size()) {
                                }
                                d4Var.v4();
                                d4Var.d2();
                                if (objArr == true) {
                                }
                                d4Var.f3.O(true);
                                d4Var.A4();
                                o2Var = d4Var.Q3;
                                if (o2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 15:
                s3 s3Var = (s3) this.b;
                s3Var.y0 = ((Integer) obj).intValue();
                s3Var.z0 = ((Integer) obj2).intValue();
                org.telegram.messenger.i0.h3(new gg.c(s3Var, 15), 60L);
                break;
            case 16:
                lh.g gVar = (lh.g) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                ArrayList arrayList17 = gVar.S1;
                if (arrayList17 != null && !arrayList17.isEmpty()) {
                    int L = org.telegram.messenger.i0.L(13.0f) + ((org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(68.0f));
                    int L2 = org.telegram.messenger.i0.L(88.0f) + gVar.d2;
                    arrayList16.add(a51.E(0, L2));
                    int i36 = L - L2;
                    int size4 = arrayList17.size();
                    int i37 = 0;
                    while (i37 < size4) {
                        Object obj7 = arrayList17.get(i37);
                        i37++;
                        for (TLRPC.TL_help_country tL_help_country : (List) gVar.R1.get((String) obj7)) {
                            if (TextUtils.isEmpty(gVar.U1) || mg.v1.g1(tL_help_country, org.telegram.messenger.i0.N3(gVar.U1).toLowerCase())) {
                                i36 -= org.telegram.messenger.i0.L(44.0f);
                                boolean containsKey = gVar.b2.containsKey(tL_help_country.iso2);
                                int i38 = lh.f.b;
                                a51 K = a51.K(lh.f.class);
                                K.l = tL_help_country.iso2;
                                K.G = tL_help_country;
                                K.e = containsKey;
                                arrayList16.add(K);
                            }
                        }
                    }
                    arrayList16.add(a51.E(1, Math.max(0, i36)));
                    break;
                }
                break;
            case 17:
                ArrayList arrayList18 = (ArrayList) obj;
                g61 g61Var = ((lh.h) this.b).Q1;
                if (g61Var != null) {
                    arrayList18.add(a51.D(org.telegram.messenger.i0.L(12.0f)));
                    arrayList18.add(a51.h(0, 0, g61Var));
                    break;
                }
                break;
            case 18:
                ((e0) this.b).a((TL_stats.TL_statsPollStats) obj);
                break;
            case 19:
                b(obj, obj2);
                break;
            case 20:
                ph.c cVar = (ph.c) this.b;
                ArrayList arrayList19 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = cVar.P1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        t9 t9Var = cVar.Q1;
                        rv0 rv0Var = new rv0(19, cVar, tL_StarGiftAuctionAcquiredGift);
                        int i39 = ph.a.b;
                        a51 K2 = a51.K(ph.a.class);
                        K2.G = tL_StarGiftAuctionAcquiredGift;
                        K2.H = t9Var;
                        K2.D = rv0Var;
                        arrayList19.add(K2);
                    }
                    arrayList19.add(a51.D(org.telegram.messenger.i0.L(16.0f)));
                    break;
                }
                break;
            case 21:
                ((ArrayList) obj).add(((ph.e) this.b).P1);
                break;
            case 22:
                ArrayList arrayList20 = (ArrayList) obj;
                arrayList20.add(((ph.m) this.b).Q1);
                arrayList20.add(a51.D(org.telegram.messenger.i0.L(16.0f)));
                break;
            case 23:
                ((ArrayList) obj).add(a51.j(-1, ((ph.w) this.b).R1));
                break;
            case 24:
                ((ArrayList) obj).add(a51.j(-1, ((ph.d0) this.b).R1));
                break;
            case 25:
                ((ph.l1) this.b).d1((ArrayList) obj, (p51) obj2);
                break;
            case 26:
                c(obj, obj2);
                break;
            case 27:
                d(obj, obj2);
                break;
            case 28:
                e(obj, obj2);
                break;
            default:
                t3 t3Var = (t3) this.b;
                ArrayList arrayList21 = (ArrayList) obj;
                v5 v5Var = t3Var.Q1;
                if (v5Var != null) {
                    ArrayList arrayList22 = v5Var.l;
                    arrayList21.add(a51.D(org.telegram.messenger.i0.L(16.0f)));
                    if (v5Var.i && arrayList22.isEmpty()) {
                        a51 q6 = a51.q(1, 34);
                        q6.u = 1;
                        arrayList21.add(q6);
                        a51 q10 = a51.q(2, 34);
                        q10.u = 1;
                        arrayList21.add(q10);
                        a51 q11 = a51.q(3, 34);
                        q11.u = 1;
                        arrayList21.add(q11);
                        a51 q12 = a51.q(4, 34);
                        q12.u = 1;
                        arrayList21.add(q12);
                        a51 q13 = a51.q(5, 34);
                        q13.u = 1;
                        arrayList21.add(q13);
                        a51 q14 = a51.q(6, 34);
                        q14.u = 1;
                        arrayList21.add(q14);
                        a51 q15 = a51.q(7, 34);
                        q15.u = 1;
                        arrayList21.add(q15);
                        a51 q16 = a51.q(8, 34);
                        q16.u = 1;
                        arrayList21.add(q16);
                        a51 q17 = a51.q(9, 34);
                        q17.u = 1;
                        arrayList21.add(q17);
                    } else {
                        int size5 = arrayList22.size();
                        int i40 = 0;
                        int i41 = 3;
                        while (i40 < size5) {
                            Object obj8 = arrayList22.get(i40);
                            i40++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj8;
                            if (!savedStarGift.collection_id.contains(Integer.valueOf(t3Var.P1))) {
                                int i42 = ph.b1.b;
                                a51 K3 = a51.K(ph.b1.class);
                                K3.u = 1;
                                K3.z = 0;
                                K3.G = savedStarGift;
                                K3.q = true;
                                K3.f = true;
                                K3.r = false;
                                HashSet hashSet = t3Var.R1;
                                int i43 = savedStarGift.msg_id;
                                int i44 = size5;
                                K3.L(hashSet.contains(Long.valueOf(i43 == 0 ? savedStarGift.saved_id : i43)));
                                K3.u = 1;
                                arrayList21.add(K3);
                                i41--;
                                if (i41 == 0) {
                                    i41 = 3;
                                }
                                size5 = i44;
                            }
                        }
                        if (v5Var.i || !v5Var.j) {
                            while (true) {
                                if (i13 < (i41 <= 0 ? 3 : i41)) {
                                    i13++;
                                    a51 q18 = a51.q(i13, 34);
                                    q18.u = 1;
                                    arrayList21.add(q18);
                                }
                            }
                        }
                    }
                    arrayList21.add(a51.D(org.telegram.messenger.i0.L(68.0f)));
                    break;
                }
                break;
        }
    }
}
