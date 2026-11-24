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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mx8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mx8(t5b t5bVar, TLRPC.Chat chat, ad7 ad7Var, long j) {
        this.a = (byte) 14;
        this.d = t5bVar;
        this.e = chat;
        this.b = ad7Var;
        this.c = j;
    }

    private final void a() {
        pub pubVar = (pub) this.d;
        TLObject tLObject = (TLObject) this.b;
        awb awbVar = (awb) this.e;
        pubVar.getClass();
        ArrayList arrayList = new ArrayList();
        oub oubVar = null;
        int i = 0;
        if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            vf6 vf6Var = new vf6();
            for (int i2 = 0; i2 < tL_messages_forumTopics.messages.size(); i2++) {
                vf6Var.k(tL_messages_forumTopics.messages.get(i2), tL_messages_forumTopics.messages.get(i2).id);
            }
            pubVar.getMessagesController().b4(tL_messages_forumTopics.users, false);
            pubVar.getMessagesController().V3(tL_messages_forumTopics.chats, false);
            ArrayList<TLRPC.TL_forumTopic> arrayList2 = tL_messages_forumTopics.topics;
            long j = this.c;
            pubVar.u(j, arrayList2, vf6Var, false, 2, -1);
            pubVar.getMessagesStorage().z1(pubVar.getConnectionsManager().getCurrentTime(), -j, (List) pubVar.a.f(j), true);
            pubVar.getMessagesStorage().g1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
            ArrayList<TLRPC.TL_forumTopic> arrayList3 = tL_messages_forumTopics.topics;
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.TL_forumTopic tL_forumTopic = arrayList3.get(i3);
                i3++;
                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                TLRPC.TL_forumTopic f = pubVar.f(j, tL_forumTopic2.id);
                if (f != null) {
                    tL_forumTopic2 = f;
                }
                arrayList.add(tL_forumTopic2);
            }
            int i4 = tL_messages_forumTopics.count;
            if (!tL_messages_forumTopics.topics.isEmpty()) {
                TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) b00.f(1, tL_messages_forumTopics.topics);
                TLRPC.Message message = (TLRPC.Message) vf6Var.f(tL_forumTopic3.top_message);
                oubVar = new oub();
                if (tL_messages_forumTopics.order_by_create_date) {
                    i = tL_forumTopic3.date;
                } else if (message != null) {
                    i = message.date;
                }
                oubVar.a = i;
                oubVar.b = tL_forumTopic3.top_message;
                oubVar.c = tL_forumTopic3.id;
            }
            i = i4;
        }
        awbVar.a(arrayList, oubVar, Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x064e, code lost:
    
        if (r17 != null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0650, code lost:
    
        r17.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0653, code lost:
    
        gl.c3(new e57((java.lang.Object) r3, (java.lang.Object) r2, (java.lang.Object) r15, (java.lang.Object) r8, (java.lang.Object) r7, (java.lang.Object) r45, (byte) 24));
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
        k27 k27Var;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList;
        up9 up9Var;
        int i;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        ArrayList arrayList3;
        tp9 tp9Var;
        boolean z;
        SQLiteCursor sQLiteCursor5;
        ArrayList arrayList4;
        up9 up9Var2;
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
                ox8 ox8Var = (ox8) obj3;
                ad7 ad7Var = (ad7) obj2;
                nx8 nx8Var = (nx8) obj;
                try {
                    try {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        sQLiteCursor = ad7Var.b.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(nx8Var.a));
                        try {
                            if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                k27Var = null;
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
                                ad7.d(TLdeserialize, arrayList6, arrayList7, null);
                                k27Var = new k27(ox8Var.a, TLdeserialize, false, true);
                            }
                            sQLiteCursor.dispose();
                            k27 k27Var2 = k27Var;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            if (!arrayList7.isEmpty()) {
                                ad7Var.P(TextUtils.join(",", arrayList7), arrayList9);
                            }
                            if (!arrayList6.isEmpty()) {
                                ad7Var.k0(arrayList6, arrayList8, false);
                            }
                            gl.c3(new ex7((Object) ox8Var, (Object) arrayList8, (Object) arrayList9, (Object) nx8Var, (Object) k27Var2, (byte) 14));
                        } catch (Exception e) {
                            e = e;
                            fa4.g(e, true);
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
                vp9 vp9Var = (vp9) obj3;
                ad7 ad7Var2 = (ad7) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase = ad7Var2.b;
                ArrayList arrayList11 = new ArrayList();
                vf6 vf6Var = new vf6();
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
                            up9Var = (up9) arrayList10.get(i4);
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
                                    sQLiteCursor7 = sQLiteDatabase.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = ? AND topic_id = ? ORDER BY mid DESC LIMIT 1", Long.valueOf(j3), Long.valueOf(up9Var.a));
                                    if (sQLiteCursor7.next()) {
                                        sQLiteCursor7.intValue(0);
                                        NativeByteBuffer byteBufferValue2 = sQLiteCursor7.byteBufferValue(1);
                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(true), true);
                                        ad7.d(TLdeserialize2, arrayList12, arrayList13, arrayList14);
                                        vf6Var.k(TLdeserialize2, up9Var.a);
                                    } else {
                                        arrayList11.add(Long.valueOf(up9Var.a));
                                    }
                                    sQLiteCursor7.dispose();
                                    i4 = i + 1;
                                    arrayList10 = arrayList2;
                                    arrayList16 = arrayList;
                                } catch (Exception e4) {
                                    e = e4;
                                    arrayList16 = arrayList;
                                    sQLiteCursor7 = sQLiteCursor2;
                                    fa4.g(e, true);
                                    if (sQLiteCursor7 != null) {
                                        sQLiteCursor7.dispose();
                                    }
                                    gl.c3(new e57((Object) vp9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) vf6Var, (byte) 23));
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
                            fa4.g(e, true);
                            if (sQLiteCursor7 != null) {
                            }
                            gl.c3(new e57((Object) vp9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) vf6Var, (byte) 23));
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                sQLiteCursor2 = sQLiteCursor7;
                arrayList = arrayList16;
                if (!arrayList12.isEmpty()) {
                    ad7Var2.k0(arrayList12, arrayList15, false);
                }
                if (arrayList13.isEmpty()) {
                    arrayList16 = arrayList;
                } else {
                    arrayList16 = arrayList;
                    try {
                        ad7Var2.P(TextUtils.join(",", arrayList13), arrayList16);
                    } catch (Exception e6) {
                        e = e6;
                        sQLiteCursor7 = sQLiteCursor2;
                        fa4.g(e, true);
                        if (sQLiteCursor7 != null) {
                        }
                        gl.c3(new e57((Object) vp9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) vf6Var, (byte) 23));
                        return;
                    }
                }
                if (!arrayList14.isEmpty()) {
                    ad7Var2.K(TextUtils.join(",", arrayList14), arrayList17);
                }
                if (sQLiteCursor2 != null) {
                    sQLiteCursor2.dispose();
                }
                gl.c3(new e57((Object) vp9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) vf6Var, (byte) 23));
                return;
            case 2:
                vp9 vp9Var2 = (vp9) obj3;
                ad7 ad7Var3 = (ad7) obj2;
                tp9 tp9Var2 = (tp9) obj;
                SQLiteDatabase sQLiteDatabase2 = ad7Var3.b;
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                ArrayList arrayList21 = new ArrayList();
                ArrayList arrayList22 = new ArrayList();
                ArrayList arrayList23 = new ArrayList();
                ArrayList arrayList24 = new ArrayList();
                try {
                    try {
                        tp9Var = tp9Var2;
                        try {
                            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT did, date, last_mid, pinned, flags, folder_id, last_mid_group, count, unread_count, max_read_id, read_outbox FROM saved_dialogs WHERE forumChatId = ? ORDER BY pinned ASC, date DESC", 0);
                            sQLiteCursor4 = null;
                            while (queryFinalized2.next()) {
                                try {
                                    try {
                                        try {
                                            up9Var2 = new up9();
                                            j = j3;
                                            up9Var2.a = queryFinalized2.longValue(0);
                                            up9Var2.j = queryFinalized2.intValue(1);
                                            up9Var2.c = queryFinalized2.intValue(2);
                                            up9Var2.k = queryFinalized2.intValue(3);
                                            up9Var2.i = (queryFinalized2.intValue(4) & 1) != 0;
                                            up9Var2.b = up9Var2.k != 999;
                                            up9Var2.e = queryFinalized2.intValue(7);
                                            up9Var2.f = queryFinalized2.longValue(8);
                                            up9Var2.g = queryFinalized2.longValue(9);
                                            up9Var2.h = queryFinalized2.longValue(10);
                                            long j4 = up9Var2.a;
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
                                                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_topics WHERE uid = ? AND mid = ? AND topic_id = ?", Long.valueOf(j), Integer.valueOf(up9Var2.c), Long.valueOf(up9Var2.a));
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
                                        ad7.d(TLdeserialize3, arrayList19, arrayList20, arrayList21);
                                        up9Var2.d = new k27(vp9Var2.a, TLdeserialize3, null, null, null, null, null, false, false, 0L, false, false, true, 0);
                                    }
                                    queryFinalized.dispose();
                                    arrayList18.add(up9Var2);
                                    sQLiteCursor4 = queryFinalized;
                                    arrayList22 = arrayList4;
                                    j3 = j;
                                    queryFinalized2 = sQLiteCursor5;
                                } catch (Exception e11) {
                                    e = e11;
                                    sQLiteCursor4 = queryFinalized;
                                    arrayList3 = arrayList4;
                                    z = true;
                                    fa4.g(e, z);
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
                                    ad7Var3.k0(arrayList19, arrayList3, false);
                                } catch (Exception e12) {
                                    e = e12;
                                    z = true;
                                    fa4.g(e, z);
                                    if (sQLiteCursor5 != null) {
                                    }
                                }
                            }
                            if (!arrayList20.isEmpty()) {
                                ad7Var3.P(TextUtils.join(",", arrayList20), arrayList23);
                            }
                            if (!arrayList21.isEmpty()) {
                                ad7Var3.K(TextUtils.join(",", arrayList21), arrayList24);
                            }
                            sQLiteCursor5.dispose();
                            break;
                        } catch (Exception e13) {
                            e = e13;
                            arrayList3 = arrayList22;
                            z = true;
                            sQLiteCursor4 = null;
                            sQLiteCursor5 = null;
                            fa4.g(e, z);
                            if (sQLiteCursor5 != null) {
                                sQLiteCursor5.dispose();
                                break;
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        arrayList3 = arrayList22;
                        tp9Var = tp9Var2;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor3 = null;
                    sQLiteCursor4 = null;
                }
                break;
            case 3:
                vqa vqaVar = (vqa) obj3;
                p8c p8cVar = (p8c) obj;
                if (((gta) obj2).e) {
                    vqaVar.k1(j3, p8cVar);
                    return;
                }
                m21 Q = vqaVar.j().Q(R.raw.error, 36, k96.a0(null, null, 2131743639, "NO_BALANCE"));
                Q.t = true;
                Q.j();
                return;
            case 4:
                je2 e15 = je2.e(((vqa) obj3).a);
                elb elbVar = new elb(null, ((TL_stars.TL_starGiftUnique) obj2).slug);
                long j5 = this.c;
                e15.q(j5, elbVar, null, true);
                ((cj3) obj).presentFragment(mu1.W9(j5), true);
                return;
            case 5:
                vqa vqaVar2 = (vqa) obj3;
                ((boolean[]) obj2)[0] = true;
                vqaVar2.f2.setLoading(false);
                vqaVar2.k1(j3, (p8c) obj);
                return;
            case 6:
                ((gta) obj2).b0((k27) obj, ((jra) obj3).a, this.c, true, true, null);
                return;
            case 7:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                u21 b0 = u21.b0((mu1) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String M0 = k96.M0(2131744872, null);
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = gl.S2(k96.G((int) j3, "StarsGiftCompletedText", new Object[0]));
                }
                b0.s(document, M0, spannableStringBuilder).k(true);
                return;
            case 8:
                ((gta) obj3).f0((LaunchActivity) obj2, j3, (String) obj);
                return;
            case 9:
                gta gtaVar = (gta) obj3;
                TLObject tLObject = (TLObject) obj2;
                p8c p8cVar2 = (p8c) obj;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    p8cVar2.a(null);
                    return;
                }
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                gtaVar.M.put(Long.valueOf(j3), stargiftupgradepreview);
                p8cVar2.a(stargiftupgradepreview);
                return;
            case 10:
                g2b g2bVar = (g2b) obj3;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList25 = g2bVar.h;
                ArrayList arrayList26 = g2bVar.g;
                int i5 = g2bVar.a;
                StringBuilder sb = new StringBuilder("StoriesController update stories for dialog ");
                long j6 = this.c;
                sb.append(j6);
                fa4.b(sb.toString());
                g2bVar.q0(j6, Collections.singletonList(tL_updateStory.story), false);
                g2bVar.o0(j6, Collections.singletonList(tL_updateStory.story), true);
                vf6 vf6Var2 = g2bVar.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) vf6Var2.f(j6);
                ArrayList arrayList27 = new ArrayList();
                int i6 = g2bVar.u;
                TL_stories.StoryItem storyItem3 = tL_updateStory.story;
                if (peerStories != null) {
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        j2 = j6;
                        im7.l0.c(new zl7(im7.n(i5), j6, storyItem3.id, (byte) 0));
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
                                b00.p(storyItem3.id, new StringBuilder("StoriesController remove story id="));
                                z3 = true;
                                z4 = true;
                            } else {
                                TL_stories.StoryItem storyItem4 = arrayList28.get(i7);
                                storyItem3 = g2b.e(storyItem4, storyItem3);
                                arrayList27.add(storyItem3);
                                peerStories.stories.set(i7, storyItem3);
                                if (storyItem3.attachPath == null) {
                                    storyItem3.attachPath = storyItem4.attachPath;
                                }
                                if (storyItem3.firstFramePath == null) {
                                    storyItem3.firstFramePath = storyItem4.firstFramePath;
                                }
                                b00.p(storyItem3.id, new StringBuilder("StoriesController update story id="));
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
                            fa4.b("StoriesController can't add new story DELETED");
                            return;
                        }
                        if (x2b.w(i5, storyItem3)) {
                            fa4.b("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j2 > 0 && (user == null || (!user.self && !g2bVar.N(user)))) {
                            fa4.b("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList27.add(storyItem3);
                        peerStories.stories.add(storyItem3);
                        fa4.b("StoriesController add new story id=" + storyItem3.id + " total stories count " + peerStories.stories.size());
                        g2bVar.Y(j2, storyItem3);
                        g2bVar.f(peerStories);
                        z2 = true;
                        z4 = true;
                    }
                    if (z4) {
                        if (!peerStories.stories.isEmpty() || g2bVar.L(j2)) {
                            Collections.sort(peerStories.stories, g2b.X);
                        } else {
                            arrayList26.remove(peerStories);
                            arrayList25.remove(peerStories);
                            vf6Var2.l(cf3.n(peerStories.peer));
                            g2bVar.u--;
                        }
                    }
                    if (i6 != g2bVar.u) {
                        g2bVar.l.edit().putInt("total_stores", g2bVar.u).apply();
                    }
                    g2bVar.u(arrayList26);
                    g2bVar.u(arrayList25);
                    if (z2) {
                        if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                            i2 = 0;
                            kk7.f(i5).k(kk7.y5, Long.valueOf(j2), Integer.valueOf(tL_updateStory.story.id));
                        } else {
                            i2 = 0;
                        }
                        kk7.f(i5).k(kk7.x5, new Object[i2]);
                    }
                    na7.q1(i5).z();
                    return;
                }
                j2 = j6;
                if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                    fa4.b("StoriesController can't add user " + j2 + " with new story DELETED");
                    return;
                }
                if (x2b.w(i5, storyItem3)) {
                    fa4.b("StoriesController can't add user " + j2 + " with new story isExpired");
                    return;
                }
                if (j2 > 0 && (user == null || (!user.self && !g2bVar.N(user)))) {
                    fa4.b("StoriesController can't add user cause is not contact");
                    return;
                }
                TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                tL_peerStories.peer = tL_updateStory.peer;
                tL_peerStories.stories.add(tL_updateStory.story);
                b00.p(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                long n = cf3.n(tL_peerStories.peer);
                g2bVar.d0(n, tL_peerStories);
                if (n != y6c.h(y6c.t0).n) {
                    TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(n));
                    g2bVar.f(tL_peerStories);
                    if (V1 != null && !V1.stories_hidden) {
                        g2bVar.Z(tL_peerStories);
                    }
                }
                fa4.b("StoriesController applyNewStories " + n);
                g2bVar.q0(n, tL_peerStories.stories, false);
                g2bVar.u = g2bVar.u + 1;
                g2bVar.Q(j2);
                z2 = true;
                if (i6 != g2bVar.u) {
                }
                g2bVar.u(arrayList26);
                g2bVar.u(arrayList25);
                if (z2) {
                }
                na7.q1(i5).z();
                return;
            case 11:
                TLObject tLObject2 = (TLObject) obj2;
                vx5 vx5Var = (vx5) obj;
                g2b g2bVar2 = ((o1b) obj3).c;
                int i8 = g2bVar2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    na7.q1(i8).b4(tL_stories_peerStories.users, false);
                    na7.q1(i8).V3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        while (true) {
                            if (i3 < peerStories2.stories.size()) {
                                if (!(peerStories2.stories.get(i3).media instanceof TLRPC.TL_messageMediaVideoStream) || (peerStories2.stories.get(i3) instanceof TL_stories.TL_storyItemSkipped)) {
                                    i3++;
                                } else {
                                    vf6 vf6Var3 = g2bVar2.E;
                                    storyItem2 = peerStories2.stories.get(i3);
                                    vf6Var3.k(storyItem2, j3);
                                }
                            }
                        }
                    }
                }
                vx5Var.a(storyItem2);
                return;
            case 12:
                TLObject tLObject3 = (TLObject) obj2;
                p8c p8cVar3 = (p8c) obj;
                g2b g2bVar3 = ((p1b) obj3).c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    na7.q1(g2bVar3.a).b4(tL_stories_stories.users, false);
                    na7.q1(g2bVar3.a).V3(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        vf6 vf6Var4 = g2bVar3.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        vf6Var4.k(storyItem, j3);
                    }
                }
                p8cVar3.a(storyItem);
                return;
            case 13:
                long j7 = this.c;
                gl.d3(new d2b((w2b) obj3, (View) obj2, j7, (byte) 3), 500L);
                ((u2b) obj).f(j7);
                return;
            case 14:
                t5b t5bVar = (t5b) obj3;
                boolean T = hc2.T((TLRPC.Chat) obj);
                long j8 = this.c;
                TLRPC.ChatFull D0 = ((ad7) obj2).D0(j8, T, true, true);
                if (D0 == null || (chatParticipants = D0.participants) == null || ((arrayList5 = chatParticipants.participants) != null && arrayList5.size() < D0.participants_count - 1)) {
                    gl.c3(new ko2((gk7) t5bVar, T, j8, (byte) 3));
                    return;
                } else {
                    gl.c3(new d2b(t5bVar, j8, D0, (byte) 4));
                    return;
                }
            case 15:
                a();
                return;
            case 16:
                kxb kxbVar = (kxb) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((cs5) obj2).u();
                TLRPC.User V12 = na7.q1(kxbVar.e).V1(Long.valueOf(j3));
                if (V12 != null) {
                    mu1 mu1Var = kxbVar.s;
                    ij.q(mu1Var, -1, V12, chat, true, new rz1((Object) kxbVar, j3, (byte) 13), mu1Var.getResourceProvider());
                    return;
                }
                return;
            default:
                kxb kxbVar2 = (kxb) obj3;
                ArrayList arrayList29 = (ArrayList) obj;
                kxbVar2.l0.removeAll((HashSet) obj2);
                kxbVar2.n();
                int size = arrayList29.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj4 = arrayList29.get(i9);
                    i9++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        kxbVar2.k(intValue, false);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ mx8(Object obj, long j, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = tLObject;
        this.e = obj2;
    }

    public /* synthetic */ mx8(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = j;
        this.e = obj3;
    }

    public /* synthetic */ mx8(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = j;
    }
}
