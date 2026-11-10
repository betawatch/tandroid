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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h20 extends c51 {
    public final g20 N1;
    public int O1;
    public final TLRPC.Chat P1;
    public final TLRPC.ChatFull Q1;
    public final ArrayList R1;
    public final ArrayList S1;
    public boolean T1;
    public final a0.h U1;
    public final a0.h V1;
    public boolean W1;
    public boolean X1;
    public final a0.h Y1;
    public final HashSet Z1;
    public org.telegram.ui.l10 a2;
    public boolean b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;

    public h20(Context context, int i7, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i7, context, null);
        this.R1 = new ArrayList();
        this.S1 = new ArrayList();
        this.U1 = new a0.h();
        this.V1 = new a0.h();
        this.p0 = 75;
        this.P1 = chat;
        this.Q1 = chatFull;
        this.Y1 = hVar;
        this.Z1 = hashSet;
        this.n1.setOnItemClickListener(new j(this, 9));
        g20 g20Var = new g20(this, context);
        this.N1 = g20Var;
        this.o1 = g20Var;
        bi.q1 q1Var = this.n1;
        d20 d20Var = new d20(this, context);
        this.p1 = d20Var;
        q1Var.setAdapter(d20Var);
        if (!this.W1) {
            this.T1 = false;
            S0();
        }
        T0();
        M0(0.0f);
    }

    @Override // org.telegram.ui.Components.c51
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.f40 f40Var = this.a2.a;
        if (f40Var.q2) {
            return;
        }
        if (motionEvent.getX() <= iVar.getLeft() || motionEvent.getX() >= iVar.getRight() || motionEvent.getY() <= iVar.getTop() || motionEvent.getY() >= iVar.getBottom()) {
            f40Var.v1(f40Var.y3, null, iVar, false);
        } else {
            f40Var.v1(f40Var.y3, null, iVar, true);
        }
    }

    @Override // org.telegram.ui.Components.c51
    public final void L0(String str) {
        g20 g20Var = this.N1;
        jg.z1 z1Var = g20Var.d;
        h20 h20Var = g20Var.x;
        e20 e20Var = g20Var.e;
        if (e20Var != null) {
            org.telegram.messenger.g0.r(e20Var);
            g20Var.e = null;
        }
        z1Var.f(null, null);
        TLRPC.Chat chat = h20Var.P1;
        bi.q1 q1Var = h20Var.n1;
        z1Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            g20Var.n = -1;
            return;
        }
        h20Var.t1.e(true, true);
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
        oj0 oj0Var = h20Var.o1;
        if (adapter != oj0Var) {
            q1Var.setAdapter(oj0Var);
        }
    }

    @Override // org.telegram.ui.Components.c51
    public final void P0() {
        this.C1 = org.telegram.ui.ActionBar.m6.Dh;
        this.D1 = org.telegram.ui.ActionBar.m6.Sg;
        int i7 = org.telegram.ui.ActionBar.m6.a;
        this.E1 = org.telegram.ui.ActionBar.m6.Tg;
        this.F1 = org.telegram.ui.ActionBar.m6.hh;
        this.G1 = org.telegram.ui.ActionBar.m6.bh;
        this.H1 = org.telegram.ui.ActionBar.m6.ch;
        this.I1 = org.telegram.ui.ActionBar.m6.Zg;
        this.J1 = org.telegram.ui.ActionBar.m6.fh;
        this.K1 = org.telegram.ui.ActionBar.m6.ah;
    }

    public final void R0() {
        if (this.b2) {
            ArrayList arrayList = org.telegram.messenger.g5.r(this.a).e0;
            ArrayList arrayList2 = this.S1;
            arrayList2.addAll(arrayList);
            long j3 = org.telegram.messenger.p10.i(this.a).n;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                TLObject tLObject = (TLObject) arrayList2.get(i7);
                if (tLObject instanceof TLRPC.TL_contact) {
                    long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                    if (j10 == j3 || this.Y1.h(j10) >= 0 || this.Z1.contains(Long.valueOf(j10))) {
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
        TLRPC.Chat chat = this.P1;
        boolean T = org.telegram.messenger.t3.T(chat);
        TLRPC.ChatFull chatFull = this.Q1;
        if (T) {
            this.W1 = true;
            bv0 bv0Var = this.t1;
            if (bv0Var != null) {
                bv0Var.e(true, false);
            }
            oj0 oj0Var = this.p1;
            if (oj0Var != null) {
                oj0Var.f();
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(chat);
            if (chatFull != null && chatFull.participants_count <= 200) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.T1) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                this.O1 = 2;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.T1 = true;
                S0();
            }
            tL_channels_getParticipants.filter.q = "";
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = org.telegram.messenger.qs.e3;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.ld(16, this, tL_channels_getParticipants));
            return;
        }
        this.W1 = false;
        ArrayList arrayList = this.R1;
        arrayList.clear();
        this.S1.clear();
        a0.h hVar2 = this.U1;
        hVar2.b();
        this.V1.b();
        if (chatFull != null) {
            long j3 = org.telegram.messenger.p10.i(this.a).n;
            int size = chatFull.participants.participants.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                long j10 = chatParticipant.user_id;
                if (j10 != j3 && ((hVar = this.Y1) == null || hVar.h(j10) < 0)) {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(chatParticipant.user_id));
                    if (!org.telegram.messenger.t10.x(a22) && !a22.bot) {
                        arrayList.add(chatParticipant);
                        hVar2.k(chatParticipant, chatParticipant.user_id);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.b2 = true;
                R0();
            }
        }
        T0();
        oj0 oj0Var2 = this.p1;
        if (oj0Var2 != null) {
            oj0Var2.f();
        }
    }

    public final void T0() {
        this.c2 = -1;
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.d2 = -1;
        boolean z9 = true;
        this.l2 = 1;
        TLRPC.Chat chat = this.P1;
        if (org.telegram.messenger.t3.t0(chat) || org.telegram.messenger.t3.y(3, chat)) {
            int i7 = this.l2;
            this.l2 = i7 + 1;
            this.c2 = i7;
        }
        if (!this.W1 || this.X1) {
            ArrayList arrayList = this.S1;
            if (arrayList.isEmpty()) {
                z9 = false;
            } else {
                int i10 = this.l2;
                int i11 = i10 + 1;
                this.l2 = i11;
                this.g2 = i10;
                this.h2 = i11;
                int size = arrayList.size() + i11;
                this.l2 = size;
                this.i2 = size;
            }
            ArrayList arrayList2 = this.R1;
            if (!arrayList2.isEmpty()) {
                if (z9) {
                    int i12 = this.l2;
                    this.l2 = i12 + 1;
                    this.j2 = i12;
                }
                int i13 = this.l2;
                this.e2 = i13;
                int size2 = arrayList2.size() + i13;
                this.l2 = size2;
                this.f2 = size2;
            }
        }
        if (this.W1) {
            int i14 = this.l2;
            this.l2 = i14 + 1;
            this.k2 = i14;
        }
        int i15 = this.l2;
        this.l2 = i15 + 1;
        this.d2 = i15;
    }
}
