package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g30 extends u51 {
    public final f30 P;
    public int Q;
    public final TLRPC.Chat R;
    public final TLRPC.ChatFull S;
    public final ArrayList T;
    public final ArrayList U;
    public boolean V;
    public final a0.h W;
    public final a0.h X;
    public boolean Y;
    public boolean Z;
    public final a0.h a0;
    public final HashSet b0;
    public org.telegram.ui.r20 c0;
    public boolean d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;

    public g30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i10, null);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.W = new a0.h();
        this.X = new a0.h();
        setDimBehindAlpha(75);
        this.R = chat;
        this.S = chatFull;
        this.a0 = hVar;
        this.b0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        f30 f30Var = new f30(this, context);
        this.P = f30Var;
        this.e = f30Var;
        hh.f1 f1Var = this.d;
        c30 c30Var = new c30(this, context);
        this.f = c30Var;
        f1Var.setAdapter(c30Var);
        if (!this.Y) {
            this.V = false;
            T();
        }
        U();
        H(0.0f);
    }

    public static /* synthetic */ int M(g30 g30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(g30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(g30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
        int i11 = (user == null || (userStatus2 = user.status) == null) ? 0 : user.self ? i10 + 50000 : userStatus2.expires;
        int i12 = (user2 == null || (userStatus = user2.status) == null) ? 0 : user2.self ? i10 + 50000 : userStatus.expires;
        if (i11 <= 0 || i12 <= 0) {
            if (i11 >= 0 || i12 >= 0) {
                if (i11 < 0 && i12 > 0) {
                    return -1;
                }
                if (i11 == 0 && i12 != 0) {
                    return -1;
                }
                if (i12 < 0 && i11 > 0) {
                    return 1;
                }
                if (i12 == 0 && i11 != 0) {
                    return 1;
                }
            } else {
                if (i11 > i12) {
                    return 1;
                }
                if (i11 < i12) {
                    return -1;
                }
            }
        } else {
            if (i11 > i12) {
                return 1;
            }
            if (i11 < i12) {
                return -1;
            }
        }
        return 0;
    }

    public static /* synthetic */ void N(g30 g30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int h;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        iw0 iw0Var = g30Var.s;
        a0.h hVar3 = g30Var.W;
        a0.h hVar4 = g30Var.X;
        ArrayList arrayList2 = g30Var.T;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(g30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(g30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(g30Var.currentAccount).getClientUserId();
            int i10 = 0;
            while (true) {
                if (i10 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                }
                if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i10).peer) == clientUserId) {
                    tL_channels_channelParticipants.participants.remove(i10);
                    break;
                }
                i10++;
            }
            g30Var.Q--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = g30Var.U;
                hVar = hVar4;
            } else {
                hVar = hVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) arrayList2.get(i12)).peer);
                boolean z10 = hVar4.f(peerId) != null || ((hVar2 = g30Var.a0) != null && hVar2.h(peerId) >= 0);
                TLRPC.User user = MessagesController.getInstance(g30Var.currentAccount).getUser(Long.valueOf(peerId));
                if ((user != null && user.bot) || UserObject.isDeleted(user)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i12);
                    hVar3.l(peerId);
                    i12--;
                    size2--;
                }
                i12++;
            }
            try {
                if (g30Var.S.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.mq(g30Var, ConnectionsManager.getInstance(g30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        if (g30Var.Q <= 0) {
            g30Var.Y = false;
            g30Var.Z = true;
            if (g30Var.m0 == 1) {
                h = 1;
            } else {
                yk0 yk0Var = g30Var.f;
                h = yk0Var != null ? yk0Var.h() - 1 : 0;
            }
            g30Var.J(h);
            if (arrayList2.isEmpty()) {
                g30Var.d0 = true;
                g30Var.S();
            }
        }
        g30Var.U();
        yk0 yk0Var2 = g30Var.f;
        if (yk0Var2 != null) {
            yk0Var2.l();
            if (iw0Var != null && g30Var.f.h() == 0 && g30Var.Z) {
                iw0Var.e(false, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.u51
    public final void E(MotionEvent motionEvent, gg.g gVar) {
        org.telegram.ui.s50 s50Var = this.c0.a;
        if (s50Var.s0) {
            return;
        }
        if (motionEvent.getX() <= gVar.getLeft() || motionEvent.getX() >= gVar.getRight() || motionEvent.getY() <= gVar.getTop() || motionEvent.getY() >= gVar.getBottom()) {
            s50Var.s1(s50Var.A1, null, gVar, false);
        } else {
            s50Var.s1(s50Var.A1, null, gVar, true);
        }
    }

    @Override // org.telegram.ui.Components.u51
    public final void G(String str) {
        f30 f30Var = this.P;
        pf.j1 j1Var = f30Var.d;
        g30 g30Var = f30Var.w;
        d30 d30Var = f30Var.e;
        if (d30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(d30Var);
            f30Var.e = null;
        }
        j1Var.f(null, null);
        TLRPC.Chat chat = g30Var.R;
        hh.f1 f1Var = g30Var.d;
        j1Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            f30Var.n = -1;
            return;
        }
        g30Var.s.e(true, true);
        f1Var.U1 = false;
        f1Var.V1 = 0;
        f30Var.l();
        f1Var.U1 = true;
        f1Var.V1 = 0;
        f30Var.h = true;
        int i10 = f30Var.n + 1;
        f30Var.n = i10;
        d30 d30Var2 = new d30(f30Var, str, i10, 0);
        f30Var.e = d30Var2;
        AndroidUtilities.runOnUIThread(d30Var2, 300L);
        f2.q0 adapter = f1Var.getAdapter();
        yk0 yk0Var = g30Var.e;
        if (adapter != yk0Var) {
            f1Var.setAdapter(yk0Var);
        }
    }

    @Override // org.telegram.ui.Components.u51
    public final void K() {
        this.E = org.telegram.ui.ActionBar.g6.Pg;
        this.F = org.telegram.ui.ActionBar.g6.eg;
        int i10 = org.telegram.ui.ActionBar.g6.a;
        this.G = org.telegram.ui.ActionBar.g6.fg;
        this.H = org.telegram.ui.ActionBar.g6.tg;
        this.I = org.telegram.ui.ActionBar.g6.ng;
        this.J = org.telegram.ui.ActionBar.g6.og;
        this.K = org.telegram.ui.ActionBar.g6.lg;
        this.L = org.telegram.ui.ActionBar.g6.rg;
        this.M = org.telegram.ui.ActionBar.g6.mg;
    }

    public final void S() {
        if (this.d0) {
            ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
            ArrayList arrayList2 = this.U;
            arrayList2.addAll(arrayList);
            long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLObject tLObject = (TLObject) arrayList2.get(i10);
                if (tLObject instanceof TLRPC.TL_contact) {
                    long j11 = ((TLRPC.TL_contact) tLObject).user_id;
                    if (j11 == j10 || this.a0.h(j11) >= 0 || this.b0.contains(Long.valueOf(j11))) {
                        arrayList2.remove(i10);
                        i10--;
                        size--;
                    }
                }
                i10++;
            }
            Collections.sort(arrayList2, new b30(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 0));
        }
    }

    public final void T() {
        a0.h hVar;
        TLRPC.Chat chat = this.R;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.S;
        if (isChannel) {
            this.Y = true;
            iw0 iw0Var = this.s;
            if (iw0Var != null) {
                iw0Var.e(true, false);
            }
            yk0 yk0Var = this.f;
            if (yk0Var != null) {
                yk0Var.l();
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
            if (chatFull != null && chatFull.participants_count <= 200) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.V) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                this.Q = 2;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.V = true;
                T();
            }
            tL_channels_getParticipants.filter.q = "";
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 200;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.gg(14, this, tL_channels_getParticipants));
            return;
        }
        this.Y = false;
        ArrayList arrayList = this.T;
        arrayList.clear();
        this.U.clear();
        a0.h hVar2 = this.W;
        hVar2.b();
        this.X.b();
        if (chatFull != null) {
            long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = chatFull.participants.participants.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                long j11 = chatParticipant.user_id;
                if (j11 != j10 && ((hVar = this.a0) == null || hVar.h(j11) < 0)) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                    if (!UserObject.isDeleted(user) && !user.bot) {
                        arrayList.add(chatParticipant);
                        hVar2.k(chatParticipant, chatParticipant.user_id);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.d0 = true;
                S();
            }
        }
        U();
        yk0 yk0Var2 = this.f;
        if (yk0Var2 != null) {
            yk0Var2.l();
        }
    }

    public final void U() {
        this.e0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.f0 = -1;
        boolean z10 = true;
        this.n0 = 1;
        TLRPC.Chat chat = this.R;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.n0;
            this.n0 = i10 + 1;
            this.e0 = i10;
        }
        if (!this.Y || this.Z) {
            ArrayList arrayList = this.U;
            if (arrayList.isEmpty()) {
                z10 = false;
            } else {
                int i11 = this.n0;
                int i12 = i11 + 1;
                this.n0 = i12;
                this.i0 = i11;
                this.j0 = i12;
                int size = arrayList.size() + i12;
                this.n0 = size;
                this.k0 = size;
            }
            ArrayList arrayList2 = this.T;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.n0;
                    this.n0 = i13 + 1;
                    this.l0 = i13;
                }
                int i14 = this.n0;
                this.g0 = i14;
                int size2 = arrayList2.size() + i14;
                this.n0 = size2;
                this.h0 = size2;
            }
        }
        if (this.Y) {
            int i15 = this.n0;
            this.n0 = i15 + 1;
            this.m0 = i15;
        }
        int i16 = this.n0;
        this.n0 = i16 + 1;
        this.f0 = i16;
    }
}
