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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b30 extends s51 {
    public final a30 P;
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
    public org.telegram.ui.o20 c0;
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

    public b30(Context context, int i9, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i9, null);
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
        a30 a30Var = new a30(this, context);
        this.P = a30Var;
        this.e = a30Var;
        gh.f1 f1Var = this.d;
        x20 x20Var = new x20(this, context);
        this.f = x20Var;
        f1Var.setAdapter(x20Var);
        if (!this.Y) {
            this.V = false;
            S();
        }
        T();
        G(0.0f);
    }

    public static /* synthetic */ int L(b30 b30Var, int i9, TLObject tLObject, TLObject tLObject2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(b30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(b30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
        int i10 = (user == null || (userStatus2 = user.status) == null) ? 0 : user.self ? i9 + 50000 : userStatus2.expires;
        int i11 = (user2 == null || (userStatus = user2.status) == null) ? 0 : user2.self ? i9 + 50000 : userStatus.expires;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 >= 0 || i11 >= 0) {
                if (i10 < 0 && i11 > 0) {
                    return -1;
                }
                if (i10 == 0 && i11 != 0) {
                    return -1;
                }
                if (i11 < 0 && i10 > 0) {
                    return 1;
                }
                if (i11 == 0 && i10 != 0) {
                    return 1;
                }
            } else {
                if (i10 > i11) {
                    return 1;
                }
                if (i10 < i11) {
                    return -1;
                }
            }
        } else {
            if (i10 > i11) {
                return 1;
            }
            if (i10 < i11) {
                return -1;
            }
        }
        return 0;
    }

    public static /* synthetic */ void M(b30 b30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int h;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        gw0 gw0Var = b30Var.s;
        a0.h hVar3 = b30Var.W;
        a0.h hVar4 = b30Var.X;
        ArrayList arrayList2 = b30Var.T;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(b30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(b30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(b30Var.currentAccount).getClientUserId();
            int i9 = 0;
            while (true) {
                if (i9 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                }
                if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i9).peer) == clientUserId) {
                    tL_channels_channelParticipants.participants.remove(i9);
                    break;
                }
                i9++;
            }
            b30Var.Q--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = b30Var.U;
                hVar = hVar4;
            } else {
                hVar = hVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) arrayList2.get(i11)).peer);
                boolean z10 = hVar4.f(peerId) != null || ((hVar2 = b30Var.a0) != null && hVar2.h(peerId) >= 0);
                TLRPC.User user = MessagesController.getInstance(b30Var.currentAccount).getUser(Long.valueOf(peerId));
                if ((user != null && user.bot) || UserObject.isDeleted(user)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i11);
                    hVar3.l(peerId);
                    i11--;
                    size2--;
                }
                i11++;
            }
            try {
                if (b30Var.S.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.kq(b30Var, ConnectionsManager.getInstance(b30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (b30Var.Q <= 0) {
            b30Var.Y = false;
            b30Var.Z = true;
            if (b30Var.m0 == 1) {
                h = 1;
            } else {
                vk0 vk0Var = b30Var.f;
                h = vk0Var != null ? vk0Var.h() - 1 : 0;
            }
            b30Var.I(h);
            if (arrayList2.isEmpty()) {
                b30Var.d0 = true;
                b30Var.R();
            }
        }
        b30Var.T();
        vk0 vk0Var2 = b30Var.f;
        if (vk0Var2 != null) {
            vk0Var2.l();
            if (gw0Var != null && b30Var.f.h() == 0 && b30Var.Z) {
                gw0Var.e(false, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.s51
    public final void D(MotionEvent motionEvent, fg.g gVar) {
        org.telegram.ui.o50 o50Var = this.c0.a;
        if (o50Var.s0) {
            return;
        }
        if (motionEvent.getX() <= gVar.getLeft() || motionEvent.getX() >= gVar.getRight() || motionEvent.getY() <= gVar.getTop() || motionEvent.getY() >= gVar.getBottom()) {
            o50Var.s1(o50Var.A1, null, gVar, false);
        } else {
            o50Var.s1(o50Var.A1, null, gVar, true);
        }
    }

    @Override // org.telegram.ui.Components.s51
    public final void F(String str) {
        a30 a30Var = this.P;
        of.v1 v1Var = a30Var.d;
        b30 b30Var = a30Var.w;
        y20 y20Var = a30Var.e;
        if (y20Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y20Var);
            a30Var.e = null;
        }
        v1Var.f(null, null);
        TLRPC.Chat chat = b30Var.R;
        gh.f1 f1Var = b30Var.d;
        v1Var.g(null, true, false, true, false, chat.id, false, 2, -1);
        if (TextUtils.isEmpty(str)) {
            a30Var.n = -1;
            return;
        }
        b30Var.s.e(true, true);
        f1Var.U1 = false;
        f1Var.V1 = 0;
        a30Var.l();
        f1Var.U1 = true;
        f1Var.V1 = 0;
        a30Var.h = true;
        int i9 = a30Var.n + 1;
        a30Var.n = i9;
        y20 y20Var2 = new y20(a30Var, str, i9, 0);
        a30Var.e = y20Var2;
        AndroidUtilities.runOnUIThread(y20Var2, 300L);
        f2.r0 adapter = f1Var.getAdapter();
        vk0 vk0Var = b30Var.e;
        if (adapter != vk0Var) {
            f1Var.setAdapter(vk0Var);
        }
    }

    @Override // org.telegram.ui.Components.s51
    public final void J() {
        this.E = org.telegram.ui.ActionBar.f6.Pg;
        this.F = org.telegram.ui.ActionBar.f6.eg;
        int i9 = org.telegram.ui.ActionBar.f6.a;
        this.G = org.telegram.ui.ActionBar.f6.fg;
        this.H = org.telegram.ui.ActionBar.f6.tg;
        this.I = org.telegram.ui.ActionBar.f6.ng;
        this.J = org.telegram.ui.ActionBar.f6.og;
        this.K = org.telegram.ui.ActionBar.f6.lg;
        this.L = org.telegram.ui.ActionBar.f6.rg;
        this.M = org.telegram.ui.ActionBar.f6.mg;
    }

    public final void R() {
        if (this.d0) {
            ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
            ArrayList arrayList2 = this.U;
            arrayList2.addAll(arrayList);
            long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                TLObject tLObject = (TLObject) arrayList2.get(i9);
                if (tLObject instanceof TLRPC.TL_contact) {
                    long j11 = ((TLRPC.TL_contact) tLObject).user_id;
                    if (j11 == j10 || this.a0.h(j11) >= 0 || this.b0.contains(Long.valueOf(j11))) {
                        arrayList2.remove(i9);
                        i9--;
                        size--;
                    }
                }
                i9++;
            }
            Collections.sort(arrayList2, new of.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
        }
    }

    public final void S() {
        a0.h hVar;
        TLRPC.Chat chat = this.R;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.S;
        if (isChannel) {
            this.Y = true;
            gw0 gw0Var = this.s;
            if (gw0Var != null) {
                gw0Var.e(true, false);
            }
            vk0 vk0Var = this.f;
            if (vk0Var != null) {
                vk0Var.l();
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
                S();
            }
            tL_channels_getParticipants.filter.q = "";
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 200;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.rc(17, this, tL_channels_getParticipants));
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
            for (int i9 = 0; i9 < size; i9++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i9);
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
                R();
            }
        }
        T();
        vk0 vk0Var2 = this.f;
        if (vk0Var2 != null) {
            vk0Var2.l();
        }
    }

    public final void T() {
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
            int i9 = this.n0;
            this.n0 = i9 + 1;
            this.e0 = i9;
        }
        if (!this.Y || this.Z) {
            ArrayList arrayList = this.U;
            if (arrayList.isEmpty()) {
                z10 = false;
            } else {
                int i10 = this.n0;
                int i11 = i10 + 1;
                this.n0 = i11;
                this.i0 = i10;
                this.j0 = i11;
                int size = arrayList.size() + i11;
                this.n0 = size;
                this.k0 = size;
            }
            ArrayList arrayList2 = this.T;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i12 = this.n0;
                    this.n0 = i12 + 1;
                    this.l0 = i12;
                }
                int i13 = this.n0;
                this.g0 = i13;
                int size2 = arrayList2.size() + i13;
                this.n0 = size2;
                this.h0 = size2;
            }
        }
        if (this.Y) {
            int i14 = this.n0;
            this.n0 = i14 + 1;
            this.m0 = i14;
        }
        int i15 = this.n0;
        this.n0 = i15 + 1;
        this.f0 = i15;
    }
}
