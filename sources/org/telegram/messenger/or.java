package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class or implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ or(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = j10;
    }

    private final void a() {
        t10 t10Var = (t10) this.b;
        long j10 = this.c;
        o10 o10Var = (o10) this.d;
        synchronized (t10Var) {
            try {
                ArrayList arrayList = (ArrayList) t10Var.H.get(Long.valueOf(j10));
                if (arrayList != null) {
                    arrayList.remove(o10Var);
                    if (arrayList.isEmpty()) {
                        t10Var.H.remove(Long.valueOf(j10));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = t10Var.getMessagesController().i1(j10);
        tL_messages_translateRichMessage.id = o10Var.b;
        tL_messages_translateRichMessage.to_lang = t10.D(o10Var.d);
        int sendRequest = t10Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new qj(t10Var, o10Var, j10, 11));
        synchronized (t10Var) {
            o10Var.f = sendRequest;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x028b, code lost:
    
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        switch (this.a) {
            case 0:
                ((hs) this.b).getNotificationCenter().k(41, Long.valueOf(this.c), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 1:
                hs hsVar = (hs) this.b;
                long j10 = this.c;
                wn wnVar = (wn) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = hsVar.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j10, new Object[0]);
                    } catch (Throwable th2) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e) {
                    hsVar.o(e, true);
                    z10 = false;
                }
                if (sQLiteCursor.next()) {
                    if (sQLiteCursor.intValue(0) != 0) {
                        z10 = true;
                        sQLiteCursor.dispose();
                        if (z10) {
                            i0.g3(wnVar);
                            return;
                        }
                        return;
                    }
                }
                z10 = false;
                sQLiteCursor.dispose();
                if (z10) {
                }
            case 2:
                hs hsVar2 = (hs) this.b;
                long j11 = this.c;
                kn knVar = (kn) this.d;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor = hsVar2.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j11, new Object[0]);
                        if (sQLiteCursor.next()) {
                            iArr[0] = sQLiteCursor.intValue(0);
                        }
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                } catch (Exception e7) {
                    hsVar2.o(e7, true);
                    break;
                }
                sQLiteCursor.dispose();
                i0.g3(new hr(6, knVar, iArr));
                return;
            case 3:
                ot.a((ot) this.b, (String) this.d, this.c);
                return;
            case 4:
                gw gwVar = (gw) this.b;
                TLObject tLObject = (TLObject) this.d;
                long j12 = this.c;
                a0.h hVar = gwVar.p;
                int i10 = gwVar.a;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int size = messages_messages.messages.size();
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    vp.r1(i10).V3(messages_messages.users, false);
                    vp.r1(i10).P3(messages_messages.chats, false);
                    hs.a0(i10).m1(messages_messages.users, messages_messages.chats, true, true);
                    boolean z11 = size > 0;
                    if (size > 0) {
                        if (gwVar.r(size, j12, true)) {
                            gwVar.l();
                        } else if (!messages_messages.messages.isEmpty()) {
                            fw a2 = fw.a(i10, messages_messages.messages.get(0));
                            a2.e = size;
                            a2.i = true;
                            gwVar.c.add(a2);
                            gwVar.l();
                        }
                    }
                    ArrayList arrayList = (ArrayList) hVar.f(j12);
                    hVar.l(j12);
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((q20) arrayList.get(i11)).a(Boolean.valueOf(z11));
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                x00 x00Var = (x00) this.b;
                long j13 = this.c;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.d;
                x00Var.c.put(j13, 0);
                if ((x00Var.l(j13) != null ? r4.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    x00Var.d.put(j13, 1);
                    x00Var.getUserConfig().k().edit().putBoolean("topics_end_reached_" + j13, true).apply();
                }
                x00Var.getNotificationCenter().k(zs.q5, Long.valueOf(j13), Boolean.FALSE);
                return;
            case 6:
                x00 x00Var2 = (x00) this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                long j14 = this.c;
                a0.h hVar2 = x00Var2.e;
                ArrayList arrayList3 = null;
                boolean z12 = false;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList2.get(i12);
                    a0.h hVar3 = (a0.h) x00Var2.b.f(j14);
                    if (hVar3 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hVar3.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            hVar2.l(x00.p(tL_forumTopic2.top_message, j14));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i13 = message.id;
                            tL_forumTopic2.top_message = i13;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            hVar2.k(tL_forumTopic2, x00.p(i13, j14));
                            z12 = true;
                        } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(tL_forumTopic);
                        }
                    }
                }
                if (z12) {
                    x00Var2.y(j14, true);
                }
                if (arrayList3 != null) {
                    x00Var2.v(j14, arrayList3, null);
                    return;
                }
                return;
            case 7:
                a();
                return;
            default:
                t10 t10Var = (t10) this.b;
                long j15 = this.c;
                n10 n10Var = (n10) this.d;
                synchronized (t10Var) {
                    try {
                        ArrayList arrayList4 = (ArrayList) t10Var.D.get(Long.valueOf(j15));
                        if (arrayList4 != null) {
                            arrayList4.remove(n10Var);
                            if (arrayList4.isEmpty()) {
                                t10Var.D.remove(Long.valueOf(j15));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                tL_messages_translateText.flags |= 2;
                ArrayList arrayList5 = n10Var.c;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj = arrayList5.get(i14);
                    i14++;
                    Pair pair = (Pair) obj;
                    q10 q10Var = (q10) pair.first;
                    q10 q10Var2 = (q10) pair.second;
                    TLRPC.TL_textWithEntities tL_textWithEntities = q10Var.a;
                    if (tL_textWithEntities != null && (q10Var2 == null || q10Var2.a == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities);
                    }
                    if (q10Var.b.size() != (q10Var2 == null ? 0 : q10Var2.b.size())) {
                        ArrayList arrayList6 = q10Var.b;
                        int size3 = arrayList6.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj2 = arrayList6.get(i15);
                            i15++;
                            tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                        }
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = q10Var.c;
                    if (tL_textWithEntities2 != null && (q10Var2 == null || q10Var2.c == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities2);
                    }
                }
                tL_messages_translateText.to_lang = t10.D(n10Var.e);
                int sendRequest = t10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new qj(t10Var, n10Var, j15, 10));
                synchronized (t10Var) {
                    n10Var.h = sendRequest;
                }
                return;
        }
    }

    public /* synthetic */ or(f1 f1Var, long j10, Object obj, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = j10;
        this.d = obj;
    }
}
