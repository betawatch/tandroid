// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class dc7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ uc7 d;

    public /* synthetic */ dc7(ad7 ad7Var, long j, uc7 uc7Var, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = j;
        this.d = uc7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        final uc7 uc7Var = this.d;
        long j = this.c;
        ad7 ad7Var = this.b;
        Object[] objArr = 0;
        final byte b2 = 1;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7Var.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                        final int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                        sQLiteCursor.dispose();
                        gl.c3(new Runnable() { // from class: ub7
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b2;
                                int i = intValue;
                                uc7 uc7Var2 = uc7Var;
                                switch (b3) {
                                    case 0:
                                        uc7Var2.a(i);
                                        break;
                                    default:
                                        uc7Var2.a(i);
                                        break;
                                }
                            }
                        });
                    } catch (Exception e) {
                        ad7Var.n(e, true);
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
                        if (ad7Var.K.f(j) == null) {
                            sQLiteCursor = ad7Var.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                            r7 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        gl.c3(new Runnable() { // from class: ub7
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = objArr2;
                                int i = r2;
                                uc7 uc7Var2 = uc7Var;
                                switch (b3) {
                                    case 0:
                                        uc7Var2.a(i);
                                        break;
                                    default:
                                        uc7Var2.a(i);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        ad7Var.n(e2, true);
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
