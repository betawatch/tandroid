// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class fe7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cf7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ we7 d;

    public /* synthetic */ fe7(cf7 cf7Var, long j, we7 we7Var, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.c = j;
        this.d = we7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        final we7 we7Var = this.d;
        long j = this.c;
        cf7 cf7Var = this.b;
        Object[] objArr = 0;
        final byte b2 = 1;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = cf7Var.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j, new Object[0]);
                        final int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : 0;
                        sQLiteCursor.dispose();
                        gm.c3(new Runnable() { // from class: wd7
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b2;
                                int i = intValue;
                                we7 we7Var2 = we7Var;
                                switch (b3) {
                                    case 0:
                                        we7Var2.a(i);
                                        break;
                                    default:
                                        we7Var2.a(i);
                                        break;
                                }
                            }
                        });
                    } catch (Exception e) {
                        cf7Var.n(e, true);
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
                        if (cf7Var.K.f(j) == null) {
                            sQLiteCursor = cf7Var.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                            r7 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                            sQLiteCursor.dispose();
                        }
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        gm.c3(new Runnable() { // from class: wd7
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = objArr2;
                                int i = r2;
                                we7 we7Var2 = we7Var;
                                switch (b3) {
                                    case 0:
                                        we7Var2.a(i);
                                        break;
                                    default:
                                        we7Var2.a(i);
                                        break;
                                }
                            }
                        });
                        if (sQLiteCursor == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        cf7Var.n(e2, true);
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
