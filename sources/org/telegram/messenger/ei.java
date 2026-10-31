package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ei implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ a0.h d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ f1 f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ei(ui uiVar, k00 k00Var, l00 l00Var, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f = uiVar;
        this.h = k00Var;
        this.n = l00Var;
        this.c = arrayList;
        this.b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.f;
                k00 k00Var = (k00) this.h;
                l00 l00Var = (l00) this.n;
                ArrayList arrayList = this.c;
                l00.a(k00Var);
                k00 d = l00.d(l00Var, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j10 = this.b;
                        a0.h hVar = this.d;
                        if (!next) {
                            queryFinalized.dispose();
                            if (hVar.m() != 0) {
                                for (int i10 = 0; i10 < hVar.m(); i10++) {
                                    ArrayList arrayList3 = (ArrayList) hVar.n(i10);
                                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                                        TLRPC.MessageReplyHeader messageReplyHeader = ((jj) arrayList3.get(i11)).k.reply_to;
                                        if (messageReplyHeader != null) {
                                            messageReplyHeader.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            l00.a(d);
                            i0.g3(new wm(uiVar, l00.d(l00Var, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j10, arrayList2, 3));
                            Runnable runnable = this.e;
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                        } else {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, uiVar.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j10;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList4 = (ArrayList) hVar.f(longValue);
                                hVar.l(longValue);
                                if (arrayList4 != null) {
                                    jj jjVar = new jj(uiVar.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(jjVar);
                                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                                        jj jjVar2 = (jj) arrayList4.get(i12);
                                        jjVar2.C = jjVar;
                                        jjVar2.m();
                                        jjVar2.k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = jjVar2.k.reply_to;
                                        messageReplyHeader2.flags |= 16;
                                        messageReplyHeader2.reply_to_msg_id = jjVar.M1();
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
                break;
            default:
                x00 x00Var = (x00) this.f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.n;
                int i13 = 0;
                x00Var.getMessagesController().V3(tL_messages_savedDialogs.users, false);
                x00Var.getMessagesController().P3(tL_messages_savedDialogs.chats, false);
                long j11 = this.b;
                ArrayList arrayList5 = this.c;
                x00Var.u(j11, arrayList5, this.d, false, 2, -1);
                long j12 = -j11;
                x00Var.getMessagesStorage().C1(x00Var.getConnectionsManager().getCurrentTime(), j12, (List) x00Var.a.f(j11), true);
                x00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i13 < size) {
                    Object obj = arrayList5.get(i13);
                    i13++;
                    hashSet.remove(Long.valueOf(o5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    hs messagesStorage = x00Var.getMessagesStorage();
                    messagesStorage.a.c(new aq(1, j12, longValue2, messagesStorage));
                    x00Var.s(j11, longValue2);
                }
                Runnable runnable2 = this.e;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ei(x00 x00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f = x00Var;
        this.h = tL_messages_savedDialogs;
        this.b = j10;
        this.c = arrayList;
        this.d = hVar;
        this.n = hashSet;
        this.e = runnable;
    }
}
