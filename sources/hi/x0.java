package hi;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.vr;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ z0 c;

    public /* synthetic */ x0(vr vrVar, z0 z0Var, int i7) {
        this.a = i7;
        this.b = vrVar;
        this.c = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        switch (this.a) {
            case 0:
                vr vrVar = this.b;
                z0 z0Var = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase = vrVar.b;
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
                    z0Var.b(nativeByteBuffer);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                    z0Var.b(nativeByteBuffer2);
                    sQLitePreparedStatement.bindLong(1, z0Var.a);
                    int i7 = 2;
                    sQLitePreparedStatement.bindLong(2, z0Var.b);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                    if (z0Var.G) {
                        i7 = 1;
                    } else if (!z0Var.M) {
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
                vr vrVar2 = this.b;
                z0 z0Var2 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLiteDatabase2 = vrVar2.b;
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
                    z0Var2.b(nativeByteBuffer3);
                    NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                    z0Var2.b(nativeByteBuffer4);
                    sQLitePreparedStatement2.bindLong(1, z0Var2.a);
                    int i10 = 2;
                    sQLitePreparedStatement2.bindLong(2, z0Var2.b);
                    sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                    if (z0Var2.G) {
                        i10 = 1;
                    } else if (!z0Var2.M) {
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
