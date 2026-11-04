package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c00 extends c1 {
    public static final int[] n = new int[5];
    public final a0.h a;
    public final a0.h b;
    public final LongSparseIntArray c;
    public final LongSparseIntArray d;
    public final a0.h e;
    public final LongSparseIntArray f;
    public final a0.h h;

    public c00(int i3) {
        super(i3);
        this.a = new a0.h();
        this.b = new a0.h();
        this.c = new LongSparseIntArray();
        this.d = new LongSparseIntArray();
        this.e = new a0.h();
        new LongSparseIntArray();
        this.f = new LongSparseIntArray();
        this.h = new a0.h();
    }

    public static long p(int i3, long j10) {
        return j10 + (i3 << 12);
    }

    public final void A(int i3, long j10, boolean z10) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j11);
        tL_messages_editForumTopic.topic_id = i3;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z10;
        TLRPC.TL_forumTopic f10 = f(j10, i3);
        if (f10 != null) {
            boolean z11 = tL_messages_editForumTopic.hidden;
            f10.hidden = z11;
            if (z11) {
                f10.closed = true;
            }
            D(j11, f10, 44);
            getMessagesStorage().f2(j11, f10, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public final int B(int i3, long j10, long j11, boolean z10) {
        long j12 = -j10;
        TLRPC.TL_forumTopic f10 = f(j12, j11);
        if (f10 == null) {
            return -1;
        }
        if (z10) {
            int i10 = f10.unread_poll_votes_count + i3;
            f10.unread_poll_votes_count = i10;
            if (i10 < 0) {
                f10.unread_poll_votes_count = 0;
            }
        } else {
            f10.unread_poll_votes_count = i3;
        }
        int i11 = f10.unread_poll_votes_count;
        y(j12, true);
        return i11;
    }

    public final int C(int i3, long j10, long j11, boolean z10) {
        long j12 = -j10;
        TLRPC.TL_forumTopic f10 = f(j12, j11);
        if (f10 == null) {
            return -1;
        }
        if (z10) {
            int i10 = f10.unread_reactions_count + i3;
            f10.unread_reactions_count = i10;
            if (i10 < 0) {
                f10.unread_reactions_count = 0;
            }
        } else {
            f10.unread_reactions_count = i3;
        }
        int i11 = f10.unread_reactions_count;
        y(j12, true);
        return i11;
    }

    public final void D(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i3) {
        long j11 = -j10;
        TLRPC.TL_forumTopic f10 = f(j11, tL_forumTopic.id);
        if (f10 != null) {
            if ((i3 & 1) != 0) {
                f10.title = tL_forumTopic.title;
            }
            if ((i3 & 2) != 0) {
                f10.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i3 & 8) != 0) {
                f10.closed = tL_forumTopic.closed;
            }
            if ((i3 & 4) != 0) {
                f10.pinned = tL_forumTopic.pinned;
            }
            if ((i3 & 32) != 0) {
                f10.hidden = tL_forumTopic.hidden;
            }
            y(j11, true);
        }
    }

    public final void E(ArrayList arrayList, long j10) {
        if (j10 > 0) {
            return;
        }
        long j11 = -j10;
        g0.h3(new vz(this, j10, arrayList, t3.p0(getMessagesController().M0(Long.valueOf(j11))), j11, 0));
    }

    public final void a(long j10, ArrayList arrayList, boolean z10) {
        if (arrayList == null) {
            return;
        }
        ArrayList l10 = l(j10);
        boolean z11 = true;
        if (l10 != null) {
            boolean z12 = false;
            for (int i3 = 0; i3 < l10.size(); i3++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i3);
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
            g0.h3(new xz(this, 0));
        }
    }

    public final void b() {
        g0.h3(new xz(this, 1));
    }

    public final void c(int i3, int i10, long j10) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j11 = -j10;
        tL_messages_deleteTopicHistory.peer = getMessagesController().j1(j11);
        tL_messages_deleteTopicHistory.top_msg_id = i3;
        if (i10 == 0) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new mp(1, j11, i3, messagesStorage));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new yz(this, j10, i3));
    }

    public final void d(ArrayList arrayList, long j10) {
        ArrayList arrayList2 = (ArrayList) this.a.f(j10);
        a0.h hVar = (a0.h) this.b.f(j10);
        if (hVar != null && arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                long intValue = ((Integer) arrayList.get(i3)).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(intValue);
                hVar.l(intValue);
                if (tL_forumTopic != null) {
                    this.e.l(p(tL_forumTopic.top_message, j10));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            y(j10, true);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c(((Integer) arrayList.get(i10)).intValue(), 0, j10);
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
        if (tL_forumTopic != null || !getMessagesController().y2(-j10)) {
            return tL_forumTopic;
        }
        int i3 = rg.c.a;
        return (TLRPC.TL_forumTopic) hVar.f((int) ((j11 >>> 32) ^ j11));
    }

    public final ArrayList g(long j10) {
        ArrayList l10 = l(j10);
        ArrayList arrayList = new ArrayList();
        if (l10 != null) {
            for (int i3 = 0; i3 < l10.size(); i3++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i3);
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
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i3);
                iArr[0] = iArr[0] + (tL_forumTopic.unread_count > 0 ? 1 : 0);
                iArr[1] = iArr[1] + (tL_forumTopic.unread_mentions_count > 0 ? 1 : 0);
                iArr[2] = iArr[2] + (tL_forumTopic.unread_reactions_count <= 0 ? 0 : 1);
                if (!getMessagesController().r2(-j10, tL_forumTopic.id, null)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
    }

    public final CharSequence i(TLRPC.Chat chat, zi ziVar, TextPaint textPaint) {
        return j(chat, ziVar, textPaint, null);
    }

    public final CharSequence j(TLRPC.Chat chat, zi ziVar, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic f10;
        TLRPC.MessageReplyHeader messageReplyHeader = ziVar.k.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i3 = messageReplyHeader.reply_to_top_id;
        if (i3 == 0) {
            i3 = messageReplyHeader.reply_to_msg_id;
        }
        if (i3 == 0 || (f10 = f(chat.id, i3)) == null) {
            return null;
        }
        return rg.c.j(f10, textPaint, drawableArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(long j10, long j11) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic f10 = f(-j10, j11);
        if (f10 == null || f10.totalMessagesCount != 0) {
            return;
        }
        if (getMessagesController().y2(j10)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getMessagesController().j1(j11);
            tL_messages_getSavedHistory.parent_peer = getMessagesController().j1(j10);
            tL_messages_getSavedHistory.limit = 1;
            tL_messages_getReplies = tL_messages_getSavedHistory;
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies2.peer = getMessagesController().j1(j10);
            tL_messages_getReplies2.msg_id = (int) j11;
            tL_messages_getReplies2.limit = 1;
            tL_messages_getReplies = tL_messages_getReplies2;
        }
        getConnectionsManager().sendRequest(tL_messages_getReplies, new sf(this, f10, j10, j11, 2));
    }

    public final ArrayList l(long j10) {
        return (ArrayList) this.a.f(j10);
    }

    public final void m(final long j10, final long j11, final c3.f0 f0Var) {
        qr messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new a4(messagesStorage, -j10, new Consumer() { // from class: org.telegram.messenger.tz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                c00 c00Var = c00.this;
                c00Var.getClass();
                g0.h3(new f9(c00Var, j10, (ArrayList) obj, j11, f0Var));
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
    public final void n(final int i3, final long j10, final boolean z10) {
        TLObject tL_messages_getForumTopics;
        long j11;
        long j12;
        int min;
        LongSparseIntArray longSparseIntArray = this.c;
        if (longSparseIntArray.get(j10, 0) != 0) {
            return;
        }
        if (r2.a) {
            a8.b("load topics " + j10 + " fromCache=" + z10 + " loadType=" + i3);
        }
        longSparseIntArray.put(j10, 1);
        if (z10) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new a4(messagesStorage, -j10, new Consumer() { // from class: org.telegram.messenger.wz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    g0.h3(new oq(c00.this, j10, (ArrayList) obj, z10, i3, 2));
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$-CC.$default$andThen(this, consumer);
                }
            }, 5));
            return;
        }
        long j13 = -j10;
        boolean y22 = getMessagesController().y2(j13);
        a0.h hVar = this.h;
        if (y22) {
            tL_messages_getForumTopics = new TLRPC.TL_messages_getSavedDialogs();
            tL_messages_getForumTopics.parent_peer = hp.s1(this.currentAccount).j1(j13);
            tL_messages_getForumTopics.flags |= 2;
            b00 b00Var = (b00) hVar.f(j10);
            if (b00Var == null) {
                b00Var = new b00();
            }
            if (i3 != 0 && i3 != 3) {
                j11 = i3 != 1 ? 0L : 0L;
                if (i3 == 1) {
                    tL_messages_getForumTopics.limit = 100;
                    tL_messages_getForumTopics.offset_date = b00Var.b;
                    tL_messages_getForumTopics.offset_id = b00Var.a;
                    tL_messages_getForumTopics.offset_peer = hp.s1(this.currentAccount).j1(b00Var.c);
                    if (r2.a) {
                        StringBuilder sb2 = new StringBuilder("offset_date=");
                        sb2.append(b00Var.b);
                        sb2.append(" offset_id=");
                        sb2.append(b00Var.a);
                        sb2.append(" offset_topic=");
                        k2.p1.r(b00Var.c, sb2);
                    }
                }
            }
            ArrayList l10 = l(j10);
            tL_messages_getForumTopics.limit = 20;
            tL_messages_getForumTopics.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
            tL_messages_getForumTopics.offset_date = 0;
            tL_messages_getForumTopics.offset_peer = new TLRPC.TL_inputPeerEmpty();
            if (l10 != null && l10.size() >= (min = Math.min(l10.size(), 20))) {
                j12 = j11;
                for (int i10 = 0; i10 < min; i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i10);
                    TLRPC.Message message = tL_forumTopic.topMessage;
                    if (message != null && message.id == tL_forumTopic.top_message) {
                        j12 = li.p(li.p(li.p(li.p(j12, tL_forumTopic.pinned ? 1L : j11), Math.abs(m5.o(tL_forumTopic.from_id))), tL_forumTopic.top_message), (message.flags & 32768) != 0 ? message.edit_date : message.date);
                    }
                }
                tL_messages_getForumTopics.hash = j12;
            }
            j12 = j11;
            tL_messages_getForumTopics.hash = j12;
        } else {
            tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = getMessagesController().j1(j13);
            if (i3 == 0) {
                tL_messages_getForumTopics.limit = 20;
            } else if (i3 == 1) {
                tL_messages_getForumTopics.limit = 100;
                b00 b00Var2 = (b00) hVar.f(j10);
                if (b00Var2 == null) {
                    b00Var2 = new b00();
                }
                tL_messages_getForumTopics.offset_date = b00Var2.b;
                tL_messages_getForumTopics.offset_id = b00Var2.a;
                tL_messages_getForumTopics.offset_topic = (int) b00Var2.c;
                if (r2.a) {
                    StringBuilder sb3 = new StringBuilder("offset_date=");
                    sb3.append(b00Var2.b);
                    sb3.append(" offset_id=");
                    sb3.append(b00Var2.a);
                    sb3.append(" offset_topic=");
                    k2.p1.r(b00Var2.c, sb3);
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopics, new yl(this, j10, i3, 1));
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
            arrayList = k5.j(hVar3, j11);
        }
        hVar2.k(tL_forumTopic, tL_forumTopic.id);
        arrayList.add(tL_forumTopic);
        if (z10) {
            getMessagesStorage().C1(getConnectionsManager().getCurrentTime(), j10, Collections.singletonList(tL_forumTopic), false);
        }
        y(j11, true);
    }

    public final void r(long j10, TL_update.TL_updateEditForumTopic tL_updateEditForumTopic) {
        int i3;
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.id = tL_updateEditForumTopic.topic_id;
        int i10 = tL_updateEditForumTopic.flags;
        if ((i10 & 1) != 0) {
            tL_forumTopic.title = tL_updateEditForumTopic.title;
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i10 & 2) != 0) {
            tL_forumTopic.icon_emoji_id = tL_updateEditForumTopic.icon_emoji_id;
            i3 |= 2;
        }
        if ((i10 & 4) != 0) {
            tL_forumTopic.closed = tL_updateEditForumTopic.closed;
            i3 |= 8;
        }
        if ((i10 & 8) != 0) {
            tL_forumTopic.hidden = tL_updateEditForumTopic.hidden;
            i3 |= 32;
        }
        if (i3 == 0) {
            return;
        }
        D(j10, tL_forumTopic, i3);
        getMessagesStorage().f2(j10, tL_forumTopic, i3);
    }

    public final void s(long j10, long j11) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(pr.a(-j10, j11));
        g0.h3(new pq(22, this, arrayList));
    }

    public final void t(long j10, int i3, boolean z10, org.telegram.ui.ActionBar.d2 d2Var) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().j1(-j10);
        tL_messages_updatePinnedForumTopic.topic_id = i3;
        tL_messages_updatePinnedForumTopic.pinned = z10;
        ArrayList g7 = g(j10);
        ArrayList arrayList = new ArrayList(g7);
        arrayList.remove(Integer.valueOf(i3));
        if (z10) {
            arrayList.add(0, Integer.valueOf(i3));
        }
        a(j10, arrayList, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new mm(this, d2Var, j10, g7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0274, code lost:
    
        if (r29 != 3) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(long j10, ArrayList arrayList, a0.h hVar, boolean z10, int i3, int i10) {
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z11;
        ArrayList arrayList4;
        c3.f0 f0Var;
        ?? r12;
        int i11;
        a0.h hVar2;
        String str2;
        int i12;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i13;
        int i14;
        ArrayList arrayList5 = arrayList;
        a0.h hVar3 = hVar;
        LongSparseIntArray longSparseIntArray = this.d;
        String str3 = "topics_end_reached_";
        a0.h hVar4 = this.b;
        a0.h hVar5 = this.a;
        if (i3 == 3 && getMessagesController().y2(-j10)) {
            getUserConfig().k().edit().remove("topics_end_reached_" + j10).apply();
            hVar5.l(j10);
            hVar4.l(j10);
            longSparseIntArray.delete(j10);
            this.h.l(j10);
        }
        if (r2.a) {
            StringBuilder sb2 = new StringBuilder("processTopics=new_topics_size=");
            sb2.append(arrayList5 == null ? 0 : arrayList5.size());
            sb2.append(" fromCache=");
            sb2.append(z10);
            sb2.append(" load_type=");
            sb2.append(i3);
            sb2.append(" totalCount=");
            sb2.append(i10);
            a8.b(sb2.toString());
        }
        ArrayList arrayList6 = (ArrayList) hVar5.f(j10);
        a0.h hVar6 = (a0.h) hVar4.f(j10);
        if (arrayList6 == null) {
            arrayList6 = k5.j(hVar5, j10);
        }
        if (hVar6 == null) {
            hVar6 = new a0.h();
            hVar4.k(hVar6, j10);
        }
        if (arrayList5 != null) {
            int i15 = 0;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            z11 = false;
            while (i15 < arrayList5.size()) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) arrayList5.get(i15);
                if (tL_forumTopic2 instanceof TLRPC.TL_forumTopicDeleted) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    ArrayList arrayList9 = arrayList7;
                    hVar2 = hVar5;
                    arrayList9.add(Long.valueOf(tL_forumTopic2.id));
                    i12 = i15;
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
                            tL_message.peer_id = getMessagesController().z1(-j10);
                            tL_forumTopic2.topicStartMessage.action = new TLRPC.TL_messageActionTopicCreate();
                            tL_forumTopic2.topicStartMessage.action.title = tL_forumTopic2.title;
                        }
                        arrayList6.add(tL_forumTopic2);
                        hVar6.k(tL_forumTopic2, tL_forumTopic2.id);
                        this.e.k(tL_forumTopic2, p(tL_forumTopic2.top_message, j10));
                        i12 = i15;
                    } else if (tL_forumTopic2.isShort || (tL_forumTopic = (TLRPC.TL_forumTopic) hVar6.f(tL_forumTopic2.id)) == null) {
                        i12 = i15;
                    } else {
                        boolean z12 = tL_forumTopic.closed;
                        boolean z13 = tL_forumTopic2.closed;
                        if (z12 != z13) {
                            tL_forumTopic.closed = z13;
                            i12 = i15;
                            getMessagesStorage().f2(-j10, tL_forumTopic2, 8);
                            z11 = true;
                        } else {
                            i12 = i15;
                        }
                        if (!z10) {
                            boolean z14 = tL_forumTopic.pinned;
                            boolean z15 = tL_forumTopic2.pinned;
                            if (z14 != z15) {
                                tL_forumTopic.pinned = z15;
                                z11 = true;
                            }
                        }
                        if (!z10) {
                            if (TextUtils.equals(tL_forumTopic.title, tL_forumTopic2.title)) {
                                i13 = 0;
                            } else {
                                tL_forumTopic.title = tL_forumTopic2.title;
                                i13 = 1;
                            }
                            long j11 = tL_forumTopic.icon_emoji_id;
                            int i16 = i13;
                            long j12 = tL_forumTopic2.icon_emoji_id;
                            if (j11 == j12 && tL_forumTopic.icon_color == tL_forumTopic2.icon_color) {
                                i14 = i16;
                            } else {
                                tL_forumTopic.icon_emoji_id = j12;
                                tL_forumTopic.icon_color = tL_forumTopic2.icon_color;
                                i14 = i16 | 2;
                            }
                            boolean z16 = tL_forumTopic.hidden;
                            boolean z17 = tL_forumTopic2.hidden;
                            if (z16 != z17) {
                                tL_forumTopic.hidden = z17;
                                i14 |= 32;
                            }
                            if (i14 != 0) {
                                getMessagesStorage().f2(-j10, tL_forumTopic2, i14);
                            }
                        }
                    }
                    z11 = true;
                }
                i15 = i12 + 1;
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
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList6.size()) {
            TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) arrayList6.get(i17);
            if (tL_forumTopic3 == null || !tL_forumTopic3.pinned) {
                i11 = i17;
            } else {
                int i19 = i18 + 1;
                i11 = i17;
                if (tL_forumTopic3.pinnedOrder != i18) {
                    tL_forumTopic3.pinnedOrder = i18;
                    i18 = i19;
                    z11 = true;
                } else {
                    i18 = i19;
                }
            }
            i17 = i11 + 1;
        }
        if (arrayList2 == null || i3 != 2) {
            arrayList4 = arrayList6;
            f0Var = null;
        } else {
            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                int i21 = 0;
                while (true) {
                    if (i21 >= arrayList6.size()) {
                        break;
                    }
                    if (((TLRPC.TL_forumTopic) arrayList6.get(i21)).id == ((Long) arrayList2.get(i20)).longValue()) {
                        arrayList6.remove(i21);
                        break;
                    }
                    i21++;
                }
            }
            qr messagesStorage = getMessagesStorage();
            arrayList4 = arrayList6;
            f0Var = null;
            messagesStorage.a.c(new dr(messagesStorage, arrayList2, j10, 4));
        }
        if (arrayList3 == null || i3 == 2) {
            if (i3 != 0 || z10) {
                r12 = 1;
                r12 = 1;
                if (i3 != 1) {
                }
            } else {
                r12 = 1;
            }
            if (arrayList4.size() >= i10 && i10 >= 0 && !e(j10)) {
                longSparseIntArray.put(j10, r12);
                getUserConfig().k().edit().putBoolean(str + j10, r12).apply();
                z11 = true;
            }
        } else {
            v(j10, arrayList3, f0Var);
        }
        if (hVar6.m() > arrayList4.size()) {
            a8.d("[TopicsController]: cache desynchronization");
            HashSet hashSet = new HashSet(hVar6.m());
            for (int i22 = 0; i22 < hVar6.m(); i22++) {
                hashSet.add(Long.valueOf(hVar6.j(i22)));
            }
            int size = arrayList4.size();
            int i23 = 0;
            while (i23 < size) {
                Object obj = arrayList4.get(i23);
                i23++;
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
        getNotificationCenter().k(hs.q5, Long.valueOf(j10), Boolean.TRUE);
        if ((i3 == 0 || (i3 == 0 && !z10)) && z10 && ((ArrayList) hVar7.f(j10)).isEmpty()) {
            g0.h3(new uz(this, j10, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(long j10, ArrayList arrayList, c3.f0 f0Var) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j11 = -j10;
        boolean y22 = getMessagesController().y2(j11);
        HashSet hashSet = new HashSet();
        int i3 = 0;
        if (y22) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i3 < arrayList.size()) {
                long o10 = m5.o(((TLRPC.TL_forumTopic) arrayList.get(i3)).from_id);
                hashSet.add(Long.valueOf(o10));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().j1(o10));
                i3++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().j1(j11);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i3 < arrayList.size()) {
                i3 = com.google.android.recaptcha.internal.a.f(((TLRPC.TL_forumTopic) arrayList.get(i3)).id, i3, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().j1(j11);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new y3(this, y22, j10, hashSet, f0Var));
    }

    public final void w(ArrayList arrayList, long j10) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().j1(-j10);
        tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        tL_messages_reorderPinnedForumTopics.force = true;
        a(j10, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public final void x(long j10, long j11, int i3, int i10) {
        b00 b00Var = new b00();
        b00Var.a = i3;
        b00Var.b = i10;
        b00Var.c = j11;
        this.h.k(b00Var, j10);
    }

    public final void y(long j10, boolean z10) {
        ArrayList arrayList = (ArrayList) this.a.f(j10);
        if (arrayList != null) {
            if (this.f.get(j10, 0) > 0) {
                Collections.sort(arrayList, new tq(11));
            }
            if (z10) {
                getNotificationCenter().k(hs.q5, Long.valueOf(j10), Boolean.TRUE);
            }
        }
    }

    public final void z(int i3, long j10, boolean z10) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j11);
        tL_messages_editForumTopic.topic_id = i3;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z10;
        a0.h hVar = (a0.h) this.b.f(j10);
        if (hVar != null && (tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(i3)) != null) {
            tL_forumTopic.closed = z10;
            getMessagesStorage().f2(j11, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new zz());
    }
}
