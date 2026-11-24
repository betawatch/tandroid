// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lc7 implements Runnable {
    public final /* synthetic */ ad7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ int f;

    public /* synthetic */ lc7(ad7 ad7Var, int i, long j, int i2, ArrayList arrayList, int i3) {
        this.a = ad7Var;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.e = arrayList;
        this.f = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        TLRPC.MessageReplies messageReplies;
        NativeByteBuffer byteBufferValue;
        ad7 ad7Var = this.a;
        int i = this.b;
        long j = this.c;
        int i2 = this.d;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            SQLitePreparedStatement executeFast = ad7Var.b.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
            try {
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                Locale locale = Locale.ENGLISH;
                long j2 = -j;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT replies_data FROM messages_v2 WHERE mid = " + i + " AND uid = " + j2, new Object[0]);
                try {
                    if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                        messageReplies = null;
                    } else {
                        messageReplies = TLRPC.MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    sQLiteCursor.dispose();
                    if (messageReplies != null) {
                        int i3 = messageReplies.replies + i2;
                        messageReplies.replies = i3;
                        if (i3 < 0) {
                            messageReplies.replies = 0;
                        }
                        ArrayList<TLRPC.Peer> arrayList = this.e;
                        if (arrayList != null) {
                            messageReplies.recent_repliers = arrayList;
                            messageReplies.flags |= 2;
                        }
                        int i4 = this.f;
                        if (i4 != 0) {
                            messageReplies.max_id = i4;
                        }
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageReplies.getObjectSize());
                        messageReplies.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i);
                        executeFast.bindLong(3, j2);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                    executeFast.dispose();
                } catch (Exception e) {
                    e = e;
                    sQLitePreparedStatement = executeFast;
                    try {
                        ad7Var.n(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLitePreparedStatement = executeFast;
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                sQLiteCursor = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = null;
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteCursor = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }
}
