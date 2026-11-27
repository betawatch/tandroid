// default package

import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ld7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ CountDownLatch e;

    public /* synthetic */ ld7(kf7 kf7Var, long j, boolean[] zArr, CountDownLatch countDownLatch, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = j;
        this.d = zArr;
        this.e = countDownLatch;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r1 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Exception e;
        SQLiteCursor sQLiteCursor;
        TLRPC.ChatFull chatFull;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        SQLiteCursor sQLiteCursor2 = null;
        CountDownLatch countDownLatch = this.e;
        boolean[] zArr = this.d;
        long j = this.c;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                try {
                    sQLiteCursor = kf7Var.b.queryFinalized("SELECT info FROM chat_settings_v2 WHERE uid = " + j, new Object[0]);
                    try {
                        try {
                            if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                chatFull = null;
                            } else {
                                chatFull = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                            }
                            sQLiteCursor.dispose();
                            zArr[0] = (chatFull instanceof TLRPC.TL_channelFull) && chatFull.migrated_from_chat_id != 0;
                            countDownLatch.countDown();
                        } catch (Exception e2) {
                            e = e2;
                            kf7Var.p(e, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            countDownLatch.countDown();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor2 = sQLiteCursor;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        countDownLatch.countDown();
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor2 != null) {
                    }
                    countDownLatch.countDown();
                    throw th;
                }
                countDownLatch.countDown();
                return;
            case 1:
                try {
                    try {
                        long e4 = kf7Var.getUserConfig().e();
                        sQLiteCursor2 = kf7Var.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + (-j) + " AND out = 0 ORDER BY mid DESC LIMIT 100", new Object[0]);
                        while (true) {
                            if (sQLiteCursor2.next()) {
                                NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    byteBufferValue2.reuse();
                                    TLRPC.MessageAction messageAction = TLdeserialize.action;
                                    if ((messageAction instanceof TLRPC.TL_messageActionChatAddUser) && messageAction.users.contains(Long.valueOf(e4))) {
                                        zArr[0] = true;
                                    }
                                }
                            }
                        }
                        sQLiteCursor2.dispose();
                    } catch (Throwable th3) {
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        countDownLatch.countDown();
                        throw th3;
                    }
                } catch (Exception e5) {
                    kf7Var.p(e5, true);
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                }
                countDownLatch.countDown();
                return;
            default:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = kf7Var.b;
                        Locale locale = Locale.US;
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT random_id FROM randoms_v2 WHERE random_id = " + j, new Object[0]);
                        if (sQLiteCursor2.next()) {
                            zArr[0] = true;
                        }
                    } catch (Exception e6) {
                        kf7Var.p(e6, true);
                        break;
                    }
                    sQLiteCursor2.dispose();
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th4) {
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                    throw th4;
                }
        }
    }
}
