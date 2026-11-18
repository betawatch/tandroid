package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class br implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ br(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
    }

    private final void a() {
        z00 z00Var = (z00) this.b;
        long j3 = this.c;
        u00 u00Var = (u00) this.d;
        synchronized (z00Var) {
            try {
                ArrayList arrayList = (ArrayList) z00Var.I.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(u00Var);
                    if (arrayList.isEmpty()) {
                        z00Var.I.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = z00Var.getMessagesController().l1(j3);
        tL_messages_translateRichMessage.id = u00Var.b;
        tL_messages_translateRichMessage.to_lang = z00.D(u00Var.d);
        int sendRequest = z00Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new go(z00Var, u00Var, j3, 12));
        synchronized (z00Var) {
            u00Var.f = sendRequest;
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
                ((tr) this.b).getNotificationCenter().k(41, Long.valueOf(this.c), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 1:
                tr trVar = (tr) this.b;
                long j3 = this.c;
                mn mnVar = (mn) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = trVar.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j3, new Object[0]);
                    } catch (Exception e10) {
                        trVar.o(e10, true);
                        z10 = false;
                    }
                    if (sQLiteCursor.next()) {
                        if (sQLiteCursor.intValue(0) != 0) {
                            z10 = true;
                            sQLiteCursor.dispose();
                            if (z10) {
                                g0.g3(mnVar);
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
                tr trVar2 = (tr) this.b;
                long j10 = this.c;
                ym ymVar = (ym) this.d;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor = trVar2.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                        if (sQLiteCursor.next()) {
                            iArr[0] = sQLiteCursor.intValue(0);
                        }
                    } catch (Exception e11) {
                        trVar2.o(e11, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    g0.g3(new fi(29, ymVar, iArr));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 3:
                xs.a((xs) this.b, (String) this.d, this.c);
                return;
            case 4:
                pv pvVar = (pv) this.b;
                TLObject tLObject = (TLObject) this.d;
                long j11 = this.c;
                a0.h hVar = pvVar.p;
                int i7 = pvVar.a;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int size = messages_messages.messages.size();
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    mp.u1(i7).f4(messages_messages.users, false);
                    mp.u1(i7).Z3(messages_messages.chats, false);
                    tr.a0(i7).m1(messages_messages.users, messages_messages.chats, true, true);
                    boolean z11 = size > 0;
                    if (size > 0) {
                        if (pvVar.r(size, j11, true)) {
                            pvVar.l();
                        } else if (!messages_messages.messages.isEmpty()) {
                            ov a10 = ov.a(i7, messages_messages.messages.get(0));
                            a10.e = size;
                            a10.i = true;
                            pvVar.c.add(a10);
                            pvVar.l();
                        }
                    }
                    ArrayList arrayList = (ArrayList) hVar.f(j11);
                    hVar.l(j11);
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((x10) arrayList.get(i10)).a(Boolean.valueOf(z11));
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                e00 e00Var = (e00) this.b;
                long j12 = this.c;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.d;
                e00Var.c.put(j12, 0);
                if ((e00Var.l(j12) != null ? r5.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    e00Var.d.put(j12, 1);
                    e00Var.getUserConfig().k().edit().putBoolean("topics_end_reached_" + j12, true).apply();
                }
                e00Var.getNotificationCenter().k(ks.t5, Long.valueOf(j12), Boolean.FALSE);
                return;
            case 6:
                e00 e00Var2 = (e00) this.b;
                long j13 = this.c;
                TLObject tLObject2 = (TLObject) this.d;
                e00Var2.n.delete(j13);
                if (tLObject2 instanceof TLRPC.TL_messages_forumTopics) {
                    ArrayList<Long> arrayList2 = ((TLRPC.TL_messages_forumTopics) tLObject2).top_icons;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    e00Var2.f.k(arrayList2, j13);
                    e00Var2.h.put(j13, System.currentTimeMillis());
                    e00Var2.getNotificationCenter().k(ks.t5, Long.valueOf(j13), Boolean.FALSE);
                    return;
                }
                return;
            case 7:
                boolean z12 = false;
                e00 e00Var3 = (e00) this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                long j14 = this.c;
                a0.h hVar2 = e00Var3.e;
                ArrayList arrayList4 = null;
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList3.get(i11);
                    a0.h hVar3 = (a0.h) e00Var3.b.f(j14);
                    if (hVar3 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hVar3.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            hVar2.l(e00.p(tL_forumTopic2.top_message, j14));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i12 = message.id;
                            tL_forumTopic2.top_message = i12;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            hVar2.k(tL_forumTopic2, e00.p(i12, j14));
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
                    e00Var3.y(j14, true);
                }
                if (arrayList4 != null) {
                    e00Var3.v(j14, arrayList4, null);
                    return;
                }
                return;
            case 8:
                a();
                return;
            default:
                z00 z00Var = (z00) this.b;
                long j15 = this.c;
                t00 t00Var = (t00) this.d;
                synchronized (z00Var) {
                    try {
                        ArrayList arrayList5 = (ArrayList) z00Var.E.get(Long.valueOf(j15));
                        if (arrayList5 != null) {
                            arrayList5.remove(t00Var);
                            if (arrayList5.isEmpty()) {
                                z00Var.E.remove(Long.valueOf(j15));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                tL_messages_translateText.flags |= 2;
                ArrayList arrayList6 = t00Var.c;
                int size2 = arrayList6.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj = arrayList6.get(i13);
                    i13++;
                    Pair pair = (Pair) obj;
                    w00 w00Var = (w00) pair.first;
                    w00 w00Var2 = (w00) pair.second;
                    TLRPC.TL_textWithEntities tL_textWithEntities = w00Var.a;
                    if (tL_textWithEntities != null && (w00Var2 == null || w00Var2.a == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities);
                    }
                    if (w00Var.b.size() != (w00Var2 == null ? 0 : w00Var2.b.size())) {
                        ArrayList arrayList7 = w00Var.b;
                        int size3 = arrayList7.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj2 = arrayList7.get(i14);
                            i14++;
                            tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                        }
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = w00Var.c;
                    if (tL_textWithEntities2 != null && (w00Var2 == null || w00Var2.c == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities2);
                    }
                }
                tL_messages_translateText.to_lang = z00.D(t00Var.e);
                int sendRequest = z00Var.getConnectionsManager().sendRequest(tL_messages_translateText, new go(z00Var, t00Var, j15, 11));
                synchronized (z00Var) {
                    t00Var.h = sendRequest;
                }
                return;
        }
    }

    public /* synthetic */ br(c1 c1Var, long j3, Object obj, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = j3;
        this.d = obj;
    }
}
