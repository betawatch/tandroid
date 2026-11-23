package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class cr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cr(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
    }

    private final void a() {
        a10 a10Var = (a10) this.b;
        long j3 = this.c;
        v00 v00Var = (v00) this.d;
        synchronized (a10Var) {
            try {
                ArrayList arrayList = (ArrayList) a10Var.I.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(v00Var);
                    if (arrayList.isEmpty()) {
                        a10Var.I.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = a10Var.getMessagesController().l1(j3);
        tL_messages_translateRichMessage.id = v00Var.b;
        tL_messages_translateRichMessage.to_lang = a10.D(v00Var.d);
        int sendRequest = a10Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new ho(a10Var, v00Var, j3, 12));
        synchronized (a10Var) {
            v00Var.f = sendRequest;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d6, code lost:
    
        if (r3 == null) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        switch (this.a) {
            case 0:
                ((ur) this.b).getNotificationCenter().k(41, Long.valueOf(this.c), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 1:
                ur urVar = (ur) this.b;
                long j3 = this.c;
                nn nnVar = (nn) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = urVar.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j3, new Object[0]);
                    } catch (Exception e10) {
                        urVar.o(e10, true);
                        z10 = false;
                    }
                    if (sQLiteCursor.next()) {
                        if (sQLiteCursor.intValue(0) != 0) {
                            z10 = true;
                            sQLiteCursor.dispose();
                            if (z10) {
                                g0.g3(nnVar);
                                return;
                            }
                            return;
                        }
                    }
                    z10 = false;
                    sQLiteCursor.dispose();
                    if (z10) {
                    }
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 2:
                ur urVar2 = (ur) this.b;
                long j10 = this.c;
                zm zmVar = (zm) this.d;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor = urVar2.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                        if (sQLiteCursor.next()) {
                            iArr[0] = sQLiteCursor.intValue(0);
                        }
                    } catch (Exception e11) {
                        urVar2.o(e11, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    g0.g3(new gi(29, zmVar, iArr));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 3:
                ys.a((ys) this.b, (String) this.d, this.c);
                return;
            case 4:
                qv qvVar = (qv) this.b;
                TLObject tLObject = (TLObject) this.d;
                long j11 = this.c;
                a0.h hVar = qvVar.p;
                int i7 = qvVar.a;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int size = messages_messages.messages.size();
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    np.u1(i7).f4(messages_messages.users, false);
                    np.u1(i7).Z3(messages_messages.chats, false);
                    ur.a0(i7).m1(messages_messages.users, messages_messages.chats, true, true);
                    boolean z11 = size > 0;
                    if (size > 0) {
                        if (qvVar.r(size, j11, true)) {
                            qvVar.l();
                        } else if (!messages_messages.messages.isEmpty()) {
                            pv a10 = pv.a(i7, messages_messages.messages.get(0));
                            a10.e = size;
                            a10.i = true;
                            qvVar.c.add(a10);
                            qvVar.l();
                        }
                    }
                    ArrayList arrayList = (ArrayList) hVar.f(j11);
                    hVar.l(j11);
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((y10) arrayList.get(i10)).a(Boolean.valueOf(z11));
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                f00 f00Var = (f00) this.b;
                long j12 = this.c;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.d;
                f00Var.c.put(j12, 0);
                if ((f00Var.l(j12) != null ? r5.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    f00Var.d.put(j12, 1);
                    f00Var.getUserConfig().k().edit().putBoolean("topics_end_reached_" + j12, true).apply();
                }
                f00Var.getNotificationCenter().k(ls.t5, Long.valueOf(j12), Boolean.FALSE);
                return;
            case 6:
                f00 f00Var2 = (f00) this.b;
                long j13 = this.c;
                TLObject tLObject2 = (TLObject) this.d;
                f00Var2.n.delete(j13);
                if (tLObject2 instanceof TLRPC.TL_messages_forumTopics) {
                    ArrayList<Long> arrayList2 = ((TLRPC.TL_messages_forumTopics) tLObject2).top_icons;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    f00Var2.f.k(arrayList2, j13);
                    f00Var2.h.put(j13, System.currentTimeMillis());
                    f00Var2.getNotificationCenter().k(ls.t5, Long.valueOf(j13), Boolean.FALSE);
                    return;
                }
                return;
            case 7:
                boolean z12 = false;
                f00 f00Var3 = (f00) this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                long j14 = this.c;
                a0.h hVar2 = f00Var3.e;
                ArrayList arrayList4 = null;
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList3.get(i11);
                    a0.h hVar3 = (a0.h) f00Var3.b.f(j14);
                    if (hVar3 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hVar3.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            hVar2.l(f00.p(tL_forumTopic2.top_message, j14));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i12 = message.id;
                            tL_forumTopic2.top_message = i12;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            hVar2.k(tL_forumTopic2, f00.p(i12, j14));
                            z12 = true;
                        } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(tL_forumTopic);
                        }
                    }
                }
                if (z12) {
                    f00Var3.y(j14, true);
                }
                if (arrayList4 != null) {
                    f00Var3.v(j14, arrayList4, null);
                    return;
                }
                return;
            case 8:
                a();
                return;
            default:
                a10 a10Var = (a10) this.b;
                long j15 = this.c;
                u00 u00Var = (u00) this.d;
                synchronized (a10Var) {
                    try {
                        ArrayList arrayList5 = (ArrayList) a10Var.E.get(Long.valueOf(j15));
                        if (arrayList5 != null) {
                            arrayList5.remove(u00Var);
                            if (arrayList5.isEmpty()) {
                                a10Var.E.remove(Long.valueOf(j15));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                tL_messages_translateText.flags |= 2;
                ArrayList arrayList6 = u00Var.c;
                int size2 = arrayList6.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj = arrayList6.get(i13);
                    i13++;
                    Pair pair = (Pair) obj;
                    x00 x00Var = (x00) pair.first;
                    x00 x00Var2 = (x00) pair.second;
                    TLRPC.TL_textWithEntities tL_textWithEntities = x00Var.a;
                    if (tL_textWithEntities != null && (x00Var2 == null || x00Var2.a == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities);
                    }
                    if (x00Var.b.size() != (x00Var2 == null ? 0 : x00Var2.b.size())) {
                        ArrayList arrayList7 = x00Var.b;
                        int size3 = arrayList7.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj2 = arrayList7.get(i14);
                            i14++;
                            tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                        }
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = x00Var.c;
                    if (tL_textWithEntities2 != null && (x00Var2 == null || x00Var2.c == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities2);
                    }
                }
                tL_messages_translateText.to_lang = a10.D(u00Var.e);
                int sendRequest = a10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new ho(a10Var, u00Var, j15, 11));
                synchronized (a10Var) {
                    u00Var.h = sendRequest;
                }
                return;
        }
    }

    public /* synthetic */ cr(c1 c1Var, long j3, Object obj, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = j3;
        this.d = obj;
    }
}
