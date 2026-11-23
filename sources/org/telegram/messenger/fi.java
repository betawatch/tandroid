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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fi implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ a0.h d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ c1 f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ fi(si siVar, tz tzVar, uz uzVar, ArrayList arrayList, long j3, a0.h hVar, Runnable runnable) {
        this.f = siVar;
        this.h = tzVar;
        this.n = uzVar;
        this.c = arrayList;
        this.b = j3;
        this.d = hVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                si siVar = (si) this.f;
                tz tzVar = (tz) this.h;
                uz uzVar = (uz) this.n;
                ArrayList arrayList = this.c;
                uz.a(tzVar);
                tz d = uz.d(uzVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j3 = this.b;
                        a0.h hVar = this.d;
                        if (!next) {
                            queryFinalized.dispose();
                            if (hVar.m() != 0) {
                                for (int i7 = 0; i7 < hVar.m(); i7++) {
                                    ArrayList arrayList3 = (ArrayList) hVar.n(i7);
                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                        TLRPC.MessageReplyHeader messageReplyHeader = ((gj) arrayList3.get(i10)).k.reply_to;
                                        if (messageReplyHeader != null) {
                                            messageReplyHeader.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            uz.a(d);
                            g0.g3(new gm(siVar, uz.d(uzVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j3, arrayList2, 3));
                            Runnable runnable = this.e;
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                        } else {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, siVar.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j3;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList4 = (ArrayList) hVar.f(longValue);
                                hVar.l(longValue);
                                if (arrayList4 != null) {
                                    gj gjVar = new gj(siVar.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(gjVar);
                                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                        gj gjVar2 = (gj) arrayList4.get(i11);
                                        gjVar2.C = gjVar;
                                        gjVar2.m();
                                        gjVar2.k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = gjVar2.k.reply_to;
                                        messageReplyHeader2.flags |= 16;
                                        messageReplyHeader2.reply_to_msg_id = gjVar.L1();
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
                break;
            default:
                f00 f00Var = (f00) this.f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.n;
                int i12 = 0;
                f00Var.getMessagesController().f4(tL_messages_savedDialogs.users, false);
                f00Var.getMessagesController().Z3(tL_messages_savedDialogs.chats, false);
                long j10 = this.b;
                ArrayList arrayList5 = this.c;
                f00Var.u(j10, arrayList5, this.d, false, 2, -1);
                long j11 = -j10;
                f00Var.getMessagesStorage().C1(f00Var.getConnectionsManager().getCurrentTime(), j11, (List) f00Var.a.f(j10), true);
                f00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    hashSet.remove(Long.valueOf(n5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    ur messagesStorage = f00Var.getMessagesStorage();
                    messagesStorage.a.c(new op(1, j11, longValue2, messagesStorage));
                    f00Var.s(j10, longValue2);
                }
                Runnable runnable2 = this.e;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fi(f00 f00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f = f00Var;
        this.h = tL_messages_savedDialogs;
        this.b = j3;
        this.c = arrayList;
        this.d = hVar;
        this.n = hashSet;
        this.e = runnable;
    }
}
