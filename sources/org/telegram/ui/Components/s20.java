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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s20 extends o51 {
    public final r20 O1;
    public int P1;
    public final TLRPC.Chat Q1;
    public final TLRPC.ChatFull R1;
    public final ArrayList S1;
    public final ArrayList T1;
    public boolean U1;
    public final a0.h V1;
    public final a0.h W1;
    public boolean X1;
    public boolean Y1;
    public final a0.h Z1;
    public final HashSet a2;
    public org.telegram.ui.k10 b2;
    public boolean c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;

    public s20(Context context, int i7, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i7, context, null);
        this.S1 = new ArrayList();
        this.T1 = new ArrayList();
        this.V1 = new a0.h();
        this.W1 = new a0.h();
        this.q0 = 75;
        this.Q1 = chat;
        this.R1 = chatFull;
        this.Z1 = hVar;
        this.a2 = hashSet;
        this.o1.setOnItemClickListener(new n(this, 9));
        r20 r20Var = new r20(this, context);
        this.O1 = r20Var;
        this.p1 = r20Var;
        di.b1 b1Var = this.o1;
        o20 o20Var = new o20(this, context);
        this.q1 = o20Var;
        b1Var.setAdapter(o20Var);
        if (!this.X1) {
            this.U1 = false;
            T0();
        }
        U0();
        N0(0.0f);
    }

    @Override // org.telegram.ui.Components.o51
    public final void K0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.f40 f40Var = this.b2.a;
        if (f40Var.r2) {
            return;
        }
        if (motionEvent.getX() <= iVar.getLeft() || motionEvent.getX() >= iVar.getRight() || motionEvent.getY() <= iVar.getTop() || motionEvent.getY() >= iVar.getBottom()) {
            f40Var.w1(f40Var.D3, null, iVar, false);
        } else {
            f40Var.w1(f40Var.D3, null, iVar, true);
        }
    }

    @Override // org.telegram.ui.Components.o51
    public final void M0(String str) {
        r20 r20Var = this.O1;
        jg.z1 z1Var = r20Var.d;
        s20 s20Var = r20Var.x;
        p20 p20Var = r20Var.e;
        if (p20Var != null) {
            org.telegram.messenger.g0.r(p20Var);
            r20Var.e = null;
        }
        z1Var.f(null, null);
        TLRPC.Chat chat = s20Var.Q1;
        di.b1 b1Var = s20Var.o1;
        z1Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            r20Var.n = -1;
            return;
        }
        s20Var.u1.e(true, true);
        b1Var.X1 = false;
        b1Var.Y1 = 0;
        r20Var.f();
        b1Var.X1 = true;
        b1Var.Y1 = 0;
        r20Var.h = true;
        int i7 = r20Var.n + 1;
        r20Var.n = i7;
        p20 p20Var2 = new p20(r20Var, str, i7, 0);
        r20Var.e = p20Var2;
        org.telegram.messenger.g0.h3(p20Var2, 300L);
        v4.i0 adapter = b1Var.getAdapter();
        bk0 bk0Var = s20Var.p1;
        if (adapter != bk0Var) {
            b1Var.setAdapter(bk0Var);
        }
    }

    @Override // org.telegram.ui.Components.o51
    public final void Q0() {
        this.D1 = org.telegram.ui.ActionBar.n6.Gh;
        this.E1 = org.telegram.ui.ActionBar.n6.Vg;
        int i7 = org.telegram.ui.ActionBar.n6.a;
        this.F1 = org.telegram.ui.ActionBar.n6.Wg;
        this.G1 = org.telegram.ui.ActionBar.n6.kh;
        this.H1 = org.telegram.ui.ActionBar.n6.eh;
        this.I1 = org.telegram.ui.ActionBar.n6.fh;
        this.J1 = org.telegram.ui.ActionBar.n6.ch;
        this.K1 = org.telegram.ui.ActionBar.n6.ih;
        this.L1 = org.telegram.ui.ActionBar.n6.dh;
    }

    public final void S0() {
        if (this.c2) {
            ArrayList arrayList = org.telegram.messenger.i5.r(this.a).f0;
            ArrayList arrayList2 = this.T1;
            arrayList2.addAll(arrayList);
            long j3 = org.telegram.messenger.j10.i(this.a).n;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                TLObject tLObject = (TLObject) arrayList2.get(i7);
                if (tLObject instanceof TLRPC.TL_contact) {
                    long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                    if (j10 == j3 || this.Z1.h(j10) >= 0 || this.a2.contains(Long.valueOf(j10))) {
                        arrayList2.remove(i7);
                        i7--;
                        size--;
                    }
                }
                i7++;
            }
            Collections.sort(arrayList2, new jg.d(org.telegram.messenger.mp.u1(this.a), ConnectionsManager.getInstance(this.a).getCurrentTime(), 2));
        }
    }

    public final void T0() {
        a0.h hVar;
        TLRPC.Chat chat = this.Q1;
        boolean T = org.telegram.messenger.v3.T(chat);
        TLRPC.ChatFull chatFull = this.R1;
        if (T) {
            this.X1 = true;
            kv0 kv0Var = this.u1;
            if (kv0Var != null) {
                kv0Var.e(true, false);
            }
            bk0 bk0Var = this.q1;
            if (bk0Var != null) {
                bk0Var.f();
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = org.telegram.messenger.mp.k1(chat);
            if (chatFull != null && chatFull.participants_count <= 200) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.U1) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                this.P1 = 2;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.U1 = true;
                T0();
            }
            tL_channels_getParticipants.filter.q = "";
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = org.telegram.messenger.ks.e3;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.u7(18, this, tL_channels_getParticipants));
            return;
        }
        this.X1 = false;
        ArrayList arrayList = this.S1;
        arrayList.clear();
        this.T1.clear();
        a0.h hVar2 = this.V1;
        hVar2.b();
        this.W1.b();
        if (chatFull != null) {
            long j3 = org.telegram.messenger.j10.i(this.a).n;
            int size = chatFull.participants.participants.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                long j10 = chatParticipant.user_id;
                if (j10 != j3 && ((hVar = this.Z1) == null || hVar.h(j10) < 0)) {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(chatParticipant.user_id));
                    if (!org.telegram.messenger.o10.y(c22) && !c22.bot) {
                        arrayList.add(chatParticipant);
                        hVar2.k(chatParticipant, chatParticipant.user_id);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.c2 = true;
                S0();
            }
        }
        U0();
        bk0 bk0Var2 = this.q1;
        if (bk0Var2 != null) {
            bk0Var2.f();
        }
    }

    public final void U0() {
        this.d2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        this.e2 = -1;
        boolean z10 = true;
        this.m2 = 1;
        TLRPC.Chat chat = this.Q1;
        if (org.telegram.messenger.v3.t0(chat) || org.telegram.messenger.v3.y(3, chat)) {
            int i7 = this.m2;
            this.m2 = i7 + 1;
            this.d2 = i7;
        }
        if (!this.X1 || this.Y1) {
            ArrayList arrayList = this.T1;
            if (arrayList.isEmpty()) {
                z10 = false;
            } else {
                int i10 = this.m2;
                int i11 = i10 + 1;
                this.m2 = i11;
                this.h2 = i10;
                this.i2 = i11;
                int size = arrayList.size() + i11;
                this.m2 = size;
                this.j2 = size;
            }
            ArrayList arrayList2 = this.S1;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i12 = this.m2;
                    this.m2 = i12 + 1;
                    this.k2 = i12;
                }
                int i13 = this.m2;
                this.f2 = i13;
                int size2 = arrayList2.size() + i13;
                this.m2 = size2;
                this.g2 = size2;
            }
        }
        if (this.X1) {
            int i14 = this.m2;
            this.m2 = i14 + 1;
            this.l2 = i14;
        }
        int i15 = this.m2;
        this.m2 = i15 + 1;
        this.e2 = i15;
    }
}
