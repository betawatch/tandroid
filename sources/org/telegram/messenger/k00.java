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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class k00 extends c1 {
    public static final int[] n = new int[5];
    public final a0.h a;
    public final a0.h b;
    public final LongSparseIntArray c;
    public final LongSparseIntArray d;
    public final a0.h e;
    public final LongSparseIntArray f;
    public final a0.h h;

    public k00(int i7) {
        super(i7);
        this.a = new a0.h();
        this.b = new a0.h();
        this.c = new LongSparseIntArray();
        this.d = new LongSparseIntArray();
        this.e = new a0.h();
        new LongSparseIntArray();
        this.f = new LongSparseIntArray();
        this.h = new a0.h();
    }

    public static long p(int i7, long j3) {
        return j3 + (i7 << 12);
    }

    public final void A(int i7, long j3, boolean z9) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j10 = -j3;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j10);
        tL_messages_editForumTopic.topic_id = i7;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z9;
        TLRPC.TL_forumTopic f10 = f(j3, i7);
        if (f10 != null) {
            boolean z10 = tL_messages_editForumTopic.hidden;
            f10.hidden = z10;
            if (z10) {
                f10.closed = true;
            }
            D(j10, f10, 44);
            getMessagesStorage().f2(j10, f10, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public final int B(int i7, long j3, long j10, boolean z9) {
        long j11 = -j3;
        TLRPC.TL_forumTopic f10 = f(j11, j10);
        if (f10 == null) {
            return -1;
        }
        if (z9) {
            int i10 = f10.unread_poll_votes_count + i7;
            f10.unread_poll_votes_count = i10;
            if (i10 < 0) {
                f10.unread_poll_votes_count = 0;
            }
        } else {
            f10.unread_poll_votes_count = i7;
        }
        int i11 = f10.unread_poll_votes_count;
        y(j11, true);
        return i11;
    }

    public final int C(int i7, long j3, long j10, boolean z9) {
        long j11 = -j3;
        TLRPC.TL_forumTopic f10 = f(j11, j10);
        if (f10 == null) {
            return -1;
        }
        if (z9) {
            int i10 = f10.unread_reactions_count + i7;
            f10.unread_reactions_count = i10;
            if (i10 < 0) {
                f10.unread_reactions_count = 0;
            }
        } else {
            f10.unread_reactions_count = i7;
        }
        int i11 = f10.unread_reactions_count;
        y(j11, true);
        return i11;
    }

    public final void D(long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7) {
        long j10 = -j3;
        TLRPC.TL_forumTopic f10 = f(j10, tL_forumTopic.id);
        if (f10 != null) {
            if ((i7 & 1) != 0) {
                f10.title = tL_forumTopic.title;
            }
            if ((i7 & 2) != 0) {
                f10.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i7 & 8) != 0) {
                f10.closed = tL_forumTopic.closed;
            }
            if ((i7 & 4) != 0) {
                f10.pinned = tL_forumTopic.pinned;
            }
            if ((i7 & 32) != 0) {
                f10.hidden = tL_forumTopic.hidden;
            }
            y(j10, true);
        }
    }

    public final void E(ArrayList arrayList, long j3) {
        if (j3 > 0) {
            return;
        }
        long j10 = -j3;
        g0.h3(new d00(this, j3, arrayList, t3.p0(getMessagesController().M0(Long.valueOf(j10))), j10, 0));
    }

    public final void a(long j3, ArrayList arrayList, boolean z9) {
        if (arrayList == null) {
            return;
        }
        ArrayList l10 = l(j3);
        boolean z10 = true;
        if (l10 != null) {
            boolean z11 = false;
            for (int i7 = 0; i7 < l10.size(); i7++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i7);
                if (tL_forumTopic != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.id));
                    boolean z12 = indexOf >= 0;
                    if (tL_forumTopic.pinned != z12 || (z12 && tL_forumTopic.pinnedOrder != indexOf)) {
                        tL_forumTopic.pinned = z12;
                        tL_forumTopic.pinnedOrder = indexOf;
                        getMessagesStorage().f2(j3, tL_forumTopic, 4);
                        z11 = true;
                    }
                }
            }
            z10 = z11;
        }
        if (z9 && z10) {
            g0.h3(new f00(this, 0));
        }
    }

    public final void b() {
        g0.h3(new f00(this, 1));
    }

    public final void c(int i7, int i10, long j3) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j10 = -j3;
        tL_messages_deleteTopicHistory.peer = getMessagesController().j1(j10);
        tL_messages_deleteTopicHistory.top_msg_id = i7;
        if (i10 == 0) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new vp(1, j10, i7, messagesStorage));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new g00(this, j3, i7));
    }

    public final void d(ArrayList arrayList, long j3) {
        ArrayList arrayList2 = (ArrayList) this.a.f(j3);
        a0.h hVar = (a0.h) this.b.f(j3);
        if (hVar != null && arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                long intValue = ((Integer) arrayList.get(i7)).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(intValue);
                hVar.l(intValue);
                if (tL_forumTopic != null) {
                    this.e.l(p(tL_forumTopic.top_message, j3));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            y(j3, true);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c(((Integer) arrayList.get(i10)).intValue(), 0, j3);
        }
    }

    public final boolean e(long j3) {
        return this.d.get(j3, 0) == 1;
    }

    public final TLRPC.TL_forumTopic f(long j3, long j10) {
        a0.h hVar = (a0.h) this.b.f(j3);
        if (hVar == null) {
            return null;
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(j10);
        if (tL_forumTopic != null || !getMessagesController().y2(-j3)) {
            return tL_forumTopic;
        }
        int i7 = qg.d.a;
        return (TLRPC.TL_forumTopic) hVar.f((int) ((j10 >>> 32) ^ j10));
    }

    public final ArrayList g(long j3) {
        ArrayList l10 = l(j3);
        ArrayList arrayList = new ArrayList();
        if (l10 != null) {
            for (int i7 = 0; i7 < l10.size(); i7++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i7);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.id));
                }
            }
        }
        return arrayList;
    }

    public final void h(long j3) {
        ArrayList arrayList = (ArrayList) this.a.f(j3);
        int[] iArr = n;
        Arrays.fill(iArr, 0);
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i7);
                iArr[0] = iArr[0] + (tL_forumTopic.unread_count > 0 ? 1 : 0);
                iArr[1] = iArr[1] + (tL_forumTopic.unread_mentions_count > 0 ? 1 : 0);
                iArr[2] = iArr[2] + (tL_forumTopic.unread_reactions_count <= 0 ? 0 : 1);
                if (!getMessagesController().r2(-j3, tL_forumTopic.id, null)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
    }

    public final CharSequence i(TLRPC.Chat chat, ij ijVar, TextPaint textPaint) {
        return j(chat, ijVar, textPaint, null);
    }

    public final CharSequence j(TLRPC.Chat chat, ij ijVar, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic f10;
        TLRPC.MessageReplyHeader messageReplyHeader = ijVar.k.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i7 = messageReplyHeader.reply_to_top_id;
        if (i7 == 0) {
            i7 = messageReplyHeader.reply_to_msg_id;
        }
        if (i7 == 0 || (f10 = f(chat.id, i7)) == null) {
            return null;
        }
        return qg.d.j(f10, textPaint, drawableArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(long j3, long j10) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic f10 = f(-j3, j10);
        if (f10 == null || f10.totalMessagesCount != 0) {
            return;
        }
        if (getMessagesController().y2(j3)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getMessagesController().j1(j10);
            tL_messages_getSavedHistory.parent_peer = getMessagesController().j1(j3);
            tL_messages_getSavedHistory.limit = 1;
            tL_messages_getReplies = tL_messages_getSavedHistory;
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies2.peer = getMessagesController().j1(j3);
            tL_messages_getReplies2.msg_id = (int) j10;
            tL_messages_getReplies2.limit = 1;
            tL_messages_getReplies = tL_messages_getReplies2;
        }
        getConnectionsManager().sendRequest(tL_messages_getReplies, new ag(this, f10, j3, j10, 2));
    }

    public final ArrayList l(long j3) {
        return (ArrayList) this.a.f(j3);
    }

    public final void m(final long j3, final long j10, final bi.h4 h4Var) {
        yr messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new a4(messagesStorage, -j3, new Consumer() { // from class: org.telegram.messenger.b00
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                k00 k00Var = k00.this;
                k00Var.getClass();
                g0.h3(new l9(k00Var, j3, (ArrayList) obj, j10, h4Var));
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
    public final void n(final int i7, final long j3, final boolean z9) {
        TLObject tL_messages_getForumTopics;
        long j10;
        long j11;
        int min;
        LongSparseIntArray longSparseIntArray = this.c;
        if (longSparseIntArray.get(j3, 0) != 0) {
            return;
        }
        if (r2.a) {
            a8.b("load topics " + j3 + " fromCache=" + z9 + " loadType=" + i7);
        }
        longSparseIntArray.put(j3, 1);
        if (z9) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new a4(messagesStorage, -j3, new Consumer() { // from class: org.telegram.messenger.e00
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    g0.h3(new xq(k00.this, j3, (ArrayList) obj, z9, i7, 2));
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$-CC.$default$andThen(this, consumer);
                }
            }, 5));
            return;
        }
        long j12 = -j3;
        boolean y22 = getMessagesController().y2(j12);
        a0.h hVar = this.h;
        if (y22) {
            tL_messages_getForumTopics = new TLRPC.TL_messages_getSavedDialogs();
            tL_messages_getForumTopics.parent_peer = qp.s1(this.currentAccount).j1(j12);
            tL_messages_getForumTopics.flags |= 2;
            j00 j00Var = (j00) hVar.f(j3);
            if (j00Var == null) {
                j00Var = new j00();
            }
            if (i7 != 0 && i7 != 3) {
                j10 = i7 != 1 ? 0L : 0L;
                if (i7 == 1) {
                    tL_messages_getForumTopics.limit = 100;
                    tL_messages_getForumTopics.offset_date = j00Var.b;
                    tL_messages_getForumTopics.offset_id = j00Var.a;
                    tL_messages_getForumTopics.offset_peer = qp.s1(this.currentAccount).j1(j00Var.c);
                    if (r2.a) {
                        StringBuilder sb2 = new StringBuilder("offset_date=");
                        sb2.append(j00Var.b);
                        sb2.append(" offset_id=");
                        sb2.append(j00Var.a);
                        sb2.append(" offset_topic=");
                        jg.g.u(j00Var.c, sb2);
                    }
                }
            }
            ArrayList l10 = l(j3);
            tL_messages_getForumTopics.limit = 20;
            tL_messages_getForumTopics.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
            tL_messages_getForumTopics.offset_date = 0;
            tL_messages_getForumTopics.offset_peer = new TLRPC.TL_inputPeerEmpty();
            if (l10 != null && l10.size() >= (min = Math.min(l10.size(), 20))) {
                j11 = j10;
                for (int i10 = 0; i10 < min; i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i10);
                    TLRPC.Message message = tL_forumTopic.topMessage;
                    if (message != null && message.id == tL_forumTopic.top_message) {
                        j11 = ui.p(ui.p(ui.p(ui.p(j11, tL_forumTopic.pinned ? 1L : j10), Math.abs(m5.o(tL_forumTopic.from_id))), tL_forumTopic.top_message), (message.flags & 32768) != 0 ? message.edit_date : message.date);
                    }
                }
                tL_messages_getForumTopics.hash = j11;
            }
            j11 = j10;
            tL_messages_getForumTopics.hash = j11;
        } else {
            tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = getMessagesController().j1(j12);
            if (i7 == 0) {
                tL_messages_getForumTopics.limit = 20;
            } else if (i7 == 1) {
                tL_messages_getForumTopics.limit = 100;
                j00 j00Var2 = (j00) hVar.f(j3);
                if (j00Var2 == null) {
                    j00Var2 = new j00();
                }
                tL_messages_getForumTopics.offset_date = j00Var2.b;
                tL_messages_getForumTopics.offset_id = j00Var2.a;
                tL_messages_getForumTopics.offset_topic = (int) j00Var2.c;
                if (r2.a) {
                    StringBuilder sb3 = new StringBuilder("offset_date=");
                    sb3.append(j00Var2.b);
                    sb3.append(" offset_id=");
                    sb3.append(j00Var2.a);
                    sb3.append(" offset_topic=");
                    jg.g.u(j00Var2.c, sb3);
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopics, new im(this, j3, i7, 1));
    }

    public final void o(long j3) {
        n(1, j3, false);
    }

    public final void q(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        long j10 = -j3;
        a0.h hVar = this.b;
        a0.h hVar2 = (a0.h) hVar.f(j10);
        if (f(j10, tL_forumTopic.id) != null) {
            return;
        }
        if (hVar2 == null) {
            hVar2 = new a0.h();
            hVar.k(hVar2, j10);
        }
        a0.h hVar3 = this.a;
        ArrayList arrayList = (ArrayList) hVar3.f(j10);
        if (arrayList == null) {
            arrayList = k5.j(hVar3, j10);
        }
        hVar2.k(tL_forumTopic, tL_forumTopic.id);
        arrayList.add(tL_forumTopic);
        if (z9) {
            getMessagesStorage().C1(getConnectionsManager().getCurrentTime(), j3, Collections.singletonList(tL_forumTopic), false);
        }
        y(j10, true);
    }

    public final void r(long j3, TL_update.TL_updateEditForumTopic tL_updateEditForumTopic) {
        int i7;
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.id = tL_updateEditForumTopic.topic_id;
        int i10 = tL_updateEditForumTopic.flags;
        if ((i10 & 1) != 0) {
            tL_forumTopic.title = tL_updateEditForumTopic.title;
            i7 = 1;
        } else {
            i7 = 0;
        }
        if ((i10 & 2) != 0) {
            tL_forumTopic.icon_emoji_id = tL_updateEditForumTopic.icon_emoji_id;
            i7 |= 2;
        }
        if ((i10 & 4) != 0) {
            tL_forumTopic.closed = tL_updateEditForumTopic.closed;
            i7 |= 8;
        }
        if ((i10 & 8) != 0) {
            tL_forumTopic.hidden = tL_updateEditForumTopic.hidden;
            i7 |= 32;
        }
        if (i7 == 0) {
            return;
        }
        D(j3, tL_forumTopic, i7);
        getMessagesStorage().f2(j3, tL_forumTopic, i7);
    }

    public final void s(long j3, long j10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(xr.a(-j3, j10));
        g0.h3(new yq(22, this, arrayList));
    }

    public final void t(long j3, int i7, boolean z9, org.telegram.ui.ActionBar.f2 f2Var) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().j1(-j3);
        tL_messages_updatePinnedForumTopic.topic_id = i7;
        tL_messages_updatePinnedForumTopic.pinned = z9;
        ArrayList g10 = g(j3);
        ArrayList arrayList = new ArrayList(g10);
        arrayList.remove(Integer.valueOf(i7));
        if (z9) {
            arrayList.add(0, Integer.valueOf(i7));
        }
        a(j3, arrayList, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new wm(this, f2Var, j3, g10));
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
    public final void u(long j3, ArrayList arrayList, a0.h hVar, boolean z9, int i7, int i10) {
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z10;
        ArrayList arrayList4;
        bi.h4 h4Var;
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
        if (i7 == 3 && getMessagesController().y2(-j3)) {
            getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
            hVar5.l(j3);
            hVar4.l(j3);
            longSparseIntArray.delete(j3);
            this.h.l(j3);
        }
        if (r2.a) {
            StringBuilder sb2 = new StringBuilder("processTopics=new_topics_size=");
            sb2.append(arrayList5 == null ? 0 : arrayList5.size());
            sb2.append(" fromCache=");
            sb2.append(z9);
            sb2.append(" load_type=");
            sb2.append(i7);
            sb2.append(" totalCount=");
            sb2.append(i10);
            a8.b(sb2.toString());
        }
        ArrayList arrayList6 = (ArrayList) hVar5.f(j3);
        a0.h hVar6 = (a0.h) hVar4.f(j3);
        if (arrayList6 == null) {
            arrayList6 = k5.j(hVar5, j3);
        }
        if (hVar6 == null) {
            hVar6 = new a0.h();
            hVar4.k(hVar6, j3);
        }
        if (arrayList5 != null) {
            int i15 = 0;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            z10 = false;
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
                            tL_message.peer_id = getMessagesController().z1(-j3);
                            tL_forumTopic2.topicStartMessage.action = new TLRPC.TL_messageActionTopicCreate();
                            tL_forumTopic2.topicStartMessage.action.title = tL_forumTopic2.title;
                        }
                        arrayList6.add(tL_forumTopic2);
                        hVar6.k(tL_forumTopic2, tL_forumTopic2.id);
                        this.e.k(tL_forumTopic2, p(tL_forumTopic2.top_message, j3));
                        i12 = i15;
                    } else if (tL_forumTopic2.isShort || (tL_forumTopic = (TLRPC.TL_forumTopic) hVar6.f(tL_forumTopic2.id)) == null) {
                        i12 = i15;
                    } else {
                        boolean z11 = tL_forumTopic.closed;
                        boolean z12 = tL_forumTopic2.closed;
                        if (z11 != z12) {
                            tL_forumTopic.closed = z12;
                            i12 = i15;
                            getMessagesStorage().f2(-j3, tL_forumTopic2, 8);
                            z10 = true;
                        } else {
                            i12 = i15;
                        }
                        if (!z9) {
                            boolean z13 = tL_forumTopic.pinned;
                            boolean z14 = tL_forumTopic2.pinned;
                            if (z13 != z14) {
                                tL_forumTopic.pinned = z14;
                                z10 = true;
                            }
                        }
                        if (!z9) {
                            if (TextUtils.equals(tL_forumTopic.title, tL_forumTopic2.title)) {
                                i13 = 0;
                            } else {
                                tL_forumTopic.title = tL_forumTopic2.title;
                                i13 = 1;
                            }
                            long j10 = tL_forumTopic.icon_emoji_id;
                            int i16 = i13;
                            long j11 = tL_forumTopic2.icon_emoji_id;
                            if (j10 == j11 && tL_forumTopic.icon_color == tL_forumTopic2.icon_color) {
                                i14 = i16;
                            } else {
                                tL_forumTopic.icon_emoji_id = j11;
                                tL_forumTopic.icon_color = tL_forumTopic2.icon_color;
                                i14 = i16 | 2;
                            }
                            boolean z15 = tL_forumTopic.hidden;
                            boolean z16 = tL_forumTopic2.hidden;
                            if (z15 != z16) {
                                tL_forumTopic.hidden = z16;
                                i14 |= 32;
                            }
                            if (i14 != 0) {
                                getMessagesStorage().f2(-j3, tL_forumTopic2, i14);
                            }
                        }
                    }
                    z10 = true;
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
            z10 = false;
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
                    z10 = true;
                } else {
                    i18 = i19;
                }
            }
            i17 = i11 + 1;
        }
        if (arrayList2 == null || i7 != 2) {
            arrayList4 = arrayList6;
            h4Var = null;
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
            yr messagesStorage = getMessagesStorage();
            arrayList4 = arrayList6;
            h4Var = null;
            messagesStorage.a.c(new lr(messagesStorage, arrayList2, j3, 4));
        }
        if (arrayList3 == null || i7 == 2) {
            if (i7 != 0 || z9) {
                r12 = 1;
                r12 = 1;
                if (i7 != 1) {
                }
            } else {
                r12 = 1;
            }
            if (arrayList4.size() >= i10 && i10 >= 0 && !e(j3)) {
                longSparseIntArray.put(j3, r12);
                getUserConfig().k().edit().putBoolean(str + j3, r12).apply();
                z10 = true;
            }
        } else {
            v(j3, arrayList3, h4Var);
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
            z10 = true;
        }
        if (z10) {
            y(j3, false);
        }
        getNotificationCenter().k(qs.q5, Long.valueOf(j3), Boolean.TRUE);
        if ((i7 == 0 || (i7 == 0 && !z9)) && z9 && ((ArrayList) hVar7.f(j3)).isEmpty()) {
            g0.h3(new c00(this, j3, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(long j3, ArrayList arrayList, bi.h4 h4Var) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j10 = -j3;
        boolean y22 = getMessagesController().y2(j10);
        HashSet hashSet = new HashSet();
        int i7 = 0;
        if (y22) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i7 < arrayList.size()) {
                long o4 = m5.o(((TLRPC.TL_forumTopic) arrayList.get(i7)).from_id);
                hashSet.add(Long.valueOf(o4));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().j1(o4));
                i7++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().j1(j10);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i7 < arrayList.size()) {
                i7 = com.google.android.recaptcha.internal.a.f(((TLRPC.TL_forumTopic) arrayList.get(i7)).id, i7, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().j1(j10);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new y3(this, y22, j3, hashSet, h4Var));
    }

    public final void w(ArrayList arrayList, long j3) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().j1(-j3);
        tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        tL_messages_reorderPinnedForumTopics.force = true;
        a(j3, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public final void x(long j3, long j10, int i7, int i10) {
        j00 j00Var = new j00();
        j00Var.a = i7;
        j00Var.b = i10;
        j00Var.c = j10;
        this.h.k(j00Var, j3);
    }

    public final void y(long j3, boolean z9) {
        ArrayList arrayList = (ArrayList) this.a.f(j3);
        if (arrayList != null) {
            if (this.f.get(j3, 0) > 0) {
                Collections.sort(arrayList, new vj(21));
            }
            if (z9) {
                getNotificationCenter().k(qs.q5, Long.valueOf(j3), Boolean.TRUE);
            }
        }
    }

    public final void z(int i7, long j3, boolean z9) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j10 = -j3;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j10);
        tL_messages_editForumTopic.topic_id = i7;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z9;
        a0.h hVar = (a0.h) this.b.f(j3);
        if (hVar != null && (tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(i7)) != null) {
            tL_forumTopic.closed = z9;
            getMessagesStorage().f2(j10, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new h00());
    }
}
