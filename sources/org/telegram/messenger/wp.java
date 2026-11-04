package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class wp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ CountDownLatch e;

    public /* synthetic */ wp(qr qrVar, long j10, boolean[] zArr, CountDownLatch countDownLatch, int i3) {
        this.a = i3;
        this.b = qrVar;
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
                qr qrVar = this.b;
                qrVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        queryFinalized = qrVar.b.queryFinalized("SELECT info FROM chat_settings_v2 WHERE uid = " + j10, new Object[0]);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e10) {
                    e = e10;
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
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = queryFinalized;
                    qrVar.o(e, true);
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
                qr qrVar2 = this.b;
                qrVar2.getClass();
                SQLiteCursor sQLiteCursor2 = null;
                try {
                    try {
                        long e12 = qrVar2.getUserConfig().e();
                        sQLiteCursor2 = qrVar2.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + (-j11) + " AND out = 0 ORDER BY mid DESC LIMIT 100", new Object[0]);
                        while (true) {
                            if (sQLiteCursor2.next()) {
                                NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    byteBufferValue2.reuse();
                                    TLRPC.MessageAction messageAction = TLdeserialize.action;
                                    if ((messageAction instanceof TLRPC.TL_messageActionChatAddUser) && messageAction.users.contains(Long.valueOf(e12))) {
                                        zArr2[0] = true;
                                    }
                                }
                            }
                        }
                        sQLiteCursor2.dispose();
                    } catch (Exception e13) {
                        qrVar2.o(e13, true);
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
                qr qrVar3 = this.b;
                qrVar3.getClass();
                SQLiteCursor sQLiteCursor3 = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = qrVar3.b;
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
                } catch (Exception e14) {
                    qrVar3.o(e14, true);
                    break;
                }
                sQLiteCursor3.dispose();
                this.e.countDown();
                return;
        }
    }
}
