package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class dq implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ dq(hs hsVar, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f = hsVar;
        this.c = j10;
        this.b = z10;
        this.h = str;
        this.e = j11;
        this.d = i10;
        this.n = str2;
        this.r = str3;
        this.s = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int intValue;
        switch (this.a) {
            case 0:
                hs hsVar = (hs) this.f;
                long j10 = this.c;
                boolean z10 = this.b;
                String str = (String) this.h;
                long j11 = this.e;
                int i10 = this.d;
                String str2 = (String) this.n;
                String str3 = (String) this.r;
                String str4 = (String) this.s;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    if (j10 == 0) {
                        try {
                            SQLiteDatabase sQLiteDatabase = hsVar.b;
                            Locale locale = Locale.ENGLISH;
                            SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE dialogs SET " + str3 + " = ? WHERE did = ?");
                            try {
                                executeFast.bindInteger(1, Math.max(i10, 0));
                                executeFast.bindLong(2, j11);
                                executeFast.step();
                                executeFast.dispose();
                                if (i10 == 0) {
                                    SQLitePreparedStatement executeFast2 = hsVar.b.executeFast("UPDATE " + str4 + " SET state = 0 WHERE dialog_id = ?");
                                    try {
                                        executeFast2.bindLong(1, j11);
                                        executeFast2.step();
                                        executeFast2.dispose();
                                    } catch (SQLiteException e) {
                                        e = e;
                                        sQLitePreparedStatement = executeFast2;
                                        e.printStackTrace();
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLitePreparedStatement = executeFast2;
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (SQLiteException e7) {
                                e = e7;
                                sQLitePreparedStatement = executeFast;
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = executeFast;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                        }
                        return;
                    }
                    try {
                        if (z10) {
                            try {
                                SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                                Locale locale2 = Locale.ENGLISH;
                                SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT " + str + " FROM topics WHERE did = " + j11 + " AND topic_id = " + j10, new Object[0]);
                                intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                queryFinalized.dispose();
                            } catch (SQLiteException e11) {
                                e = e11;
                                e.printStackTrace();
                                if (sQLitePreparedStatement == null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        } else {
                            intValue = 0;
                        }
                        SQLiteDatabase sQLiteDatabase3 = hsVar.b;
                        Locale locale3 = Locale.ENGLISH;
                        SQLitePreparedStatement executeFast3 = sQLiteDatabase3.executeFast("UPDATE topics SET " + str + " = ? WHERE did = ? AND topic_id = ?");
                        try {
                            executeFast3.bindInteger(1, Math.max(intValue + i10, 0));
                            executeFast3.bindLong(2, j11);
                            executeFast3.bindLong(3, j10);
                            executeFast3.step();
                            executeFast3.dispose();
                            if (i10 != 0) {
                                return;
                            }
                            SQLitePreparedStatement executeFast4 = hsVar.b.executeFast("UPDATE " + str2 + " SET state = 0 WHERE dialog_id = ? AND topic_id = ? ");
                            try {
                                executeFast4.bindLong(1, j11);
                                executeFast4.bindLong(2, j10);
                                executeFast4.step();
                                executeFast4.dispose();
                                return;
                            } catch (SQLiteException e12) {
                                e = e12;
                                sQLitePreparedStatement = executeFast4;
                                e.printStackTrace();
                                if (sQLitePreparedStatement == null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement = executeFast4;
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            sQLitePreparedStatement = executeFast3;
                        } catch (Throwable th5) {
                            th = th5;
                            sQLitePreparedStatement = executeFast3;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            default:
                rh.e6 e6Var = (rh.e6) this.f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.r;
                boolean z11 = this.b;
                long j12 = this.c;
                int i11 = this.d;
                jj jjVar = (jj) this.s;
                long j13 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.d.c(new rh.k5(e6Var, tLObject, 5));
                    runnable.run();
                    return;
                } else {
                    if (tL_error == null || !w8.r(tL_error.text) || z11) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = vp.r1(e6Var.a).i1(j12);
                    tL_messages_getScheduledMessages.id.add(Integer.valueOf(i11));
                    ConnectionsManager.getInstance(e6Var.a).sendRequest(tL_messages_getScheduledMessages, new c70(e6Var, jjVar, j13, runnable));
                    return;
                }
        }
    }

    public /* synthetic */ dq(rh.e6 e6Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, jj jjVar, long j11) {
        this.f = e6Var;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.b = z10;
        this.c = j10;
        this.d = i10;
        this.s = jjVar;
        this.e = j11;
    }
}
