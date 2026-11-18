package hi;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.tr;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;
    public final /* synthetic */ a1 c;

    public /* synthetic */ y0(tr trVar, a1 a1Var, int i7) {
        this.a = i7;
        this.b = trVar;
        this.c = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        switch (this.a) {
            case 0:
                tr trVar = this.b;
                a1 a1Var = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase = trVar.b;
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
                    a1Var.b(nativeByteBuffer);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                    a1Var.b(nativeByteBuffer2);
                    sQLitePreparedStatement.bindLong(1, a1Var.a);
                    int i7 = 2;
                    sQLitePreparedStatement.bindLong(2, a1Var.b);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                    if (a1Var.G) {
                        i7 = 1;
                    } else if (!a1Var.M) {
                        i7 = 0;
                    }
                    sQLitePreparedStatement.bindInteger(4, i7);
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
                tr trVar2 = this.b;
                a1 a1Var2 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLiteDatabase2 = trVar2.b;
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
                    a1Var2.b(nativeByteBuffer3);
                    NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                    a1Var2.b(nativeByteBuffer4);
                    sQLitePreparedStatement2.bindLong(1, a1Var2.a);
                    int i10 = 2;
                    sQLitePreparedStatement2.bindLong(2, a1Var2.b);
                    sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                    if (a1Var2.G) {
                        i10 = 1;
                    } else if (!a1Var2.M) {
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
