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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vh0 extends FrameLayout {
    public th0 E;
    public uh0 F;
    public uh0 G;
    public sh0 H;
    public final ArrayList I;
    public final ArrayList J;
    public o90 K;
    public final org.telegram.ui.ActionBar.e6 L;
    public int a;
    public final int b;
    public final org.telegram.messenger.gj c;
    public final TLRPC.Reaction d;
    public final nh0 e;
    public final oh0 f;
    public final qh0 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean w;
    public boolean x;
    public boolean y;

    public vh0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, org.telegram.messenger.gj gjVar, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        this.n = new ArrayList();
        this.r = new LongSparseArray();
        this.y = true;
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        this.J = new ArrayList();
        this.b = i7;
        this.c = gjVar;
        TLRPC.Reaction reaction = reactionCount == null ? null : reactionCount.reaction;
        this.d = reaction;
        this.L = e6Var;
        this.a = reactionCount == null ? 6 : reactionCount.count;
        nh0 nh0Var = new nh0(this, context, e6Var);
        this.e = nh0Var;
        v4.b0 b0Var = new v4.b0();
        nh0Var.setLayoutManager(b0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            nh0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i6, false)));
        }
        oh0 oh0Var = new oh0(this, i7, context, e6Var, z10);
        this.f = oh0Var;
        nh0Var.setAdapter(oh0Var);
        nh0Var.setOnItemClickListener(new j(this, 10));
        nh0Var.setOnItemLongClickListener(new gx(this, 15));
        nh0Var.j(new ph0(this, b0Var));
        nh0Var.setVerticalScrollBarEnabled(true);
        nh0Var.setAlpha(0.0f);
        addView(nh0Var, c8.ja.c(-1.0f, -1));
        qh0 qh0Var = new qh0(this, context, e6Var);
        this.h = qh0Var;
        qh0Var.e(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.i6, -1);
        qh0Var.setIsSingleCell(true);
        qh0Var.setItemsCount(this.a);
        addView(qh0Var, c8.ja.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !org.telegram.messenger.np.s1(i7).D3()) {
            arrayList.clear();
            arrayList.add(ch.p0.d(reaction));
            i();
        }
        qh0Var.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public static /* synthetic */ void a(vh0 vh0Var, TLObject tLObject) {
        ArrayList arrayList = vh0Var.I;
        LongSparseArray longSparseArray = vh0Var.r;
        ArrayList arrayList2 = vh0Var.n;
        int i7 = vh0Var.b;
        if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
            vh0Var.w = false;
            return;
        }
        TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
        org.telegram.messenger.np.s1(i7).Y3(tL_messages_messageReactionsList.users, false);
        org.telegram.messenger.np.s1(i7).S3(tL_messages_messageReactionsList.chats, false);
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < tL_messages_messageReactionsList.reactions.size(); i10++) {
            arrayList2.add(tL_messages_messageReactionsList.reactions.get(i10));
            long B1 = org.telegram.messenger.gj.B1(tL_messages_messageReactionsList.reactions.get(i10).peer_id);
            ArrayList arrayList3 = (ArrayList) longSparseArray.get(B1);
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
            ch.p0 d = ch.p0.d(tL_messages_messageReactionsList.reactions.get(i10).reaction);
            if (d.g != 0) {
                hashSet.add(d);
            }
            arrayList3.add(tL_messages_messageReactionsList.reactions.get(i10));
            longSparseArray.put(B1, arrayList3);
        }
        if (vh0Var.d == null) {
            arrayList.clear();
            arrayList.addAll(hashSet);
            vh0Var.i();
        }
        Collections.sort(arrayList2, Comparator$-CC.comparingInt(new bg.d(21)));
        vh0Var.f.f();
        if (!vh0Var.x) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(er.f);
            duration.addUpdateListener(new f60(vh0Var, 4));
            duration.addListener(new h60(vh0Var, 12));
            duration.start();
            vh0Var.j();
            vh0Var.x = true;
        }
        String str = tL_messages_messageReactionsList.next_offset;
        vh0Var.s = str;
        if (str == null) {
            vh0Var.y = false;
        }
        vh0Var.w = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLoadCount() {
        return this.d == null ? 100 : 50;
    }

    public final void c() {
        this.w = true;
        int i7 = this.b;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.gj gjVar = this.c;
        tL_messages_getMessageReactionsList.peer = s12.j1(org.telegram.messenger.gj.B0(gjVar.k));
        tL_messages_getMessageReactionsList.id = gjVar.e1();
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
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new v1(this, 10), 64);
    }

    public final void d(org.telegram.ui.ce ceVar) {
        this.H = ceVar;
    }

    public final void e(org.telegram.ui.a7 a7Var) {
        this.E = a7Var;
    }

    public final void f(org.telegram.ui.hf hfVar) {
        this.G = hfVar;
    }

    public final void g(org.telegram.ui.gf gfVar) {
        this.F = gfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kh0 kh0Var = (kh0) it.next();
                TLObject tLObject = kh0Var.a;
                if (kh0Var.c > 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i7);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && org.telegram.messenger.gj.B1(messagePeerReaction.peer_id) == kh0Var.b) {
                                messagePeerReaction.date = kh0Var.c;
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
            kh0 kh0Var2 = (kh0) it2.next();
            long j3 = kh0Var2.b;
            TLObject tLObject2 = kh0Var2.a;
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
                tL_messagePeerReaction.date = kh0Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(org.telegram.messenger.gj.B1(tL_messagePeerReaction.peer_id), arrayList3);
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
        ArrayList arrayList = this.J;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.I;
            int size = arrayList3.size();
            i7 = this.b;
            if (i10 >= size) {
                break;
            }
            TLRPC.InputStickerSet i12 = org.telegram.messenger.gj.i1(g5.e(i7, ((ch.p0) arrayList3.get(i10)).g));
            if (i12 != null && !hashSet.contains(Long.valueOf(i12.id))) {
                arrayList2.add(i12);
                hashSet.add(Long.valueOf(i12.id));
            }
            i10++;
        }
        if (org.telegram.messenger.np.s1(i7).D3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        o90 o90Var = new o90(this.b, 1, getContext(), arrayList2, this.L);
        this.K = o90Var;
        o90Var.L = false;
    }

    public final void j() {
        if (this.E != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int L = org.telegram.messenger.g0.L(size * 50);
            o90 o90Var = this.K;
            if (o90Var != null) {
                L = org.telegram.messenger.k5.C(8.0f, o90Var.getMeasuredHeight(), L);
            }
            nh0 nh0Var = this.e;
            if (nh0Var.getMeasuredHeight() != 0) {
                L = Math.min(nh0Var.getMeasuredHeight(), L);
            }
            this.E.b(this, L);
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
