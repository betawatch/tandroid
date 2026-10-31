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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vi0 extends FrameLayout {
    public ti0 D;
    public ui0 E;
    public ui0 F;
    public si0 G;
    public final ArrayList H;
    public final ArrayList I;
    public da0 J;
    public final org.telegram.ui.ActionBar.p6 K;
    public int a;
    public final int b;
    public final org.telegram.messenger.jj c;
    public final TLRPC.Reaction d;
    public final ni0 e;
    public final oi0 f;
    public final qi0 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean w;
    public boolean x;
    public boolean y;

    public vi0(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, org.telegram.messenger.jj jjVar, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        this.n = new ArrayList();
        this.r = new LongSparseArray();
        this.y = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.b = i10;
        this.c = jjVar;
        TLRPC.Reaction reaction = reactionCount == null ? null : reactionCount.reaction;
        this.d = reaction;
        this.K = p6Var;
        this.a = reactionCount == null ? 6 : reactionCount.count;
        ni0 ni0Var = new ni0(this, context, p6Var);
        this.e = ni0Var;
        s4.a0 a0Var = new s4.a0();
        ni0Var.setLayoutManager(a0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            ni0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false)));
        }
        oi0 oi0Var = new oi0(this, i10, context, p6Var, z10);
        this.f = oi0Var;
        ni0Var.setAdapter(oi0Var);
        ni0Var.setOnItemClickListener(new k(this, 10));
        ni0Var.setOnItemLongClickListener(new px(this, 15));
        ni0Var.j(new pi0(this, a0Var));
        ni0Var.setVerticalScrollBarEnabled(true);
        ni0Var.setAlpha(0.0f);
        addView(ni0Var, w7.b6.c(-1.0f, -1));
        qi0 qi0Var = new qi0(this, context, p6Var);
        this.h = qi0Var;
        qi0Var.e(org.telegram.ui.ActionBar.t6.G8, org.telegram.ui.ActionBar.t6.i6, -1);
        qi0Var.setIsSingleCell(true);
        qi0Var.setItemsCount(this.a);
        addView(qi0Var, w7.b6.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !org.telegram.messenger.vp.r1(i10).A3()) {
            arrayList.clear();
            arrayList.add(sg.o0.d(reaction));
            i();
        }
        qi0Var.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public static /* synthetic */ void a(vi0 vi0Var, TLObject tLObject) {
        ArrayList arrayList = vi0Var.H;
        LongSparseArray longSparseArray = vi0Var.r;
        ArrayList arrayList2 = vi0Var.n;
        int i10 = vi0Var.b;
        if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
            vi0Var.w = false;
            return;
        }
        TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
        org.telegram.messenger.vp.r1(i10).V3(tL_messages_messageReactionsList.users, false);
        org.telegram.messenger.vp.r1(i10).P3(tL_messages_messageReactionsList.chats, false);
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < tL_messages_messageReactionsList.reactions.size(); i11++) {
            arrayList2.add(tL_messages_messageReactionsList.reactions.get(i11));
            long C1 = org.telegram.messenger.jj.C1(tL_messages_messageReactionsList.reactions.get(i11).peer_id);
            ArrayList arrayList3 = (ArrayList) longSparseArray.get(C1);
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
            sg.o0 d = sg.o0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
            if (d.g != 0) {
                hashSet.add(d);
            }
            arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
            longSparseArray.put(C1, arrayList3);
        }
        if (vi0Var.d == null) {
            arrayList.clear();
            arrayList.addAll(hashSet);
            vi0Var.i();
        }
        int i13 = 12;
        Collections.sort(arrayList2, Comparator$-CC.comparingInt(new bi.t6(i13)));
        vi0Var.f.f();
        if (!vi0Var.x) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(gr.f);
            duration.addUpdateListener(new r60(vi0Var, 5));
            duration.addListener(new t60(vi0Var, i13));
            duration.start();
            vi0Var.j();
            vi0Var.x = true;
        }
        String str = tL_messages_messageReactionsList.next_offset;
        vi0Var.s = str;
        if (str == null) {
            vi0Var.y = false;
        }
        vi0Var.w = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLoadCount() {
        return this.d == null ? 100 : 50;
    }

    public final void c() {
        this.w = true;
        int i10 = this.b;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.jj jjVar = this.c;
        tL_messages_getMessageReactionsList.peer = r12.i1(org.telegram.messenger.jj.B0(jjVar.k));
        tL_messages_getMessageReactionsList.id = jjVar.f1();
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 10), 64);
    }

    public final void d(org.telegram.ui.re reVar) {
        this.G = reVar;
    }

    public final void e(org.telegram.ui.a7 a7Var) {
        this.D = a7Var;
    }

    public final void f(org.telegram.ui.xf xfVar) {
        this.F = xfVar;
    }

    public final void g(org.telegram.ui.wf wfVar) {
        this.E = wfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ki0 ki0Var = (ki0) it.next();
                TLObject tLObject = ki0Var.a;
                if (ki0Var.c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && org.telegram.messenger.jj.C1(messagePeerReaction.peer_id) == ki0Var.b) {
                                messagePeerReaction.date = ki0Var.c;
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
            ki0 ki0Var2 = (ki0) it2.next();
            long j10 = ki0Var2.b;
            TLObject tLObject2 = ki0Var2.a;
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
                tL_messagePeerReaction.date = ki0Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(org.telegram.messenger.jj.C1(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new bi.t6(11)));
        this.f.f();
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
            TLRPC.InputStickerSet j12 = org.telegram.messenger.jj.j1(f5.e(i10, ((sg.o0) arrayList3.get(i11)).g));
            if (j12 != null && !hashSet.contains(Long.valueOf(j12.id))) {
                arrayList2.add(j12);
                hashSet.add(Long.valueOf(j12.id));
            }
            i11++;
        }
        if (org.telegram.messenger.vp.r1(i10).A3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        da0 da0Var = new da0(this.b, 1, getContext(), arrayList2, this.K);
        this.J = da0Var;
        da0Var.K = false;
    }

    public final void j() {
        if (this.D != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int L = org.telegram.messenger.i0.L(size * 50);
            da0 da0Var = this.J;
            if (da0Var != null) {
                L = org.telegram.messenger.m5.C(8.0f, da0Var.getMeasuredHeight(), L);
            }
            ni0 ni0Var = this.e;
            if (ni0Var.getMeasuredHeight() != 0) {
                L = Math.min(ni0Var.getMeasuredHeight(), L);
            }
            this.D.c(this, L);
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

    public void setPredictiveCount(int i10) {
        this.a = i10;
        this.h.setItemsCount(i10);
    }
}
