package di;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8 implements Runnable {
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

    public /* synthetic */ g8(v8 v8Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i7, gj gjVar, long j10) {
        this.f = v8Var;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.c = z10;
        this.b = j3;
        this.e = i7;
        this.s = gjVar;
        this.d = j10;
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
                v8 v8Var = (v8) this.f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.r;
                boolean z10 = this.c;
                long j3 = this.b;
                int i7 = this.e;
                gj gjVar = (gj) this.s;
                long j10 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.d.c(new s7(v8Var, tLObject, 5));
                    runnable.run();
                    return;
                } else {
                    if (tL_error == null || !org.telegram.messenger.r8.r(tL_error.text) || z10) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = np.s1(v8Var.a).j1(j3);
                    tL_messages_getScheduledMessages.id.add(Integer.valueOf(i7));
                    ConnectionsManager.getInstance(v8Var.a).sendRequest(tL_messages_getScheduledMessages, new y(v8Var, gjVar, j10, runnable, 2));
                    return;
                }
            default:
                vr vrVar = (vr) this.f;
                long j11 = this.b;
                boolean z11 = this.c;
                String str = (String) this.h;
                long j12 = this.d;
                int i10 = this.e;
                String str2 = (String) this.n;
                String str3 = (String) this.r;
                String str4 = (String) this.s;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    if (j11 == 0) {
                        try {
                            SQLiteDatabase sQLiteDatabase = vrVar.b;
                            Locale locale = Locale.ENGLISH;
                            executeFast = sQLiteDatabase.executeFast("UPDATE dialogs SET " + str3 + " = ? WHERE did = ?");
                        } catch (SQLiteException e10) {
                            e = e10;
                        }
                        try {
                            executeFast.bindInteger(1, Math.max(i10, 0));
                            executeFast.bindLong(2, j12);
                            executeFast.step();
                            executeFast.dispose();
                            if (i10 == 0) {
                                executeFast = vrVar.b.executeFast("UPDATE " + str4 + " SET state = 0 WHERE dialog_id = ?");
                                executeFast.bindLong(1, j12);
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
                                SQLiteDatabase sQLiteDatabase2 = vrVar.b;
                                Locale locale2 = Locale.ENGLISH;
                                SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT " + str + " FROM topics WHERE did = " + j12 + " AND topic_id = " + j11, new Object[0]);
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
                    SQLiteDatabase sQLiteDatabase3 = vrVar.b;
                    Locale locale3 = Locale.ENGLISH;
                    SQLitePreparedStatement executeFast2 = sQLiteDatabase3.executeFast("UPDATE topics SET " + str + " = ? WHERE did = ? AND topic_id = ?");
                    try {
                        executeFast2.bindInteger(1, Math.max(intValue + i10, 0));
                        executeFast2.bindLong(2, j12);
                        executeFast2.bindLong(3, j11);
                        executeFast2.step();
                        executeFast2.dispose();
                        if (i10 != 0) {
                            return;
                        }
                        SQLitePreparedStatement executeFast3 = vrVar.b.executeFast("UPDATE " + str2 + " SET state = 0 WHERE dialog_id = ? AND topic_id = ? ");
                        try {
                            executeFast3.bindLong(1, j12);
                            executeFast3.bindLong(2, j11);
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

    public /* synthetic */ g8(vr vrVar, long j3, boolean z10, String str, long j10, int i7, String str2, String str3, String str4) {
        this.f = vrVar;
        this.b = j3;
        this.c = z10;
        this.h = str;
        this.d = j10;
        this.e = i7;
        this.n = str2;
        this.r = str3;
        this.s = str4;
    }
}
