// default package

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class he7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ he7(kf7 kf7Var, long j, boolean z, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = j;
        this.d = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x003c, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9 A[Catch: Exception -> 0x00ca, all -> 0x00d4, TryCatch #4 {Exception -> 0x00ca, blocks: (B:10:0x0093, B:12:0x00a9, B:13:0x00ad, B:17:0x00ab, B:23:0x00a3, B:31:0x00c6, B:32:0x00c9), top: B:2:0x0010, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab A[Catch: Exception -> 0x00ca, all -> 0x00d4, TryCatch #4 {Exception -> 0x00ca, blocks: (B:10:0x0093, B:12:0x00a9, B:13:0x00ad, B:17:0x00ab, B:23:0x00a3, B:31:0x00c6, B:32:0x00c9), top: B:2:0x0010, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.SQLite.SQLiteCursor] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        int i;
        SQLiteCursor sQLiteCursor3 = this.a;
        int i2 = 0;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        boolean z = this.d;
        long j = this.c;
        kf7 kf7Var = this.b;
        try {
            try {
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e) {
                    kf7Var.p(e, true);
                    if (0 == 0) {
                        return;
                    }
                }
                switch (sQLiteCursor3) {
                    case 0:
                        try {
                            sQLiteCursor2 = kf7Var.b.queryFinalized("SELECT flags FROM dialogs WHERE did = " + j, new Object[0]);
                            try {
                                i = sQLiteCursor2.next() ? sQLiteCursor2.intValue(0) : 0;
                                sQLiteCursor2.dispose();
                            } catch (Exception e2) {
                                e = e2;
                                kf7Var.p(e, true);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                i = 0;
                                if (!z) {
                                }
                                sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE dialogs SET flags = ? WHERE did = ?");
                                sQLitePreparedStatement.bindInteger(1, r5);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                                kf7Var.u1(false);
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLiteCursor2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor3 = 0;
                            if (sQLiteCursor3 != 0) {
                                sQLiteCursor3.dispose();
                            }
                            throw th;
                        }
                        int i3 = !z ? i | 1 : i & (-2);
                        sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE dialogs SET flags = ? WHERE did = ?");
                        sQLitePreparedStatement.bindInteger(1, i3);
                        sQLitePreparedStatement.bindLong(2, j);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                        kf7Var.u1(false);
                        sQLitePreparedStatement.dispose();
                        return;
                    default:
                        try {
                            sQLiteCursor = kf7Var.b.queryFinalized("SELECT flags FROM dialogs WHERE did = " + j, new Object[0]);
                            try {
                                boolean next = sQLiteCursor.next();
                                sQLiteCursor3 = sQLiteCursor;
                                if (next) {
                                    i2 = sQLiteCursor.intValue(0);
                                    sQLiteCursor3 = sQLiteCursor;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                kf7Var.p(e, true);
                                sQLiteCursor3 = sQLiteCursor;
                                break;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            sQLiteCursor = null;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor3 = 0;
                            if (sQLiteCursor3 != 0) {
                                sQLiteCursor3.dispose();
                            }
                            throw th;
                        }
                        try {
                            try {
                                sQLiteCursor3.dispose();
                                int i4 = z ? i2 | 64 : i2 & (-65);
                                sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE dialogs SET flags = ? WHERE did = ?");
                                sQLitePreparedStatement.bindInteger(1, i4);
                                sQLitePreparedStatement.bindLong(2, j);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement.dispose();
                            } catch (Exception e6) {
                                kf7Var.p(e6, true);
                                if (0 == 0) {
                                    return;
                                }
                            }
                            sQLitePreparedStatement.dispose();
                            return;
                        } catch (Throwable th4) {
                            if (0 != 0) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th4;
                        }
                }
            } catch (Throwable th5) {
                if (0 != 0) {
                    sQLitePreparedStatement.dispose();
                }
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
