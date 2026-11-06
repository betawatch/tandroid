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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class rh0 extends FrameLayout {
    public ph0 D;
    public qh0 E;
    public qh0 F;
    public oh0 G;
    public final ArrayList H;
    public final ArrayList I;
    public l90 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public int a;
    public final int b;
    public final org.telegram.messenger.ij c;
    public final TLRPC.Reaction d;
    public final jh0 e;
    public final kh0 f;
    public final mh0 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean w;
    public boolean x;
    public boolean y;

    public rh0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7, org.telegram.messenger.ij ijVar, TLRPC.ReactionCount reactionCount, boolean z9) {
        super(context);
        this.n = new ArrayList();
        this.r = new LongSparseArray();
        this.y = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.b = i7;
        this.c = ijVar;
        TLRPC.Reaction reaction = reactionCount == null ? null : reactionCount.reaction;
        this.d = reaction;
        this.K = f6Var;
        this.a = reactionCount == null ? 6 : reactionCount.count;
        jh0 jh0Var = new jh0(this, context, f6Var);
        this.e = jh0Var;
        v4.b0 b0Var = new v4.b0();
        jh0Var.setLayoutManager(b0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            jh0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false)));
        }
        kh0 kh0Var = new kh0(this, i7, context, f6Var, z9);
        this.f = kh0Var;
        jh0Var.setAdapter(kh0Var);
        jh0Var.setOnItemClickListener(new k(this, 10));
        jh0Var.setOnItemLongClickListener(new ax(this, 15));
        jh0Var.j(new lh0(this, b0Var));
        jh0Var.setVerticalScrollBarEnabled(true);
        jh0Var.setAlpha(0.0f);
        addView(jh0Var, c8.ha.c(-1.0f, -1));
        mh0 mh0Var = new mh0(this, context, f6Var);
        this.h = mh0Var;
        mh0Var.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.i6, -1);
        mh0Var.setIsSingleCell(true);
        mh0Var.setItemsCount(this.a);
        addView(mh0Var, c8.ha.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !org.telegram.messenger.qp.s1(i7).D3()) {
            arrayList.clear();
            arrayList.add(ch.o0.d(reaction));
            i();
        }
        mh0Var.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public static /* synthetic */ void a(rh0 rh0Var, TLObject tLObject) {
        ArrayList arrayList = rh0Var.H;
        LongSparseArray longSparseArray = rh0Var.r;
        ArrayList arrayList2 = rh0Var.n;
        int i7 = rh0Var.b;
        if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
            rh0Var.w = false;
            return;
        }
        TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
        org.telegram.messenger.qp.s1(i7).Y3(tL_messages_messageReactionsList.users, false);
        org.telegram.messenger.qp.s1(i7).S3(tL_messages_messageReactionsList.chats, false);
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < tL_messages_messageReactionsList.reactions.size(); i10++) {
            arrayList2.add(tL_messages_messageReactionsList.reactions.get(i10));
            long C1 = org.telegram.messenger.ij.C1(tL_messages_messageReactionsList.reactions.get(i10).peer_id);
            ArrayList arrayList3 = (ArrayList) longSparseArray.get(C1);
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
            ch.o0 d = ch.o0.d(tL_messages_messageReactionsList.reactions.get(i10).reaction);
            if (d.g != 0) {
                hashSet.add(d);
            }
            arrayList3.add(tL_messages_messageReactionsList.reactions.get(i10));
            longSparseArray.put(C1, arrayList3);
        }
        if (rh0Var.d == null) {
            arrayList.clear();
            arrayList.addAll(hashSet);
            rh0Var.i();
        }
        Collections.sort(arrayList2, Comparator$-CC.comparingInt(new bg.d(21)));
        rh0Var.f.f();
        if (!rh0Var.x) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(xq.f);
            duration.addUpdateListener(new c60(rh0Var, 4));
            duration.addListener(new e60(rh0Var, 12));
            duration.start();
            rh0Var.j();
            rh0Var.x = true;
        }
        String str = tL_messages_messageReactionsList.next_offset;
        rh0Var.s = str;
        if (str == null) {
            rh0Var.y = false;
        }
        rh0Var.w = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLoadCount() {
        return this.d == null ? 100 : 50;
    }

    public final void c() {
        this.w = true;
        int i7 = this.b;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.ij ijVar = this.c;
        tL_messages_getMessageReactionsList.peer = s12.j1(org.telegram.messenger.ij.B0(ijVar.k));
        tL_messages_getMessageReactionsList.id = ijVar.f1();
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
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 10), 64);
    }

    public final void d(org.telegram.ui.fe feVar) {
        this.G = feVar;
    }

    public final void e(org.telegram.ui.a7 a7Var) {
        this.D = a7Var;
    }

    public final void f(org.telegram.ui.kf kfVar) {
        this.F = kfVar;
    }

    public final void g(org.telegram.ui.jf jfVar) {
        this.E = jfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gh0 gh0Var = (gh0) it.next();
                TLObject tLObject = gh0Var.a;
                if (gh0Var.c > 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i7);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && org.telegram.messenger.ij.C1(messagePeerReaction.peer_id) == gh0Var.b) {
                                messagePeerReaction.date = gh0Var.c;
                                messagePeerReaction.dateIsSeen = true;
                                break;
                            }
                            i7++;
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
            gh0 gh0Var2 = (gh0) it2.next();
            long j3 = gh0Var2.b;
            TLObject tLObject2 = gh0Var2.a;
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
                tL_messagePeerReaction.date = gh0Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(org.telegram.messenger.ij.C1(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(20)));
        this.f.f();
        j();
    }

    public final void i() {
        int i7;
        ArrayList arrayList = this.I;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.H;
            int size = arrayList3.size();
            i7 = this.b;
            if (i10 >= size) {
                break;
            }
            TLRPC.InputStickerSet j12 = org.telegram.messenger.ij.j1(i5.e(i7, ((ch.o0) arrayList3.get(i10)).g));
            if (j12 != null && !hashSet.contains(Long.valueOf(j12.id))) {
                arrayList2.add(j12);
                hashSet.add(Long.valueOf(j12.id));
            }
            i10++;
        }
        if (org.telegram.messenger.qp.s1(i7).D3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        l90 l90Var = new l90(this.b, 1, getContext(), arrayList2, this.K);
        this.J = l90Var;
        l90Var.K = false;
    }

    public final void j() {
        if (this.D != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int L = org.telegram.messenger.g0.L(size * 50);
            l90 l90Var = this.J;
            if (l90Var != null) {
                L = org.telegram.messenger.k5.C(8.0f, l90Var.getMeasuredHeight(), L);
            }
            jh0 jh0Var = this.e;
            if (jh0Var.getMeasuredHeight() != 0) {
                L = Math.min(jh0Var.getMeasuredHeight(), L);
            }
            this.D.b(this, L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.x || this.w) {
            return;
        }
        c();
    }

    public void setPredictiveCount(int i7) {
        this.a = i7;
        this.h.setItemsCount(i7);
    }
}
