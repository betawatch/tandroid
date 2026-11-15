package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class fr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fr(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
    }

    private final void a() {
        c10 c10Var = (c10) this.b;
        long j3 = this.c;
        x00 x00Var = (x00) this.d;
        synchronized (c10Var) {
            try {
                ArrayList arrayList = (ArrayList) c10Var.I.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(x00Var);
                    if (arrayList.isEmpty()) {
                        c10Var.I.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = c10Var.getMessagesController().j1(j3);
        tL_messages_translateRichMessage.id = x00Var.b;
        tL_messages_translateRichMessage.to_lang = c10.D(x00Var.d);
        int sendRequest = c10Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new mj(c10Var, x00Var, j3, 12));
        synchronized (c10Var) {
            x00Var.f = sendRequest;
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
                ((vr) this.b).getNotificationCenter().k(41, Long.valueOf(this.c), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 1:
                vr vrVar = (vr) this.b;
                long j3 = this.c;
                qn qnVar = (qn) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = vrVar.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j3, new Object[0]);
                    } catch (Throwable th2) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    vrVar.o(e10, true);
                    z10 = false;
                }
                if (sQLiteCursor.next()) {
                    if (sQLiteCursor.intValue(0) != 0) {
                        z10 = true;
                        sQLiteCursor.dispose();
                        if (z10) {
                            g0.h3(qnVar);
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
                vr vrVar2 = (vr) this.b;
                long j10 = this.c;
                an anVar = (an) this.d;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor = vrVar2.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                        if (sQLiteCursor.next()) {
                            iArr[0] = sQLiteCursor.intValue(0);
                        }
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                } catch (Exception e11) {
                    vrVar2.o(e11, true);
                    break;
                }
                sQLiteCursor.dispose();
                g0.h3(new wq(7, anVar, iArr));
                return;
            case 3:
                at.a((at) this.b, (String) this.d, this.c);
                return;
            case 4:
                tv tvVar = (tv) this.b;
                TLObject tLObject = (TLObject) this.d;
                long j11 = this.c;
                a0.h hVar = tvVar.p;
                int i7 = tvVar.a;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int size = messages_messages.messages.size();
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    np.s1(i7).Y3(messages_messages.users, false);
                    np.s1(i7).S3(messages_messages.chats, false);
                    vr.a0(i7).m1(messages_messages.users, messages_messages.chats, true, true);
                    boolean z11 = size > 0;
                    if (size > 0) {
                        if (tvVar.r(size, j11, true)) {
                            tvVar.l();
                        } else if (!messages_messages.messages.isEmpty()) {
                            sv a10 = sv.a(i7, messages_messages.messages.get(0));
                            a10.e = size;
                            a10.i = true;
                            tvVar.c.add(a10);
                            tvVar.l();
                        }
                    }
                    ArrayList arrayList = (ArrayList) hVar.f(j11);
                    hVar.l(j11);
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((z10) arrayList.get(i10)).a(Boolean.valueOf(z11));
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                h00 h00Var = (h00) this.b;
                long j12 = this.c;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.d;
                h00Var.c.put(j12, 0);
                if ((h00Var.l(j12) != null ? r4.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    h00Var.d.put(j12, 1);
                    h00Var.getUserConfig().k().edit().putBoolean("topics_end_reached_" + j12, true).apply();
                }
                h00Var.getNotificationCenter().k(ns.q5, Long.valueOf(j12), Boolean.FALSE);
                return;
            case 6:
                h00 h00Var2 = (h00) this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                long j13 = this.c;
                a0.h hVar2 = h00Var2.e;
                ArrayList arrayList3 = null;
                boolean z12 = false;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList2.get(i11);
                    a0.h hVar3 = (a0.h) h00Var2.b.f(j13);
                    if (hVar3 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hVar3.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            hVar2.l(h00.p(tL_forumTopic2.top_message, j13));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i12 = message.id;
                            tL_forumTopic2.top_message = i12;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            hVar2.k(tL_forumTopic2, h00.p(i12, j13));
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
                    h00Var2.y(j13, true);
                }
                if (arrayList3 != null) {
                    h00Var2.v(j13, arrayList3, null);
                    return;
                }
                return;
            case 7:
                a();
                return;
            default:
                c10 c10Var = (c10) this.b;
                long j14 = this.c;
                w00 w00Var = (w00) this.d;
                synchronized (c10Var) {
                    try {
                        ArrayList arrayList4 = (ArrayList) c10Var.E.get(Long.valueOf(j14));
                        if (arrayList4 != null) {
                            arrayList4.remove(w00Var);
                            if (arrayList4.isEmpty()) {
                                c10Var.E.remove(Long.valueOf(j14));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                tL_messages_translateText.flags |= 2;
                ArrayList arrayList5 = w00Var.c;
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj = arrayList5.get(i13);
                    i13++;
                    Pair pair = (Pair) obj;
                    z00 z00Var = (z00) pair.first;
                    z00 z00Var2 = (z00) pair.second;
                    TLRPC.TL_textWithEntities tL_textWithEntities = z00Var.a;
                    if (tL_textWithEntities != null && (z00Var2 == null || z00Var2.a == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities);
                    }
                    if (z00Var.b.size() != (z00Var2 == null ? 0 : z00Var2.b.size())) {
                        ArrayList arrayList6 = z00Var.b;
                        int size3 = arrayList6.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj2 = arrayList6.get(i14);
                            i14++;
                            tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                        }
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = z00Var.c;
                    if (tL_textWithEntities2 != null && (z00Var2 == null || z00Var2.c == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities2);
                    }
                }
                tL_messages_translateText.to_lang = c10.D(w00Var.e);
                int sendRequest = c10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new mj(c10Var, w00Var, j14, 11));
                synchronized (c10Var) {
                    w00Var.h = sendRequest;
                }
                return;
        }
    }

    public /* synthetic */ fr(c1 c1Var, long j3, Object obj, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = j3;
        this.d = obj;
    }
}
