// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ke7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ df7 d;

    public /* synthetic */ ke7(jf7 jf7Var, long j, df7 df7Var, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = j;
        this.d = df7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        final df7 df7Var = this.d;
        long j = this.c;
        jf7 jf7Var = this.b;
        Object[] objArr = 0;
        final byte b2 = 1;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = jf7Var.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                        final int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                        sQLiteCursor.dispose();
                        hl.c3(new Runnable() { // from class: zd7
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b2;
                                int i = intValue;
                                df7 df7Var2 = df7Var;
                                switch (b3) {
                                    case 0:
                                        df7Var2.a(i);
                                        break;
                                    default:
                                        df7Var2.a(i);
                                        break;
                                }
                            }
                        });
                    } catch (Exception e) {
                        jf7Var.n(e, true);
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
                        if (jf7Var.K.f(j) == null) {
                            sQLiteCursor = jf7Var.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                            r7 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        hl.c3(new Runnable() { // from class: zd7
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = objArr2;
                                int i = r2;
                                df7 df7Var2 = df7Var;
                                switch (b3) {
                                    case 0:
                                        df7Var2.a(i);
                                        break;
                                    default:
                                        df7Var2.a(i);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        jf7Var.n(e2, true);
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
