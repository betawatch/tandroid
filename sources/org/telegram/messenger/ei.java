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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ei implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ a0.h d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ c1 f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ei(ri riVar, sz szVar, tz tzVar, ArrayList arrayList, long j3, a0.h hVar, Runnable runnable) {
        this.f = riVar;
        this.h = szVar;
        this.n = tzVar;
        this.c = arrayList;
        this.b = j3;
        this.d = hVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ri riVar = (ri) this.f;
                sz szVar = (sz) this.h;
                tz tzVar = (tz) this.n;
                ArrayList arrayList = this.c;
                tz.a(szVar);
                sz d = tz.d(tzVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = riVar.getMessagesStorage().b;
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
                                        TLRPC.MessageReplyHeader messageReplyHeader = ((fj) arrayList3.get(i10)).k.reply_to;
                                        if (messageReplyHeader != null) {
                                            messageReplyHeader.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            tz.a(d);
                            g0.g3(new fm(riVar, tz.d(tzVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j3, arrayList2, 3));
                            Runnable runnable = this.e;
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                        } else {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, riVar.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j3;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList4 = (ArrayList) hVar.f(longValue);
                                hVar.l(longValue);
                                if (arrayList4 != null) {
                                    fj fjVar = new fj(riVar.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(fjVar);
                                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                        fj fjVar2 = (fj) arrayList4.get(i11);
                                        fjVar2.C = fjVar;
                                        fjVar2.m();
                                        fjVar2.k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = fjVar2.k.reply_to;
                                        messageReplyHeader2.flags |= 16;
                                        messageReplyHeader2.reply_to_msg_id = fjVar.L1();
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
                e00 e00Var = (e00) this.f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.n;
                int i12 = 0;
                e00Var.getMessagesController().f4(tL_messages_savedDialogs.users, false);
                e00Var.getMessagesController().Z3(tL_messages_savedDialogs.chats, false);
                long j10 = this.b;
                ArrayList arrayList5 = this.c;
                e00Var.u(j10, arrayList5, this.d, false, 2, -1);
                long j11 = -j10;
                e00Var.getMessagesStorage().C1(e00Var.getConnectionsManager().getCurrentTime(), j11, (List) e00Var.a.f(j10), true);
                e00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    hashSet.remove(Long.valueOf(n5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    tr messagesStorage = e00Var.getMessagesStorage();
                    messagesStorage.a.c(new np(1, j11, longValue2, messagesStorage));
                    e00Var.s(j10, longValue2);
                }
                Runnable runnable2 = this.e;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ei(e00 e00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f = e00Var;
        this.h = tL_messages_savedDialogs;
        this.b = j3;
        this.c = arrayList;
        this.d = hVar;
        this.n = hashSet;
        this.e = runnable;
    }
}
