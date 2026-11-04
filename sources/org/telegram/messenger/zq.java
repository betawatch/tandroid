package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zq(Object obj, Object obj2, long j10, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.c = j10;
    }

    private final void a() {
        x00 x00Var = (x00) this.b;
        long j10 = this.c;
        s00 s00Var = (s00) this.d;
        synchronized (x00Var) {
            try {
                ArrayList arrayList = (ArrayList) x00Var.I.get(Long.valueOf(j10));
                if (arrayList != null) {
                    arrayList.remove(s00Var);
                    if (arrayList.isEmpty()) {
                        x00Var.I.remove(Long.valueOf(j10));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = x00Var.getMessagesController().j1(j10);
        tL_messages_translateRichMessage.id = s00Var.b;
        tL_messages_translateRichMessage.to_lang = x00.D(s00Var.d);
        int sendRequest = x00Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new fj(x00Var, s00Var, j10, 12));
        synchronized (x00Var) {
            s00Var.f = sendRequest;
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
                ((qr) this.b).getNotificationCenter().k(41, Long.valueOf(this.c), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 1:
                qr qrVar = (qr) this.b;
                long j10 = this.c;
                jn jnVar = (jn) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = qrVar.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j10, new Object[0]);
                    } catch (Throwable th2) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    qrVar.o(e10, true);
                    z10 = false;
                }
                if (sQLiteCursor.next()) {
                    if (sQLiteCursor.intValue(0) != 0) {
                        z10 = true;
                        sQLiteCursor.dispose();
                        if (z10) {
                            g0.h3(jnVar);
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
                qr qrVar2 = (qr) this.b;
                long j11 = this.c;
                tm tmVar = (tm) this.d;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor = qrVar2.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j11, new Object[0]);
                        if (sQLiteCursor.next()) {
                            iArr[0] = sQLiteCursor.intValue(0);
                        }
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                } catch (Exception e11) {
                    qrVar2.o(e11, true);
                    break;
                }
                sQLiteCursor.dispose();
                g0.h3(new pq(7, tmVar, iArr));
                return;
            case 3:
                us.a((us) this.b, (String) this.d, this.c);
                return;
            case 4:
                nv nvVar = (nv) this.b;
                TLObject tLObject = (TLObject) this.d;
                long j12 = this.c;
                a0.h hVar = nvVar.p;
                int i3 = nvVar.a;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int size = messages_messages.messages.size();
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    hp.s1(i3).Y3(messages_messages.users, false);
                    hp.s1(i3).S3(messages_messages.chats, false);
                    qr.a0(i3).m1(messages_messages.users, messages_messages.chats, true, true);
                    boolean z11 = size > 0;
                    if (size > 0) {
                        if (nvVar.r(size, j12, true)) {
                            nvVar.l();
                        } else if (!messages_messages.messages.isEmpty()) {
                            mv a10 = mv.a(i3, messages_messages.messages.get(0));
                            a10.e = size;
                            a10.i = true;
                            nvVar.c.add(a10);
                            nvVar.l();
                        }
                    }
                    ArrayList arrayList = (ArrayList) hVar.f(j12);
                    hVar.l(j12);
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((u10) arrayList.get(i10)).a(Boolean.valueOf(z11));
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                c00 c00Var = (c00) this.b;
                long j13 = this.c;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.d;
                c00Var.c.put(j13, 0);
                if ((c00Var.l(j13) != null ? r4.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    c00Var.d.put(j13, 1);
                    c00Var.getUserConfig().k().edit().putBoolean("topics_end_reached_" + j13, true).apply();
                }
                c00Var.getNotificationCenter().k(hs.q5, Long.valueOf(j13), Boolean.FALSE);
                return;
            case 6:
                c00 c00Var2 = (c00) this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                long j14 = this.c;
                a0.h hVar2 = c00Var2.e;
                ArrayList arrayList3 = null;
                boolean z12 = false;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList2.get(i11);
                    a0.h hVar3 = (a0.h) c00Var2.b.f(j14);
                    if (hVar3 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hVar3.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            hVar2.l(c00.p(tL_forumTopic2.top_message, j14));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i12 = message.id;
                            tL_forumTopic2.top_message = i12;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            hVar2.k(tL_forumTopic2, c00.p(i12, j14));
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
                    c00Var2.y(j14, true);
                }
                if (arrayList3 != null) {
                    c00Var2.v(j14, arrayList3, null);
                    return;
                }
                return;
            case 7:
                a();
                return;
            default:
                x00 x00Var = (x00) this.b;
                long j15 = this.c;
                r00 r00Var = (r00) this.d;
                synchronized (x00Var) {
                    try {
                        ArrayList arrayList4 = (ArrayList) x00Var.E.get(Long.valueOf(j15));
                        if (arrayList4 != null) {
                            arrayList4.remove(r00Var);
                            if (arrayList4.isEmpty()) {
                                x00Var.E.remove(Long.valueOf(j15));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                tL_messages_translateText.flags |= 2;
                ArrayList arrayList5 = r00Var.c;
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj = arrayList5.get(i13);
                    i13++;
                    Pair pair = (Pair) obj;
                    u00 u00Var = (u00) pair.first;
                    u00 u00Var2 = (u00) pair.second;
                    TLRPC.TL_textWithEntities tL_textWithEntities = u00Var.a;
                    if (tL_textWithEntities != null && (u00Var2 == null || u00Var2.a == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities);
                    }
                    if (u00Var.b.size() != (u00Var2 == null ? 0 : u00Var2.b.size())) {
                        ArrayList arrayList6 = u00Var.b;
                        int size3 = arrayList6.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj2 = arrayList6.get(i14);
                            i14++;
                            tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                        }
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = u00Var.c;
                    if (tL_textWithEntities2 != null && (u00Var2 == null || u00Var2.c == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities2);
                    }
                }
                tL_messages_translateText.to_lang = x00.D(r00Var.e);
                int sendRequest = x00Var.getConnectionsManager().sendRequest(tL_messages_translateText, new fj(x00Var, r00Var, j15, 11));
                synchronized (x00Var) {
                    r00Var.h = sendRequest;
                }
                return;
        }
    }

    public /* synthetic */ zq(c1 c1Var, long j10, Object obj, int i3) {
        this.a = i3;
        this.b = c1Var;
        this.c = j10;
        this.d = obj;
    }
}
