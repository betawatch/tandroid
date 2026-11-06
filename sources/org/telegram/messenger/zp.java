package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class zp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ zp(int i7, long j3, yr yrVar, boolean z9) {
        this.a = i7;
        this.b = yrVar;
        this.c = j3;
        this.d = z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
    
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: all -> 0x0038, Exception -> 0x003a, TRY_ENTER, TryCatch #4 {Exception -> 0x003a, blocks: (B:12:0x0034, B:16:0x0050, B:36:0x006b, B:37:0x006e), top: B:11:0x0034, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9 A[Catch: all -> 0x00b0, Exception -> 0x00b2, TRY_ENTER, TryCatch #10 {Exception -> 0x00b2, blocks: (B:50:0x00ac, B:54:0x00cb, B:68:0x00e9, B:69:0x00ec, B:63:0x00be), top: B:43:0x0088, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v24, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        int i7;
        SQLiteCursor sQLiteCursor2;
        switch (this.a) {
            case 0:
                long j3 = this.c;
                yr yrVar = this.b;
                yrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        try {
                            sQLiteCursor = yrVar.b.queryFinalized("SELECT flags FROM dialogs WHERE did = " + j3, new Object[0]);
                            try {
                                try {
                                    i7 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                                    sQLiteCursor.dispose();
                                } catch (Exception e10) {
                                    e = e10;
                                    yrVar.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    i7 = 0;
                                    if (!this.d) {
                                    }
                                    sQLitePreparedStatement = yrVar.b.executeFast("UPDATE dialogs SET flags = ? WHERE did = ?");
                                    sQLitePreparedStatement.bindInteger(1, r3);
                                    sQLitePreparedStatement.bindLong(2, j3);
                                    sQLitePreparedStatement.step();
                                    sQLitePreparedStatement.dispose();
                                    yrVar.t1(false);
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (0 != 0) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th3;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        sQLiteCursor = null;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = null;
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                    int i10 = !this.d ? i7 | 1 : i7 & (-2);
                    sQLitePreparedStatement = yrVar.b.executeFast("UPDATE dialogs SET flags = ? WHERE did = ?");
                    sQLitePreparedStatement.bindInteger(1, i10);
                    sQLitePreparedStatement.bindLong(2, j3);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    yrVar.t1(false);
                } catch (Exception e12) {
                    yrVar.o(e12, true);
                    if (0 == 0) {
                        return;
                    }
                }
                sQLitePreparedStatement.dispose();
                return;
            default:
                long j10 = this.c;
                yr yrVar2 = this.b;
                yrVar2.getClass();
                SQLiteCursor sQLiteCursor3 = "SELECT flags FROM dialogs WHERE did = ";
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                int i11 = 0;
                try {
                    try {
                        sQLiteCursor2 = yrVar2.b.queryFinalized("SELECT flags FROM dialogs WHERE did = " + j10, new Object[0]);
                        try {
                            boolean next = sQLiteCursor2.next();
                            sQLiteCursor3 = sQLiteCursor2;
                            if (next) {
                                i11 = sQLiteCursor2.intValue(0);
                                sQLiteCursor3 = sQLiteCursor2;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            yrVar2.o(e, true);
                            sQLiteCursor3 = sQLiteCursor2;
                            break;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor2 = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor3 = 0;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                try {
                    try {
                        sQLiteCursor3.dispose();
                        int i12 = this.d ? i11 | 64 : i11 & (-65);
                        sQLitePreparedStatement2 = yrVar2.b.executeFast("UPDATE dialogs SET flags = ? WHERE did = ?");
                        sQLitePreparedStatement2.bindInteger(1, i12);
                        sQLitePreparedStatement2.bindLong(2, j10);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                    } catch (Exception e15) {
                        yrVar2.o(e15, true);
                        if (0 == 0) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th7) {
                    if (0 != 0) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th7;
                }
        }
    }
}
