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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u30 extends q61 {
    public final t30 Q;
    public int R;
    public final TLRPC.Chat S;
    public final TLRPC.ChatFull T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final a0.h X;
    public final a0.h Y;
    public boolean Z;
    public boolean a0;
    public final a0.h b0;
    public final HashSet c0;
    public org.telegram.ui.g30 d0;
    public boolean e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;

    public u30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i10, null);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.X = new a0.h();
        this.Y = new a0.h();
        setDimBehindAlpha(75);
        this.S = chat;
        this.T = chatFull;
        this.b0 = hVar;
        this.c0 = hashSet;
        this.d.setOnItemClickListener(new k(this, 9));
        t30 t30Var = new t30(this, context);
        this.Q = t30Var;
        this.e = t30Var;
        lh.e1 e1Var = this.d;
        q30 q30Var = new q30(this, context);
        this.f = q30Var;
        e1Var.setAdapter(q30Var);
        if (!this.Z) {
            this.W = false;
            T();
        }
        U();
        G(0.0f);
    }

    public static /* synthetic */ int M(u30 u30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(u30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(u30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static /* synthetic */ void N(u30 u30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int h;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        zw0 zw0Var = u30Var.s;
        a0.h hVar3 = u30Var.X;
        a0.h hVar4 = u30Var.Y;
        ArrayList arrayList2 = u30Var.U;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(u30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(u30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(u30Var.currentAccount).getClientUserId();
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
            u30Var.R--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = u30Var.V;
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
                boolean z4 = hVar4.f(peerId) != null || ((hVar2 = u30Var.b0) != null && hVar2.h(peerId) >= 0);
                TLRPC.User user = MessagesController.getInstance(u30Var.currentAccount).getUser(Long.valueOf(peerId));
                if ((user != null && user.bot) || UserObject.isDeleted(user)) {
                    z4 = true;
                }
                if (z4) {
                    arrayList2.remove(i12);
                    hVar3.l(peerId);
                    i12--;
                    size2--;
                }
                i12++;
            }
            try {
                if (u30Var.T.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.uq(u30Var, ConnectionsManager.getInstance(u30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (u30Var.R <= 0) {
            u30Var.Z = false;
            u30Var.a0 = true;
            if (u30Var.n0 == 1) {
                h = 1;
            } else {
                ql0 ql0Var = u30Var.f;
                h = ql0Var != null ? ql0Var.h() - 1 : 0;
            }
            u30Var.I(h);
            if (arrayList2.isEmpty()) {
                u30Var.e0 = true;
                u30Var.S();
            }
        }
        u30Var.U();
        ql0 ql0Var2 = u30Var.f;
        if (ql0Var2 != null) {
            ql0Var2.l();
            if (zw0Var != null && u30Var.f.h() == 0 && u30Var.a0) {
                zw0Var.e(false, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.q61
    public final void D(MotionEvent motionEvent, kg.f fVar) {
        org.telegram.ui.e60 e60Var = this.d0.a;
        if (e60Var.t0) {
            return;
        }
        if (motionEvent.getX() <= fVar.getLeft() || motionEvent.getX() >= fVar.getRight() || motionEvent.getY() <= fVar.getTop() || motionEvent.getY() >= fVar.getBottom()) {
            e60Var.s1(e60Var.B1, null, fVar, false);
        } else {
            e60Var.s1(e60Var.B1, null, fVar, true);
        }
    }

    @Override // org.telegram.ui.Components.q61
    public final void F(String str) {
        t30 t30Var = this.Q;
        tf.j1 j1Var = t30Var.d;
        u30 u30Var = t30Var.w;
        r30 r30Var = t30Var.e;
        if (r30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r30Var);
            t30Var.e = null;
        }
        j1Var.f(null, null);
        TLRPC.Chat chat = u30Var.S;
        lh.e1 e1Var = u30Var.d;
        j1Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            t30Var.n = -1;
            return;
        }
        u30Var.s.e(true, true);
        e1Var.V1 = false;
        e1Var.W1 = 0;
        t30Var.l();
        e1Var.V1 = true;
        e1Var.W1 = 0;
        t30Var.h = true;
        int i10 = t30Var.n + 1;
        t30Var.n = i10;
        r30 r30Var2 = new r30(t30Var, str, i10, 0);
        t30Var.e = r30Var2;
        AndroidUtilities.runOnUIThread(r30Var2, 300L);
        f2.o0 adapter = e1Var.getAdapter();
        ql0 ql0Var = u30Var.e;
        if (adapter != ql0Var) {
            e1Var.setAdapter(ql0Var);
        }
    }

    @Override // org.telegram.ui.Components.q61
    public final void J() {
        this.F = org.telegram.ui.ActionBar.j6.Pg;
        this.G = org.telegram.ui.ActionBar.j6.eg;
        int i10 = org.telegram.ui.ActionBar.j6.a;
        this.H = org.telegram.ui.ActionBar.j6.fg;
        this.I = org.telegram.ui.ActionBar.j6.tg;
        this.J = org.telegram.ui.ActionBar.j6.ng;
        this.K = org.telegram.ui.ActionBar.j6.og;
        this.L = org.telegram.ui.ActionBar.j6.lg;
        this.M = org.telegram.ui.ActionBar.j6.rg;
        this.N = org.telegram.ui.ActionBar.j6.mg;
    }

    public final void S() {
        if (this.e0) {
            ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
            ArrayList arrayList2 = this.V;
            arrayList2.addAll(arrayList);
            long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLObject tLObject = (TLObject) arrayList2.get(i10);
                if (tLObject instanceof TLRPC.TL_contact) {
                    long j11 = ((TLRPC.TL_contact) tLObject).user_id;
                    if (j11 == j10 || this.b0.h(j11) >= 0 || this.c0.contains(Long.valueOf(j11))) {
                        arrayList2.remove(i10);
                        i10--;
                        size--;
                    }
                }
                i10++;
            }
            Collections.sort(arrayList2, new p30(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 0));
        }
    }

    public final void T() {
        a0.h hVar;
        TLRPC.Chat chat = this.S;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.T;
        if (isChannel) {
            this.Z = true;
            zw0 zw0Var = this.s;
            if (zw0Var != null) {
                zw0Var.e(true, false);
            }
            ql0 ql0Var = this.f;
            if (ql0Var != null) {
                ql0Var.l();
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
            if (chatFull != null && chatFull.participants_count <= 200) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.W) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                this.R = 2;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.W = true;
                T();
            }
            tL_channels_getParticipants.filter.q = "";
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 200;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.no(10, this, tL_channels_getParticipants));
            return;
        }
        this.Z = false;
        ArrayList arrayList = this.U;
        arrayList.clear();
        this.V.clear();
        a0.h hVar2 = this.X;
        hVar2.b();
        this.Y.b();
        if (chatFull != null) {
            long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = chatFull.participants.participants.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                long j11 = chatParticipant.user_id;
                if (j11 != j10 && ((hVar = this.b0) == null || hVar.h(j11) < 0)) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                    if (!UserObject.isDeleted(user) && !user.bot) {
                        arrayList.add(chatParticipant);
                        hVar2.k(chatParticipant, chatParticipant.user_id);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.e0 = true;
                S();
            }
        }
        U();
        ql0 ql0Var2 = this.f;
        if (ql0Var2 != null) {
            ql0Var2.l();
        }
    }

    public final void U() {
        this.f0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.g0 = -1;
        boolean z4 = true;
        this.o0 = 1;
        TLRPC.Chat chat = this.S;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.o0;
            this.o0 = i10 + 1;
            this.f0 = i10;
        }
        if (!this.Z || this.a0) {
            ArrayList arrayList = this.V;
            if (arrayList.isEmpty()) {
                z4 = false;
            } else {
                int i11 = this.o0;
                int i12 = i11 + 1;
                this.o0 = i12;
                this.j0 = i11;
                this.k0 = i12;
                int size = arrayList.size() + i12;
                this.o0 = size;
                this.l0 = size;
            }
            ArrayList arrayList2 = this.U;
            if (!arrayList2.isEmpty()) {
                if (z4) {
                    int i13 = this.o0;
                    this.o0 = i13 + 1;
                    this.m0 = i13;
                }
                int i14 = this.o0;
                this.h0 = i14;
                int size2 = arrayList2.size() + i14;
                this.o0 = size2;
                this.i0 = size2;
            }
        }
        if (this.Z) {
            int i15 = this.o0;
            this.o0 = i15 + 1;
            this.n0 = i15;
        }
        int i16 = this.o0;
        this.o0 = i16 + 1;
        this.g0 = i16;
    }
}
