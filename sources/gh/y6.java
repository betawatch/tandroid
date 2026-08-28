package gh;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;

    public /* synthetic */ y6(int i9, int i10, long j10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = i9;
        this.d = arrayList;
        this.e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i9 = this.c;
                long j10 = this.e;
                SQLiteDatabase database = this.b.getDatabase();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        database.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        ArrayList arrayList = this.d;
                        if (arrayList != null) {
                            sQLitePreparedStatement = database.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i9);
                                sQLitePreparedStatement.bindLong(4, j10);
                                sQLitePreparedStatement.bindInteger(5, i10);
                                sQLitePreparedStatement.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 1:
                this.b.lambda$loadPendingTasks$27(this.c, this.d, this.e);
                return;
            default:
                this.b.lambda$loadPendingTasks$28(this.c, this.d, this.e);
                return;
        }
    }

    public /* synthetic */ y6(MessagesStorage messagesStorage, long j10, ArrayList arrayList, int i9) {
        this.a = 0;
        this.b = messagesStorage;
        this.d = arrayList;
        this.c = i9;
        this.e = j10;
    }
}
