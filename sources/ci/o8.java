package ci;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ o8(e9 e9Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i3, zi ziVar, long j11) {
        this.f = e9Var;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.c = z10;
        this.b = j10;
        this.e = i3;
        this.s = ziVar;
        this.d = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement executeFast;
        int intValue;
        Throwable th2;
        switch (this.a) {
            case 0:
                e9 e9Var = (e9) this.f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.r;
                boolean z10 = this.c;
                long j10 = this.b;
                int i3 = this.e;
                zi ziVar = (zi) this.s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.d.c(new a8(e9Var, tLObject, 5));
                    runnable.run();
                    return;
                } else {
                    if (tL_error == null || !org.telegram.messenger.r8.r(tL_error.text) || z10) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = hp.s1(e9Var.a).j1(j10);
                    tL_messages_getScheduledMessages.id.add(Integer.valueOf(i3));
                    ConnectionsManager.getInstance(e9Var.a).sendRequest(tL_messages_getScheduledMessages, new a0(e9Var, ziVar, j11, runnable, 2));
                    return;
                }
            default:
                qr qrVar = (qr) this.f;
                long j12 = this.b;
                boolean z11 = this.c;
                String str = (String) this.h;
                long j13 = this.d;
                int i10 = this.e;
                String str2 = (String) this.n;
                String str3 = (String) this.r;
                String str4 = (String) this.s;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    if (j12 == 0) {
                        try {
                            SQLiteDatabase sQLiteDatabase = qrVar.b;
                            Locale locale = Locale.ENGLISH;
                            executeFast = sQLiteDatabase.executeFast("UPDATE dialogs SET " + str3 + " = ? WHERE did = ?");
                        } catch (SQLiteException e10) {
                            e = e10;
                        }
                        try {
                            executeFast.bindInteger(1, Math.max(i10, 0));
                            executeFast.bindLong(2, j13);
                            executeFast.step();
                            executeFast.dispose();
                            if (i10 == 0) {
                                executeFast = qrVar.b.executeFast("UPDATE " + str4 + " SET state = 0 WHERE dialog_id = ?");
                                executeFast.bindLong(1, j13);
                                executeFast.step();
                                executeFast.dispose();
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            sQLitePreparedStatement = executeFast;
                            e.printStackTrace();
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLitePreparedStatement = executeFast;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                        return;
                    }
                    if (z11) {
                        try {
                            try {
                                SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                                Locale locale2 = Locale.ENGLISH;
                                SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT " + str + " FROM topics WHERE did = " + j13 + " AND topic_id = " + j12, new Object[0]);
                                intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                queryFinalized.dispose();
                            } catch (SQLiteException e12) {
                                e = e12;
                                e.printStackTrace();
                                if (sQLitePreparedStatement == null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th2;
                        }
                    } else {
                        intValue = 0;
                    }
                    SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                    Locale locale3 = Locale.ENGLISH;
                    SQLitePreparedStatement executeFast2 = sQLiteDatabase3.executeFast("UPDATE topics SET " + str + " = ? WHERE did = ? AND topic_id = ?");
                    try {
                        executeFast2.bindInteger(1, Math.max(intValue + i10, 0));
                        executeFast2.bindLong(2, j13);
                        executeFast2.bindLong(3, j12);
                        executeFast2.step();
                        executeFast2.dispose();
                        if (i10 != 0) {
                            return;
                        }
                        SQLitePreparedStatement executeFast3 = qrVar.b.executeFast("UPDATE " + str2 + " SET state = 0 WHERE dialog_id = ? AND topic_id = ? ");
                        try {
                            executeFast3.bindLong(1, j13);
                            executeFast3.bindLong(2, j12);
                            executeFast3.step();
                            executeFast3.dispose();
                            return;
                        } catch (SQLiteException e13) {
                            e = e13;
                            sQLitePreparedStatement = executeFast3;
                            e.printStackTrace();
                            if (sQLitePreparedStatement == null) {
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            sQLitePreparedStatement = executeFast3;
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th2;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        sQLitePreparedStatement = executeFast2;
                    } catch (Throwable th6) {
                        th2 = th6;
                        sQLitePreparedStatement = executeFast2;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
        }
    }

    public /* synthetic */ o8(qr qrVar, long j10, boolean z10, String str, long j11, int i3, String str2, String str3, String str4) {
        this.f = qrVar;
        this.b = j10;
        this.c = z10;
        this.h = str;
        this.d = j11;
        this.e = i3;
        this.n = str2;
        this.r = str3;
        this.s = str4;
    }
}
