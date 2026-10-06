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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class v30 extends o71 {
    public final u30 T;
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

    public v30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.i iVar, HashSet hashSet) {
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
        this.d.setOnItemClickListener(new j(this, 9));
        u30 u30Var = new u30(this, context);
        this.T = u30Var;
        this.e = u30Var;
        ai.w0 w0Var = this.d;
        r30 r30Var = new r30(this, context);
        this.f = r30Var;
        w0Var.setAdapter(r30Var);
        if (!this.c0) {
            this.Z = false;
            R();
        }
        S();
        F(0.0f);
    }

    public static /* synthetic */ int K(v30 v30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(v30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(v30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static /* synthetic */ void L(v30 v30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int h;
        a0.i iVar;
        ArrayList arrayList;
        a0.i iVar2;
        ux0 ux0Var = v30Var.s;
        a0.i iVar3 = v30Var.a0;
        a0.i iVar4 = v30Var.b0;
        ArrayList arrayList2 = v30Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(v30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(v30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(v30Var.currentAccount).getClientUserId();
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
            v30Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = v30Var.Y;
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
                boolean z10 = iVar4.f(peerId) != null || ((iVar2 = v30Var.e0) != null && iVar2.h(peerId) >= 0);
                TLRPC.User user = MessagesController.getInstance(v30Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (v30Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.vq(v30Var, ConnectionsManager.getInstance(v30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (v30Var.U <= 0) {
            v30Var.c0 = false;
            v30Var.d0 = true;
            if (v30Var.q0 == 1) {
                h = 1;
            } else {
                yl0 yl0Var = v30Var.f;
                h = yl0Var != null ? yl0Var.h() - 1 : 0;
            }
            v30Var.H(h);
            if (arrayList2.isEmpty()) {
                v30Var.h0 = true;
                v30Var.Q();
            }
        }
        v30Var.S();
        yl0 yl0Var2 = v30Var.f;
        if (yl0Var2 != null) {
            yl0Var2.l();
            if (ux0Var != null && v30Var.f.h() == 0 && v30Var.d0) {
                ux0Var.e(false, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.o71
    public final void C(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.h60 h60Var = this.g0.a;
        if (h60Var.w0) {
            return;
        }
        if (motionEvent.getX() <= h2Var.getLeft() || motionEvent.getX() >= h2Var.getRight() || motionEvent.getY() <= h2Var.getTop() || motionEvent.getY() >= h2Var.getBottom()) {
            h60Var.s1(h60Var.E1, null, h2Var, false);
        } else {
            h60Var.s1(h60Var.E1, null, h2Var, true);
        }
    }

    @Override // org.telegram.ui.Components.o71
    public final void E(String str) {
        u30 u30Var = this.T;
        gg.c2 c2Var = u30Var.d;
        v30 v30Var = u30Var.w;
        s30 s30Var = u30Var.e;
        if (s30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(s30Var);
            u30Var.e = null;
        }
        c2Var.f(null, null);
        TLRPC.Chat chat = v30Var.V;
        ai.w0 w0Var = v30Var.d;
        c2Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            u30Var.n = -1;
            return;
        }
        v30Var.s.e(true, true);
        w0Var.Y1 = false;
        w0Var.Z1 = 0;
        u30Var.l();
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
        u30Var.h = true;
        int i10 = u30Var.n + 1;
        u30Var.n = i10;
        s30 s30Var2 = new s30(u30Var, str, i10, 0);
        u30Var.e = s30Var2;
        AndroidUtilities.runOnUIThread(s30Var2, 300L);
        s4.h0 adapter = w0Var.getAdapter();
        yl0 yl0Var = v30Var.e;
        if (adapter != yl0Var) {
            w0Var.setAdapter(yl0Var);
        }
    }

    @Override // org.telegram.ui.Components.o71
    public final void I() {
        this.I = org.telegram.ui.ActionBar.i6.Pg;
        this.J = org.telegram.ui.ActionBar.i6.eg;
        int i10 = org.telegram.ui.ActionBar.i6.a;
        this.K = org.telegram.ui.ActionBar.i6.fg;
        this.L = org.telegram.ui.ActionBar.i6.tg;
        this.M = org.telegram.ui.ActionBar.i6.ng;
        this.N = org.telegram.ui.ActionBar.i6.og;
        this.O = org.telegram.ui.ActionBar.i6.lg;
        this.P = org.telegram.ui.ActionBar.i6.rg;
        this.Q = org.telegram.ui.ActionBar.i6.mg;
    }

    public final void Q() {
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
            Collections.sort(arrayList2, new gg.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
        }
    }

    public final void R() {
        a0.i iVar;
        TLRPC.Chat chat = this.V;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.W;
        if (isChannel) {
            this.c0 = true;
            ux0 ux0Var = this.s;
            if (ux0Var != null) {
                ux0Var.e(true, false);
            }
            yl0 yl0Var = this.f;
            if (yl0Var != null) {
                yl0Var.l();
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
                R();
            }
            tL_channels_getParticipants.filter.q = "";
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 200;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.no(10, this, tL_channels_getParticipants));
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
                Q();
            }
        }
        S();
        yl0 yl0Var2 = this.f;
        if (yl0Var2 != null) {
            yl0Var2.l();
        }
    }

    public final void S() {
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
