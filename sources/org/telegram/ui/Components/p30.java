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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p30 extends f61 {
    public final o30 P;
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
    public org.telegram.ui.s20 c0;
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

    public p30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
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
        this.d.setOnItemClickListener(new k(this, 9));
        o30 o30Var = new o30(this, context);
        this.P = o30Var;
        this.e = o30Var;
        jh.e1 e1Var = this.d;
        l30 l30Var = new l30(this, context);
        this.f = l30Var;
        e1Var.setAdapter(l30Var);
        if (!this.Y) {
            this.V = false;
            T();
        }
        U();
        G(0.0f);
    }

    public static /* synthetic */ int L(p30 p30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(p30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(p30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static /* synthetic */ void M(p30 p30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int h;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        qw0 qw0Var = p30Var.s;
        a0.h hVar3 = p30Var.W;
        a0.h hVar4 = p30Var.X;
        ArrayList arrayList2 = p30Var.T;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(p30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(p30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(p30Var.currentAccount).getClientUserId();
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
            p30Var.Q--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = p30Var.U;
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
                boolean z10 = hVar4.f(peerId) != null || ((hVar2 = p30Var.a0) != null && hVar2.h(peerId) >= 0);
                TLRPC.User user = MessagesController.getInstance(p30Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (p30Var.S.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.mq(p30Var, ConnectionsManager.getInstance(p30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (p30Var.Q <= 0) {
            p30Var.Y = false;
            p30Var.Z = true;
            if (p30Var.m0 == 1) {
                h = 1;
            } else {
                il0 il0Var = p30Var.f;
                h = il0Var != null ? il0Var.h() - 1 : 0;
            }
            p30Var.I(h);
            if (arrayList2.isEmpty()) {
                p30Var.d0 = true;
                p30Var.S();
            }
        }
        p30Var.U();
        il0 il0Var2 = p30Var.f;
        if (il0Var2 != null) {
            il0Var2.l();
            if (qw0Var != null && p30Var.f.h() == 0 && p30Var.Z) {
                qw0Var.e(false, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final void D(MotionEvent motionEvent, ig.f fVar) {
        org.telegram.ui.r50 r50Var = this.c0.a;
        if (r50Var.s0) {
            return;
        }
        if (motionEvent.getX() <= fVar.getLeft() || motionEvent.getX() >= fVar.getRight() || motionEvent.getY() <= fVar.getTop() || motionEvent.getY() >= fVar.getBottom()) {
            r50Var.s1(r50Var.A1, null, fVar, false);
        } else {
            r50Var.s1(r50Var.A1, null, fVar, true);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final void F(String str) {
        o30 o30Var = this.P;
        rf.k1 k1Var = o30Var.d;
        p30 p30Var = o30Var.w;
        m30 m30Var = o30Var.e;
        if (m30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m30Var);
            o30Var.e = null;
        }
        k1Var.f(null, null);
        TLRPC.Chat chat = p30Var.R;
        jh.e1 e1Var = p30Var.d;
        k1Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            o30Var.n = -1;
            return;
        }
        p30Var.s.e(true, true);
        e1Var.U1 = false;
        e1Var.V1 = 0;
        o30Var.l();
        e1Var.U1 = true;
        e1Var.V1 = 0;
        o30Var.h = true;
        int i10 = o30Var.n + 1;
        o30Var.n = i10;
        m30 m30Var2 = new m30(o30Var, str, i10, 0);
        o30Var.e = m30Var2;
        AndroidUtilities.runOnUIThread(m30Var2, 300L);
        f2.p0 adapter = e1Var.getAdapter();
        il0 il0Var = p30Var.e;
        if (adapter != il0Var) {
            e1Var.setAdapter(il0Var);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final void J() {
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
            Collections.sort(arrayList2, new k30(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 0));
        }
    }

    public final void T() {
        a0.h hVar;
        TLRPC.Chat chat = this.R;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.S;
        if (isChannel) {
            this.Y = true;
            qw0 qw0Var = this.s;
            if (qw0Var != null) {
                qw0Var.e(true, false);
            }
            il0 il0Var = this.f;
            if (il0Var != null) {
                il0Var.l();
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.zg(13, this, tL_channels_getParticipants));
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
        il0 il0Var2 = this.f;
        if (il0Var2 != null) {
            il0Var2.l();
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
