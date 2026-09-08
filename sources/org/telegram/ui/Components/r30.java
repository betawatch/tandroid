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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r30 extends o61 {
    public final q30 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.i a0;
    public final a0.i b0;
    public boolean c0;
    public boolean d0;
    public final a0.i e0;
    public final HashSet f0;
    public org.telegram.ui.j30 g0;
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

    public r30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.i iVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.a0 = new a0.i();
        this.b0 = new a0.i();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.e0 = iVar;
        this.f0 = hashSet;
        this.d.setOnItemClickListener(new k(this, 9));
        q30 q30Var = new q30(this, context);
        this.T = q30Var;
        this.e = q30Var;
        bi.o0 o0Var = this.d;
        n30 n30Var = new n30(this, context);
        this.f = n30Var;
        o0Var.setAdapter(n30Var);
        if (!this.c0) {
            this.Z = false;
            T();
        }
        U();
        H(0.0f);
    }

    public static /* synthetic */ int M(r30 r30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(r30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(r30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static /* synthetic */ void N(r30 r30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int h;
        a0.i iVar;
        ArrayList arrayList;
        a0.i iVar2;
        xw0 xw0Var = r30Var.s;
        a0.i iVar3 = r30Var.a0;
        a0.i iVar4 = r30Var.b0;
        ArrayList arrayList2 = r30Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(r30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(r30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(r30Var.currentAccount).getClientUserId();
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
            r30Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = r30Var.Y;
                iVar = iVar4;
            } else {
                iVar = iVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                iVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) arrayList2.get(i12)).peer);
                boolean z10 = iVar4.f(peerId) != null || ((iVar2 = r30Var.e0) != null && iVar2.h(peerId) >= 0);
                TLRPC.User user = MessagesController.getInstance(r30Var.currentAccount).getUser(Long.valueOf(peerId));
                if ((user != null && user.bot) || UserObject.isDeleted(user)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i12);
                    iVar3.l(peerId);
                    i12--;
                    size2--;
                }
                i12++;
            }
            try {
                if (r30Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.zq(r30Var, ConnectionsManager.getInstance(r30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (r30Var.U <= 0) {
            r30Var.c0 = false;
            r30Var.d0 = true;
            if (r30Var.q0 == 1) {
                h = 1;
            } else {
                kl0 kl0Var = r30Var.f;
                h = kl0Var != null ? kl0Var.h() - 1 : 0;
            }
            r30Var.J(h);
            if (arrayList2.isEmpty()) {
                r30Var.h0 = true;
                r30Var.S();
            }
        }
        r30Var.U();
        kl0 kl0Var2 = r30Var.f;
        if (kl0Var2 != null) {
            kl0Var2.l();
            if (xw0Var != null && r30Var.f.h() == 0 && r30Var.d0) {
                xw0Var.e(false, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.o61
    public final void D(MotionEvent motionEvent, di.h2 h2Var) {
        org.telegram.ui.j60 j60Var = this.g0.a;
        if (j60Var.w0) {
            return;
        }
        if (motionEvent.getX() <= h2Var.getLeft() || motionEvent.getX() >= h2Var.getRight() || motionEvent.getY() <= h2Var.getTop() || motionEvent.getY() >= h2Var.getBottom()) {
            j60Var.s1(j60Var.E1, null, h2Var, false);
        } else {
            j60Var.s1(j60Var.E1, null, h2Var, true);
        }
    }

    @Override // org.telegram.ui.Components.o61
    public final void G(String str) {
        q30 q30Var = this.T;
        hg.b2 b2Var = q30Var.d;
        r30 r30Var = q30Var.w;
        o30 o30Var = q30Var.e;
        if (o30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(o30Var);
            q30Var.e = null;
        }
        b2Var.f(null, null);
        TLRPC.Chat chat = r30Var.V;
        bi.o0 o0Var = r30Var.d;
        b2Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            q30Var.n = -1;
            return;
        }
        r30Var.s.e(true, true);
        o0Var.Y1 = false;
        o0Var.Z1 = 0;
        q30Var.l();
        o0Var.Y1 = true;
        o0Var.Z1 = 0;
        q30Var.h = true;
        int i10 = q30Var.n + 1;
        q30Var.n = i10;
        o30 o30Var2 = new o30(q30Var, str, i10, 0);
        q30Var.e = o30Var2;
        AndroidUtilities.runOnUIThread(o30Var2, 300L);
        s4.h0 adapter = o0Var.getAdapter();
        kl0 kl0Var = r30Var.e;
        if (adapter != kl0Var) {
            o0Var.setAdapter(kl0Var);
        }
    }

    @Override // org.telegram.ui.Components.o61
    public final void K() {
        this.I = org.telegram.ui.ActionBar.j6.Pg;
        this.J = org.telegram.ui.ActionBar.j6.eg;
        int i10 = org.telegram.ui.ActionBar.j6.a;
        this.K = org.telegram.ui.ActionBar.j6.fg;
        this.L = org.telegram.ui.ActionBar.j6.tg;
        this.M = org.telegram.ui.ActionBar.j6.ng;
        this.N = org.telegram.ui.ActionBar.j6.og;
        this.O = org.telegram.ui.ActionBar.j6.lg;
        this.P = org.telegram.ui.ActionBar.j6.rg;
        this.Q = org.telegram.ui.ActionBar.j6.mg;
    }

    public final void S() {
        if (this.h0) {
            ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
            ArrayList arrayList2 = this.Y;
            arrayList2.addAll(arrayList);
            long j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLObject tLObject = (TLObject) arrayList2.get(i10);
                if (tLObject instanceof TLRPC.TL_contact) {
                    long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                    if (j10 == j3 || this.e0.h(j10) >= 0 || this.f0.contains(Long.valueOf(j10))) {
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
        a0.i iVar;
        TLRPC.Chat chat = this.V;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.W;
        if (isChannel) {
            this.c0 = true;
            xw0 xw0Var = this.s;
            if (xw0Var != null) {
                xw0Var.e(true, false);
            }
            kl0 kl0Var = this.f;
            if (kl0Var != null) {
                kl0Var.l();
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.ro(10, this, tL_channels_getParticipants));
            return;
        }
        this.c0 = false;
        ArrayList arrayList = this.X;
        arrayList.clear();
        this.Y.clear();
        a0.i iVar2 = this.a0;
        iVar2.b();
        this.b0.b();
        if (chatFull != null) {
            long j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = chatFull.participants.participants.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                long j10 = chatParticipant.user_id;
                if (j10 != j3 && ((iVar = this.e0) == null || iVar.h(j10) < 0)) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                    if (!UserObject.isDeleted(user) && !user.bot) {
                        arrayList.add(chatParticipant);
                        iVar2.k(chatParticipant, chatParticipant.user_id);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.h0 = true;
                S();
            }
        }
        U();
        kl0 kl0Var2 = this.f;
        if (kl0Var2 != null) {
            kl0Var2.l();
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
