// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class le7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ef7 d;

    public /* synthetic */ le7(kf7 kf7Var, long j, ef7 ef7Var, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = j;
        this.d = ef7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        final ef7 ef7Var = this.d;
        long j = this.c;
        kf7 kf7Var = this.b;
        Object[] objArr = 0;
        final byte b2 = 1;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = kf7Var.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                        final int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                        sQLiteCursor.dispose();
                        hl.c3(new Runnable() { // from class: zd7
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b2;
                                int i = intValue;
                                ef7 ef7Var2 = ef7Var;
                                switch (b3) {
                                    case 0:
                                        ef7Var2.a(i);
                                        break;
                                    default:
                                        ef7Var2.a(i);
                                        break;
                                }
                            }
                        });
                    } catch (Exception e) {
                        kf7Var.p(e, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            default:
                try {
                    try {
                        if (kf7Var.K.f(j) == null) {
                            sQLiteCursor = kf7Var.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                            r7 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        hl.c3(new Runnable() { // from class: zd7
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = objArr2;
                                int i = r2;
                                ef7 ef7Var2 = ef7Var;
                                switch (b3) {
                                    case 0:
                                        ef7Var2.a(i);
                                        break;
                                    default:
                                        ef7Var2.a(i);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        kf7Var.p(e2, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
        }
    }
}
