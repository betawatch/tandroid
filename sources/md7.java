// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class md7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cf7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;

    public /* synthetic */ md7(cf7 cf7Var, ArrayList arrayList, int i, long j) {
        this.a = (byte) 2;
        this.b = cf7Var;
        this.d = arrayList;
        this.c = i;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.e;
        int i = this.c;
        ArrayList arrayList = this.d;
        cf7 cf7Var = this.b;
        switch (b) {
            case 0:
                cf7Var.getMessagesController().r4(i, j, arrayList);
                return;
            case 1:
                cf7Var.getMessagesController().c(null, this.c, -1, this.d, this.e);
                return;
            default:
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        if (arrayList != null) {
                            sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i2);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i);
                                sQLitePreparedStatement.bindLong(4, j);
                                sQLitePreparedStatement.bindInteger(5, i2);
                                sQLitePreparedStatement.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ md7(cf7 cf7Var, int i, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.c = i;
        this.d = arrayList;
        this.e = j;
    }
}
