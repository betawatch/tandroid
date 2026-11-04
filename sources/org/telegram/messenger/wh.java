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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class wh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ a0.h d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ c1 f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ wh(li liVar, rz rzVar, sz szVar, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f = liVar;
        this.h = rzVar;
        this.n = szVar;
        this.c = arrayList;
        this.b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                li liVar = (li) this.f;
                rz rzVar = (rz) this.h;
                sz szVar = (sz) this.n;
                ArrayList arrayList = this.c;
                sz.a(rzVar);
                rz d = sz.d(szVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j10 = this.b;
                        a0.h hVar = this.d;
                        if (!next) {
                            queryFinalized.dispose();
                            if (hVar.m() != 0) {
                                for (int i3 = 0; i3 < hVar.m(); i3++) {
                                    ArrayList arrayList3 = (ArrayList) hVar.n(i3);
                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                        TLRPC.MessageReplyHeader messageReplyHeader = ((zi) arrayList3.get(i10)).k.reply_to;
                                        if (messageReplyHeader != null) {
                                            messageReplyHeader.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            sz.a(d);
                            g0.h3(new zl(liVar, sz.d(szVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j10, arrayList2, 3));
                            Runnable runnable = this.e;
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                        } else {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, liVar.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j10;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList4 = (ArrayList) hVar.f(longValue);
                                hVar.l(longValue);
                                if (arrayList4 != null) {
                                    zi ziVar = new zi(liVar.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(ziVar);
                                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                        zi ziVar2 = (zi) arrayList4.get(i11);
                                        ziVar2.C = ziVar;
                                        ziVar2.m();
                                        ziVar2.k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = ziVar2.k.reply_to;
                                        messageReplyHeader2.flags |= 16;
                                        messageReplyHeader2.reply_to_msg_id = ziVar.M1();
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
                c00 c00Var = (c00) this.f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.n;
                int i12 = 0;
                c00Var.getMessagesController().Y3(tL_messages_savedDialogs.users, false);
                c00Var.getMessagesController().S3(tL_messages_savedDialogs.chats, false);
                long j11 = this.b;
                ArrayList arrayList5 = this.c;
                c00Var.u(j11, arrayList5, this.d, false, 2, -1);
                long j12 = -j11;
                c00Var.getMessagesStorage().C1(c00Var.getConnectionsManager().getCurrentTime(), j12, (List) c00Var.a.f(j11), true);
                c00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    hashSet.remove(Long.valueOf(m5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    qr messagesStorage = c00Var.getMessagesStorage();
                    messagesStorage.a.c(new mp(1, j12, longValue2, messagesStorage));
                    c00Var.s(j11, longValue2);
                }
                Runnable runnable2 = this.e;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wh(c00 c00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f = c00Var;
        this.h = tL_messages_savedDialogs;
        this.b = j10;
        this.c = arrayList;
        this.d = hVar;
        this.n = hashSet;
        this.e = runnable;
    }
}
