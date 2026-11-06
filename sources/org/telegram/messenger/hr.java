package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class hr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hr(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
    }

    private final void a() {
        f10 f10Var = (f10) this.b;
        long j3 = this.c;
        a10 a10Var = (a10) this.d;
        synchronized (f10Var) {
            try {
                ArrayList arrayList = (ArrayList) f10Var.H.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(a10Var);
                    if (arrayList.isEmpty()) {
                        f10Var.H.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = f10Var.getMessagesController().j1(j3);
        tL_messages_translateRichMessage.id = a10Var.b;
        tL_messages_translateRichMessage.to_lang = f10.D(a10Var.d);
        int sendRequest = f10Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new oj(f10Var, a10Var, j3, 12));
        synchronized (f10Var) {
            a10Var.f = sendRequest;
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
        boolean z9;
        SQLiteCursor sQLiteCursor = null;
        switch (this.a) {
            case 0:
                ((yr) this.b).getNotificationCenter().k(41, Long.valueOf(this.c), Boolean.TRUE, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 1:
                yr yrVar = (yr) this.b;
                long j3 = this.c;
                tn tnVar = (tn) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = yrVar.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j3, new Object[0]);
                    } catch (Throwable th2) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    yrVar.o(e10, true);
                    z9 = false;
                }
                if (sQLiteCursor.next()) {
                    if (sQLiteCursor.intValue(0) != 0) {
                        z9 = true;
                        sQLiteCursor.dispose();
                        if (z9) {
                            g0.h3(tnVar);
                            return;
                        }
                        return;
                    }
                }
                z9 = false;
                sQLiteCursor.dispose();
                if (z9) {
                }
            case 2:
                yr yrVar2 = (yr) this.b;
                long j10 = this.c;
                dn dnVar = (dn) this.d;
                int[] iArr = new int[1];
                try {
                    try {
                        sQLiteCursor = yrVar2.b.queryFinalized("SELECT MAX(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                        if (sQLiteCursor.next()) {
                            iArr[0] = sQLiteCursor.intValue(0);
                        }
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                } catch (Exception e11) {
                    yrVar2.o(e11, true);
                    break;
                }
                sQLiteCursor.dispose();
                g0.h3(new yq(7, dnVar, iArr));
                return;
            case 3:
                dt.a((dt) this.b, (String) this.d, this.c);
                return;
            case 4:
                vv vvVar = (vv) this.b;
                TLObject tLObject = (TLObject) this.d;
                long j11 = this.c;
                a0.h hVar = vvVar.p;
                int i7 = vvVar.a;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    int size = messages_messages.messages.size();
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    qp.s1(i7).Y3(messages_messages.users, false);
                    qp.s1(i7).S3(messages_messages.chats, false);
                    yr.a0(i7).m1(messages_messages.users, messages_messages.chats, true, true);
                    boolean z10 = size > 0;
                    if (size > 0) {
                        if (vvVar.r(size, j11, true)) {
                            vvVar.l();
                        } else if (!messages_messages.messages.isEmpty()) {
                            uv a10 = uv.a(i7, messages_messages.messages.get(0));
                            a10.e = size;
                            a10.i = true;
                            vvVar.c.add(a10);
                            vvVar.l();
                        }
                    }
                    ArrayList arrayList = (ArrayList) hVar.f(j11);
                    hVar.l(j11);
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((c20) arrayList.get(i10)).a(Boolean.valueOf(z10));
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                k00 k00Var = (k00) this.b;
                long j12 = this.c;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.d;
                k00Var.c.put(j12, 0);
                if ((k00Var.l(j12) != null ? r4.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    k00Var.d.put(j12, 1);
                    k00Var.getUserConfig().k().edit().putBoolean("topics_end_reached_" + j12, true).apply();
                }
                k00Var.getNotificationCenter().k(qs.q5, Long.valueOf(j12), Boolean.FALSE);
                return;
            case 6:
                k00 k00Var2 = (k00) this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                long j13 = this.c;
                a0.h hVar2 = k00Var2.e;
                ArrayList arrayList3 = null;
                boolean z11 = false;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList2.get(i11);
                    a0.h hVar3 = (a0.h) k00Var2.b.f(j13);
                    if (hVar3 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hVar3.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            hVar2.l(k00.p(tL_forumTopic2.top_message, j13));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i12 = message.id;
                            tL_forumTopic2.top_message = i12;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            hVar2.k(tL_forumTopic2, k00.p(i12, j13));
                            z11 = true;
                        } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(tL_forumTopic);
                        }
                    }
                }
                if (z11) {
                    k00Var2.y(j13, true);
                }
                if (arrayList3 != null) {
                    k00Var2.v(j13, arrayList3, null);
                    return;
                }
                return;
            case 7:
                a();
                return;
            default:
                f10 f10Var = (f10) this.b;
                long j14 = this.c;
                z00 z00Var = (z00) this.d;
                synchronized (f10Var) {
                    try {
                        ArrayList arrayList4 = (ArrayList) f10Var.D.get(Long.valueOf(j14));
                        if (arrayList4 != null) {
                            arrayList4.remove(z00Var);
                            if (arrayList4.isEmpty()) {
                                f10Var.D.remove(Long.valueOf(j14));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                tL_messages_translateText.flags |= 2;
                ArrayList arrayList5 = z00Var.c;
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj = arrayList5.get(i13);
                    i13++;
                    Pair pair = (Pair) obj;
                    c10 c10Var = (c10) pair.first;
                    c10 c10Var2 = (c10) pair.second;
                    TLRPC.TL_textWithEntities tL_textWithEntities = c10Var.a;
                    if (tL_textWithEntities != null && (c10Var2 == null || c10Var2.a == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities);
                    }
                    if (c10Var.b.size() != (c10Var2 == null ? 0 : c10Var2.b.size())) {
                        ArrayList arrayList6 = c10Var.b;
                        int size3 = arrayList6.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj2 = arrayList6.get(i14);
                            i14++;
                            tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                        }
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = c10Var.c;
                    if (tL_textWithEntities2 != null && (c10Var2 == null || c10Var2.c == null)) {
                        tL_messages_translateText.text.add(tL_textWithEntities2);
                    }
                }
                tL_messages_translateText.to_lang = f10.D(z00Var.e);
                int sendRequest = f10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new oj(f10Var, z00Var, j14, 11));
                synchronized (f10Var) {
                    z00Var.h = sendRequest;
                }
                return;
        }
    }

    public /* synthetic */ hr(c1 c1Var, long j3, Object obj, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = j3;
        this.d = obj;
    }
}
