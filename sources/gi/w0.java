package gi;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.qr;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ y0 c;

    public /* synthetic */ w0(qr qrVar, y0 y0Var, int i3) {
        this.a = i3;
        this.b = qrVar;
        this.c = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        switch (this.a) {
            case 0:
                qr qrVar = this.b;
                y0 y0Var = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase = qrVar.b;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase == null) {
                        return;
                    }
                    sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                    y0Var.b(nativeByteBuffer);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                    y0Var.b(nativeByteBuffer2);
                    sQLitePreparedStatement.bindLong(1, y0Var.a);
                    int i3 = 2;
                    sQLitePreparedStatement.bindLong(2, y0Var.b);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                    if (y0Var.G) {
                        i3 = 1;
                    } else if (!y0Var.M) {
                        i3 = 0;
                    }
                    sQLitePreparedStatement.bindInteger(4, i3);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer2.reuse();
                    sQLitePreparedStatement.dispose();
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                qr qrVar2 = this.b;
                y0 y0Var2 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLiteDatabase2 = qrVar2.b;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase2 == null) {
                        return;
                    }
                    sQLitePreparedStatement2 = sQLiteDatabase2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement2.requery();
                    NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                    y0Var2.b(nativeByteBuffer3);
                    NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                    y0Var2.b(nativeByteBuffer4);
                    sQLitePreparedStatement2.bindLong(1, y0Var2.a);
                    int i10 = 2;
                    sQLitePreparedStatement2.bindLong(2, y0Var2.b);
                    sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                    if (y0Var2.G) {
                        i10 = 1;
                    } else if (!y0Var2.M) {
                        i10 = 0;
                    }
                    sQLitePreparedStatement2.bindInteger(4, i10);
                    sQLitePreparedStatement2.step();
                    nativeByteBuffer4.reuse();
                    sQLitePreparedStatement2.dispose();
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
        }
    }
}
