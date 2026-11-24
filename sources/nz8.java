// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nz8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nz8(v7b v7bVar, TLRPC.Chat chat, cf7 cf7Var, long j) {
        this.a = (byte) 14;
        this.d = v7bVar;
        this.e = chat;
        this.b = cf7Var;
        this.c = j;
    }

    private final void a() {
        qwb qwbVar = (qwb) this.d;
        TLObject tLObject = (TLObject) this.b;
        dyb dybVar = (dyb) this.e;
        qwbVar.getClass();
        ArrayList arrayList = new ArrayList();
        pwb pwbVar = null;
        int i = 0;
        if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            vh6 vh6Var = new vh6();
            for (int i2 = 0; i2 < tL_messages_forumTopics.messages.size(); i2++) {
                vh6Var.k(tL_messages_forumTopics.messages.get(i2), tL_messages_forumTopics.messages.get(i2).id);
            }
            qwbVar.getMessagesController().d4(tL_messages_forumTopics.users, false);
            qwbVar.getMessagesController().X3(tL_messages_forumTopics.chats, false);
            ArrayList<TLRPC.TL_forumTopic> arrayList2 = tL_messages_forumTopics.topics;
            long j = this.c;
            qwbVar.u(j, arrayList2, vh6Var, false, 2, -1);
            qwbVar.getMessagesStorage().z1(qwbVar.getConnectionsManager().getCurrentTime(), -j, (List) qwbVar.a.f(j), true);
            qwbVar.getMessagesStorage().g1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
            ArrayList<TLRPC.TL_forumTopic> arrayList3 = tL_messages_forumTopics.topics;
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.TL_forumTopic tL_forumTopic = arrayList3.get(i3);
                i3++;
                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                TLRPC.TL_forumTopic f = qwbVar.f(j, tL_forumTopic2.id);
                if (f != null) {
                    tL_forumTopic2 = f;
                }
                arrayList.add(tL_forumTopic2);
            }
            int i4 = tL_messages_forumTopics.count;
            if (!tL_messages_forumTopics.topics.isEmpty()) {
                TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) b10.f(1, tL_messages_forumTopics.topics);
                TLRPC.Message message = (TLRPC.Message) vh6Var.f(tL_forumTopic3.top_message);
                pwbVar = new pwb();
                if (tL_messages_forumTopics.order_by_create_date) {
                    i = tL_forumTopic3.date;
                } else if (message != null) {
                    i = message.date;
                }
                pwbVar.a = i;
                pwbVar.b = tL_forumTopic3.top_message;
                pwbVar.c = tL_forumTopic3.id;
            }
            i = i4;
        }
        dybVar.a(arrayList, pwbVar, Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x064e, code lost:
    
        if (r17 != null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0650, code lost:
    
        r17.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0653, code lost:
    
        gm.c3(new e77((java.lang.Object) r3, (java.lang.Object) r2, (java.lang.Object) r15, (java.lang.Object) r8, (java.lang.Object) r7, (java.lang.Object) r45, (byte) 24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0665, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0623, code lost:
    
        if (r17 != null) goto L236;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0834  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        k47 k47Var;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList;
        vr9 vr9Var;
        int i;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        ArrayList arrayList3;
        ur9 ur9Var;
        boolean z;
        SQLiteCursor sQLiteCursor5;
        ArrayList arrayList4;
        vr9 vr9Var2;
        long j;
        SQLiteCursor queryFinalized;
        long j2;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList5;
        byte b = this.a;
        SQLiteCursor sQLiteCursor6 = null;
        r8 = null;
        TL_stories.StoryItem storyItem = null;
        r8 = null;
        r8 = null;
        TL_stories.StoryItem storyItem2 = null;
        long j3 = this.c;
        int i3 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                pz8 pz8Var = (pz8) obj3;
                cf7 cf7Var = (cf7) obj2;
                oz8 oz8Var = (oz8) obj;
                try {
                    try {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        sQLiteCursor = cf7Var.b.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(oz8Var.a));
                        try {
                            if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                k47Var = null;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.send_state = sQLiteCursor.intValue(1);
                                TLdeserialize.readAttachPath(byteBufferValue, j3);
                                byteBufferValue.reuse();
                                TLdeserialize.id = sQLiteCursor.intValue(2);
                                TLdeserialize.date = sQLiteCursor.intValue(3);
                                TLdeserialize.flags |= TLObject.FLAG_30;
                                TLdeserialize.quick_reply_shortcut_id = sQLiteCursor.intValue(4);
                                TLdeserialize.ttl = sQLiteCursor.intValue(5);
                                cf7.d(TLdeserialize, arrayList6, arrayList7, null);
                                k47Var = new k47(pz8Var.a, TLdeserialize, false, true);
                            }
                            sQLiteCursor.dispose();
                            k47 k47Var2 = k47Var;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            if (!arrayList7.isEmpty()) {
                                cf7Var.P(TextUtils.join(",", arrayList7), arrayList9);
                            }
                            if (!arrayList6.isEmpty()) {
                                cf7Var.k0(arrayList6, arrayList8, false);
                            }
                            gm.c3(new hz7((Object) pz8Var, (Object) arrayList8, (Object) arrayList9, (Object) oz8Var, (Object) k47Var2, (byte) 14));
                        } catch (Exception e) {
                            e = e;
                            fc4.g(e, true);
                            if (sQLiteCursor == null) {
                                return;
                            }
                            sQLiteCursor.dispose();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (sQLiteCursor6 != null) {
                            sQLiteCursor6.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor6 = null;
                    if (sQLiteCursor6 != null) {
                    }
                    throw th;
                }
                sQLiteCursor.dispose();
                return;
            case 1:
                wr9 wr9Var = (wr9) obj3;
                cf7 cf7Var2 = (cf7) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase = cf7Var2.b;
                ArrayList arrayList11 = new ArrayList();
                vh6 vh6Var = new vh6();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                int i4 = 0;
                SQLiteCursor sQLiteCursor7 = null;
                while (i4 < arrayList10.size()) {
                    try {
                        try {
                            vr9Var = (vr9) arrayList10.get(i4);
                            i = i4;
                            arrayList = arrayList16;
                            arrayList2 = arrayList10;
                        } catch (Exception e3) {
                            e = e3;
                        }
                        try {
                            sQLiteCursor2 = sQLiteCursor7;
                            try {
                                try {
                                    sQLiteCursor7 = sQLiteDatabase.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = ? AND topic_id = ? ORDER BY mid DESC LIMIT 1", Long.valueOf(j3), Long.valueOf(vr9Var.a));
                                    if (sQLiteCursor7.next()) {
                                        sQLiteCursor7.intValue(0);
                                        NativeByteBuffer byteBufferValue2 = sQLiteCursor7.byteBufferValue(1);
                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(true), true);
                                        cf7.d(TLdeserialize2, arrayList12, arrayList13, arrayList14);
                                        vh6Var.k(TLdeserialize2, vr9Var.a);
                                    } else {
                                        arrayList11.add(Long.valueOf(vr9Var.a));
                                    }
                                    sQLiteCursor7.dispose();
                                    i4 = i + 1;
                                    arrayList10 = arrayList2;
                                    arrayList16 = arrayList;
                                } catch (Exception e4) {
                                    e = e4;
                                    arrayList16 = arrayList;
                                    sQLiteCursor7 = sQLiteCursor2;
                                    fc4.g(e, true);
                                    if (sQLiteCursor7 != null) {
                                        sQLiteCursor7.dispose();
                                    }
                                    gm.c3(new e77((Object) wr9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) vh6Var, (byte) 23));
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor7 = sQLiteCursor2;
                                if (sQLiteCursor7 != null) {
                                    sQLiteCursor7.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            arrayList16 = arrayList;
                            fc4.g(e, true);
                            if (sQLiteCursor7 != null) {
                            }
                            gm.c3(new e77((Object) wr9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) vh6Var, (byte) 23));
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                sQLiteCursor2 = sQLiteCursor7;
                arrayList = arrayList16;
                if (!arrayList12.isEmpty()) {
                    cf7Var2.k0(arrayList12, arrayList15, false);
                }
                if (arrayList13.isEmpty()) {
                    arrayList16 = arrayList;
                } else {
                    arrayList16 = arrayList;
                    try {
                        cf7Var2.P(TextUtils.join(",", arrayList13), arrayList16);
                    } catch (Exception e6) {
                        e = e6;
                        sQLiteCursor7 = sQLiteCursor2;
                        fc4.g(e, true);
                        if (sQLiteCursor7 != null) {
                        }
                        gm.c3(new e77((Object) wr9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) vh6Var, (byte) 23));
                        return;
                    }
                }
                if (!arrayList14.isEmpty()) {
                    cf7Var2.K(TextUtils.join(",", arrayList14), arrayList17);
                }
                if (sQLiteCursor2 != null) {
                    sQLiteCursor2.dispose();
                }
                gm.c3(new e77((Object) wr9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) vh6Var, (byte) 23));
                return;
            case 2:
                wr9 wr9Var2 = (wr9) obj3;
                cf7 cf7Var3 = (cf7) obj2;
                ur9 ur9Var2 = (ur9) obj;
                SQLiteDatabase sQLiteDatabase2 = cf7Var3.b;
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                ArrayList arrayList21 = new ArrayList();
                ArrayList arrayList22 = new ArrayList();
                ArrayList arrayList23 = new ArrayList();
                ArrayList arrayList24 = new ArrayList();
                try {
                    try {
                        ur9Var = ur9Var2;
                        try {
                            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT did, date, last_mid, pinned, flags, folder_id, last_mid_group, count, unread_count, max_read_id, read_outbox FROM saved_dialogs WHERE forumChatId = ? ORDER BY pinned ASC, date DESC", 0);
                            sQLiteCursor4 = null;
                            while (queryFinalized2.next()) {
                                try {
                                    try {
                                        try {
                                            vr9Var2 = new vr9();
                                            j = j3;
                                            vr9Var2.a = queryFinalized2.longValue(0);
                                            vr9Var2.j = queryFinalized2.intValue(1);
                                            vr9Var2.c = queryFinalized2.intValue(2);
                                            vr9Var2.k = queryFinalized2.intValue(3);
                                            vr9Var2.i = (queryFinalized2.intValue(4) & 1) != 0;
                                            vr9Var2.b = vr9Var2.k != 999;
                                            vr9Var2.e = queryFinalized2.intValue(7);
                                            vr9Var2.f = queryFinalized2.longValue(8);
                                            vr9Var2.g = queryFinalized2.longValue(9);
                                            vr9Var2.h = queryFinalized2.longValue(10);
                                            long j4 = vr9Var2.a;
                                            if (j4 < 0) {
                                                try {
                                                    arrayList20.add(Long.valueOf(-j4));
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    sQLiteCursor3 = queryFinalized2;
                                                    if (sQLiteCursor3 != null) {
                                                        sQLiteCursor3.dispose();
                                                    }
                                                    if (sQLiteCursor4 != null) {
                                                        sQLiteCursor4.dispose();
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                arrayList19.add(Long.valueOf(j4));
                                            }
                                            arrayList4 = arrayList22;
                                            try {
                                                sQLiteCursor5 = queryFinalized2;
                                                try {
                                                    try {
                                                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_topics WHERE uid = ? AND mid = ? AND topic_id = ?", Long.valueOf(j), Integer.valueOf(vr9Var2.c), Long.valueOf(vr9Var2.a));
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                sQLiteCursor5 = queryFinalized2;
                                            }
                                        } catch (Exception e9) {
                                            e = e9;
                                            sQLiteCursor5 = queryFinalized2;
                                            arrayList4 = arrayList22;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLiteCursor5 = queryFinalized2;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    sQLiteCursor5 = queryFinalized2;
                                    arrayList3 = arrayList22;
                                }
                                try {
                                    if (queryFinalized.next()) {
                                        NativeByteBuffer byteBufferValue3 = queryFinalized.byteBufferValue(0);
                                        TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(true), true);
                                        cf7.d(TLdeserialize3, arrayList19, arrayList20, arrayList21);
                                        vr9Var2.d = new k47(wr9Var2.a, TLdeserialize3, null, null, null, null, null, false, false, 0L, false, false, true, 0);
                                    }
                                    queryFinalized.dispose();
                                    arrayList18.add(vr9Var2);
                                    sQLiteCursor4 = queryFinalized;
                                    arrayList22 = arrayList4;
                                    j3 = j;
                                    queryFinalized2 = sQLiteCursor5;
                                } catch (Exception e11) {
                                    e = e11;
                                    sQLiteCursor4 = queryFinalized;
                                    arrayList3 = arrayList4;
                                    z = true;
                                    fc4.g(e, z);
                                    if (sQLiteCursor5 != null) {
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    sQLiteCursor4 = queryFinalized;
                                    sQLiteCursor3 = sQLiteCursor5;
                                    if (sQLiteCursor3 != null) {
                                    }
                                    if (sQLiteCursor4 != null) {
                                    }
                                    throw th;
                                }
                            }
                            sQLiteCursor5 = queryFinalized2;
                            arrayList4 = arrayList22;
                            if (arrayList19.isEmpty()) {
                                arrayList3 = arrayList4;
                            } else {
                                arrayList3 = arrayList4;
                                try {
                                    cf7Var3.k0(arrayList19, arrayList3, false);
                                } catch (Exception e12) {
                                    e = e12;
                                    z = true;
                                    fc4.g(e, z);
                                    if (sQLiteCursor5 != null) {
                                    }
                                }
                            }
                            if (!arrayList20.isEmpty()) {
                                cf7Var3.P(TextUtils.join(",", arrayList20), arrayList23);
                            }
                            if (!arrayList21.isEmpty()) {
                                cf7Var3.K(TextUtils.join(",", arrayList21), arrayList24);
                            }
                            sQLiteCursor5.dispose();
                            break;
                        } catch (Exception e13) {
                            e = e13;
                            arrayList3 = arrayList22;
                            z = true;
                            sQLiteCursor4 = null;
                            sQLiteCursor5 = null;
                            fc4.g(e, z);
                            if (sQLiteCursor5 != null) {
                                sQLiteCursor5.dispose();
                                break;
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        arrayList3 = arrayList22;
                        ur9Var = ur9Var2;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor3 = null;
                    sQLiteCursor4 = null;
                }
                break;
            case 3:
                wsa wsaVar = (wsa) obj3;
                qac qacVar = (qac) obj;
                if (((jva) obj2).e) {
                    wsaVar.k1(j3, qacVar);
                    return;
                }
                u31 Q = wsaVar.j().Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, "NO_BALANCE"));
                Q.u = true;
                Q.j();
                return;
            case 4:
                uf2 e15 = uf2.e(((wsa) obj3).a);
                fnb fnbVar = new fnb(null, ((TL_stars.TL_starGiftUnique) obj2).slug);
                long j5 = this.c;
                e15.q(j5, fnbVar, null, true);
                ((nk3) obj).presentFragment(yv1.ga(j5), true);
                return;
            case 5:
                wsa wsaVar2 = (wsa) obj3;
                ((boolean[]) obj2)[0] = true;
                wsaVar2.f2.setLoading(false);
                wsaVar2.k1(j3, (qac) obj);
                return;
            case 6:
                ((jva) obj2).b0((k47) obj, ((kta) obj3).a, this.c, true, true, null);
                return;
            case 7:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                c41 b0 = c41.b0((yv1) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String M0 = jb6.M0(2131744798, null);
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = gm.S2(jb6.G((int) j3, "StarsGiftCompletedText", new Object[0]));
                }
                b0.s(document, M0, spannableStringBuilder).k(true);
                return;
            case 8:
                ((jva) obj3).f0((LaunchActivity) obj2, j3, (String) obj);
                return;
            case 9:
                jva jvaVar = (jva) obj3;
                TLObject tLObject = (TLObject) obj2;
                qac qacVar2 = (qac) obj;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    qacVar2.a(null);
                    return;
                }
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                jvaVar.M.put(Long.valueOf(j3), stargiftupgradepreview);
                qacVar2.a(stargiftupgradepreview);
                return;
            case 10:
                h4b h4bVar = (h4b) obj3;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList25 = h4bVar.h;
                ArrayList arrayList26 = h4bVar.g;
                int i5 = h4bVar.a;
                StringBuilder sb = new StringBuilder("StoriesController update stories for dialog ");
                long j6 = this.c;
                sb.append(j6);
                fc4.b(sb.toString());
                h4bVar.q0(j6, Collections.singletonList(tL_updateStory.story), false);
                h4bVar.o0(j6, Collections.singletonList(tL_updateStory.story), true);
                vh6 vh6Var2 = h4bVar.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) vh6Var2.f(j6);
                ArrayList arrayList27 = new ArrayList();
                int i6 = h4bVar.u;
                TL_stories.StoryItem storyItem3 = tL_updateStory.story;
                if (peerStories != null) {
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        j2 = j6;
                        lo7.l0.c(new co7(lo7.n(i5), j6, storyItem3.id, (byte) 0));
                    } else {
                        j2 = j6;
                    }
                    int i7 = 0;
                    while (true) {
                        if (i7 >= peerStories.stories.size()) {
                            z3 = false;
                        } else if (peerStories.stories.get(i7).id == storyItem3.id) {
                            boolean z5 = storyItem3 instanceof TL_stories.TL_storyItemDeleted;
                            ArrayList<TL_stories.StoryItem> arrayList28 = peerStories.stories;
                            if (z5) {
                                arrayList28.remove(i7);
                                b10.p(storyItem3.id, new StringBuilder("StoriesController remove story id="));
                                z3 = true;
                                z4 = true;
                            } else {
                                TL_stories.StoryItem storyItem4 = arrayList28.get(i7);
                                storyItem3 = h4b.e(storyItem4, storyItem3);
                                arrayList27.add(storyItem3);
                                peerStories.stories.set(i7, storyItem3);
                                if (storyItem3.attachPath == null) {
                                    storyItem3.attachPath = storyItem4.attachPath;
                                }
                                if (storyItem3.firstFramePath == null) {
                                    storyItem3.firstFramePath = storyItem4.firstFramePath;
                                }
                                b10.p(storyItem3.id, new StringBuilder("StoriesController update story id="));
                                z3 = true;
                            }
                        } else {
                            i7++;
                        }
                    }
                    z4 = false;
                    if (z3) {
                        z2 = false;
                    } else {
                        if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                            fc4.b("StoriesController can't add new story DELETED");
                            return;
                        }
                        if (y4b.w(i5, storyItem3)) {
                            fc4.b("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j2 > 0 && (user == null || (!user.self && !h4bVar.N(user)))) {
                            fc4.b("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList27.add(storyItem3);
                        peerStories.stories.add(storyItem3);
                        fc4.b("StoriesController add new story id=" + storyItem3.id + " total stories count " + peerStories.stories.size());
                        h4bVar.Y(j2, storyItem3);
                        h4bVar.f(peerStories);
                        z2 = true;
                        z4 = true;
                    }
                    if (z4) {
                        if (!peerStories.stories.isEmpty() || h4bVar.L(j2)) {
                            Collections.sort(peerStories.stories, h4b.X);
                        } else {
                            arrayList26.remove(peerStories);
                            arrayList25.remove(peerStories);
                            vh6Var2.l(pg3.n(peerStories.peer));
                            h4bVar.u--;
                        }
                    }
                    if (i6 != h4bVar.u) {
                        h4bVar.l.edit().putInt("total_stores", h4bVar.u).apply();
                    }
                    h4bVar.u(arrayList26);
                    h4bVar.u(arrayList25);
                    if (z2) {
                        if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                            i2 = 0;
                            nm7.f(i5).k(nm7.A5, Long.valueOf(j2), Integer.valueOf(tL_updateStory.story.id));
                        } else {
                            i2 = 0;
                        }
                        nm7.f(i5).k(nm7.z5, new Object[i2]);
                    }
                    oc7.r1(i5).z();
                    return;
                }
                j2 = j6;
                if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                    fc4.b("StoriesController can't add user " + j2 + " with new story DELETED");
                    return;
                }
                if (y4b.w(i5, storyItem3)) {
                    fc4.b("StoriesController can't add user " + j2 + " with new story isExpired");
                    return;
                }
                if (j2 > 0 && (user == null || (!user.self && !h4bVar.N(user)))) {
                    fc4.b("StoriesController can't add user cause is not contact");
                    return;
                }
                TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                tL_peerStories.peer = tL_updateStory.peer;
                tL_peerStories.stories.add(tL_updateStory.story);
                b10.p(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                long n = pg3.n(tL_peerStories.peer);
                h4bVar.d0(n, tL_peerStories);
                if (n != z8c.h(z8c.t0).n) {
                    TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(n));
                    h4bVar.f(tL_peerStories);
                    if (W1 != null && !W1.stories_hidden) {
                        h4bVar.Z(tL_peerStories);
                    }
                }
                fc4.b("StoriesController applyNewStories " + n);
                h4bVar.q0(n, tL_peerStories.stories, false);
                h4bVar.u = h4bVar.u + 1;
                h4bVar.Q(j2);
                z2 = true;
                if (i6 != h4bVar.u) {
                }
                h4bVar.u(arrayList26);
                h4bVar.u(arrayList25);
                if (z2) {
                }
                oc7.r1(i5).z();
                return;
            case 11:
                TLObject tLObject2 = (TLObject) obj2;
                uz5 uz5Var = (uz5) obj;
                h4b h4bVar2 = ((q3b) obj3).c;
                int i8 = h4bVar2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    oc7.r1(i8).d4(tL_stories_peerStories.users, false);
                    oc7.r1(i8).X3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        while (true) {
                            if (i3 < peerStories2.stories.size()) {
                                if (!(peerStories2.stories.get(i3).media instanceof TLRPC.TL_messageMediaVideoStream) || (peerStories2.stories.get(i3) instanceof TL_stories.TL_storyItemSkipped)) {
                                    i3++;
                                } else {
                                    vh6 vh6Var3 = h4bVar2.E;
                                    storyItem2 = peerStories2.stories.get(i3);
                                    vh6Var3.k(storyItem2, j3);
                                }
                            }
                        }
                    }
                }
                uz5Var.a(storyItem2);
                return;
            case 12:
                TLObject tLObject3 = (TLObject) obj2;
                qac qacVar3 = (qac) obj;
                h4b h4bVar3 = ((r3b) obj3).c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    oc7.r1(h4bVar3.a).d4(tL_stories_stories.users, false);
                    oc7.r1(h4bVar3.a).X3(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        vh6 vh6Var4 = h4bVar3.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        vh6Var4.k(storyItem, j3);
                    }
                }
                qacVar3.a(storyItem);
                return;
            case 13:
                long j7 = this.c;
                gm.d3(new e4b((x4b) obj3, (View) obj2, j7, (byte) 3), 500L);
                ((v4b) obj).f(j7);
                return;
            case 14:
                v7b v7bVar = (v7b) obj3;
                boolean T = sd2.T((TLRPC.Chat) obj);
                long j8 = this.c;
                TLRPC.ChatFull D0 = ((cf7) obj2).D0(j8, T, true, true);
                if (D0 == null || (chatParticipants = D0.participants) == null || ((arrayList5 = chatParticipants.participants) != null && arrayList5.size() < D0.participants_count - 1)) {
                    gm.c3(new vp2((jm7) v7bVar, T, j8, (byte) 3));
                    return;
                } else {
                    gm.c3(new e4b(v7bVar, j8, D0, (byte) 4));
                    return;
                }
            case 15:
                a();
                return;
            case 16:
                mzb mzbVar = (mzb) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((bu5) obj2).u();
                TLRPC.User W12 = oc7.r1(mzbVar.e).W1(Long.valueOf(j3));
                if (W12 != null) {
                    yv1 yv1Var = mzbVar.s;
                    ik.q(yv1Var, -1, W12, chat, true, new d12((Object) mzbVar, j3, (byte) 13), yv1Var.getResourceProvider());
                    return;
                }
                return;
            default:
                mzb mzbVar2 = (mzb) obj3;
                ArrayList arrayList29 = (ArrayList) obj;
                mzbVar2.l0.removeAll((HashSet) obj2);
                mzbVar2.n();
                int size = arrayList29.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj4 = arrayList29.get(i9);
                    i9++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        mzbVar2.k(intValue, false);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ nz8(Object obj, long j, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = tLObject;
        this.e = obj2;
    }

    public /* synthetic */ nz8(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = j;
        this.e = obj3;
    }

    public /* synthetic */ nz8(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = j;
    }
}
