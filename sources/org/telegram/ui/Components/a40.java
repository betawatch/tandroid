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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class a40 extends s71 {
    public final z30 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.h a0;
    public final a0.h b0;
    public boolean c0;
    public boolean d0;
    public final a0.h e0;
    public final HashSet f0;
    public org.telegram.ui.t20 g0;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;

    public a40(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.a0 = new a0.h();
        this.b0 = new a0.h();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.e0 = hVar;
        this.f0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        z30 z30Var = new z30(this, context);
        this.T = z30Var;
        this.e = z30Var;
        ai.u1 u1Var = this.d;
        w30 w30Var = new w30(this, context);
        this.f = w30Var;
        u1Var.setAdapter(w30Var);
        if (!this.c0) {
            this.Z = false;
            T();
        }
        U();
        G(0.0f);
    }

    public static /* synthetic */ int M(a40 a40Var, int i10, TLObject tLObject, TLObject tLObject2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(a40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(a40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static /* synthetic */ void N(a40 a40Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int h;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        wx0 wx0Var = a40Var.s;
        a0.h hVar3 = a40Var.a0;
        a0.h hVar4 = a40Var.b0;
        ArrayList arrayList2 = a40Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(a40Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(a40Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(a40Var.currentAccount).getClientUserId();
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
            a40Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = a40Var.Y;
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
                boolean z10 = hVar4.f(peerId) != null || ((hVar2 = a40Var.e0) != null && hVar2.h(peerId) >= 0);
                TLRPC.User user = MessagesController.getInstance(a40Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (a40Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.mq(a40Var, ConnectionsManager.getInstance(a40Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (a40Var.U <= 0) {
            a40Var.c0 = false;
            a40Var.d0 = true;
            if (a40Var.q0 == 1) {
                h = 1;
            } else {
                lm0 lm0Var = a40Var.f;
                h = lm0Var != null ? lm0Var.h() - 1 : 0;
            }
            a40Var.J(h);
            if (arrayList2.isEmpty()) {
                a40Var.h0 = true;
                a40Var.S();
            }
        }
        a40Var.U();
        lm0 lm0Var2 = a40Var.f;
        if (lm0Var2 != null) {
            lm0Var2.l();
            if (wx0Var != null && a40Var.f.h() == 0 && a40Var.d0) {
                wx0Var.e(false, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.s71
    public final void D(MotionEvent motionEvent, ei.e2 e2Var) {
        org.telegram.ui.u50 u50Var = this.g0.a;
        if (u50Var.w0) {
            return;
        }
        if (motionEvent.getX() <= e2Var.getLeft() || motionEvent.getX() >= e2Var.getRight() || motionEvent.getY() <= e2Var.getTop() || motionEvent.getY() >= e2Var.getBottom()) {
            u50Var.s1(u50Var.E1, null, e2Var, false);
        } else {
            u50Var.s1(u50Var.E1, null, e2Var, true);
        }
    }

    @Override // org.telegram.ui.Components.s71
    public final void F(String str) {
        z30 z30Var = this.T;
        hg.a2 a2Var = z30Var.d;
        a40 a40Var = z30Var.w;
        x30 x30Var = z30Var.e;
        if (x30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x30Var);
            z30Var.e = null;
        }
        a2Var.f(null, null);
        TLRPC.Chat chat = a40Var.V;
        ai.u1 u1Var = a40Var.d;
        a2Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            z30Var.n = -1;
            return;
        }
        a40Var.s.e(true, true);
        u1Var.W1 = false;
        u1Var.X1 = 0;
        z30Var.l();
        u1Var.W1 = true;
        u1Var.X1 = 0;
        z30Var.h = true;
        int i10 = z30Var.n + 1;
        z30Var.n = i10;
        x30 x30Var2 = new x30(z30Var, str, i10, 0);
        z30Var.e = x30Var2;
        AndroidUtilities.runOnUIThread(x30Var2, 300L);
        s4.g0 adapter = u1Var.getAdapter();
        lm0 lm0Var = a40Var.e;
        if (adapter != lm0Var) {
            u1Var.setAdapter(lm0Var);
        }
    }

    @Override // org.telegram.ui.Components.s71
    public final void K() {
        this.I = org.telegram.ui.ActionBar.k6.Pg;
        this.J = org.telegram.ui.ActionBar.k6.eg;
        int i10 = org.telegram.ui.ActionBar.k6.a;
        this.K = org.telegram.ui.ActionBar.k6.fg;
        this.L = org.telegram.ui.ActionBar.k6.tg;
        this.M = org.telegram.ui.ActionBar.k6.ng;
        this.N = org.telegram.ui.ActionBar.k6.og;
        this.O = org.telegram.ui.ActionBar.k6.lg;
        this.P = org.telegram.ui.ActionBar.k6.rg;
        this.Q = org.telegram.ui.ActionBar.k6.mg;
    }

    public final void S() {
        if (this.h0) {
            ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
            ArrayList arrayList2 = this.Y;
            arrayList2.addAll(arrayList);
            long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLObject tLObject = (TLObject) arrayList2.get(i10);
                if (tLObject instanceof TLRPC.TL_contact) {
                    long j11 = ((TLRPC.TL_contact) tLObject).user_id;
                    if (j11 == j10 || this.e0.h(j11) >= 0 || this.f0.contains(Long.valueOf(j11))) {
                        arrayList2.remove(i10);
                        i10--;
                        size--;
                    }
                }
                i10++;
            }
            Collections.sort(arrayList2, new hg.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
        }
    }

    public final void T() {
        a0.h hVar;
        TLRPC.Chat chat = this.V;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.W;
        if (isChannel) {
            this.c0 = true;
            wx0 wx0Var = this.s;
            if (wx0Var != null) {
                wx0Var.e(true, false);
            }
            lm0 lm0Var = this.f;
            if (lm0Var != null) {
                lm0Var.l();
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
            if (chatFull != null && chatFull.participants_count <= 200) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.Z) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                this.U = 2;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.Z = true;
                T();
            }
            tL_channels_getParticipants.filter.q = "";
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 200;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.vc(17, this, tL_channels_getParticipants));
            return;
        }
        this.c0 = false;
        ArrayList arrayList = this.X;
        arrayList.clear();
        this.Y.clear();
        a0.h hVar2 = this.a0;
        hVar2.b();
        this.b0.b();
        if (chatFull != null) {
            long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = chatFull.participants.participants.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                long j11 = chatParticipant.user_id;
                if (j11 != j10 && ((hVar = this.e0) == null || hVar.h(j11) < 0)) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                    if (!UserObject.isDeleted(user) && !user.bot) {
                        arrayList.add(chatParticipant);
                        hVar2.k(chatParticipant, chatParticipant.user_id);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.h0 = true;
                S();
            }
        }
        U();
        lm0 lm0Var2 = this.f;
        if (lm0Var2 != null) {
            lm0Var2.l();
        }
    }

    public final void U() {
        this.i0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.j0 = -1;
        boolean z10 = true;
        this.r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.r0;
            this.r0 = i10 + 1;
            this.i0 = i10;
        }
        if (!this.c0 || this.d0) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                z10 = false;
            } else {
                int i11 = this.r0;
                int i12 = i11 + 1;
                this.r0 = i12;
                this.m0 = i11;
                this.n0 = i12;
                int size = arrayList.size() + i12;
                this.r0 = size;
                this.o0 = size;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.r0;
                    this.r0 = i13 + 1;
                    this.p0 = i13;
                }
                int i14 = this.r0;
                this.k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.r0 = size2;
                this.l0 = size2;
            }
        }
        if (this.c0) {
            int i15 = this.r0;
            this.r0 = i15 + 1;
            this.q0 = i15;
        }
        int i16 = this.r0;
        this.r0 = i16 + 1;
        this.j0 = i16;
    }
}
