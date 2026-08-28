package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ej0 extends FrameLayout {
    public dj0 A;
    public dj0 B;
    public bj0 C;
    public final ArrayList D;
    public final ArrayList E;
    public ca0 F;
    public final org.telegram.ui.ActionBar.b6 G;
    public int a;
    public final int b;
    public final MessageObject c;
    public final TLRPC.Reaction d;
    public final wi0 e;
    public final xi0 f;
    public final zi0 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean v;
    public boolean w;
    public boolean x;
    public cj0 y;

    public ej0(Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        this.n = new ArrayList();
        this.r = new LongSparseArray();
        this.x = true;
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = new ArrayList();
        this.b = i9;
        this.c = messageObject;
        TLRPC.Reaction reaction = reactionCount == null ? null : reactionCount.reaction;
        this.d = reaction;
        this.G = b6Var;
        this.a = reactionCount == null ? 6 : reactionCount.count;
        wi0 wi0Var = new wi0(this, context, b6Var);
        this.e = wi0Var;
        f2.m0 m0Var = new f2.m0();
        wi0Var.setLayoutManager(m0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            wi0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false)));
        }
        xi0 xi0Var = new xi0(this, i9, context, b6Var, z10);
        this.f = xi0Var;
        wi0Var.setAdapter(xi0Var);
        wi0Var.setOnItemClickListener(new j(this, 10));
        wi0Var.setOnItemLongClickListener(new wu(this, 14));
        wi0Var.j(new yi0(this, m0Var));
        wi0Var.setVerticalScrollBarEnabled(true);
        wi0Var.setAlpha(0.0f);
        addView(wi0Var, g7.e6.c(-1.0f, -1));
        zi0 zi0Var = new zi0(this, context, b6Var);
        this.h = zi0Var;
        zi0Var.f(org.telegram.ui.ActionBar.f6.G8, org.telegram.ui.ActionBar.f6.i6, -1);
        zi0Var.setIsSingleCell(true);
        zi0Var.setItemsCount(this.a);
        addView(zi0Var, g7.e6.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i9).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(hg.r0.d(reaction));
            i();
        }
        zi0Var.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public static /* synthetic */ void a(ej0 ej0Var, TLObject tLObject) {
        ArrayList arrayList = ej0Var.D;
        LongSparseArray longSparseArray = ej0Var.r;
        ArrayList arrayList2 = ej0Var.n;
        int i9 = ej0Var.b;
        if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
            ej0Var.v = false;
            return;
        }
        TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
        MessagesController.getInstance(i9).putUsers(tL_messages_messageReactionsList.users, false);
        MessagesController.getInstance(i9).putChats(tL_messages_messageReactionsList.chats, false);
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < tL_messages_messageReactionsList.reactions.size(); i10++) {
            arrayList2.add(tL_messages_messageReactionsList.reactions.get(i10));
            long peerId = MessageObject.getPeerId(tL_messages_messageReactionsList.reactions.get(i10).peer_id);
            ArrayList arrayList3 = (ArrayList) longSparseArray.get(peerId);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
            }
            int i11 = 0;
            while (i11 < arrayList3.size()) {
                if (((TLRPC.MessagePeerReaction) arrayList3.get(i11)).reaction == null) {
                    arrayList3.remove(i11);
                    i11--;
                }
                i11++;
            }
            hg.r0 d = hg.r0.d(tL_messages_messageReactionsList.reactions.get(i10).reaction);
            if (d.g != 0) {
                hashSet.add(d);
            }
            arrayList3.add(tL_messages_messageReactionsList.reactions.get(i10));
            longSparseArray.put(peerId, arrayList3);
        }
        if (ej0Var.d == null) {
            arrayList.clear();
            arrayList.addAll(hashSet);
            ej0Var.i();
        }
        Collections.sort(arrayList2, Comparator$-CC.comparingInt(new ff.d(18)));
        ej0Var.f.l();
        if (!ej0Var.w) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(gr.f);
            duration.addUpdateListener(new q60(ej0Var, 5));
            duration.addListener(new r60(ej0Var, 12));
            duration.start();
            ej0Var.j();
            ej0Var.w = true;
        }
        String str = tL_messages_messageReactionsList.next_offset;
        ej0Var.s = str;
        if (str == null) {
            ej0Var.x = false;
        }
        ej0Var.v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLoadCount() {
        return this.d == null ? 100 : 50;
    }

    public final void c() {
        this.v = true;
        int i9 = this.b;
        MessagesController messagesController = MessagesController.getInstance(i9);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getMessageReactionsList, new w1(this, 11), 64);
    }

    public final void d(org.telegram.ui.oe oeVar) {
        this.C = oeVar;
    }

    public final void e(org.telegram.ui.a7 a7Var) {
        this.y = a7Var;
    }

    public final void f(org.telegram.ui.rf rfVar) {
        this.B = rfVar;
    }

    public final void g(org.telegram.ui.qf qfVar) {
        this.A = qfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ti0 ti0Var = (ti0) it.next();
                TLObject tLObject = ti0Var.a;
                if (ti0Var.c > 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i9);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == ti0Var.b) {
                                messagePeerReaction.date = ti0Var.c;
                                messagePeerReaction.dateIsSeen = true;
                                break;
                            }
                            i9++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ti0 ti0Var2 = (ti0) it2.next();
            long j10 = ti0Var2.b;
            TLObject tLObject2 = ti0Var2.a;
            LongSparseArray longSparseArray = this.r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).id;
                }
                tL_messagePeerReaction.date = ti0Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new ff.d(17)));
        this.f.l();
        j();
    }

    public final void i() {
        int i9;
        ArrayList arrayList = this.E;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.D;
            int size = arrayList3.size();
            i9 = this.b;
            if (i10 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(k5.f(i9, ((hg.r0) arrayList3.get(i10)).g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.id));
            }
            i10++;
        }
        if (MessagesController.getInstance(i9).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        ca0 ca0Var = new ca0(this.b, getContext(), this.G, arrayList2, 1);
        this.F = ca0Var;
        ca0Var.G = false;
    }

    public final void j() {
        if (this.y != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            ca0 ca0Var = this.F;
            if (ca0Var != null) {
                dp = org.telegram.messenger.l0.C(8.0f, ca0Var.getMeasuredHeight(), dp);
            }
            wi0 wi0Var = this.e;
            if (wi0Var.getMeasuredHeight() != 0) {
                dp = Math.min(wi0Var.getMeasuredHeight(), dp);
            }
            this.y.a(this, dp);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.w || this.v) {
            return;
        }
        c();
    }

    public void setPredictiveCount(int i9) {
        this.a = i9;
        this.h.setItemsCount(i9);
    }
}
