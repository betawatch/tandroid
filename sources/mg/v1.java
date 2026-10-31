package mg;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.m10;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v1 extends ha {
    public final vh.d P1;
    public final t1 Q1;
    public final z3 R1;
    public final qg.c S1;
    public final Paint T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final HashSet W1;
    public final HashSet X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashMap a2;
    public final ArrayList b2;
    public final ArrayList c2;
    public final LinkedHashMap d2;
    public final t5 e2;
    public String f2;
    public ng.i g2;
    public int h2;
    public final TLRPC.Chat i2;
    public int j2;
    public q k2;
    public int l2;
    public t m2;
    public final androidx.activity.i n2;

    public v1(k2 k2Var, long j10) {
        super(k2Var, false);
        this.T1 = new Paint(1);
        this.U1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        this.W1 = new HashSet();
        this.X1 = new HashSet();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.a2 = new HashMap();
        this.b2 = new ArrayList();
        this.c2 = new ArrayList();
        this.d2 = new LinkedHashMap();
        this.h2 = org.telegram.messenger.i0.L(134.0f);
        this.n2 = new androidx.activity.i(this, 29);
        this.t0 = 0;
        this.i2 = vp.r1(this.a).L0(Long.valueOf(-j10));
        ((ViewGroup) this.l1.getParent()).removeView(this.l1);
        ViewGroup viewGroup = this.b;
        gr grVar = gr.h;
        this.e2 = new t5(viewGroup, 0L, 350L, grVar);
        qg.c cVar = new qg.c(getContext(), this.I0);
        this.S1 = cVar;
        cVar.setOnCloseClickListener(new p1(this, 7));
        cVar.setText(O0());
        cVar.setCloseImageVisible(true);
        cVar.f.c(false, 0.0f);
        t1 t1Var = new t1(this, getContext(), this.I0);
        this.Q1 = t1Var;
        int i10 = t6.h5;
        a7.i(i10, t1Var, this.I0);
        t1Var.setOnSearchTextChange(new r1(this, 0));
        this.R1 = new z3(getContext(), this.I0);
        o1();
        ViewGroup viewGroup2 = this.b;
        int i11 = this.t0;
        viewGroup2.addView(cVar, b6.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.b;
        int i12 = this.t0;
        viewGroup3.addView(t1Var, b6.f(-2.0f, -1, 55, i12, 0, i12, 0));
        m10 m10Var = new m10(getContext(), this.I0, (tk0) null);
        m10Var.setClickable(true);
        m10Var.setOrientation(1);
        m10Var.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        a7.i(i10, m10Var, this.I0);
        vh.d dVar = new vh.d(getContext(), this.I0, true);
        this.P1 = dVar;
        dVar.setOnClickListener(new q1(this, 1));
        m10Var.addView(dVar, b6.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i13 = this.t0;
        viewGroup4.addView(m10Var, b6.f(-2.0f, -1, 87, i13, 0, i13, 0));
        ng.i iVar = this.g2;
        tk0 tk0Var = this.k1;
        iVar.n = arrayList;
        iVar.f = tk0Var;
        int i14 = this.t0;
        tk0Var.setPadding(i14, 0, i14, org.telegram.messenger.i0.L(60.0f));
        this.k1.j(new ag.u(this, 6));
        this.k1.setOnItemClickListener(new l(this, 1));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(grVar);
        jVar.C = false;
        jVar.m = false;
        this.k1.setItemAnimator(jVar);
        this.k1.i(new u1(this, 0));
        n1(false, true);
        f1(1, null, true);
        f1(3, null, true);
    }

    public static /* synthetic */ void d1(v1 v1Var, boolean z10, Pair pair) {
        HashMap hashMap = v1Var.a2;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            v1Var.b2.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new lh.c(v1Var, 1));
        }
        if (v1Var.j2 == 3) {
            v1Var.n1(true, true);
            v1Var.j1(true);
        }
    }

    public static boolean g1(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!c3.i0.t(tL_help_country)) {
            return false;
        }
        String lowerCase = org.telegram.messenger.i0.N3(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || sc.e.y(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = org.telegram.messenger.i0.N3(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || sc.e.y(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        org.telegram.messenger.i0.r(this.n2);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        ng.i iVar = new ng.i(getContext(), this.I0, true);
        this.g2 = iVar;
        return iVar;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        int i10 = this.j2;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : cd.L0(2131753288, null) : cd.L0(2131753603, null) : cd.L0(2131749689, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final void R0(Canvas canvas, int i10) {
        this.l2 = i10;
        float f7 = org.telegram.messenger.i0.m;
        qg.c cVar = this.S1;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(40.0f)) / 2.0f) + f7));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Q1.setTranslationY(translationY);
        this.k1.setTranslationY((r2.getMeasuredHeight() + cVar.getMeasuredHeight()) - org.telegram.messenger.i0.L(16.0f));
        int w02 = t6.w0(t6.h5, this.I0);
        Paint paint = this.T1;
        paint.setColor(w02);
        int max = Math.max(0, i10);
        boolean z10 = max < org.telegram.messenger.i0.m;
        t5 t5Var = this.e2;
        int W1 = org.telegram.messenger.i0.W1(t5Var.d(z10), max, 0);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(this.t0, W1, this.b.getWidth() - this.t0, org.telegram.messenger.i0.L(14.0f) + this.b.getHeight());
        float L = (1.0f - t5Var.c) * org.telegram.messenger.i0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void c0(Configuration configuration) {
        m1(false, true);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        q qVar = this.k2;
        if (qVar != null) {
            qVar.run();
        }
    }

    public final void e1() {
        if (TextUtils.isEmpty(this.f2)) {
            return;
        }
        this.f2 = null;
        this.Q1.setText("");
        org.telegram.messenger.i0.r(this.n2);
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        arrayList.addAll(k0.e(this.i2.id));
        n1(false, false);
        n1(true, true);
    }

    public final void f1(int i10, String str, boolean z10) {
        TLRPC.Chat chat = this.i2;
        if (i10 == 1) {
            long j10 = chat.id;
            s1 s1Var = new s1(this, z10, 0);
            vp r12 = vp.r1(d20.s0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.s0);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = r12.g1(j10);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new ag.k0(4, r12, s1Var));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            s1 s1Var2 = new s1(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(d20.s0);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = cd.D0().B != null ? cd.D0().B.c() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new ag.c(s1Var2, 8));
            return;
        }
        long j11 = chat.id;
        r1 r1Var = new r1(this, 1);
        vp r13 = vp.r1(d20.s0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(d20.s0);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new x(r13, j11, r1Var, 0));
    }

    public final void h1(int i10, List list) {
        this.j2 = i10;
        this.f2 = null;
        HashSet hashSet = this.X1;
        hashSet.clear();
        HashSet hashSet2 = this.W1;
        hashSet2.clear();
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.d2;
        linkedHashMap.clear();
        if (i10 == 1) {
            arrayList.addAll(this.Z1);
        } else if (i10 == 2) {
            arrayList.addAll(k0.e(this.i2.id));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                long j10 = tLObject instanceof TLRPC.TL_inputPeerChat ? -((TLRPC.TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j10 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        t1 t1Var = this.Q1;
        t1Var.setText("");
        t1Var.d.b(false);
        t1Var.b(false, hashSet2, new p1(this, 4), this.c2);
        o1();
        n1(false, true);
        this.S1.setText(O0());
        l1(false);
        j1(false);
    }

    public final void i1(boolean z10) {
        HashSet hashSet = this.W1;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.j2;
            LinkedHashMap linkedHashMap = this.d2;
            if (i10 == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(user);
                        }
                    }
                }
                t tVar = this.m2;
                if (tVar != null) {
                    tVar.c.i1.E(0);
                    w0 w0Var = tVar.a;
                    ArrayList arrayList2 = w0Var.V1;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = og.e.w;
                        w0Var.a2 = 0;
                    } else {
                        int i12 = og.e.w;
                        w0Var.a2 = 1;
                    }
                    w0Var.f2 = 0;
                    w0Var.k1(false, true);
                    w0Var.j1(true);
                    w0Var.b1();
                    return;
                }
                return;
            }
            if (i10 == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (TLObject tLObject2 : linkedHashMap.values()) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (hashSet.contains(Long.valueOf(-chat.id))) {
                            arrayList3.add(chat);
                        }
                    }
                }
                t tVar2 = this.m2;
                if (tVar2 != null) {
                    v vVar = tVar2.c;
                    vVar.i1.E(0);
                    w0 w0Var2 = tVar2.a;
                    boolean z11 = !vVar.d;
                    ArrayList arrayList4 = w0Var2.U1;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    w0Var2.k1(z11, true);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.c2;
            int size = arrayList6.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList6.get(i13);
                i13++;
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                    arrayList5.add(tL_help_country);
                }
            }
            t tVar3 = this.m2;
            if (tVar3 != null) {
                tVar3.c.i1.E(0);
                w0 w0Var3 = tVar3.a;
                ArrayList arrayList7 = w0Var3.W1;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                w0Var3.k1(false, true);
            }
        }
    }

    public final void j1(boolean z10) {
        tk0 tk0Var = this.k1;
        if (!z10) {
            tk0Var.v0(0);
            return;
        }
        ci.p pVar = new ci.p(getContext(), 2, 0.6f);
        pVar.a = 1;
        pVar.p = org.telegram.messenger.i0.L(38.0f);
        tk0Var.getLayoutManager().w0(pVar);
    }

    public final void k1() {
        int i10 = this.j2;
        String G = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : cd.G((int) vp.r1(d20.s0).p0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]) : cd.G((int) k0.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]) : cd.L0(2131753272, null);
        t tVar = this.m2;
        if (tVar != null) {
            new cc(tVar.c.c, tVar.b).Q(R.raw.chats_infotip, 36, G).k(true);
        }
    }

    public final void l1(boolean z10) {
        vh.d dVar = this.P1;
        dVar.setShowZero(false);
        int i10 = this.j2;
        dVar.i(i10 != 1 ? (i10 == 2 || i10 == 3) ? cd.L0(2131745963, null) : "" : cd.L0(2131753289, null), z10, true);
        HashSet hashSet = this.W1;
        dVar.c(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void m1(boolean z10, boolean z11) {
        int i10;
        ng.i iVar;
        ArrayList arrayList = this.U1;
        arrayList.clear();
        ArrayList arrayList2 = this.V1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.j2 == 1) {
            String L0 = cd.L0(2131749561, null);
            ng.h hVar = new ng.h(9, false);
            hVar.i = 1;
            hVar.j = R.drawable.menu_random;
            hVar.g = L0;
            arrayList2.add(hVar);
        }
        ng.h hVar2 = new ng.h(10, false);
        z3 z3Var = this.R1;
        hVar2.q = z3Var;
        arrayList2.add(hVar2);
        int i11 = this.j2;
        HashSet hashSet = this.W1;
        if (i11 == 3) {
            ArrayList arrayList3 = this.b2;
            int size = arrayList3.size();
            i10 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.a2.get(str)) {
                    if (TextUtils.isEmpty(this.f2) || g1(tL_help_country, org.telegram.messenger.i0.N3(this.f2).toLowerCase())) {
                        i10 += org.telegram.messenger.i0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        ng.h hVar3 = new ng.h(6, true);
                        hVar3.f = tL_help_country;
                        hVar3.k = contains;
                        arrayList4.add(hVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int L = org.telegram.messenger.i0.L(32.0f) + i10;
                    String upperCase = str.toUpperCase();
                    ng.h hVar4 = new ng.h(7, false);
                    hVar4.g = upperCase;
                    arrayList2.add(hVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = L;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.Y1;
        int size2 = arrayList6.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList6.get(i13);
            i13++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += org.telegram.messenger.i0.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(o5.n(inputPeer)));
            ng.h hVar5 = new ng.h(3, true);
            hVar5.d = inputPeer;
            hVar5.c = null;
            hVar5.e = null;
            hVar5.k = contains2;
            arrayList2.add(hVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ng.h(5, false));
            i10 += org.telegram.messenger.i0.L(150.0f);
        }
        int i14 = 0;
        int max = Math.max(0, ((int) (org.telegram.messenger.i0.q.y * 0.6f)) - i10);
        ng.h hVar6 = new ng.h(-1, false);
        hVar6.l = max;
        arrayList2.add(hVar6);
        if (hashSet.size() > 0 && this.j2 != 3) {
            z3Var.a(cd.L0(2131743656, null), new q1(this, i14));
        } else if (z10) {
            z3Var.setRightText(null);
        } else {
            y3 y3Var = z3Var.b;
            y3Var.c(null, false, true);
            y3Var.setOnClickListener(null);
            y3Var.setVisibility(0);
        }
        if (!z11 || (iVar = this.g2) == null) {
            return;
        }
        if (z10) {
            iVar.E(arrayList, arrayList2);
        } else {
            iVar.f();
        }
    }

    public final void n1(boolean z10, boolean z11) {
        m1(z10, z11);
        int i10 = 0;
        while (true) {
            tk0 tk0Var = this.k1;
            if (i10 >= tk0Var.getChildCount()) {
                l1(z10);
                return;
            }
            View childAt = tk0Var.getChildAt(i10);
            if (childAt instanceof qg.k) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.V1;
                    if (R < arrayList.size()) {
                        ng.h hVar = (ng.h) arrayList.get(R);
                        qg.k kVar = (qg.k) childAt;
                        kVar.c(hVar.k, z10);
                        TLRPC.Chat chat = hVar.e;
                        if (chat != null) {
                            kVar.i(z10, this.g2.F(chat) > 200 ? 0.3f : 1.0f);
                        } else {
                            kVar.i(z10, 1.0f);
                        }
                    }
                }
                i10++;
            }
            if (childAt instanceof qg.b) {
                ((qg.b) childAt).c(this.W1.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i10++;
        }
    }

    public final void o1() {
        String H;
        int i10 = this.j2;
        z3 z3Var = this.R1;
        if (i10 == 1) {
            TLRPC.Chat chat = this.i2;
            H = cd.H(',', w3.V(chat) ? "Subscribers" : "Members", Math.max(0, this.g2.F(chat) - 1));
            z3Var.setLayerHeight(32);
        } else if (i10 == 2) {
            H = cd.G((int) k0.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
            z3Var.setLayerHeight(32);
        } else if (i10 != 3) {
            H = "";
        } else {
            H = cd.G((int) vp.r1(d20.s0).p0, "BoostingSelectUpToCountriesPlural", new Object[0]);
            z3Var.setLayerHeight(1);
        }
        z3Var.setText(H);
    }
}
