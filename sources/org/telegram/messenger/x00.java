package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x00 extends f1 {
    public static final int[] n = new int[5];
    public final a0.h a;
    public final a0.h b;
    public final LongSparseIntArray c;
    public final LongSparseIntArray d;
    public final a0.h e;
    public final LongSparseIntArray f;
    public final a0.h h;

    public x00(int i10) {
        super(i10);
        this.a = new a0.h();
        this.b = new a0.h();
        this.c = new LongSparseIntArray();
        this.d = new LongSparseIntArray();
        this.e = new a0.h();
        new LongSparseIntArray();
        this.f = new LongSparseIntArray();
        this.h = new a0.h();
    }

    public static long p(int i10, long j10) {
        return j10 + (i10 << 12);
    }

    public final void A(int i10, long j10, boolean z10) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().i1(j11);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z10;
        TLRPC.TL_forumTopic f7 = f(j10, i10);
        if (f7 != null) {
            boolean z11 = tL_messages_editForumTopic.hidden;
            f7.hidden = z11;
            if (z11) {
                f7.closed = true;
            }
            D(j11, f7, 44);
            getMessagesStorage().f2(j11, f7, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public final int B(int i10, long j10, long j11, boolean z10) {
        long j12 = -j10;
        TLRPC.TL_forumTopic f7 = f(j12, j11);
        if (f7 == null) {
            return -1;
        }
        if (z10) {
            int i11 = f7.unread_poll_votes_count + i10;
            f7.unread_poll_votes_count = i11;
            if (i11 < 0) {
                f7.unread_poll_votes_count = 0;
            }
        } else {
            f7.unread_poll_votes_count = i10;
        }
        int i12 = f7.unread_poll_votes_count;
        y(j12, true);
        return i12;
    }

    public final int C(int i10, long j10, long j11, boolean z10) {
        long j12 = -j10;
        TLRPC.TL_forumTopic f7 = f(j12, j11);
        if (f7 == null) {
            return -1;
        }
        if (z10) {
            int i11 = f7.unread_reactions_count + i10;
            f7.unread_reactions_count = i11;
            if (i11 < 0) {
                f7.unread_reactions_count = 0;
            }
        } else {
            f7.unread_reactions_count = i10;
        }
        int i12 = f7.unread_reactions_count;
        y(j12, true);
        return i12;
    }

    public final void D(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        long j11 = -j10;
        TLRPC.TL_forumTopic f7 = f(j11, tL_forumTopic.id);
        if (f7 != null) {
            if ((i10 & 1) != 0) {
                f7.title = tL_forumTopic.title;
            }
            if ((i10 & 2) != 0) {
                f7.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i10 & 8) != 0) {
                f7.closed = tL_forumTopic.closed;
            }
            if ((i10 & 4) != 0) {
                f7.pinned = tL_forumTopic.pinned;
            }
            if ((i10 & 32) != 0) {
                f7.hidden = tL_forumTopic.hidden;
            }
            y(j11, true);
        }
    }

    public final void E(ArrayList arrayList, long j10) {
        if (j10 > 0) {
            return;
        }
        long j11 = -j10;
        i0.g3(new p00(this, j10, arrayList, w3.p0(getMessagesController().L0(Long.valueOf(j11))), j11, 0));
    }

    public final void a(long j10, ArrayList arrayList, boolean z10) {
        if (arrayList == null) {
            return;
        }
        ArrayList l4 = l(j10);
        boolean z11 = true;
        if (l4 != null) {
            boolean z12 = false;
            for (int i10 = 0; i10 < l4.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l4.get(i10);
                if (tL_forumTopic != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.id));
                    boolean z13 = indexOf >= 0;
                    if (tL_forumTopic.pinned != z13 || (z13 && tL_forumTopic.pinnedOrder != indexOf)) {
                        tL_forumTopic.pinned = z13;
                        tL_forumTopic.pinnedOrder = indexOf;
                        getMessagesStorage().f2(j10, tL_forumTopic, 4);
                        z12 = true;
                    }
                }
            }
            z11 = z12;
        }
        if (z10 && z11) {
            i0.g3(new s00(this, 0));
        }
    }

    public final void b() {
        i0.g3(new s00(this, 1));
    }

    public final void c(int i10, int i11, long j10) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j11 = -j10;
        tL_messages_deleteTopicHistory.peer = getMessagesController().i1(j11);
        tL_messages_deleteTopicHistory.top_msg_id = i10;
        if (i11 == 0) {
            hs messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new aq(1, j11, i10, messagesStorage));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new t00(this, j10, i10));
    }

    public final void d(ArrayList arrayList, long j10) {
        ArrayList arrayList2 = (ArrayList) this.a.f(j10);
        a0.h hVar = (a0.h) this.b.f(j10);
        if (hVar != null && arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long intValue = ((Integer) arrayList.get(i10)).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(intValue);
                hVar.l(intValue);
                if (tL_forumTopic != null) {
                    this.e.l(p(tL_forumTopic.top_message, j10));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            y(j10, true);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c(((Integer) arrayList.get(i11)).intValue(), 0, j10);
        }
    }

    public final boolean e(long j10) {
        return this.d.get(j10, 0) == 1;
    }

    public final TLRPC.TL_forumTopic f(long j10, long j11) {
        a0.h hVar = (a0.h) this.b.f(j10);
        if (hVar == null) {
            return null;
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(j11);
        if (tL_forumTopic != null || !getMessagesController().x2(-j10)) {
            return tL_forumTopic;
        }
        int i10 = gg.e.a;
        return (TLRPC.TL_forumTopic) hVar.f((int) ((j11 >>> 32) ^ j11));
    }

    public final ArrayList g(long j10) {
        ArrayList l4 = l(j10);
        ArrayList arrayList = new ArrayList();
        if (l4 != null) {
            for (int i10 = 0; i10 < l4.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l4.get(i10);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.id));
                }
            }
        }
        return arrayList;
    }

    public final void h(long j10) {
        ArrayList arrayList = (ArrayList) this.a.f(j10);
        int[] iArr = n;
        Arrays.fill(iArr, 0);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i10);
                iArr[0] = iArr[0] + (tL_forumTopic.unread_count > 0 ? 1 : 0);
                iArr[1] = iArr[1] + (tL_forumTopic.unread_mentions_count > 0 ? 1 : 0);
                iArr[2] = iArr[2] + (tL_forumTopic.unread_reactions_count <= 0 ? 0 : 1);
                if (!getMessagesController().q2(-j10, tL_forumTopic.id, null)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
    }

    public final CharSequence i(TLRPC.Chat chat, jj jjVar, TextPaint textPaint) {
        return j(chat, jjVar, textPaint, null);
    }

    public final CharSequence j(TLRPC.Chat chat, jj jjVar, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic f7;
        TLRPC.MessageReplyHeader messageReplyHeader = jjVar.k.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i10 = messageReplyHeader.reply_to_top_id;
        if (i10 == 0) {
            i10 = messageReplyHeader.reply_to_msg_id;
        }
        if (i10 == 0 || (f7 = f(chat.id, i10)) == null) {
            return null;
        }
        return gg.e.j(f7, textPaint, drawableArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(long j10, long j11) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic f7 = f(-j10, j11);
        if (f7 == null || f7.totalMessagesCount != 0) {
            return;
        }
        if (getMessagesController().x2(j10)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getMessagesController().i1(j11);
            tL_messages_getSavedHistory.parent_peer = getMessagesController().i1(j10);
            tL_messages_getSavedHistory.limit = 1;
            tL_messages_getReplies = tL_messages_getSavedHistory;
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies2.peer = getMessagesController().i1(j10);
            tL_messages_getReplies2.msg_id = (int) j11;
            tL_messages_getReplies2.limit = 1;
            tL_messages_getReplies = tL_messages_getReplies2;
        }
        getConnectionsManager().sendRequest(tL_messages_getReplies, new yf(this, f7, j10, j11, 2));
    }

    public final ArrayList l(long j10) {
        return (ArrayList) this.a.f(j10);
    }

    public final void m(final long j10, final long j11, final a3.h0 h0Var) {
        hs messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new d4(messagesStorage, -j10, new Consumer() { // from class: org.telegram.messenger.m00
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                x00 x00Var = x00.this;
                x00Var.getClass();
                i0.g3(new m9(x00Var, j10, (ArrayList) obj, j11, h0Var));
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$-CC.$default$andThen(this, consumer);
            }
        }, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (r5.c == 0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.tgnet.tl.TL_forum$TL_messages_getForumTopics] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.telegram.tgnet.TLRPC$TL_messages_getSavedDialogs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final int i10, final long j10, final boolean z10) {
        TLObject tL_messages_getForumTopics;
        long j11;
        long j12;
        int min;
        LongSparseIntArray longSparseIntArray = this.c;
        if (longSparseIntArray.get(j10, 0) != 0) {
            return;
        }
        if (v2.a) {
            f8.b("load topics " + j10 + " fromCache=" + z10 + " loadType=" + i10);
        }
        longSparseIntArray.put(j10, 1);
        if (z10) {
            hs messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new d4(messagesStorage, -j10, new Consumer() { // from class: org.telegram.messenger.r00
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    i0.g3(new dr(x00.this, j10, (ArrayList) obj, z10, i10, 2));
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$-CC.$default$andThen(this, consumer);
                }
            }, 5));
            return;
        }
        long j13 = -j10;
        boolean x22 = getMessagesController().x2(j13);
        a0.h hVar = this.h;
        if (x22) {
            tL_messages_getForumTopics = new TLRPC.TL_messages_getSavedDialogs();
            tL_messages_getForumTopics.parent_peer = vp.r1(this.currentAccount).i1(j13);
            tL_messages_getForumTopics.flags |= 2;
            w00 w00Var = (w00) hVar.f(j10);
            if (w00Var == null) {
                w00Var = new w00();
            }
            if (i10 != 0 && i10 != 3) {
                j11 = i10 != 1 ? 0L : 0L;
                if (i10 == 1) {
                    tL_messages_getForumTopics.limit = 100;
                    tL_messages_getForumTopics.offset_date = w00Var.b;
                    tL_messages_getForumTopics.offset_id = w00Var.a;
                    tL_messages_getForumTopics.offset_peer = vp.r1(this.currentAccount).i1(w00Var.c);
                    if (v2.a) {
                        StringBuilder sb2 = new StringBuilder("offset_date=");
                        sb2.append(w00Var.b);
                        sb2.append(" offset_id=");
                        sb2.append(w00Var.a);
                        sb2.append(" offset_topic=");
                        i0.a.q(w00Var.c, sb2);
                    }
                }
            }
            ArrayList l4 = l(j10);
            tL_messages_getForumTopics.limit = 20;
            tL_messages_getForumTopics.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
            tL_messages_getForumTopics.offset_date = 0;
            tL_messages_getForumTopics.offset_peer = new TLRPC.TL_inputPeerEmpty();
            if (l4 != null && l4.size() >= (min = Math.min(l4.size(), 20))) {
                j12 = j11;
                for (int i11 = 0; i11 < min; i11++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l4.get(i11);
                    TLRPC.Message message = tL_forumTopic.topMessage;
                    if (message != null && message.id == tL_forumTopic.top_message) {
                        j12 = ui.p(ui.p(ui.p(ui.p(j12, tL_forumTopic.pinned ? 1L : j11), Math.abs(o5.o(tL_forumTopic.from_id))), tL_forumTopic.top_message), (message.flags & 32768) != 0 ? message.edit_date : message.date);
                    }
                }
                tL_messages_getForumTopics.hash = j12;
            }
            j12 = j11;
            tL_messages_getForumTopics.hash = j12;
        } else {
            tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = getMessagesController().i1(j13);
            if (i10 == 0) {
                tL_messages_getForumTopics.limit = 20;
            } else if (i10 == 1) {
                tL_messages_getForumTopics.limit = 100;
                w00 w00Var2 = (w00) hVar.f(j10);
                if (w00Var2 == null) {
                    w00Var2 = new w00();
                }
                tL_messages_getForumTopics.offset_date = w00Var2.b;
                tL_messages_getForumTopics.offset_id = w00Var2.a;
                tL_messages_getForumTopics.offset_topic = (int) w00Var2.c;
                if (v2.a) {
                    StringBuilder sb3 = new StringBuilder("offset_date=");
                    sb3.append(w00Var2.b);
                    sb3.append(" offset_id=");
                    sb3.append(w00Var2.a);
                    sb3.append(" offset_topic=");
                    i0.a.q(w00Var2.c, sb3);
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopics, new mm(this, j10, i10, 1));
    }

    public final void o(long j10) {
        n(1, j10, false);
    }

    public final void q(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        long j11 = -j10;
        a0.h hVar = this.b;
        a0.h hVar2 = (a0.h) hVar.f(j11);
        if (f(j11, tL_forumTopic.id) != null) {
            return;
        }
        if (hVar2 == null) {
            hVar2 = new a0.h();
            hVar.k(hVar2, j11);
        }
        a0.h hVar3 = this.a;
        ArrayList arrayList = (ArrayList) hVar3.f(j11);
        if (arrayList == null) {
            arrayList = m5.i(hVar3, j11);
        }
        hVar2.k(tL_forumTopic, tL_forumTopic.id);
        arrayList.add(tL_forumTopic);
        if (z10) {
            getMessagesStorage().C1(getConnectionsManager().getCurrentTime(), j10, Collections.singletonList(tL_forumTopic), false);
        }
        y(j11, true);
    }

    public final void r(long j10, TL_update.TL_updateEditForumTopic tL_updateEditForumTopic) {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.id = tL_updateEditForumTopic.topic_id;
        int i11 = tL_updateEditForumTopic.flags;
        if ((i11 & 1) != 0) {
            tL_forumTopic.title = tL_updateEditForumTopic.title;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            tL_forumTopic.icon_emoji_id = tL_updateEditForumTopic.icon_emoji_id;
            i10 |= 2;
        }
        if ((i11 & 4) != 0) {
            tL_forumTopic.closed = tL_updateEditForumTopic.closed;
            i10 |= 8;
        }
        if ((i11 & 8) != 0) {
            tL_forumTopic.hidden = tL_updateEditForumTopic.hidden;
            i10 |= 32;
        }
        if (i10 == 0) {
            return;
        }
        D(j10, tL_forumTopic, i10);
        getMessagesStorage().f2(j10, tL_forumTopic, i10);
    }

    public final void s(long j10, long j11) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(gs.a(-j10, j11));
        i0.g3(new hr(20, this, arrayList));
    }

    public final void t(long j10, int i10, boolean z10, org.telegram.ui.ActionBar.k2 k2Var) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().i1(-j10);
        tL_messages_updatePinnedForumTopic.topic_id = i10;
        tL_messages_updatePinnedForumTopic.pinned = z10;
        ArrayList g10 = g(j10);
        ArrayList arrayList = new ArrayList(g10);
        arrayList.remove(Integer.valueOf(i10));
        if (z10) {
            arrayList.add(0, Integer.valueOf(i10));
        }
        a(j10, arrayList, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new hm(this, k2Var, j10, g10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x022e, code lost:
    
        if (r28 != 3) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(long j10, ArrayList arrayList, a0.h hVar, boolean z10, int i10, int i11) {
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z11;
        ArrayList arrayList4;
        a3.h0 h0Var;
        ?? r12;
        int i12;
        a0.h hVar2;
        String str2;
        int i13;
        TLRPC.TL_forumTopic tL_forumTopic;
        ArrayList arrayList5 = arrayList;
        a0.h hVar3 = hVar;
        LongSparseIntArray longSparseIntArray = this.d;
        String str3 = "topics_end_reached_";
        a0.h hVar4 = this.b;
        a0.h hVar5 = this.a;
        if (i10 == 3 && getMessagesController().x2(-j10)) {
            getUserConfig().k().edit().remove("topics_end_reached_" + j10).apply();
            hVar5.l(j10);
            hVar4.l(j10);
            longSparseIntArray.delete(j10);
            this.h.l(j10);
        }
        if (v2.a) {
            StringBuilder sb2 = new StringBuilder("processTopics=new_topics_size=");
            sb2.append(arrayList5 == null ? 0 : arrayList5.size());
            sb2.append(" fromCache=");
            sb2.append(z10);
            sb2.append(" load_type=");
            sb2.append(i10);
            sb2.append(" totalCount=");
            sb2.append(i11);
            f8.b(sb2.toString());
        }
        ArrayList arrayList6 = (ArrayList) hVar5.f(j10);
        a0.h hVar6 = (a0.h) hVar4.f(j10);
        if (arrayList6 == null) {
            arrayList6 = m5.i(hVar5, j10);
        }
        if (hVar6 == null) {
            hVar6 = new a0.h();
            hVar4.k(hVar6, j10);
        }
        if (arrayList5 != null) {
            int i14 = 0;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            z11 = false;
            while (i14 < arrayList5.size()) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) arrayList5.get(i14);
                if (tL_forumTopic2 instanceof TLRPC.TL_forumTopicDeleted) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    ArrayList arrayList9 = arrayList7;
                    hVar2 = hVar5;
                    arrayList9.add(Long.valueOf(tL_forumTopic2.id));
                    i13 = i14;
                    arrayList7 = arrayList9;
                    str2 = str3;
                } else {
                    hVar2 = hVar5;
                    str2 = str3;
                    if (!hVar6.d(tL_forumTopic2.id)) {
                        if (hVar3 != null) {
                            tL_forumTopic2.topMessage = (TLRPC.Message) hVar3.f(tL_forumTopic2.top_message);
                            tL_forumTopic2.topicStartMessage = (TLRPC.Message) hVar3.f(tL_forumTopic2.id);
                        }
                        if (tL_forumTopic2.topMessage == null && !tL_forumTopic2.isShort) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            ArrayList arrayList10 = arrayList8;
                            arrayList10.add(tL_forumTopic2);
                            arrayList8 = arrayList10;
                        }
                        if (tL_forumTopic2.topicStartMessage == null) {
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_forumTopic2.topicStartMessage = tL_message;
                            tL_message.message = "";
                            tL_message.id = tL_forumTopic2.id;
                            tL_message.peer_id = getMessagesController().y1(-j10);
                            tL_forumTopic2.topicStartMessage.action = new TLRPC.TL_messageActionTopicCreate();
                            tL_forumTopic2.topicStartMessage.action.title = tL_forumTopic2.title;
                        }
                        arrayList6.add(tL_forumTopic2);
                        hVar6.k(tL_forumTopic2, tL_forumTopic2.id);
                        this.e.k(tL_forumTopic2, p(tL_forumTopic2.top_message, j10));
                        i13 = i14;
                    } else if (tL_forumTopic2.isShort || (tL_forumTopic = (TLRPC.TL_forumTopic) hVar6.f(tL_forumTopic2.id)) == null) {
                        i13 = i14;
                    } else {
                        boolean z12 = tL_forumTopic.closed;
                        boolean z13 = tL_forumTopic2.closed;
                        if (z12 != z13) {
                            tL_forumTopic.closed = z13;
                            i13 = i14;
                            getMessagesStorage().f2(-j10, tL_forumTopic2, 8);
                            z11 = true;
                        } else {
                            i13 = i14;
                        }
                        if (!z10) {
                            boolean z14 = tL_forumTopic.pinned;
                            boolean z15 = tL_forumTopic2.pinned;
                            if (z14 != z15) {
                                tL_forumTopic.pinned = z15;
                            }
                        }
                    }
                    z11 = true;
                }
                i14 = i13 + 1;
                arrayList5 = arrayList;
                hVar3 = hVar;
                str3 = str2;
                hVar5 = hVar2;
            }
            str = str3;
            arrayList2 = arrayList7;
            arrayList3 = arrayList8;
        } else {
            str = "topics_end_reached_";
            arrayList2 = null;
            arrayList3 = null;
            z11 = false;
        }
        a0.h hVar7 = hVar5;
        int i15 = 0;
        int i16 = 0;
        while (i15 < arrayList6.size()) {
            TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) arrayList6.get(i15);
            if (tL_forumTopic3 == null || !tL_forumTopic3.pinned) {
                i12 = i15;
            } else {
                int i17 = i16 + 1;
                i12 = i15;
                if (tL_forumTopic3.pinnedOrder != i16) {
                    tL_forumTopic3.pinnedOrder = i16;
                    i16 = i17;
                    z11 = true;
                } else {
                    i16 = i17;
                }
            }
            i15 = i12 + 1;
        }
        if (arrayList2 == null || i10 != 2) {
            arrayList4 = arrayList6;
            h0Var = null;
        } else {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                int i19 = 0;
                while (true) {
                    if (i19 >= arrayList6.size()) {
                        break;
                    }
                    if (((TLRPC.TL_forumTopic) arrayList6.get(i19)).id == ((Long) arrayList2.get(i18)).longValue()) {
                        arrayList6.remove(i19);
                        break;
                    }
                    i19++;
                }
            }
            hs messagesStorage = getMessagesStorage();
            arrayList4 = arrayList6;
            h0Var = null;
            messagesStorage.a.c(new tr(messagesStorage, arrayList2, j10, 4));
        }
        if (arrayList3 == null || i10 == 2) {
            if (i10 != 0 || z10) {
                r12 = 1;
                r12 = 1;
                if (i10 != 1) {
                }
            } else {
                r12 = 1;
            }
            if (arrayList4.size() >= i11 && i11 >= 0 && !e(j10)) {
                longSparseIntArray.put(j10, r12);
                getUserConfig().k().edit().putBoolean(str + j10, r12).apply();
                z11 = true;
            }
        } else {
            v(j10, arrayList3, h0Var);
        }
        if (hVar6.m() > arrayList4.size()) {
            f8.d("[TopicsController]: cache desynchronization");
            HashSet hashSet = new HashSet(hVar6.m());
            for (int i20 = 0; i20 < hVar6.m(); i20++) {
                hashSet.add(Long.valueOf(hVar6.j(i20)));
            }
            int size = arrayList4.size();
            int i21 = 0;
            while (i21 < size) {
                Object obj = arrayList4.get(i21);
                i21++;
                if (((TLRPC.TL_forumTopic) obj) != null) {
                    hashSet.remove(Long.valueOf(r6.id));
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hVar6.l(((Long) it.next()).longValue());
            }
            z11 = true;
        }
        if (z11) {
            y(j10, false);
        }
        getNotificationCenter().k(zs.q5, Long.valueOf(j10), Boolean.TRUE);
        if ((i10 == 0 || (i10 == 0 && !z10)) && z10 && ((ArrayList) hVar7.f(j10)).isEmpty()) {
            i0.g3(new o00(this, j10, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(long j10, ArrayList arrayList, a3.h0 h0Var) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j11 = -j10;
        boolean x22 = getMessagesController().x2(j11);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        if (x22) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i10 < arrayList.size()) {
                long o10 = o5.o(((TLRPC.TL_forumTopic) arrayList.get(i10)).from_id);
                hashSet.add(Long.valueOf(o10));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().i1(o10));
                i10++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().i1(j11);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i10 < arrayList.size()) {
                i10 = c3.i0.j(((TLRPC.TL_forumTopic) arrayList.get(i10)).id, i10, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().i1(j11);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new b4(this, x22, j10, hashSet, h0Var));
    }

    public final void w(ArrayList arrayList, long j10) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().i1(-j10);
        tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        tL_messages_reorderPinnedForumTopics.force = true;
        a(j10, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public final void x(long j10, long j11, int i10, int i11) {
        w00 w00Var = new w00();
        w00Var.a = i10;
        w00Var.b = i11;
        w00Var.c = j11;
        this.h.k(w00Var, j10);
    }

    public final void y(long j10, boolean z10) {
        ArrayList arrayList = (ArrayList) this.a.f(j10);
        if (arrayList != null) {
            if (this.f.get(j10, 0) > 0) {
                Collections.sort(arrayList, new bk(23));
            }
            if (z10) {
                getNotificationCenter().k(zs.q5, Long.valueOf(j10), Boolean.TRUE);
            }
        }
    }

    public final void z(int i10, long j10, boolean z10) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().i1(j11);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z10;
        a0.h hVar = (a0.h) this.b.f(j10);
        if (hVar != null && (tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(i10)) != null) {
            tL_forumTopic.closed = z10;
            getMessagesStorage().f2(j11, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new u00());
    }
}
