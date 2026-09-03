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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yj0 extends FrameLayout {
    public xj0 B;
    public xj0 C;
    public vj0 D;
    public final ArrayList E;
    public final ArrayList F;
    public wa0 G;
    public final org.telegram.ui.ActionBar.f6 H;
    public int a;
    public final int b;
    public final MessageObject c;
    public final TLRPC.Reaction d;
    public final qj0 e;
    public final rj0 f;
    public final tj0 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean v;
    public boolean w;
    public boolean x;
    public wj0 y;

    public yj0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z4) {
        super(context);
        this.n = new ArrayList();
        this.r = new LongSparseArray();
        this.x = true;
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = new ArrayList();
        this.b = i10;
        this.c = messageObject;
        TLRPC.Reaction reaction = reactionCount == null ? null : reactionCount.reaction;
        this.d = reaction;
        this.H = f6Var;
        this.a = reactionCount == null ? 6 : reactionCount.count;
        qj0 qj0Var = new qj0(this, context, f6Var);
        this.e = qj0Var;
        f2.i0 i0Var = new f2.i0();
        qj0Var.setLayoutManager(i0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            qj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false)));
        }
        rj0 rj0Var = new rj0(this, i10, context, f6Var, z4);
        this.f = rj0Var;
        qj0Var.setAdapter(rj0Var);
        qj0Var.setOnItemClickListener(new k(this, 10));
        qj0Var.setOnItemLongClickListener(new ev(this, 14));
        qj0Var.j(new sj0(this, i0Var));
        qj0Var.setVerticalScrollBarEnabled(true);
        qj0Var.setAlpha(0.0f);
        addView(qj0Var, k7.b6.c(-1.0f, -1));
        tj0 tj0Var = new tj0(this, context, f6Var);
        this.h = tj0Var;
        tj0Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.i6, -1);
        tj0Var.setIsSingleCell(true);
        tj0Var.setItemsCount(this.a);
        addView(tj0Var, k7.b6.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(mg.q0.d(reaction));
            i();
        }
        tj0Var.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public static /* synthetic */ void a(yj0 yj0Var, TLObject tLObject) {
        ArrayList arrayList = yj0Var.E;
        LongSparseArray longSparseArray = yj0Var.r;
        ArrayList arrayList2 = yj0Var.n;
        int i10 = yj0Var.b;
        if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
            yj0Var.v = false;
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
            mg.q0 d = mg.q0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
            if (d.g != 0) {
                hashSet.add(d);
            }
            arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
            longSparseArray.put(peerId, arrayList3);
        }
        if (yj0Var.d == null) {
            arrayList.clear();
            arrayList.addAll(hashSet);
            yj0Var.i();
        }
        Collections.sort(arrayList2, Comparator$-CC.comparingInt(new kf.d(18)));
        yj0Var.f.l();
        if (!yj0Var.w) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(mr.f);
            duration.addUpdateListener(new j70(yj0Var, 5));
            duration.addListener(new od0(yj0Var, 5));
            duration.start();
            yj0Var.j();
            yj0Var.w = true;
        }
        String str = tL_messages_messageReactionsList.next_offset;
        yj0Var.s = str;
        if (str == null) {
            yj0Var.x = false;
        }
        yj0Var.v = false;
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 11), 64);
    }

    public final void d(org.telegram.ui.ve veVar) {
        this.D = veVar;
    }

    public final void e(org.telegram.ui.f7 f7Var) {
        this.y = f7Var;
    }

    public final void f(org.telegram.ui.xf xfVar) {
        this.C = xfVar;
    }

    public final void g(org.telegram.ui.wf wfVar) {
        this.B = wfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nj0 nj0Var = (nj0) it.next();
                TLObject tLObject = nj0Var.a;
                if (nj0Var.c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == nj0Var.b) {
                                messagePeerReaction.date = nj0Var.c;
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
            nj0 nj0Var2 = (nj0) it2.next();
            long j10 = nj0Var2.b;
            TLObject tLObject2 = nj0Var2.a;
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
                tL_messagePeerReaction.date = nj0Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new kf.d(17)));
        this.f.l();
        j();
    }

    public final void i() {
        int i10;
        ArrayList arrayList = this.F;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (true) {
            ArrayList arrayList3 = this.E;
            int size = arrayList3.size();
            i10 = this.b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(l5.f(i10, ((mg.q0) arrayList3.get(i11)).g));
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
        wa0 wa0Var = new wa0(this.b, getContext(), this.H, arrayList2, 1);
        this.G = wa0Var;
        wa0Var.H = false;
    }

    public final void j() {
        if (this.y != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            wa0 wa0Var = this.G;
            if (wa0Var != null) {
                dp = org.telegram.messenger.y3.C(8.0f, wa0Var.getMeasuredHeight(), dp);
            }
            qj0 qj0Var = this.e;
            if (qj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(qj0Var.getMeasuredHeight(), dp);
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
