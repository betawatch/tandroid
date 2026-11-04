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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uh0 extends FrameLayout {
    public sh0 E;
    public th0 F;
    public th0 G;
    public rh0 H;
    public final ArrayList I;
    public final ArrayList J;
    public h90 K;
    public final org.telegram.ui.ActionBar.e6 L;
    public int a;
    public final int b;
    public final org.telegram.messenger.zi c;
    public final TLRPC.Reaction d;
    public final mh0 e;
    public final nh0 f;
    public final ph0 h;
    public final ArrayList n;
    public final LongSparseArray r;
    public String s;
    public boolean w;
    public boolean x;
    public boolean y;

    public uh0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, org.telegram.messenger.zi ziVar, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        this.n = new ArrayList();
        this.r = new LongSparseArray();
        this.y = true;
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        this.J = new ArrayList();
        this.b = i3;
        this.c = ziVar;
        TLRPC.Reaction reaction = reactionCount == null ? null : reactionCount.reaction;
        this.d = reaction;
        this.L = e6Var;
        this.a = reactionCount == null ? 6 : reactionCount.count;
        mh0 mh0Var = new mh0(this, context, e6Var);
        this.e = mh0Var;
        u4.b0 b0Var = new u4.b0();
        mh0Var.setLayoutManager(b0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            mh0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false)));
        }
        nh0 nh0Var = new nh0(this, i3, context, e6Var, z10);
        this.f = nh0Var;
        mh0Var.setAdapter(nh0Var);
        mh0Var.setOnItemClickListener(new k(this, 10));
        mh0Var.setOnItemLongClickListener(new zw(this, 15));
        mh0Var.j(new oh0(this, b0Var));
        mh0Var.setVerticalScrollBarEnabled(true);
        mh0Var.setAlpha(0.0f);
        addView(mh0Var, b8.mf.c(-1.0f, -1));
        ph0 ph0Var = new ph0(this, context, e6Var);
        this.h = ph0Var;
        ph0Var.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.i6, -1);
        ph0Var.setIsSingleCell(true);
        ph0Var.setItemsCount(this.a);
        addView(ph0Var, b8.mf.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !org.telegram.messenger.hp.s1(i3).D3()) {
            arrayList.clear();
            arrayList.add(dh.n0.d(reaction));
            i();
        }
        ph0Var.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public static /* synthetic */ void a(uh0 uh0Var, TLObject tLObject) {
        ArrayList arrayList = uh0Var.I;
        LongSparseArray longSparseArray = uh0Var.r;
        ArrayList arrayList2 = uh0Var.n;
        int i3 = uh0Var.b;
        if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
            uh0Var.w = false;
            return;
        }
        TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
        org.telegram.messenger.hp.s1(i3).Y3(tL_messages_messageReactionsList.users, false);
        org.telegram.messenger.hp.s1(i3).S3(tL_messages_messageReactionsList.chats, false);
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < tL_messages_messageReactionsList.reactions.size(); i10++) {
            arrayList2.add(tL_messages_messageReactionsList.reactions.get(i10));
            long C1 = org.telegram.messenger.zi.C1(tL_messages_messageReactionsList.reactions.get(i10).peer_id);
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
            dh.n0 d = dh.n0.d(tL_messages_messageReactionsList.reactions.get(i10).reaction);
            if (d.g != 0) {
                hashSet.add(d);
            }
            arrayList3.add(tL_messages_messageReactionsList.reactions.get(i10));
            longSparseArray.put(C1, arrayList3);
        }
        if (uh0Var.d == null) {
            arrayList.clear();
            arrayList.addAll(hashSet);
            uh0Var.i();
        }
        Collections.sort(arrayList2, Comparator$-CC.comparingInt(new cg.d(21)));
        uh0Var.f.f();
        if (!uh0Var.x) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(xq.f);
            duration.addUpdateListener(new y50(uh0Var, 5));
            duration.addListener(new a60(uh0Var, 12));
            duration.start();
            uh0Var.j();
            uh0Var.x = true;
        }
        String str = tL_messages_messageReactionsList.next_offset;
        uh0Var.s = str;
        if (str == null) {
            uh0Var.y = false;
        }
        uh0Var.w = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLoadCount() {
        return this.d == null ? 100 : 50;
    }

    public final void c() {
        this.w = true;
        int i3 = this.b;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.zi ziVar = this.c;
        tL_messages_getMessageReactionsList.peer = s12.j1(org.telegram.messenger.zi.B0(ziVar.k));
        tL_messages_getMessageReactionsList.id = ziVar.f1();
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
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getMessageReactionsList, new w1(this, 10), 64);
    }

    public final void d(org.telegram.ui.de deVar) {
        this.H = deVar;
    }

    public final void e(org.telegram.ui.b7 b7Var) {
        this.E = b7Var;
    }

    public final void f(org.telegram.ui.gf gfVar) {
        this.G = gfVar;
    }

    public final void g(org.telegram.ui.ff ffVar) {
        this.F = ffVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jh0 jh0Var = (jh0) it.next();
                TLObject tLObject = jh0Var.a;
                if (jh0Var.c > 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i3);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && org.telegram.messenger.zi.C1(messagePeerReaction.peer_id) == jh0Var.b) {
                                messagePeerReaction.date = jh0Var.c;
                                messagePeerReaction.dateIsSeen = true;
                                break;
                            }
                            i3++;
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
            jh0 jh0Var2 = (jh0) it2.next();
            long j10 = jh0Var2.b;
            TLObject tLObject2 = jh0Var2.a;
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
                tL_messagePeerReaction.date = jh0Var2.c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(org.telegram.messenger.zi.C1(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new cg.d(20)));
        this.f.f();
        j();
    }

    public final void i() {
        int i3;
        ArrayList arrayList = this.J;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.I;
            int size = arrayList3.size();
            i3 = this.b;
            if (i10 >= size) {
                break;
            }
            TLRPC.InputStickerSet j12 = org.telegram.messenger.zi.j1(g5.e(i3, ((dh.n0) arrayList3.get(i10)).g));
            if (j12 != null && !hashSet.contains(Long.valueOf(j12.id))) {
                arrayList2.add(j12);
                hashSet.add(Long.valueOf(j12.id));
            }
            i10++;
        }
        if (org.telegram.messenger.hp.s1(i3).D3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        h90 h90Var = new h90(this.b, 1, getContext(), arrayList2, this.L);
        this.K = h90Var;
        h90Var.L = false;
    }

    public final void j() {
        if (this.E != null) {
            int size = this.n.size();
            if (size == 0) {
                size = this.a;
            }
            int L = org.telegram.messenger.g0.L(size * 50);
            h90 h90Var = this.K;
            if (h90Var != null) {
                L = org.telegram.messenger.k5.C(8.0f, h90Var.getMeasuredHeight(), L);
            }
            mh0 mh0Var = this.e;
            if (mh0Var.getMeasuredHeight() != 0) {
                L = Math.min(mh0Var.getMeasuredHeight(), L);
            }
            this.E.c(this, L);
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

    public void setPredictiveCount(int i3) {
        this.a = i3;
        this.h.setItemsCount(i3);
    }
}
