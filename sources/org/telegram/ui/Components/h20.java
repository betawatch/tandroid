package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h20 extends b51 {
    public final g20 K1;
    public int L1;
    public final TLRPC.Chat M1;
    public final TLRPC.ChatFull N1;
    public final ArrayList O1;
    public final ArrayList P1;
    public boolean Q1;
    public final a0.h R1;
    public final a0.h S1;
    public boolean T1;
    public boolean U1;
    public final a0.h V1;
    public final HashSet W1;
    public org.telegram.ui.h10 X1;
    public boolean Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;

    public h20(Context context, int i7, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i7, context, null);
        this.O1 = new ArrayList();
        this.P1 = new ArrayList();
        this.R1 = new a0.h();
        this.S1 = new a0.h();
        this.p0 = 75;
        this.M1 = chat;
        this.N1 = chatFull;
        this.V1 = hVar;
        this.W1 = hashSet;
        this.k1.setOnItemClickListener(new k(this, 9));
        g20 g20Var = new g20(this, context);
        this.K1 = g20Var;
        this.l1 = g20Var;
        bi.q1 q1Var = this.k1;
        d20 d20Var = new d20(this, context);
        this.m1 = d20Var;
        q1Var.setAdapter(d20Var);
        if (!this.T1) {
            this.Q1 = false;
            S0();
        }
        T0();
        M0(0.0f);
    }

    @Override // org.telegram.ui.Components.b51
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.c40 c40Var = this.X1.a;
        if (c40Var.n2) {
            return;
        }
        if (motionEvent.getX() <= iVar.getLeft() || motionEvent.getX() >= iVar.getRight() || motionEvent.getY() <= iVar.getTop() || motionEvent.getY() >= iVar.getBottom()) {
            c40Var.v1(c40Var.v3, null, iVar, false);
        } else {
            c40Var.v1(c40Var.v3, null, iVar, true);
        }
    }

    @Override // org.telegram.ui.Components.b51
    public final void L0(String str) {
        g20 g20Var = this.K1;
        jg.z1 z1Var = g20Var.d;
        h20 h20Var = g20Var.x;
        e20 e20Var = g20Var.e;
        if (e20Var != null) {
            org.telegram.messenger.g0.r(e20Var);
            g20Var.e = null;
        }
        z1Var.f(null, null);
        TLRPC.Chat chat = h20Var.M1;
        bi.q1 q1Var = h20Var.k1;
        z1Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            g20Var.n = -1;
            return;
        }
        h20Var.q1.e(true, true);
        q1Var.W1 = false;
        q1Var.X1 = 0;
        g20Var.f();
        q1Var.W1 = true;
        q1Var.X1 = 0;
        g20Var.h = true;
        int i7 = g20Var.n + 1;
        g20Var.n = i7;
        e20 e20Var2 = new e20(g20Var, str, i7, 0);
        g20Var.e = e20Var2;
        org.telegram.messenger.g0.i3(e20Var2, 300L);
        v4.g0 adapter = q1Var.getAdapter();
        oj0 oj0Var = h20Var.l1;
        if (adapter != oj0Var) {
            q1Var.setAdapter(oj0Var);
        }
    }

    @Override // org.telegram.ui.Components.b51
    public final void P0() {
        this.z1 = org.telegram.ui.ActionBar.k6.Dh;
        this.A1 = org.telegram.ui.ActionBar.k6.Sg;
        int i7 = org.telegram.ui.ActionBar.k6.a;
        this.B1 = org.telegram.ui.ActionBar.k6.Tg;
        this.C1 = org.telegram.ui.ActionBar.k6.hh;
        this.D1 = org.telegram.ui.ActionBar.k6.bh;
        this.E1 = org.telegram.ui.ActionBar.k6.ch;
        this.F1 = org.telegram.ui.ActionBar.k6.Zg;
        this.G1 = org.telegram.ui.ActionBar.k6.fh;
        this.H1 = org.telegram.ui.ActionBar.k6.ah;
    }

    public final void R0() {
        if (this.Y1) {
            ArrayList arrayList = org.telegram.messenger.g5.r(this.a).e0;
            ArrayList arrayList2 = this.P1;
            arrayList2.addAll(arrayList);
            long j3 = org.telegram.messenger.p10.i(this.a).n;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                TLObject tLObject = (TLObject) arrayList2.get(i7);
                if (tLObject instanceof TLRPC.TL_contact) {
                    long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                    if (j10 == j3 || this.V1.h(j10) >= 0 || this.W1.contains(Long.valueOf(j10))) {
                        arrayList2.remove(i7);
                        i7--;
                        size--;
                    }
                }
                i7++;
            }
            Collections.sort(arrayList2, new jg.d(org.telegram.messenger.qp.s1(this.a), ConnectionsManager.getInstance(this.a).getCurrentTime(), 2));
        }
    }

    public final void S0() {
        a0.h hVar;
        TLRPC.Chat chat = this.M1;
        boolean T = org.telegram.messenger.t3.T(chat);
        TLRPC.ChatFull chatFull = this.N1;
        if (T) {
            this.T1 = true;
            av0 av0Var = this.q1;
            if (av0Var != null) {
                av0Var.e(true, false);
            }
            oj0 oj0Var = this.m1;
            if (oj0Var != null) {
                oj0Var.f();
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(chat);
            if (chatFull != null && chatFull.participants_count <= 200) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.Q1) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                this.L1 = 2;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.Q1 = true;
                S0();
            }
            tL_channels_getParticipants.filter.q = "";
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = org.telegram.messenger.qs.e3;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.ld(16, this, tL_channels_getParticipants));
            return;
        }
        this.T1 = false;
        ArrayList arrayList = this.O1;
        arrayList.clear();
        this.P1.clear();
        a0.h hVar2 = this.R1;
        hVar2.b();
        this.S1.b();
        if (chatFull != null) {
            long j3 = org.telegram.messenger.p10.i(this.a).n;
            int size = chatFull.participants.participants.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                long j10 = chatParticipant.user_id;
                if (j10 != j3 && ((hVar = this.V1) == null || hVar.h(j10) < 0)) {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(chatParticipant.user_id));
                    if (!org.telegram.messenger.t10.x(a22) && !a22.bot) {
                        arrayList.add(chatParticipant);
                        hVar2.k(chatParticipant, chatParticipant.user_id);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.Y1 = true;
                R0();
            }
        }
        T0();
        oj0 oj0Var2 = this.m1;
        if (oj0Var2 != null) {
            oj0Var2.f();
        }
    }

    public final void T0() {
        this.Z1 = -1;
        this.b2 = -1;
        this.c2 = -1;
        this.d2 = -1;
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        this.a2 = -1;
        boolean z9 = true;
        this.i2 = 1;
        TLRPC.Chat chat = this.M1;
        if (org.telegram.messenger.t3.t0(chat) || org.telegram.messenger.t3.y(3, chat)) {
            int i7 = this.i2;
            this.i2 = i7 + 1;
            this.Z1 = i7;
        }
        if (!this.T1 || this.U1) {
            ArrayList arrayList = this.P1;
            if (arrayList.isEmpty()) {
                z9 = false;
            } else {
                int i10 = this.i2;
                int i11 = i10 + 1;
                this.i2 = i11;
                this.d2 = i10;
                this.e2 = i11;
                int size = arrayList.size() + i11;
                this.i2 = size;
                this.f2 = size;
            }
            ArrayList arrayList2 = this.O1;
            if (!arrayList2.isEmpty()) {
                if (z9) {
                    int i12 = this.i2;
                    this.i2 = i12 + 1;
                    this.g2 = i12;
                }
                int i13 = this.i2;
                this.b2 = i13;
                int size2 = arrayList2.size() + i13;
                this.i2 = size2;
                this.c2 = size2;
            }
        }
        if (this.T1) {
            int i14 = this.i2;
            this.i2 = i14 + 1;
            this.h2 = i14;
        }
        int i15 = this.i2;
        this.i2 = i15 + 1;
        this.a2 = i15;
    }
}
