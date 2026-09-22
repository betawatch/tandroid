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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ck0 extends FrameLayout {
    public bk0 E;
    public bk0 F;
    public zj0 G;
    public final ArrayList H;
    public final ArrayList I;
    public eb0 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public int a;
    public final int b;
    public final MessageObject c;
    public final TLRPC.Reaction d;
    public final uj0 e;
    public final vj0 f;
    public final xj0 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean v;
    public boolean w;
    public boolean x;
    public ak0 y;

    public ck0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        this.n = new ArrayList();
        this.r = new LongSparseArray();
        this.x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.b = i10;
        this.c = messageObject;
        TLRPC.Reaction reaction = reactionCount == null ? null : reactionCount.reaction;
        this.d = reaction;
        this.K = f6Var;
        this.a = reactionCount == null ? 6 : reactionCount.count;
        uj0 uj0Var = new uj0(this, context, f6Var);
        this.e = uj0Var;
        s4.c0 c0Var = new s4.c0();
        uj0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            uj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false)));
        }
        vj0 vj0Var = new vj0(this, i10, context, f6Var, z10);
        this.f = vj0Var;
        uj0Var.setAdapter(vj0Var);
        uj0Var.setOnItemClickListener(new j(this, 10));
        uj0Var.setOnItemLongClickListener(new mv(this, 15));
        uj0Var.j(new wj0(this, c0Var));
        uj0Var.setVerticalScrollBarEnabled(true);
        uj0Var.setAlpha(0.0f);
        addView(uj0Var, w7.y5.c(-1.0f, -1));
        xj0 xj0Var = new xj0(this, context, f6Var);
        this.h = xj0Var;
        xj0Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.i6, -1);
        xj0Var.setIsSingleCell(true);
        xj0Var.setItemsCount(this.a);
        addView(xj0Var, w7.y5.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(zg.p0.d(reaction));
            i();
        }
        xj0Var.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public static /* synthetic */ void a(ck0 ck0Var, TLObject tLObject) {
        ArrayList arrayList = ck0Var.H;
        LongSparseArray longSparseArray = ck0Var.r;
        ArrayList arrayList2 = ck0Var.n;
        int i10 = ck0Var.b;
        if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
            ck0Var.v = false;
            return;
        }
        TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
        MessagesController.getInstance(i10).putUsers(tL_messages_messageReactionsList.users, false);
        MessagesController.getInstance(i10).putChats(tL_messages_messageReactionsList.chats, false);
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < tL_messages_messageReactionsList.reactions.size(); i11++) {
            arrayList2.add(tL_messages_messageReactionsList.reactions.get(i11));
            long peerId = MessageObject.getPeerId(tL_messages_messageReactionsList.reactions.get(i11).peer_id);
            ArrayList arrayList3 = (ArrayList) longSparseArray.get(peerId);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
            }
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                if (((TLRPC.MessagePeerReaction) arrayList3.get(i12)).reaction == null) {
                    arrayList3.remove(i12);
                    i12--;
                }
                i12++;
            }
            zg.p0 d = zg.p0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
            if (d.g != 0) {
                hashSet.add(d);
            }
            arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
            longSparseArray.put(peerId, arrayList3);
        }
        if (ck0Var.d == null) {
            arrayList.clear();
            arrayList.addAll(hashSet);
            ck0Var.i();
        }
        Collections.sort(arrayList2, Comparator$-CC.comparingInt(new ai.f7(12)));
        ck0Var.f.l();
        if (!ck0Var.w) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(qr.f);
            duration.addUpdateListener(new s70(ck0Var, 5));
            duration.addListener(new gd0(ck0Var, 7));
            duration.start();
            ck0Var.j();
            ck0Var.w = true;
        }
        String str = tL_messages_messageReactionsList.next_offset;
        ck0Var.s = str;
        if (str == null) {
            ck0Var.x = false;
        }
        ck0Var.v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLoadCount() {
        return this.d == null ? 100 : 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.b;
        MessagesController messagesController = MessagesController.getInstance(i10);
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 11), 64);
    }

    public final void d(org.telegram.ui.qe qeVar) {
        this.G = qeVar;
    }

    public final void e(org.telegram.ui.b7 b7Var) {
        this.y = b7Var;
    }

    public final void f(org.telegram.ui.cg cgVar) {
        this.F = cgVar;
    }

    public final void g(org.telegram.ui.bg bgVar) {
        this.E = bgVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rj0 rj0Var = (rj0) it.next();
                TLObject tLObject = rj0Var.a;
                if (rj0Var.c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == rj0Var.b) {
                                messagePeerReaction.date = rj0Var.c;
                                messagePeerReaction.dateIsSeen = true;
                                break;
                            }
                            i10++;
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
            rj0 rj0Var2 = (rj0) it2.next();
            long j3 = rj0Var2.b;
            TLObject tLObject2 = rj0Var2.a;
            LongSparseArray longSparseArray = this.r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
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
                tL_messagePeerReaction.date = rj0Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new ai.f7(11)));
        this.f.l();
        j();
    }

    public final void i() {
        int i10;
        ArrayList arrayList = this.I;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (true) {
            ArrayList arrayList3 = this.H;
            int size = arrayList3.size();
            i10 = this.b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(p5.f(i10, ((zg.p0) arrayList3.get(i11)).g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        eb0 eb0Var = new eb0(this.b, getContext(), this.K, arrayList2, 1);
        this.J = eb0Var;
        eb0Var.K = false;
    }

    public final void j() {
        if (this.y != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            eb0 eb0Var = this.J;
            if (eb0Var != null) {
                dp = org.telegram.messenger.l0.C(8.0f, eb0Var.getMeasuredHeight(), dp);
            }
            uj0 uj0Var = this.e;
            if (uj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(uj0Var.getMeasuredHeight(), dp);
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

    public void setPredictiveCount(int i10) {
        this.a = i10;
        this.h.setItemsCount(i10);
    }
}
