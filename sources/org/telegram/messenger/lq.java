package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class lq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ CountDownLatch e;

    public /* synthetic */ lq(hs hsVar, long j10, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r6 == null) goto L17;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor queryFinalized;
        TLRPC.ChatFull chatFull;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                long j10 = this.c;
                boolean[] zArr = this.d;
                CountDownLatch countDownLatch = this.e;
                hs hsVar = this.b;
                hsVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        queryFinalized = hsVar.b.queryFinalized("SELECT info FROM chat_settings_v2 WHERE uid = " + j10, new Object[0]);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e) {
                    e = e;
                }
                try {
                    new ArrayList();
                    if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        chatFull = null;
                    } else {
                        chatFull = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    zArr[0] = (chatFull instanceof TLRPC.TL_channelFull) && chatFull.migrated_from_chat_id != 0;
                    countDownLatch.countDown();
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = queryFinalized;
                    hsVar.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    countDownLatch.countDown();
                    throw th;
                }
                countDownLatch.countDown();
                return;
            case 1:
                long j11 = this.c;
                boolean[] zArr2 = this.d;
                CountDownLatch countDownLatch2 = this.e;
                hs hsVar2 = this.b;
                hsVar2.getClass();
                SQLiteCursor sQLiteCursor2 = null;
                try {
                    try {
                        long e10 = hsVar2.getUserConfig().e();
                        sQLiteCursor2 = hsVar2.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + (-j11) + " AND out = 0 ORDER BY mid DESC LIMIT 100", new Object[0]);
                        while (true) {
                            if (sQLiteCursor2.next()) {
                                NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    byteBufferValue2.reuse();
                                    TLRPC.MessageAction messageAction = TLdeserialize.action;
                                    if ((messageAction instanceof TLRPC.TL_messageActionChatAddUser) && messageAction.users.contains(Long.valueOf(e10))) {
                                        zArr2[0] = true;
                                    }
                                }
                            }
                        }
                        sQLiteCursor2.dispose();
                    } catch (Exception e11) {
                        hsVar2.o(e11, true);
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                    }
                    countDownLatch2.countDown();
                    return;
                } catch (Throwable th4) {
                    countDownLatch2.countDown();
                    throw th4;
                }
            default:
                long j12 = this.c;
                boolean[] zArr3 = this.d;
                hs hsVar3 = this.b;
                hsVar3.getClass();
                SQLiteCursor sQLiteCursor3 = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = hsVar3.b;
                        Locale locale = Locale.US;
                        sQLiteCursor3 = sQLiteDatabase.queryFinalized("SELECT random_id FROM randoms_v2 WHERE random_id = " + j12, new Object[0]);
                        if (sQLiteCursor3.next()) {
                            zArr3[0] = true;
                        }
                    } finally {
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                    }
                } catch (Exception e12) {
                    hsVar3.o(e12, true);
                    break;
                }
                sQLiteCursor3.dispose();
                this.e.countDown();
                return;
        }
    }
}
