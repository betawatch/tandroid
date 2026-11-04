package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ rp(qr qrVar, int i3, long j10, int i10) {
        this.a = i10;
        this.b = qrVar;
        this.c = i3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i3 = this.c;
                long j10 = this.d;
                qr qrVar = this.b;
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i3 + " WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (SQLiteException e10) {
                    qrVar.o(e10, true);
                    return;
                }
            case 1:
                this.b.A0(this.c, this.d);
                return;
            case 2:
                int i10 = this.c;
                long j11 = this.d;
                qr qrVar2 = this.b;
                qrVar2.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = qrVar2.b.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, i10);
                        sQLitePreparedStatement.bindLong(2, j11);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e11) {
                    qrVar2.o(e11, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
                return;
            case 3:
                int i11 = this.c;
                long j12 = this.d;
                qr qrVar3 = this.b;
                qrVar3.getClass();
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLitePreparedStatement2 = qrVar3.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        sQLitePreparedStatement2.bindInteger(1, i11);
                        sQLitePreparedStatement2.bindLong(2, j12);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Exception e12) {
                        qrVar3.o(e12, true);
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
            case 4:
                int i12 = this.c;
                long j13 = this.d;
                qr qrVar4 = this.b;
                qrVar4.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase2 = qrVar4.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i12 + " AND uid = " + j13).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    qrVar4.o(e13, true);
                    return;
                }
            case 5:
                int i13 = this.c;
                long j14 = this.d;
                qr qrVar5 = this.b;
                qrVar5.getClass();
                try {
                    SQLitePreparedStatement executeFast = qrVar5.b.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
                    executeFast.bindInteger(1, i13);
                    executeFast.bindLong(2, -j14);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e14) {
                    qrVar5.o(e14, true);
                    return;
                }
            case 6:
                qr qrVar6 = this.b;
                int i14 = this.c;
                long j15 = this.d;
                try {
                    SQLiteDatabase sQLiteDatabase3 = qrVar6.b;
                    Locale locale3 = Locale.US;
                    sQLiteDatabase3.executeFast("DELETE FROM download_queue WHERE uid = " + j15 + " AND type = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    qrVar6.o(e15, true);
                    return;
                }
            default:
                int i15 = this.c;
                long j16 = this.d;
                qr qrVar7 = this.b;
                qrVar7.getClass();
                SQLitePreparedStatement sQLitePreparedStatement3 = null;
                try {
                    try {
                        sQLitePreparedStatement3 = qrVar7.b.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                        sQLitePreparedStatement3.requery();
                        sQLitePreparedStatement3.bindInteger(1, i15);
                        sQLitePreparedStatement3.bindLong(2, j16);
                        sQLitePreparedStatement3.step();
                        sQLitePreparedStatement3.dispose();
                        return;
                    } catch (Exception e16) {
                        qrVar7.o(e16, true);
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th4) {
                    if (sQLitePreparedStatement3 != null) {
                        sQLitePreparedStatement3.dispose();
                    }
                    throw th4;
                }
        }
    }
}
